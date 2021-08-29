package minipro5.demo.Repositories;
import minipro5.demo.Model.Fee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import java.util.List;
public interface FeeRepository extends CrudRepository<Fee, Long> {
    public List<Fee> findByAmount(double amount);
    @Query("from Fee as f where f.amount >:minCost")
    public  List<Fee> findExtraCharges(@Param("minCost")double minCost);
}