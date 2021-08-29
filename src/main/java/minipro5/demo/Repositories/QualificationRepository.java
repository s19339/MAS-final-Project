package minipro5.demo.Repositories;

import minipro5.demo.Model.Qualification;
import minipro5.demo.Model.Teacher;
import org.springframework.data.repository.CrudRepository;

public interface QualificationRepository  extends CrudRepository<Qualification,Long> {
}
