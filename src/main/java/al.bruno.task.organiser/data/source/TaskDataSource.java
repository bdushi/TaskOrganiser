package al.bruno.task.organiser.data.source;

import al.bruno.task.organiser.entity.Task;

import java.util.List;

public interface TaskDataSource {
    public long insert(Task task);
    public List<Task> getAllTasks();
}
