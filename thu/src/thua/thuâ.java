package thua;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static java.sql.DriverManager.getConnection;

public class thuâ {
        private static final String DB_URL ="jdbc:mysql://localhost:3306/studentdb";
        private static final String DB_USERNAME = "root";
        private static final String DB_PASSWORD = "root";

        public static void main(String [] args) {
            try {
                Connection connnection = getConnection (DB_URL,DB_USERNAME,DB_PASSWORD);
                System.out.println(" OK ");
                Statement statement = connnection.createStatement();
                String query = "SELECT * FROM student";
                ResultSet resultSet = statement.executeQuery(query);
                while ( resultSet.next()){
                    System.out.println("ID: "+ resultSet.getInt(1));
                    System.out.println("Name: " + resultSet.getString(2));
                    System.out.println("Score: "+ resultSet.getFloat("score"));
                    System.out.println("----------------------------------");
                }
            }catch (SQLException e) {
                e.printStackTrace();
            }

        }

}
