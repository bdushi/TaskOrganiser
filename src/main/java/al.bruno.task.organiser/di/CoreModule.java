package  al.bruno.task.organiser.di;

import dagger.Module;
import dagger.Provides;
import dagger.Reusable;

import javax.inject.Singleton;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static al.bruno.task.organiser.common.Constants.LOG_SQLITE;
import static al.bruno.task.organiser.common.Constants.URL;

/**
 * https://github.com/xerial/sqlite-jdbc
 * Connect to a sample database
 */

@Module
public class CoreModule {

    @Singleton
    @Provides
    public Connection connection() {
        try(Connection connection = DriverManager.getConnection(URL)) {
            System.out.println(LOG_SQLITE);
            return connection;
        } catch (SQLException e) {
            return null;
        }
    }

    @Reusable
    @Provides
    public Statement statement(Connection connection) {
        try(Statement statement = connection.createStatement()) {
            statement.setQueryTimeout(30);
            return statement;
        } catch (SQLException e) {
            return null;
        }
    }
}
