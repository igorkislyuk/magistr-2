<%@ page pageEncoding="UTF-8" %>

<%@ page import="ru.itmotourism.DAO.CompetitionsRepository" %>
<%@ page import="ru.itmotourism.entities.Competitions" %>

<%CompetitionsRepository competitionsRepository = (CompetitionsRepository)session.getAttribute("events");
for(Competitions competitions: competitionsRepository.findAll()){%>
<%=competitions.getName()%>
<%}
session.removeAttribute("events");%>