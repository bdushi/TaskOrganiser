package al.bruno.task.organiser.di;

import al.bruno.task.organiser.Main;
import al.bruno.task.organiser.Main_MembersInjector;
import al.bruno.task.organiser.data.source.TaskTypeDataSource;
import al.bruno.task.organiser.data.source.TaskTypeRepository;
import al.bruno.task.organiser.data.source.local.TaskTypeLocalDataSource;
import al.bruno.task.organiser.data.source.local.TaskTypeLocalDataSource_Factory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerTaskComponent implements TaskComponent {
  private final DaggerTaskComponent taskComponent = this;

  private Provider<SessionFactory> sessionFactoryProvider;

  private Provider<Session> sessionProvider;

  private Provider<TaskTypeLocalDataSource> taskTypeLocalDataSourceProvider;

  private Provider<TaskTypeDataSource> providesTaskTypeLocalDataSourceProvider;

  private DaggerTaskComponent(CoreModule coreModuleParam, Main appParam) {

    initialize(coreModuleParam, appParam);

  }

  public static TaskComponent.Factory factory() {
    return new Factory();
  }

  private TaskTypeRepository taskTypeRepository() {
    return new TaskTypeRepository(providesTaskTypeLocalDataSourceProvider.get());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final CoreModule coreModuleParam, final Main appParam) {
    this.sessionFactoryProvider = DoubleCheck.provider(CoreModule_SessionFactoryFactory.create(coreModuleParam));
    this.sessionProvider = DoubleCheck.provider(CoreModule_SessionFactory.create(coreModuleParam, sessionFactoryProvider));
    this.taskTypeLocalDataSourceProvider = TaskTypeLocalDataSource_Factory.create(sessionProvider);
    this.providesTaskTypeLocalDataSourceProvider = DoubleCheck.provider((Provider) taskTypeLocalDataSourceProvider);
  }

  @Override
  public void inject(Main app) {
    injectMain(app);
  }

  private Main injectMain(Main instance) {
    Main_MembersInjector.injectTaskTypeRepository(instance, taskTypeRepository());
    return instance;
  }

  private static final class Factory implements TaskComponent.Factory {
    @Override
    public TaskComponent create(Main app) {
      Preconditions.checkNotNull(app);
      return new DaggerTaskComponent(new CoreModule(), app);
    }
  }
}
