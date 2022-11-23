package com.grupo_gl122_c.parcial3.Servicios;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.grupo_gl122_c.parcial3.Modelos.ReseñasUsuario;

public class ReseñasUsuarioDB {
    Connection _cn;

    public ReseñasUsuarioDB(){
        _cn = new Conexion().abrirDB();
    }

    public List<ReseñasUsuario> obtenReseñasUsuarios(){
        try {
            Statement stnt = _cn.createStatement();
            String query = "SELECT * FROM Reseñas";

            List<ReseñasUsuario> reseñas = new ArrayList<>();

            ResultSet result = stnt.executeQuery(query);
            while(result.next()){
                ReseñasUsuario reseña = new ReseñasUsuario(
                    result.getString("nombre"),
                    result.getString("comentario"),
                    result.getString("foto"),
                    result.getString("rol")
                    );

                reseñas.add(reseña);
            }
            result.close();
            stnt.close();
            return reseñas;

        } catch (SQLException e) {
            System.out.println("Excepcion en ReseñasUsuarioDB");
            int x = 1;
        }
        return null;
    }
}
