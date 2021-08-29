package minipro5.demo.Repositories;

import minipro5.demo.Model.Assigned;
import minipro5.demo.Model.Assignment;
import minipro5.demo.Model.Bus;

import minipro5.demo.Model.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;


import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class WithAnAttributeTest {

    @Autowired
    private AssignmentRepository assignmentRepository;

    @Autowired
    private AssiggnedRepository assiggnedRepository;

    @Autowired
    private StudentRepository studentRepository;

    Student s1;
    Assignment a1;
    Assigned as1;

    @Test
    public void testRequiredDependencies(){
        assertNotNull(assiggnedRepository);
        assertNotNull(assignmentRepository);
        assertNotNull(studentRepository);

    }

    @BeforeEach
    public void initData(){

        s1 = Student.builder()
                .firstName("kunal")
                .lastName("Kashyap")
                .address("warsaw")
                .subject(new HashSet<>(Arrays.asList("Python" ," MAS")))
                .year(3)
                .build();

        a1 = Assignment.builder()
                .topic("Project")
                .minWords(500000)
                .build();

        as1 = Assigned.builder()
                .startDate(LocalDate.EPOCH)
                .endDate(LocalDate.EPOCH)
                .build();


    }
}
