package minipro5.demo.Repositories;
import minipro5.demo.Model.Bus;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface BusRepository extends CrudRepository <Bus,Long>{
    public List<Bus> findByName(String name);

    @Query("from Bus as b where b.cost >:minCost")
    public  List<Bus> findMinCost(@Param("minCost")double minCost);

    @Query("from Bus as b left join fetch b.person where b.id = :id")
    public Optional<Bus> findById(Long id);


}
