package al.bruno.task.organiser.data.source.local;

import al.bruno.task.organiser.data.source.TaskDataSource;
import al.bruno.task.organiser.model.Task;
import al.bruno.task.organiser.model.TaskType;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TaskLocalDataSource implements TaskDataSource {
    private final Statement statement;
    public TaskLocalDataSource(Statement statement) {
        this.statement = statement;
    }

    @Override
    public long insert(Task task) {
        try {
            return statement.executeUpdate(
                    "INSERT INTO task ()"
            );
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override
    public List<Task> getAllTasks() {
        List<Task> tasks = new ArrayList<>();
        try {
            ResultSet rs = statement.executeQuery("select * from task");
            while(rs.next()) {
                tasks.add(
                        new Task(
                                rs.getLong(Task.TaskDDL.ID),
                                rs.getString(Task.TaskDDL.SUBJECT),
                                new TaskType(TaskType.TaskTypeDDL.TASK_TYPE),
                                rs.getLong(Task.TaskDDL.DURATION),
                                rs.getInt(Task.TaskDDL.DIFFICULTIES),
                                null
                        )
                );
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return tasks;
    }
}
