package minipro5.demo.Repositories;

import minipro5.demo.Model.Course;
import minipro5.demo.Model.Program;
import minipro5.demo.Model.Registration;
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
public class ProCourseRepositoryTest {
    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private ProgramRepository programRepository;


    Program p;
    Course c;

    @Test
    public void testRequiredDependencies(){
        assertNotNull(programRepository);
        assertNotNull(courseRepository);


    }

    @BeforeEach
    public void initData(){


        c = Course.builder()
                .courseName("CS")
                .credit(3.0)
                .semester(2)
                .build();

        p = Program.builder()
                .name("ART")
                .semester("second")
                .duration(4)
                .build();
    }
}
