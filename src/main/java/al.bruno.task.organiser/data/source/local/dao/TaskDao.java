package al.bruno.task.organiser.data.source.local.dao;

import al.bruno.task.organiser.model.Task;

import java.util.List;

public interface TaskDao {
    public List<Task> getAllTasks();
}
