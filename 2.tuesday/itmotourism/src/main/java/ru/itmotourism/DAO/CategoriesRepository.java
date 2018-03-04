package ru.itmotourism.DAO;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import ru.itmotourism.entities.Categories;

import java.util.List;

public interface CategoriesRepository extends CrudRepository<Categories, Integer> {
    public Categories findByPeopleIdAndKindOfSportAndCategory(int peopleId, String kindOfSport, String category);
    public Categories findByOrderNumber(String orderNumber);
    public Categories findByPeopleIdAndKindOfSport(int peopleId, String kindOfSport);
    @Query("select c from Categories c order by c.kindOfSport, c.category")
    public List<Categories> findAllOrderByKindOfSport();
}
