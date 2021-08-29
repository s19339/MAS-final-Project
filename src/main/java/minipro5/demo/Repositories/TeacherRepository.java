package minipro5.demo.Repositories;

import minipro5.demo.Model.Bus;
import minipro5.demo.Model.Teacher;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TeacherRepository extends CrudRepository<Teacher,Long> {

}
