package com.example.juanka.myaudiobooksclass.modelo;

/**
 * Created by Juanka on 15/09/2016.
 */
public class BookInfo {
    String nombre;
    String autor;
    int resourt;
    String URL;

    public BookInfo(String nombre, String autor, int resourt, String URL) {
        this.nombre = nombre;
        this.autor = autor;
        this.resourt = resourt;
        this.URL = URL;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getResourt() {
        return resourt;
    }

    public void setResourt(int resourt) {
        this.resourt = resourt;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }



}
