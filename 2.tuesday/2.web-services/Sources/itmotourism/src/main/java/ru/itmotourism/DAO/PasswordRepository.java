package ru.itmotourism.DAO;


import org.springframework.data.repository.CrudRepository;
import ru.itmotourism.entities.Passwords;


public interface PasswordRepository extends CrudRepository<Passwords, Integer>{
    public Passwords findByUserName(String userName);
    public void deleteAllByUserName(String userName);
}
