package minipro5.demo.Repositories;

import minipro5.demo.Model.Program;
import minipro5.demo.Model.Registration;
import minipro5.demo.Model.Session;
import minipro5.demo.Model.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
public class RegSessionRepositoryTest {
    @Autowired
    private RegistrationRepository registrationRepository;

    @Autowired
    private SessionRepository sessionRepository;

    Registration reg;
    Session s;

    @Test
    public void testRequiredDependencies(){
        assertNotNull(sessionRepository);
        assertNotNull(registrationRepository);
    }

    @BeforeEach
    public void initData(){

        s = Session.builder()
                .sessionCode(1)
                .toDate(LocalDate.EPOCH)
                .fromDate(LocalDate.EPOCH)
                .build();

        reg = Registration.builder()
                .regDate(LocalDate.EPOCH)
                .semester(2)
                .verification("true")
                .build();
    }
}
