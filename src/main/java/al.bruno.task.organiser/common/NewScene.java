package al.bruno.task.organiser.common;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class NewScene {
    private NewScene() {

    }
    public static Scene newScene(Pane pane) {
        return new Scene(pane, 720, 480);
    }
}
