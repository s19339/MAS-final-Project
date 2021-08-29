package minipro5.demo.Service;

import lombok.RequiredArgsConstructor;
import minipro5.demo.Model.Bus;
import minipro5.demo.Model.Person;
import minipro5.demo.Model.Program;
import minipro5.demo.Repositories.PersonRepository;
import minipro5.demo.Repositories.ProgramRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProgramService {
    private final ProgramRepository programRepository;

//    public List<Program> getStudentByBusId( long id) {
//        return programRepository.findById(id);
//    }

//    public List<Program> getAllProgram() {
//        Iterable<Program> all = programRepository.findAll();
//        List<Program> res = new ArrayList<>();
//        all.forEach(res :: add);
//        return res;
//
//    }

}
