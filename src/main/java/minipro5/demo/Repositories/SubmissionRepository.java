package minipro5.demo.Repositories;

import minipro5.demo.Model.Submission;
import minipro5.demo.Model.Teacher;
import org.springframework.data.repository.CrudRepository;

public interface SubmissionRepository extends CrudRepository<Submission,Long> {
}
