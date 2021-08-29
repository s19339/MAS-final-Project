package minipro5.demo.GUI.Controller;

import minipro5.demo.GUI.View.MainWindowView;
import lombok.RequiredArgsConstructor;
import minipro5.demo.GUI.View.ProgramListView;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.swing.*;

@Controller
@RequiredArgsConstructor

public class MainWindowController {
    private final MainWindowView view;
    private final BusListController busListController;
    private final ProgramListController programListController;


    public void showGUI(){
        view.setVisible(true);
    }

    @PostConstruct
    private void initMenuListeners(){
        view.getMenuItem().addActionListener( e -> {
            busListController.showGUI(this);
//            programListController.showGUI(this);

        });
    }

//    @PostConstruct
//    private void initMenuListeners1(){
//        view.getMenuItem().addActionListener( e -> {
//            programListController.showGUI(this);
//
//        });
//    }

//    public void showView1(JPanel viewToShow1){
//        view.getContentPane().removeAll();
//        view.getContentPane().add(viewToShow1);
//        view.revalidate();
//
//    }

    public void showView(JPanel viewToShow){
        view.getContentPane().removeAll();
        view.getContentPane().add(viewToShow);
        view.revalidate();

    }

}
