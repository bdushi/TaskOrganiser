package al.bruno.task.organiser.di;

import al.bruno.task.organiser.Main;
import dagger.BindsInstance;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {CoreModule.class, DataSourceModule.class})
public interface TaskComponent {
    @Component.Factory
    interface Factory {
        TaskComponent create(@BindsInstance Main app);
    }
    void inject(Main app);
}