package minipro5.demo.Repositories;
import minipro5.demo.Model.Fee;
import minipro5.demo.Model.Program;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class FeeProRepositoryTest {
    @Autowired
    private FeeRepository feeRepository;
    @Autowired
    private ProgramRepository programRepository;
    Fee f;
    Program p;
    @PersistenceContext
    private EntityManager entityManager;
    @BeforeEach
    public void initData(){
        f = Fee.builder()
                .amount(1000d)
                .extraCharges(10d)
                .build();

        f = Fee.builder()
                .amount(10000d)
                .extraCharges(100d)
                .build();

        f = Fee.builder()
                .amount(10000d)
                .extraCharges(1000d)
                .build();

        p = Program.builder()
                .name("ART")
                .semester("second")
                .duration(4)
                .build();
    }
    @Test
    public void testRequiredDependencies (){
        assertNotNull(feeRepository);
        assertNotNull(programRepository);
    }
//    @Test
//    public void fetchRepositories(){
//        Iterable<Fee> all = feeRepository.findAll();
//        for( Fee f : all){
//            System.out.println(f);
//        }
//    }

    //    @Test
//    public void testSaveInvalidCost(){
//        b1.setCost(-10d);
//        busRepository.save(b1);
//        entityManager.flush();
//    }

    @Test
    public void testFindByAmount(){
        List<Fee> fees = feeRepository.findByAmount(2000d);
        System.out.println(fees);
        assertEquals(0, fees.size());
    }
//    @Test
//    public void testMinCost() {
//        List<Fee> extra = feeRepository.findExtraCharges(10d);
//        System.out.println(extra);
//        assertEquals(0, extra.size());
//    }

//    @Test
//    public void testSave() {
//        f.getProgram().getProgram_id();
//        feeRepository.save(f);
//        p.setProgram_id(1l);
//        programRepository.save(p);
//        Optional<Fee> byId = feeRepository.findById(f.getFee_id());
//        assertTrue(byId.isPresent());
//        //System.out.println(byId.get().getPerson());
//        assertEquals(1 , byId.get().getFee_id());
//    }
}