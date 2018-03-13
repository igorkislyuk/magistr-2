package ru.itmotourism.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
import ru.itmotourism.entities.Roles;

import java.util.List;


public interface RolesRepository extends CrudRepository<Roles, Integer> {
    List<Roles> findByUserName(String username);

    @Transactional
    void deleteByUserName(String username);
}
