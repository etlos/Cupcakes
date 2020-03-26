package DBAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 The purpose of Connector is to...

 @author kasper
 */
public class Connector {

    private static String URL ="jdbc:mysql://localhost:3306/cupcakes?serverTimezone=CET&useSSL=false";
    private static String USERNAME ="root";
    private static String PASSWORD = "Mac+AdamA7X";

    private static Connection singleton;

    public static void setConnection(Connection con) {
        singleton = con;
    }

    public static Connection connection() throws ClassNotFoundException, SQLException {
        if (singleton == null) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            singleton = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }
        return singleton;
    }

   /* public static void setDBCredentials() {
        String deployed = System.getenv("DEPLOYED");
        //Droplet Prod: hent variabler fra setenv.sh
        if (deployed != null) {
            URL = System.getenv("JDBC_CONNECTION_STRING");
            USERNAME = System.getenv("JDBC_USER");
            PASSWORD = System.getenv("Rock-solid1");
        } else {
            //Localhost
            URL = "jdbc:mysql://localhost:3306/cupcakes?serverTimezone=CET&useSSL=false";
            USERNAME = "root";
            PASSWORD = "Mac+AdamA7X";
        }
    }*/
}
