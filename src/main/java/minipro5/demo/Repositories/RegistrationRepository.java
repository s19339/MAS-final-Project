package minipro5.demo.Repositories;

import minipro5.demo.Model.Qualification;
import minipro5.demo.Model.Registration;
import org.springframework.data.repository.CrudRepository;

public interface RegistrationRepository extends CrudRepository<Registration,Long> {
}
