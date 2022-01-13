package al.bruno.task.organiser.model;

import java.time.LocalDate;

public class Task {
    private long id;
    private String subject;
    private TaskType taskType;
    private long duration;
    private long difficulties;
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public long getDifficulties() {
        return difficulties;
    }

    public void setDifficulties(long difficulties) {
        this.difficulties = difficulties;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }
}
