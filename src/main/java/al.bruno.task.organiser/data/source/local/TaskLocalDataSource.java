package al.bruno.task.organiser.data.source.local;

import al.bruno.task.organiser.data.source.TaskDataSource;
import al.bruno.task.organiser.model.Task;
import org.hibernate.Session;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public class TaskLocalDataSource implements TaskDataSource {
    private final Session session;
    @Inject
    public TaskLocalDataSource(Session session) {
        this.session = session;
    }

    @Override
    public long insert(Task task) {
        session.beginTransaction();
        session.save(task);
        session.getTransaction().commit();
        session.close();
        return -1;
    }

    @Override
    public List<Task> getAllTasks() {
        List<Task> tasks = new ArrayList<>();
        return tasks;
    }
}
