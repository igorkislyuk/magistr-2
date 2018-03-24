package ru.itmotourism.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import ru.itmotourism.DAO.PasswordRepository;
import ru.itmotourism.DAO.PeopleRepository;
import ru.itmotourism.DAO.RolesRepository;
import ru.itmotourism.DaysCounter;
import ru.itmotourism.entities.Passwords;
import ru.itmotourism.entities.People;
import ru.itmotourism.entities.Roles;

import java.sql.Date;


@RestController
public class signUpController {
    @Autowired
    private PeopleRepository peopleRepository;
    @Autowired
    private PasswordRepository passwordRepository;
    @Autowired
    private RolesRepository rolesRepository;
    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public ModelAndView signUp(@RequestParam String name
            , @RequestParam String surname,@RequestParam String login
            ,@RequestParam String password,@RequestParam String bday, @RequestParam String fatherName){
        People people = new People();
        int year = Integer.parseInt(bday.substring(0,4));
        int month = Integer.parseInt(bday.substring(5,7));

        int day = Integer.parseInt(bday.substring(8));
        long time = ((year-1970)*365+ DaysCounter.getMonthDays(month,year)+day)*24*60*60;
        time *=1000;
        people.setbDay(new Date(time));
        people.setFatherName(fatherName);
        people.setName(name);
        people.setSurname(surname);
        people.setUserName(login);
        peopleRepository.save(people);
        Passwords passwords = new Passwords();
        passwords.setUserName(login);
        passwords.setPassword(password);
        passwordRepository.save(passwords);
        Roles roles = new Roles();
        roles.setRoleName("ROLE_USER");
        roles.setUserName(login);
        rolesRepository.save(roles);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
