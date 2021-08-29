package minipro5.demo.Repositories;

import minipro5.demo.Model.Student;
import minipro5.demo.Model.Teacher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Arrays;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class PersonRepositoryTest {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private TeacherRepository teacherRepository;

    @PersistenceContext
    private EntityManager entityManager;

    Teacher t1;
    Student s1 , s2;

    @BeforeEach
    public void initData()
    {
        t1 = Teacher.builder()
                .firstName("Michal")
                .firstName("Jan")
                .address("listopada")
                .subjectTeaching("Mathematics")
                .salary(5000.0)
                .build();

        s1 = Student.builder()
                .firstName("kunal")
                .lastName("Kashyap")
                .address("warsaw")
                .subject(new HashSet<>(Arrays.asList("Python" ," MAS")))
                .year(3)
                .build();

        s2 = Student.builder()
                .firstName("Jay")
                .lastName("patel")
                .address("spain")
                .subject(new HashSet<>(Arrays.asList("ppj" ," gui")))
                .year(3)
                .build();
    }

    @Test
    public void testRequiredDependencies(){

        assertNotNull(teacherRepository);
        assertNotNull(personRepository);
        assertNotNull(studentRepository);
    }

//    @Test
//    public void testSaveAll(){
//        studentRepository.saveAll(Arrays.asList(s1,s2));
//       // teacherRepository.saveAll(t1);
//        entityManager.flush();
//
//        assertEquals(2,studentRepository.count());
//    }

}