package al.bruno.task.organiser.model;

public class TaskType {
    private Long id;
    private String taskType;

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

    public static class TaskTypeDDL {

        public static String TABLE_NAME = "task_type";
        public static String ID = "_id";
        public static String TASK_TYPE = "_task_type";

        public static String CREATE_TASK_TYPE = "CREATE TABLE " + TABLE_NAME + " ("
                + ID + " INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, "
                + TASK_TYPE + " TEXT"
                + ")";
    }
}
