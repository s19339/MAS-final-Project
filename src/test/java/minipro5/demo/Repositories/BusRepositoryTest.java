package minipro5.demo.Repositories;

import minipro5.demo.Model.Bus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class BusRepositoryTest {

    @Autowired
    private BusRepository busRepository;

    Bus b1;

    @PersistenceContext
    private EntityManager entityManager;
    @BeforeEach
    public void initData(){
        b1 = Bus.builder()
                .name("Honda")
                .model("Platina")
                .cost(50000_00d)
                .build();
    }

    @Test
    public void testRequiredDependencies (){
        assertNotNull(busRepository);
    }

    @Test
    public void fetchRepositories(){
        Iterable<Bus> all = busRepository.findAll();
        for( Bus b : all){
            System.out.println(b);
        }
    }

   // @Test
//    public void testSaveBike() {
//        busRepository.save(b1);
//        entityManager.flush();
//        long count = busRepository.count();
//        assertEquals(3, count);
//
//    }

//    @Test
//    public void testSaveInvalidCost(){
//        b1.setCost(-10d);
//        busRepository.save(b1);
//        entityManager.flush();
//    }

    @Test
    public void testFindByName(){

       List<Bus> bmw = busRepository.findByName("BMW");
        System.out.println(bmw);
        assertEquals(1, bmw.size());
    }

    @Test
    public void testMinCost() {
       List<Bus> bus = busRepository.findMinCost(11000);
        System.out.println(bus);
        assertEquals(1, bus.size());
    }
}