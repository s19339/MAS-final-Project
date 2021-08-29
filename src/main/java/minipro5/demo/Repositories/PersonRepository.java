package minipro5.demo.Repositories;

import minipro5.demo.Model.Bus;
import minipro5.demo.Model.Person;
import minipro5.demo.Model.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonRepository extends CrudRepository <Person,Long> {
    @Query("from Person as s where s.UsesBus.id = :id")
    List<Person> findStudentByBusId(@Param("id") long id);

}
