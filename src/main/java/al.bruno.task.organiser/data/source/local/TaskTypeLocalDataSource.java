package al.bruno.task.organiser.data.source.local;

import al.bruno.task.organiser.data.source.TaskTypeDataSource;
import al.bruno.task.organiser.model.TaskType;
import org.hibernate.Session;

import javax.inject.Inject;
import java.util.List;

public class TaskTypeLocalDataSource implements TaskTypeDataSource {
    private final Session session;
    @Inject
    public TaskTypeLocalDataSource(Session session) {
        this.session = session;
    }
    @Override
    public List<TaskType> taskType() {
        return session.createQuery( "from TaskType", TaskType.class ).getResultList();
    }
}
