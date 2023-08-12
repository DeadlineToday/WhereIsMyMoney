package com.example.whereismymoney;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseFunctions {

    Statement statement;
    String query;

    public Connection connectToDB() throws ClassNotFoundException, SQLException {

            Class.forName("org.postgresql.Driver");

            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + "wimm_db", "postgres","1234");

    }

    public void createTable(Connection connection) throws SQLException {

        statement = connection.createStatement();

        query = "CREATE TABLE money_info (" +
                "id INTEGER, " +
                "date DATE, " +
                "incomes DECIMAL(10,2), " +
                "expenses DECIMAL(10,2), " +
                "type VARCHAR(255), " +
                "comments VARCHAR(255), " +
                "PRIMARY KEY(id))";

        try {
            statement.executeUpdate(query);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
