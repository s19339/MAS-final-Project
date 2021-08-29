package minipro5.demo.Service;

import lombok.RequiredArgsConstructor;
import minipro5.demo.Model.Bus;
import minipro5.demo.Model.Person;
import minipro5.demo.Repositories.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepository personRepository;

    public List<Person> getStudentByBusId(long id) {
        return personRepository.findStudentByBusId(id);
    }

    public List<Person> getAllPerson() {
        Iterable<Person> all = personRepository.findAll();
        List<Person> res = new ArrayList<>();
        all.forEach(res :: add);
        return res;

    }

}
