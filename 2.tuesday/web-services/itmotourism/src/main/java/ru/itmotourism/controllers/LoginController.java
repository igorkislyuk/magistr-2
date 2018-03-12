package ru.itmotourism.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import ru.itmotourism.DAO.PasswordRepository;
import ru.itmotourism.DAO.PeopleRepository;
import ru.itmotourism.DAO.RolesRepository;
import ru.itmotourism.entities.Passwords;
import ru.itmotourism.entities.People;
import ru.itmotourism.entities.Roles;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class LoginController {
    @Autowired
    private PeopleRepository peopleRepository;
    @Autowired
    private RolesRepository rolesRepository;
    @Autowired
    private PasswordRepository passwordRepository;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView testq(HttpSession session, HttpServletRequest request) {
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        ModelAndView modelAndView = new ModelAndView();
        System.out.println("login:"+login+"; password:"+password);
        People people = peopleRepository.findByUserName(login);
        Passwords passwords = passwordRepository.findByUserName(people.getUserName());
        if(passwords.getPassword().equals(password)){
            session.setAttribute("userName", people.getUserName());
            session.setAttribute("password", password);

            List<Roles> list = rolesRepository.findByUserName(login);
            for(Roles rolesEntity: list){
                session.setAttribute(rolesEntity.getRoleName(),rolesEntity.getRoleName());
                System.out.println("roleName:"+rolesEntity.getRoleName());
            }

            modelAndView.setViewName("redirect:/");
        }else modelAndView.setViewName("redirect:/autentification");
        return modelAndView;
    }
}
