package al.bruno.task.organiser.model;

import al.bruno.task.organiser.hibernate.config.LocalDateAttributeConverter;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table( name = "task" )
public class Task implements Serializable {
    @Id
    @Column(name = "_id")
    private Long id;
    @Column(name = "_subject")
    private String subject;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "_task_type", referencedColumnName = "_id")
    private TaskType taskType;
    @Column(name = "_duration")
    private Long duration;
    @Column(name = "_difficulties")
    private Integer difficulties;

    @Convert(converter = LocalDateAttributeConverter.class)
    @Column(name = "_deadline")
    private LocalDate deadline;

    public Task(Long id, String subject, TaskType taskType, Long duration, Integer difficulties, LocalDate deadline) {
        this.id = id;
        this.subject = subject;
        this.taskType = taskType;
        this.duration = duration;
        this.difficulties = difficulties;
        this.deadline = deadline;
    }
    public Task(String subject, TaskType taskType, Long duration, Integer difficulties, LocalDate deadline) {
        this.subject = subject;
        this.taskType = taskType;
        this.duration = duration;
        this.difficulties = difficulties;
        this.deadline = deadline;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public TaskType getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskType taskType) {
        this.taskType = taskType;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public Integer getDifficulties() {
        return difficulties;
    }

    public void setDifficulties(Integer difficulties) {
        this.difficulties = difficulties;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }
}
