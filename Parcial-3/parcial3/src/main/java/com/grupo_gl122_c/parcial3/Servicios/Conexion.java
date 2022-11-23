package com.grupo_gl122_c.parcial3.Servicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public Connection abrirDB(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            String connectionURL = "jdbc:sqlserver://localhost:1433;"
            + "databaseName=Reseñas;"
            + "user=SA;"
            + "password=Pablo1020*;"
            + "trustServerCertificate=true";
            
            Connection con = DriverManager.getConnection(connectionURL);
            return con;
        } catch (SQLException e) {
            System.out.println("excepcion en la conexion");
            int x = 1;
        } catch (ClassNotFoundException cnfex){
            System.out.println("excepcion de class notfound");
            int x = 1;
        }
        return null;
    }
}
