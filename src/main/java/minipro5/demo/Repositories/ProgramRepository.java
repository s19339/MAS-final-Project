package minipro5.demo.Repositories;

import minipro5.demo.Model.Bus;
import minipro5.demo.Model.Program;
import minipro5.demo.Model.Qualification;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProgramRepository extends CrudRepository<Program,Long> {

//    public List<Program> findByProgramName(String name);
}
