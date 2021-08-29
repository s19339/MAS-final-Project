package minipro5.demo;

import minipro5.demo.GUI.Controller.MainWindowController;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import javax.swing.*;

@SpringBootApplication
public class DemoApplication {



    public static void main(String[] args) {
//          SpringApplication.run(DemoApplication.class, args);

        ConfigurableApplicationContext ctx = new SpringApplicationBuilder(DemoApplication.class).headless(false)
                .run(args);

        SwingUtilities.invokeLater( () -> {
            ctx.getBean(MainWindowController.class).showGUI();
        } );

    }

}
