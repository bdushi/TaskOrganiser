package al.bruno.task.organiser.data.source;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TaskRepository_Factory implements Factory<TaskRepository> {
  private final Provider<TaskDataSource> taskDataSourceProvider;

  public TaskRepository_Factory(Provider<TaskDataSource> taskDataSourceProvider) {
    this.taskDataSourceProvider = taskDataSourceProvider;
  }

  @Override
  public TaskRepository get() {
    return newInstance(taskDataSourceProvider.get());
  }

  public static TaskRepository_Factory create(Provider<TaskDataSource> taskDataSourceProvider) {
    return new TaskRepository_Factory(taskDataSourceProvider);
  }

  public static TaskRepository newInstance(TaskDataSource taskDataSource) {
    return new TaskRepository(taskDataSource);
  }
}
