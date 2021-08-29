package minipro5.demo.GUI.Controller;
import lombok.RequiredArgsConstructor;
import minipro5.demo.GUI.View.ProgramListView;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class ProgramListController {
    private final ProgramListView programListView;

    public void showGUI(MainWindowController mainWindowController) {
        mainWindowController.showView(programListView.getPanel1());
    }

}
