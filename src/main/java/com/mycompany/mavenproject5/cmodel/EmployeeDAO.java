/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject5.cmodel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;

/**
 *
 * @author User
 */
public class EmployeeDAO {
    
    private Connection connection;

    public EmployeeDAO() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/employeedb?useSSL=false&serverTimezone=UTC",
                    "root",
                    "password"
            );

            System.out.println("Database connected successfully!");

        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Database connection failed!");
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void addEmployee(Employee employee) {
        if (connection == null) {
            System.err.println("Database connection is null!");
            return;
        }
        try {
            String query = "INSERT INTO customer (name, address, tnumber, guests, vehicle, destinanation) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, employee.getName());
            statement.setString(2, employee.getAddress());
            statement.setString(3, employee.getTnumber());
            statement.setInt(4, employee.getGuests());
            statement.setString(5, employee.getVehicle());
            statement.setString(6, employee.getDestinanation());

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("customer added successfully!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
                System.out.println("Database connection closed.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
