    //package ru.itmotourism.controllers;
    //
    //import org.springframework.beans.factory.annotation.Autowired;
    //import org.springframework.web.bind.annotation.GetMapping;
    //import org.springframework.web.bind.annotation.RequestParam;
    //import org.springframework.web.bind.annotation.ResponseBody;
    //import org.springframework.web.bind.annotation.RestController;
    //import ru.itmotourism.DAO.CompetitionsRepository;
    //import ru.itmotourism.DAO.PeopleRepository;
    //import ru.itmotourism.DAO.PlacesRepository;
    //import ru.itmotourism.DaysCounter;
    //import ru.itmotourism.entities.People;
    //import ru.itmotourism.entities.Places;
    //import tex.TexLoader;
    //import tex.templates.RepresentationLow;
    //
    //import javax.servlet.http.HttpSession;
    //import java.io.File;
    //import java.io.FileNotFoundException;
    //import java.sql.Date;
    //import java.util.List;
    //
    //@RestController
    //public class RepresentationController {
    //    @Autowired
    //    private PlacesRepository placesRepository;
    //    @Autowired
    //    private CompetitionsRepository competitionsRepository;
    //    @Autowired
    //    private PeopleRepository peopleRepository;
    //
    //    @GetMapping(value = "/generateOrders")
    //    public @ResponseBody String generateOrders(HttpSession session, @RequestParam String event) {
    //        if (session.getAttribute("ROLE_ADMIN") != null) {
    //            File pdflatex = new File("E:\\MiKTeX\\miktex\\bin\\x64\\pdflatex.exe");
    //            try {
    //                TexLoader.setPdfLatex(pdflatex);
    //            } catch (FileNotFoundException e) {
    //                System.out.println(e.getMessage());
    //
    //                return e.getMessage();
    //            }
    //
    //            //Sets resource directory
    //            TexLoader.setResDir(new File("E:\\MiKTeX\\texResults"));
    //
    //            RepresentationLow pattern = new RepresentationLow();
    //
    //            //add person to document
    //            String date = event.substring(event.indexOf('(')+1,event.indexOf(')'));
    //            event = event.substring(0,event.indexOf('('));
    //            int year = Integer.parseInt(date.substring(0,4));
    //            int month = Integer.parseInt(date.substring(5,7));
    //            int day = Integer.parseInt(date.substring(8));
    //            long time = ((year-1970)*365+ DaysCounter.getMonthDays(month,year)+day)*24*60*60;
    //            time *=1000;
    //            List<Places> placesList = placesRepository.findByCompetitionId(competitionsRepository.findByNameAndDate(event, new Date(time)).getId());
    //            int i=1;
    //            People people;
    //            for(Places places: placesList){
    //                people = peopleRepository.findById(places.getPeopleId());
    //                String[] array = {String.valueOf(i), people.getSurname()+" "+people.getName()+" "+people.getFatherName(),people.getbDay().toString(),"","Соревнования"};
    //            }
    //
    //
    //            pattern.add(RepresentationLow.EXAMPLE_ARRAY);
    //
    //            //generate TeX document
    //            pattern.generate();
    //
    //            //generate PDF from TeX (saves it in output directory)
    //            //TexLoader.OUT_DIR.getAbsolutePath(); //get output directory
    //            TexLoader.createPdfFromTex(pattern.getTex());
    //            System.out.print(TexLoader.OUT_DIR.getAbsolutePath());
    //            return "generated";
    //        }
    //        else return "error";
    //    }
    //}
