package com.grupo_gl122_c.parcial3.Modelos;

public class ReseñasUsuario {
    private String nombre, comentario, foto, rol;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public ReseñasUsuario() {
    }

    public ReseñasUsuario(String nombre, String comentario, String foto, String rol) {
        this.nombre = nombre;
        this.comentario = comentario;
        this.foto = foto;
        this.rol = rol;
    }

    

    
}
