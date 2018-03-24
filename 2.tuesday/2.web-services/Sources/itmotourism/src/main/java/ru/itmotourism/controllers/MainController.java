package ru.itmotourism.controllers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ru.itmotourism.DAO.CategoriesRepository;
import ru.itmotourism.DAO.CompetitionsRepository;
import ru.itmotourism.DAO.PeopleRepository;
import ru.itmotourism.DAO.PlacesRepository;
import ru.itmotourism.DaysCounter;
import ru.itmotourism.entities.Categories;
import ru.itmotourism.entities.Competitions;
import ru.itmotourism.entities.People;
import ru.itmotourism.entities.Places;

import javax.servlet.http.HttpSession;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Controller
@RestController
public class MainController {

    ArrayList<Places> placesList = new ArrayList<Places>();

@Autowired
private PeopleRepository peopleRepository;
    @Autowired
    private CompetitionsRepository competitionsRepository;
    @Autowired
    private PlacesRepository placesRepository;
    @Autowired
    private CategoriesRepository categoriesRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView test() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }


    @RequestMapping(value = "/events", method = RequestMethod.GET)
    public ModelAndView events(HttpSession session) {
        ModelAndView modelAndView = new ModelAndView();
        session.setAttribute("events", competitionsRepository);
        modelAndView.setViewName("events");
        return modelAndView;
    }

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public ModelAndView about() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("about");
        return modelAndView;
    }

    @RequestMapping(value = "/autentification", method = RequestMethod.GET)
    public ModelAndView autentification() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("autentification");
        return modelAndView;
    }

    @RequestMapping(value = "/signUp", method = RequestMethod.GET)
    public ModelAndView signUp() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("signUp");
        return modelAndView;
    }

    @RequestMapping(value = "/logOut")
    public ModelAndView logOut(HttpSession session){
        session.invalidate();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping(value = "/myAchievements")
    public ModelAndView myAchievements(HttpSession session){
        session.setAttribute("places", placesRepository);
        session.setAttribute("events", competitionsRepository);
        session.setAttribute("people", peopleRepository);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("myAchievements");
        return modelAndView;
    }

    @RequestMapping(value = "/addCategory")
    public ModelAndView addCategory(HttpSession session){
        session.setAttribute("people", peopleRepository);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("addCategory");
        return modelAndView;
    }

    @PostMapping(value = "/newCategory")
    public ModelAndView newCategory(HttpSession session, @RequestParam String category, @RequestParam String kind,
                                    @RequestParam String date, @RequestParam String order){
        ModelAndView modelAndView = new ModelAndView();
        Categories categories = new Categories();
        categories.setCategory(category);
        categories.setKindOfSport(kind);
        categories.setOrderNumber(order);
        int peopleId = peopleRepository.findByUserName((String)session.getAttribute("userName")).getId();
        categories.setPeopleId(peopleId);
        session.setAttribute("category", category);
        session.setAttribute("kind", kind);
        int year = Integer.parseInt(date.substring(0,4));
        int month = Integer.parseInt(date.substring(5,7));

        int day = Integer.parseInt(date.substring(8));
        long time = ((year-1970)*365+ DaysCounter.getMonthDays(month,year)+day)*24*60*60;
        time *=1000;
        categories.setDate(new Date(time));
        Categories cat = categoriesRepository.findByPeopleIdAndKindOfSport(peopleId,kind);
        if(cat!=null){
            session.setAttribute("exist", peopleId);
            categoriesRepository.delete(cat.getId());
        }
        categoriesRepository.save(categories);
        modelAndView.setViewName("afterCategoryCreating");
        return modelAndView;
    }

    @RequestMapping(value = "/adminPage")
    public ModelAndView adminPage(HttpSession session){
        ModelAndView modelAndView = new ModelAndView();
        if(session.getAttribute("ROLE_ADMIN")!=null) {
            session.setAttribute("events", competitionsRepository);
            modelAndView.setViewName("EventController");
        }else modelAndView.setViewName("accessDenied");
        return modelAndView;
    }


    @PostMapping(value = "/createEvent")
    public ModelAndView createEvent(@RequestParam String name, @RequestParam String date, @RequestParam String info,
                                    HttpSession session, @RequestParam String kindOfSport, @RequestParam String category){
        Competitions competitions = new Competitions();
        int year = Integer.parseInt(date.substring(0,4));
        int month = Integer.parseInt(date.substring(5,7));
        int day = Integer.parseInt(date.substring(8));
        long time = ((year-1970)*365+ DaysCounter.getMonthDays(month,year)+day)*24*60*60;
        time *=1000;
        competitions.setDate(new Date(time));
        competitions.setInfo(info);
        competitions.setName(name);
        competitions.setKindOfSport(kindOfSport);
        competitions.setCategory(category);
        competitionsRepository.save(competitions);
        session.setAttribute("events", competitionsRepository);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("EventController");
        return modelAndView;
    }

    @PostMapping(value = "/eventData")
    public ModelAndView eventData(HttpSession session, @RequestParam String event){
        ModelAndView modelAndView = new ModelAndView();
        String date = event.substring(event.indexOf('(')+1,event.indexOf(')'));
        event = event.substring(0,event.indexOf('('));
        int year = Integer.parseInt(date.substring(0,4));
        int month = Integer.parseInt(date.substring(5,7));
        int day = Integer.parseInt(date.substring(8));
        long time = ((year-1970)*365+ DaysCounter.getMonthDays(month,year)+day)*24*60*60;
        time *=1000;

        if(session.getAttribute("ROLE_ADMIN")!=null) {
            if(event.equals("выберите событие")) modelAndView.setViewName("EventController");
            else {
                session.setAttribute("places", placesRepository);
                session.setAttribute("people", peopleRepository);
                System.out.println(event);
                session.setAttribute("event", competitionsRepository.findByNameAndDate(event, new Date(time)));
                modelAndView.setViewName("eventData");
            }
        }else modelAndView.setViewName("accessDenied");
        return modelAndView;
    }

    @GetMapping(value = "/setPlace")
    public @ResponseBody String setPlace(HttpSession session, @RequestParam String number,
                                 @RequestParam String event, @RequestParam String place, @RequestParam String time){
        if(session.getAttribute("ROLE_ADMIN")!=null){
            String date = event.substring(event.indexOf('(')+1,event.indexOf(')'));
            event = event.substring(0,event.indexOf('('));
            int year = Integer.parseInt(date.substring(0,4));
            int month = Integer.parseInt(date.substring(5,7));
            int day = Integer.parseInt(date.substring(8));
            long dateTime = ((year-1970)*365+ DaysCounter.getMonthDays(month,year)+day)*24*60*60;
            dateTime *=1000;
            Places places = placesRepository.findByCompetitionIdAndStartNumber(competitionsRepository.findByNameAndDate(event, new Date(dateTime)).getId(), Integer.parseInt(number));
            placesRepository.delete(places.getId());
            places.setPlace(Integer.parseInt(place));
            places.setTime(time);
            placesList.add(places);
//            placesRepository.save(places);
            return "saved";
        }
        return "error";
    }

    @GetMapping(value = "/informationAboutEvent")
    public ModelAndView informationAboutEvent(HttpSession session, @RequestParam int eventId){
        Iterator<Competitions> iterator = competitionsRepository.findAllWithUpcomingDate().iterator();
        int i=1;
        while(i<eventId){
            i++;
            iterator.next();
        }
        Competitions competitions = iterator.next();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("informationAboutEvent");
        session.setAttribute("event", competitions);
        return modelAndView;
    }

    @GetMapping(value = "/getOnEvent")
    public ModelAndView getOnEvent(HttpSession session, @RequestParam int eventId){
        Competitions competitions = competitionsRepository.findById(eventId);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("afterRegistration");

        if(session.getAttribute("ROLE_USER")!=null){
            int peopleId = peopleRepository.findByUserName((String)session.getAttribute("userName")).getId();
            if(placesRepository.findByPeopleIdAndCompetitionId(peopleId, competitions.getId())!=null){
                session.setAttribute("exist", peopleId);
                session.setAttribute("event", competitions);
                return modelAndView;
            }
            Places places = new Places();
            session.setAttribute("event", competitions);
            places.setStartNumber(placesRepository.findByCompetitionId(competitions.getId()).size()+1);
            places.setCompetitionId(competitions.getId());
            places.setPeopleId(peopleId);
            places.setPlace(0);
            placesRepository.save(places);

        }else modelAndView.setViewName("autentification");
        return  modelAndView;
    }

    @GetMapping(value = "/getAllEvents")
    public ModelAndView getAllEvents(HttpSession session){
        System.out.println("got it");
        session.setAttribute("events", competitionsRepository);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("getAllEvents");
        return modelAndView;
    }

    @RequestMapping(value = "/categoriesController")
    public ModelAndView categoriesController(HttpSession session){
        ModelAndView modelAndView = new ModelAndView();
        if(session.getAttribute("ROLE_ADMIN")==null) modelAndView.setViewName("accessDenied");
        modelAndView.setViewName("CategoriesController");
        session.setAttribute("people", peopleRepository);
        session.setAttribute("categories", categoriesRepository);
        return modelAndView;
    }
}

