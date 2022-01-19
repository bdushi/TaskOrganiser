package al.bruno.task.organiser.data.source;

import al.bruno.task.organiser.entity.TaskType;

import java.util.List;

public interface TaskTypeDataSource {
    void insert(TaskType taskType);
    List<TaskType> taskType();

}
