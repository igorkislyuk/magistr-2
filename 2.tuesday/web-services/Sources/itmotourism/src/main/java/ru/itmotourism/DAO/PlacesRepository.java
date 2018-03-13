package ru.itmotourism.DAO;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import ru.itmotourism.entities.Places;

import java.util.List;

public interface PlacesRepository extends CrudRepository<Places, Integer>{
    public List<Places> findByCompetitionId(int id);
    public Places findByPeopleIdAndCompetitionId(int peopleId, int competitionId);
    public List<Places> findByPeopleId(int id);
    public Places findByCompetitionIdAndStartNumber(int competitionId, int startNumber);
}
