/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kevinjimenezfiltrojava.Ninja.Modelo.clases;

/**
 *
 * @author user
 */
public class Ninja {
    
    private long id;
    private String nombre;
    private String rango;
    private String aldea;
    
    //Constructor vacio y uno lleno con todo
    public Ninja() {
    }

    public Ninja(long id, String nombre, String rango, String aldea) {
        this.id = id;
        this.nombre = nombre;
        this.rango = rango;
        this.aldea = aldea;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public String getAldea() {
        return aldea;
    }

    public void setAldea(String aldea) {
        this.aldea = aldea;
    }

    @Override
    public String toString() {
        return "Ninja{" + "id=" + id + ", nombre=" + nombre + ", rango=" + rango + ", aldea=" + aldea + '}';
    }
    
    

    
    
    
    
}
