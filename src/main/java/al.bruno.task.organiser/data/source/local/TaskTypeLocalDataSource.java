package al.bruno.task.organiser.data.source.local;

import al.bruno.task.organiser.data.TaskOrganaiser;
import al.bruno.task.organiser.data.source.TaskTypeDataSource;
import al.bruno.task.organiser.entity.TaskType;
import com.squareup.sqldelight.TransactionWithoutReturn;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

public class TaskTypeLocalDataSource implements TaskTypeDataSource {
    private final TaskOrganaiser taskOrganaiser;
    @Inject
    public TaskTypeLocalDataSource(TaskOrganaiser taskOrganaiser) {
        this.taskOrganaiser = taskOrganaiser;
    }

    @Override
    public void insert(TaskType taskType) {
        taskOrganaiser.getTaskTypeQueries().insert(taskType.getTaskType());
    }

    @Override
    public List<TaskType> taskType() {
        return taskOrganaiser
                .getTaskTypeQueries()
                .getAll()
                .executeAsList()
                .stream()
                .map(
                        taskType -> new TaskType(taskType.get_id(), taskType.get_task_type())
                ).collect(Collectors.toList());
    }
}
