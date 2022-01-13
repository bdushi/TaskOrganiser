package al.bruno.task.organiser.data.source.local;

import al.bruno.task.organiser.data.source.TaskDataSource;
import al.bruno.task.organiser.model.Task;
import org.jooq.DSLContext;

import java.util.List;


public class TaskLocalDataSource implements TaskDataSource {
    private final DSLContext dSLContext;
    public TaskLocalDataSource(DSLContext dSLContext) {
        this.dSLContext = dSLContext;
    }


    @Override
    public long insert(Task task) {
        return 0;
    }

    @Override
    public List<Task> getAllTasks() {
        return null;
    }
}
