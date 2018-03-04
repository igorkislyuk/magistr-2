<%@ page import="ru.itmotourism.DAO.CompetitionsRepository" %>
<%@ page import="ru.itmotourism.DAO.PeopleRepository" %>
<%@ page import="ru.itmotourism.DAO.PlacesRepository" %>
<%@ page import="ru.itmotourism.entities.Competitions" %>
<%@ page import="ru.itmotourism.entities.Places" %>
<%@ page import="java.util.List" %>
<%@ page import="ru.itmotourism.entities.People" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%Competitions competitions = (Competitions)session.getAttribute("event");
    PeopleRepository peopleRepository = (PeopleRepository)session.getAttribute("people");
    PlacesRepository placesRepository = (PlacesRepository)session.getAttribute("places");
List<Places> placesList = placesRepository.findByCompetitionId(competitions.getId());%>
<table>
    <tr>
        <th>Фамилия</th>
        <th>Имя</th>
        <th>Отчество</th>
        <th>Стартовый номер</th>
        <th>Место</th>
    </tr>
    <%for(Places places:placesList){
    People people = peopleRepository.findById(places.getPeopleId());
    %>
    <%="    <tr>\n" +
            "        <th>" +
            people.getSurname() +
            "</th>\n" +
            "        <th>" +
            people.getName() +
            "</th>\n" +
            "        <th>" +
            people.getFatherName() +
            "</th>\n" +
            "        <th>" +
            places.getStartNumber() +
            "</th>\n" +
            "        <th>" +
            places.getPlace() +
            "</th>\n" +
            "    </tr>"%>
<%}
session.removeAttribute("event");
session.removeAttribute("people");
session.removeAttribute("places");%>

</table>