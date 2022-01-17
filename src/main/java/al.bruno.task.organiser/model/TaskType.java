package al.bruno.task.organiser.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table( name = "task_type" )
public class TaskType implements Serializable {
    @Id
    @Column(name = "_id")
    private Long id;
    @Column(name = "_task_type")
    private String taskType;

    public TaskType() {

    }
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
