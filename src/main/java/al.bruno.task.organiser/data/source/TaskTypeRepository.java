package al.bruno.task.organiser.data.source;

import al.bruno.task.organiser.entity.TaskType;

import javax.inject.Inject;
import java.util.List;

public class TaskTypeRepository {
    private final TaskTypeDataSource taskTypeDataSource;
    @Inject
    public TaskTypeRepository(TaskTypeDataSource taskTypeDataSource) {
        this.taskTypeDataSource = taskTypeDataSource;
    }

    public List<TaskType> taskType() {
        return taskTypeDataSource.taskType();
    }

    public void insert(TaskType taskType) {
        taskTypeDataSource.insert(taskType);
    }
}
