package al.bruno.task.organiser.entity;

public class TaskType {

    private Long id;
    private String taskType;

    public TaskType(Long id, String taskType) {
        this.id = id;
        this.taskType = taskType;
    }

    public TaskType(String taskType) {
        this.taskType = taskType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }
}
