/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kevinjimenezfiltrojava.Persistencia;

/**
 *
 * @author user
 */
import java.sql.*;

public abstract class BDConnection {
    private static String url = "";
    private static String user = "";
    private static String password = "";
    public static Connection con = null;

    public static Connection MySQLConnection() {
        url = "jdbc:mysql://192.168.110.122:3306/Naruto_Kevin_Jimenez";
        user = "KevinJ";
        password = "1032494350";
        return getConnection(url, user, password);
    }

    private static Connection getConnection(String url, String user, String password) {
        try {
            // Realizar la conexion
            con = DriverManager.getConnection(url, user, password);
            if (con != null) {
                DatabaseMetaData meta = con.getMetaData();
                System.out.println("Database connected " + meta.getDriverName());
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return con;
    }

}
