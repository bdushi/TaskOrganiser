package al.bruno.task.organiser.di;

import al.bruno.task.organiser.data.source.TaskTypeDataSource;
import al.bruno.task.organiser.data.source.local.TaskLocalDataSource;
import al.bruno.task.organiser.data.source.local.TaskTypeLocalDataSource;
import dagger.Binds;
import dagger.Module;

import javax.inject.Singleton;

@Module
public abstract class DataSourceModule {
    @Singleton
    @Binds
    public abstract TaskLocalDataSource providesTaskLocalDataSource(TaskLocalDataSource taskLocalDataSource);
    @Singleton
    @Binds
    public abstract TaskTypeDataSource providesTaskTypeLocalDataSource(TaskTypeLocalDataSource taskTypeLocalDataSource);
}