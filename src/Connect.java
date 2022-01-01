import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connect {
    /**
     * https://github.com/xerial/sqlite-jdbc
     * Connect to a sample database
     */
    private static Connection connection = null;

    public static void newInstance() {
        if(connection != null) {
            connect();
        }
    }

    private Connect() {
        connect();
    }

    public Statement getStatement() throws SQLException {
        Statement statement = connection.createStatement();
        statement.setQueryTimeout(30);
        return statement;
    }

    private static void connect() {
        try {
            // db parameters
            String url = "jdbc:sqlite:db/task.db";
            // create a connection to the database
            connection = DriverManager.getConnection(url);
            System.out.println("Connection to SQLite has been established.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
