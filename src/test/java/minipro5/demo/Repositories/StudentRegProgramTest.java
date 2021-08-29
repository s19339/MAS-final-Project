package minipro5.demo.Repositories;

import minipro5.demo.Model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
public class StudentRegProgramTest {
    @Autowired
    private RegistrationRepository registrationRepository;

    @Autowired
    private ProgramRepository programRepository;

    @Autowired
    private StudentRepository studentRepository;

    Student s1;
    Registration reg;
    Program p;

    @Test
    public void testRequiredDependencies(){
        assertNotNull(programRepository);
        assertNotNull(registrationRepository);
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

        reg = Registration.builder()
                .regDate(LocalDate.EPOCH)
                .semester(2)
                .verification("true")
                .build();

        p = Program.builder()
                .name("ART")
                .semester("second")
                .duration(4)
                .build();
    }
}

