package al.bruno.task.organiser.di;

import al.bruno.task.organiser.data.TaskOrganaiser;
import al.bruno.task.organiser.data.TaskOrganiser.TaskOrganaiserImplKt;
import al.bruno.task.organiser.ui.FormView;
import al.bruno.task.organiser.ui.GridView;
import al.bruno.task.organiser.ui.task.view.TaskView;
import com.squareup.sqldelight.db.SqlDriver;
import com.squareup.sqldelight.sqlite.driver.JdbcSqliteDriver;
import dagger.Module;
import dagger.Provides;
import dagger.Reusable;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

import javax.inject.Singleton;
import java.util.Properties;

import static al.bruno.task.organiser.common.Constants.URL;

/**
 * Connect to a sample database
 *
 * https://github.com/xerial/sqlite-jdbc
 *
 * https://www.baeldung.com/spring-boot-sqlite
 */

@Module
public class CoreModule {
    @Reusable
    @Provides
    public SqlDriver sqlDriver() {
        return new JdbcSqliteDriver(JdbcSqliteDriver.IN_MEMORY, new Properties());
    }

    @Reusable
    @Provides
    public TaskOrganaiser taskOrganaiser(SqlDriver sqlDriver) {
        TaskOrganaiser.Companion.getSchema().create(sqlDriver);
        return TaskOrganaiser.Companion.invoke(sqlDriver);
    }

    @Reusable
    @Provides
    public Scene newScene(Pane pane) {
        return new Scene(pane, 720, 480);
    }

    @Reusable
    @Provides
    public TaskView taskView() {
        return new TaskView();
    }

    @Reusable
    @Provides
    public GridView gridView() {
        return new GridView();
    }

    @Reusable
    @Provides
    public FormView formView() {
        return new FormView();
    }
}
