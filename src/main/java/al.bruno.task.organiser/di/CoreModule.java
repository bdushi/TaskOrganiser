package  al.bruno.task.organiser.di;

import dagger.Module;
import dagger.Provides;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import javax.inject.Singleton;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static al.bruno.task.organiser.common.Constants.LOG_SQLITE;
import static al.bruno.task.organiser.common.Constants.URL;

/**
 *
 * Connect to a sample database
 *
 * https://github.com/xerial/sqlite-jdbc
 *
 * https://www.baeldung.com/jooq-intro
 *
 * https://github.com/etiennestuder/gradle-jooq-plugin
 *
 * https://www.jooq.org/doc/latest/manual/code-generation/codegen-gradle/
 */

@Module
public class CoreModule {
    @Singleton
    @Provides
    public DSLContext dSLContext(Connection connection) {
        return DSL.using(connection, SQLDialect.SQLITE);
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
//
//    @Reusable
//    @Provides
//    public Statement statement(Connection connection) {
//        try(Statement statement = connection.createStatement()) {
//            statement.setQueryTimeout(30);
//            return statement;
//        } catch (SQLException e) {
//            return null;
//        }
//    }
}
