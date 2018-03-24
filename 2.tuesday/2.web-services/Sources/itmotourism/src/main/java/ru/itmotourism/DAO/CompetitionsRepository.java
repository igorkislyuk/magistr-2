package ru.itmotourism.DAO;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import ru.itmotourism.entities.Competitions;

import java.sql.Date;
import java.util.List;

public interface CompetitionsRepository extends JpaRepository<Competitions, Integer> {
    @Query("SELECT u FROM Competitions u WHERE u.date > current_date ORDER BY u.date DESC")
    public List<Competitions> findAllWithUpcomingDate();
    public Competitions findById(int id);
    public Competitions findByNameAndDate(String name, Date date);
}
