package minipro5.demo;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
class DataInitializer {

    @EventListener
    public void atStart(ContextRefreshedEvent ev){
        System.out.println("Context Refreshed");
    }

}
