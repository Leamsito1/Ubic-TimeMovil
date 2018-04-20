package com.example.ismael.timeubic;

/**
 * Created by ISMAEL on 23/03/2018.
 */

public class Datos {
    private int Id;
    private String titulo;
    private String Estacion;
    private  int image;

    public Datos(int id, String titulo, String estacion, int image) {
        Id = id;
        this.titulo = titulo;
        Estacion = estacion;
        this.image = image;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEstacion() {
        return Estacion;
    }

    public void setEstacion(String estacion) {
        Estacion = estacion;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
