package  al.bruno.task.organiser.di;

import al.bruno.task.organiser.model.Task;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcPooledConnectionSource;
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
 *
 * Connect to a sample database
 *
 * https://github.com/xerial/sqlite-jdbc
 *
 * https://www.baeldung.com/spring-boot-sqlite
 */

@Module
public class CoreModule {
    @Singleton
    @Provides
    public JdbcPooledConnectionSource jdbcPooledConnectionSource() {
        try {
            return new JdbcPooledConnectionSource(URL);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Singleton
    @Provides
    public Dao<Task, Long> taskDao(JdbcPooledConnectionSource jdbcPooledConnectionSource) {
        try {
            return DaoManager.createDao(jdbcPooledConnectionSource, Task.class);
        } catch (SQLException e) {
            return null;
        }
    }

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
