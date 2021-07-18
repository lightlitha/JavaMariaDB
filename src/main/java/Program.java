/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author faceless
 */
import java.sql.*;

public class Program {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // Load the JDBC driver
        Class.forName("org.mariadb.jdbc.Driver");
        System.out.println("Driver loaded");

        // Try to connect
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/db_phiscus_747", "faceless", "24685");

        System.out.println("It works!");

        connection.close();
    }
}
