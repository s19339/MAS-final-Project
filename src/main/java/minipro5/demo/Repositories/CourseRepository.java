package minipro5.demo.Repositories;

import minipro5.demo.Model.Bus;
import minipro5.demo.Model.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository  extends CrudRepository<Course,Long> {
}
