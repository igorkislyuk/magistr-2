package ru.itmotourism.services;


import ru.itmotourism.entities.Competitions;

import java.util.List;

public interface CompetitionService {
    public List<Competitions> findAllUpcomingCompetitions();
}
