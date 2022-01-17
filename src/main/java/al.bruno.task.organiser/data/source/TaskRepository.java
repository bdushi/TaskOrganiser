package al.bruno.task.organiser.data.source;

import al.bruno.task.organiser.model.Task;

import javax.inject.Inject;

public class TaskRepository {
    private final TaskDataSource taskDataSource;
    @Inject
    public TaskRepository(TaskDataSource taskDataSource) {
        this.taskDataSource = taskDataSource;
    }
    public long insert(Task task) {
        return taskDataSource.insert(task);
    }

}
