package minipro5.demo.GUI.View;
import lombok.Data;
import org.springframework.stereotype.Component;
import javax.swing.*;

@Data
@Component

public class MainWindowView extends JFrame {
    private JMenuItem menuItem;
    private JButton button;

    public MainWindowView () {

        setTitle("University Management System");
        setSize(1024,760);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        initMenuBar();

    }

    private void initMenuBar(){

        JMenuBar bar = new JMenuBar();
        JMenu mnuUniversity = new JMenu("Person");
        bar.add(mnuUniversity);

        JMenu mnuBus = new JMenu("Bus");
        bar.add(mnuBus);

        JMenu mnuSubject = new JMenu("Program");
        bar.add(mnuSubject);

        menuItem = new JMenuItem("Show Person list");
        mnuUniversity.add(menuItem);

        menuItem = new JMenuItem("Show Program list");
        mnuSubject.add(menuItem);

        menuItem = new JMenuItem("Show Bus list");
        mnuBus.add(menuItem);

        this.setJMenuBar(bar);

    }
}
