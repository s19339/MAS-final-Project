package minipro5.demo.Repositories;

import minipro5.demo.Model.Bus;
import minipro5.demo.Model.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student,Long> {



}
