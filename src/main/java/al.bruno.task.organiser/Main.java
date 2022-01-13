package al.bruno.task.organiser;

import al.bruno.task.organiser.common.NewScene;
import al.bruno.task.organiser.di.DaggerTaskComponent;
import al.bruno.task.organiser.ui.task.view.TaskView;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * https://dagger.dev/
 *
 * https://docs.oracle.com/javafx/2/layout/builtin_layouts.htm
 *
 * https://github.com/effad/ValidatorFX
 *
 * http://mail.openjdk.java.net/pipermail/openjfx-dev/2018-June/021977.html
 */

public class Main extends Application {
    public Main() {
        DaggerTaskComponent.factory().create(this).inject(this);
    }

    public static void main(String[] args) {
        new Main();
        launch(args);
    }
    @Override
    public void start(Stage stage) {
        stage.setScene(NewScene.newScene(new TaskView()));
        stage.setTitle("Task Organiser");
        stage.show();
    }
}
