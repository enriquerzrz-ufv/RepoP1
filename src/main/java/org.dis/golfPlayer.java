package org.dis;

import com.opencsv.bean.CsvBindByName;

public class golfPlayer {
    @CsvBindByName
    private int posicion;
    @CsvBindByName
    private String nombre;
    @CsvBindByName
    private   String apellido;
    @CsvBindByName
    private String pais;
    @CsvBindByName
    private   String edad;


    public golfPlayer(int posicion, String nombre, String apellido, String pais, String edad) {
        this.posicion = posicion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
        this.edad = edad;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
}
