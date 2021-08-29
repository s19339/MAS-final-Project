package minipro5.demo.Repositories;

import minipro5.demo.Model.Qualification;
import minipro5.demo.Model.Session;
import org.springframework.data.repository.CrudRepository;

public interface SessionRepository extends CrudRepository<Session,Long> {
}
