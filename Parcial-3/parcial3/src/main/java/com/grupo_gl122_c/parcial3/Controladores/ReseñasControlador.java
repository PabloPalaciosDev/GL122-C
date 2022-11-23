package com.grupo_gl122_c.parcial3.Controladores;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grupo_gl122_c.parcial3.Modelos.ReseñasUsuario;
import com.grupo_gl122_c.parcial3.Servicios.ReseñasUsuarioDB;

@RestController
public class ReseñasControlador {
    @GetMapping("/reseñas/all")
    public List<ReseñasUsuario> ObtenerReseñas(){
        return new ReseñasUsuarioDB().obtenReseñasUsuarios();
    }
}
