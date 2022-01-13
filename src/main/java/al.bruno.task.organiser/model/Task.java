package al.bruno.task.organiser.model;

import java.time.LocalDate;

public class Task {
    private Long id;
    private String subject;
    private TaskType taskType;
    private Long duration;
    private Integer difficulties;
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

    public static class TaskDDL {
        public static String TABLE_NAME = "task";
        public static String ID = "_id";
        public static String SUBJECT = "_subject";
        public static String TASK_TYPE = "_task_type";
        public static String DURATION = "_duration";
        public static String DIFFICULTIES = "_difficulties";
        public static String DEADLINE = "_deadline";

        public static String CREATE_TASK_TYPE = "CREATE OR REPLACE TABLE " + TABLE_NAME + " ("
                + ID + " INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, "
                + SUBJECT + " TEXT,"
                + TASK_TYPE + " INTEGER REFERENCES task_type(_id) ON UPDATE CASCADE ON DELETE CASCADE,"
                + DURATION + " REAL,"
                + DIFFICULTIES + " INTEGER,"
                + DEADLINE + " TEXT,"
                + ")";
    }
}
