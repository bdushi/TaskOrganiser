package al.bruno.task.organiser.di;

import al.bruno.task.organiser.data.source.local.TaskLocalDataSource;
import dagger.Binds;
import dagger.Module;

import javax.inject.Singleton;

@Module
public abstract class DataSourceModule {
    @Singleton
    @Binds
    public abstract TaskLocalDataSource providesTaskLocalDataSource(TaskLocalDataSource taskLocalDataSource);
}