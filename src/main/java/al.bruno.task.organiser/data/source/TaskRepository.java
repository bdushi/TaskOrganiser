package al.bruno.task.organiser.data.source;

import javax.inject.Inject;

public class TaskRepository {
    private final TaskDataSource taskDataSource;
    @Inject
    public TaskRepository(TaskDataSource taskDataSource) {
        this.taskDataSource = taskDataSource;
    }


}
