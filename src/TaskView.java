import javafx.scene.layout.AnchorPane;

public class TaskView extends AnchorPane {
    public TaskView() {
        FormView formView = new FormView();
        GridView gridView = new GridView();
        getChildren().addAll(formView, gridView);
        AnchorPane.setLeftAnchor(formView, 5.0);
        AnchorPane.setRightAnchor(gridView, 5.0);
    }
}
