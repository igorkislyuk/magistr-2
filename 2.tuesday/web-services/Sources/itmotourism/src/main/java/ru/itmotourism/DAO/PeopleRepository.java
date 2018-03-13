package ru.itmotourism.DAO;

import org.springframework.data.repository.CrudRepository;
import ru.itmotourism.entities.People;

import java.util.List;


public interface PeopleRepository extends CrudRepository<People, Integer> {
    List<People> findByNameAndSurname(String name, String surname);
    People findByUserName(String userName);
    People findByName(String Name);
    People findById(int id);
}
