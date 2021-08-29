package minipro5.demo.GUI.View;


import lombok.Data;
import minipro5.demo.Model.Program;


import javax.swing.*;
import java.awt.*;

@org.springframework.stereotype.Component
@Data

public class ProgramListView {
    private JPanel panel1;
    private JList ProgramList;
    private JButton backButton1;
    private JButton nextButton1;
    private JLabel selectedProgram;
    private JLabel personValue;


    private void createUIComponents() {
        ProgramList = new JList<Program>();
        ProgramList.setCellRenderer(new ProgramListCellRender());
        ProgramList.setModel(new DefaultListModel<Program>());

    }

    private class ProgramListCellRender extends JLabel implements ListCellRenderer<Program> {

        public ProgramListCellRender (){
            setOpaque(true);
        }

           @Override
        public Component getListCellRendererComponent(JList<? extends Program> list, Program value, int index, boolean isSelected, boolean cellHasFocus) {
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
}


