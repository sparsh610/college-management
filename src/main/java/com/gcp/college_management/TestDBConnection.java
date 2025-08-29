package com.gcp.college_management;

import java.sql.*;

public class TestDBConnection {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://192.168.1.100:3306/collegemanagement?serverTimezone=UTC";
        String username = "root";
        String password = "root";

        Connection conn = DriverManager.getConnection(url, username, password);
        System.out.println("Connected successfully!");
        conn.close();
    }
}
