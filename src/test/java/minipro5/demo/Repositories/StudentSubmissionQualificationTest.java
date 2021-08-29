package minipro5.demo.Repositories;

import minipro5.demo.Model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
public class StudentSubmissionQualificationTest {
    @Autowired
    private QualificationRepository qualificationRepository;

    @Autowired
    private SubmissionRepository submissionRepository;

    @Autowired
    private StudentRepository studentRepository;

    Student s1;
    Submission sub;
    Qualification q;

    @Test
    public void testRequiredDependencies(){
        assertNotNull(qualificationRepository);
        assertNotNull(submissionRepository);
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

        sub = Submission.builder()
                .FileName("Passport")
                .Certificates("IELTS")
                .build();

        q = Qualification.builder()
                .minPercentage(50)
                .description("Information Technology")
                .build();


    }
}

