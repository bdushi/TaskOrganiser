package al.bruno.task.organiser.data.source.local;

import al.bruno.task.organiser.data.TaskOrganaiser;
import al.bruno.task.organiser.data.source.TaskDataSource;
import al.bruno.task.organiser.entity.Task;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public class TaskLocalDataSource implements TaskDataSource {
    private final TaskOrganaiser taskOrganaiser;
    @Inject
    public TaskLocalDataSource(TaskOrganaiser taskOrganaiser) {
        this.taskOrganaiser = taskOrganaiser;
    }

    @Override
    public long insert(Task task) {
        return -1;
    }

    @Override
    public List<Task> getAllTasks() {
        List<Task> tasks = new ArrayList<>();
        return tasks;
    }
}
