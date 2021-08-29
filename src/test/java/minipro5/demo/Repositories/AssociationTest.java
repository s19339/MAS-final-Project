package minipro5.demo.Repositories;

import minipro5.demo.Model.Bus;

import minipro5.demo.Model.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;


import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class AssociationTest {

    @Autowired
    private BusRepository busRepository;

    @Autowired
    private StudentRepository studentRepository;

    Student s1;
    Bus b1;

    @Test
    public void testRequiredDependencies(){
        assertNotNull(busRepository);
        assertNotNull(studentRepository);

    }

    @BeforeEach
    public void initData(){
        b1 = Bus.builder()
                .name("Mercedes")
                .model("AMG")
                .cost(50000_00d)
                .build();


        s1 = Student.builder()
                .firstName("kunal")
                .lastName("Kashyap")
                .address("warsaw")
                .subject(new HashSet<>(Arrays.asList("Python" ," MAS")))
                .year(3)
                .build();

    }

//    @Test
//    public void testSave() {
//        b1.getPerson().add(s1);
//        busRepository.save(b1);
//        s1.setUsesBus(b1);
//        studentRepository.save(s1);
//
//        Optional<Bus> byId = busRepository.findById(b1.getId());
//        assertTrue(byId.isPresent());
//        System.out.println(byId.get().getPerson());
//        assertEquals(1 , byId.get().getPerson().size());
//
//    }

}
