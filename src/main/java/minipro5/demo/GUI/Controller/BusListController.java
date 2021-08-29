package minipro5.demo.GUI.Controller;

import lombok.RequiredArgsConstructor;

import minipro5.demo.GUI.View.BusListView;
import minipro5.demo.Model.Bus;

import minipro5.demo.Model.Person;
import minipro5.demo.Service.BusService;
import minipro5.demo.Service.PersonService;

import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class BusListController {

    private final BusListView view;
    private final BusService busService;
    private final PersonService personService;



    public void showGUI(MainWindowController mainWindowController) {
        updateBusFromDB();
        mainWindowController.showView(view.getConfirmed());
    }

    @PostConstruct
    public void initListeners(){
        view.getBusList().addListSelectionListener(e -> {

            if (!e.getValueIsAdjusting()) {
                Bus selectedValue = (Bus) view.getBusList().getSelectedValue();
                System.out.println("Bus Selected : " + selectedValue.getName());
                view.getSelectedBusValue().setText(selectedValue.getName());
                List<Person> personByBusID = personService.getStudentByBusId(selectedValue.getId());
                StringBuilder sb = new StringBuilder();
                for(Iterator<Person> it = personByBusID.iterator(); it.hasNext();){
                    Person s = it.next();
                    sb.append(s.getFirstName()).append(s.getLastName());
                    if (it.hasNext()){
                        sb.append(" , ");
                    }
                }
                view.getStudentValue().setText(sb.toString());
            }
        });
    }



    private void updateBusFromDB() {
        List<Bus> buses = busService.getAllBus();
        DefaultListModel<Bus> model = (DefaultListModel<Bus>) view.getBusList().getModel();
        model.removeAllElements();
        buses.forEach(model :: addElement);
    }


}
