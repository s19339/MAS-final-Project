package minipro5.demo.Repositories;

import minipro5.demo.Model.Assignment;
import minipro5.demo.Model.Student;
import minipro5.demo.Model.Teacher;
import minipro5.demo.Model.Topic;
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
class CompositionTest {

    @Autowired
    private AssignmentRepository assignmentRepository;

    @Autowired
    private TopicReposditory topicReposditory;


    @PersistenceContext
    private EntityManager entityManager;

    Assignment a1;
    Topic t1;


    @BeforeEach
    public void initData()
    {
        t1 = Topic.builder()
                .name("Assignment")
                .description("last project")
                .build();

        a1 = Assignment.builder()
                .topic("Miniproject")
                .minWords(5000.0)
                .build();

    }

    @Test
    public void testRequiredDependencies(){

        assertNotNull(assignmentRepository);
        assertNotNull(topicReposditory);
    }

}