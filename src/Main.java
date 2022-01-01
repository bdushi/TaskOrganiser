import javafx.application.Application;
import javafx.stage.Stage;

/**
 * https://docs.oracle.com/javafx/2/layout/builtin_layouts.htm
 */

public class Main extends Application {

    private final TaskController taskController;

    public Main() {
        this.taskController = new TaskController();
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setScene(NewScene.newScene(new TaskView()));
        stage.setTitle("Task Organiser");
        stage.show();
    }
}
