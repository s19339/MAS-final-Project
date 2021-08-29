package minipro5.demo.Service;

import lombok.RequiredArgsConstructor;
import minipro5.demo.Model.Bus;
import minipro5.demo.Repositories.BusRepository;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BusService {

    private final BusRepository busRepository;

    public List<Bus> getAllBus() {
        Iterable<Bus> all = busRepository.findAll();
        List<Bus> res = new ArrayList<>();
        all.forEach(res :: add);
        return res;

    }

}
