import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import model.TaskType;

public class FormView extends GridPane {
    public FormView() {
        Label label = new Label("School Task Organiser");
        label.setPadding(new Insets(4));
        // Subject
        Label subjectLabel = new Label("Subject: ");
        subjectLabel.setPadding(new Insets(8));
        TextField subjectField = new TextField();
        subjectField.setPromptText("Enter Subject");
        // Task Type
        Label taskTypeLabel = new Label("TaskType: ");
        taskTypeLabel.setPadding(new Insets(8));
        ComboBox<TaskType> taskTypeComboBox = new ComboBox<>();

        Label durationLabel = new Label("Duration: ");
        durationLabel.setPadding(new Insets(8));
        TextField durationField = new TextField();
        durationField.setPromptText("Enter Duration");

        Label difficultiesLabel = new Label("Difficulties: ");
        difficultiesLabel.setPadding(new Insets(8));
        ComboBox<Integer> difficultiesComboBox = new ComboBox<>(
                FXCollections.observableArrayList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        );

        Label deadlineLabel = new Label("Deadline: ");
        deadlineLabel.setPadding(new Insets(8));
        DatePicker deadlineDatePicker = new DatePicker();

        Button submit = new Button("Submit");

        Text error = new Text();
        error.setVisible(false);

        submit.setOnAction(actionEvent -> {

        });
        submit.setAlignment(Pos.BASELINE_RIGHT);
        addColumn(0, label);
        addRow(1, subjectLabel, subjectField);
        addRow(2, taskTypeLabel, taskTypeComboBox);
        addRow(3, durationLabel, durationField);
        addRow(4, difficultiesLabel, difficultiesComboBox);
        addRow(5, deadlineLabel, deadlineDatePicker);
        addRow(6, submit);
        addRow(7, error);
    }
}
