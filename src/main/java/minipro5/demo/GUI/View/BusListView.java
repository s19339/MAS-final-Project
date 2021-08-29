package minipro5.demo.GUI.View;

import lombok.Data;
import minipro5.demo.Model.Bus;
import minipro5.demo.Model.Student;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@org.springframework.stereotype.Component
@Data

public class BusListView {
    private JPanel confirmed;
    private JList busList;
    private JLabel selectedBusValue;
    private JLabel StudentValue;
    private JLabel selectedCostValue;
    private JButton Back;
    private JButton nextButton;
     
    private void createUIComponents() {
        busList = new JList<Student>();
        busList.setCellRenderer(new BusListCellRender());
        busList.setModel(new DefaultListModel<Bus>());

    }

    private class BusListCellRender extends JLabel implements ListCellRenderer<Bus> {

        public BusListCellRender (){
            setOpaque(true);
        }

        @Override
        public Component getListCellRendererComponent(JList<? extends Bus> list, Bus value, int index, boolean isSelected, boolean cellHasFocus) {
            setText(value.getName());
            if(isSelected) {
                setBackground(list.getSelectionBackground());
                setForeground(list.getSelectionForeground());
            }else{
                setBackground(list.getBackground());
                setForeground(list.getForeground());
            }
            return this;
        }
        }

//    public void goBack() {
//        getBack().addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//                goBack();
//            }
//        });
//        return ;
//    }
    }
