/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kevinjimenezfiltrojava.MisionNinja.Modelo.clases;

import java.time.LocalDate;

/**
 *
 * @author user
 */
public class MisionNinja {
    
    private long idNinja;
    private long idMision;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public MisionNinja() {
    }

    public MisionNinja(long idNinja, long idMision, LocalDate fechaInicio, LocalDate fechaFin) {
        this.idNinja = idNinja;
        this.idMision = idMision;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public long getIdNinja() {
        return idNinja;
    }

    public void setIdNinja(long idNinja) {
        this.idNinja = idNinja;
    }

    public long getIdMision() {
        return idMision;
    }

    public void setIdMision(long idMision) {
        this.idMision = idMision;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        return "MisionNinja{" + "idNinja=" + idNinja + ", idMision=" + idMision + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + '}';
    }
    
    
    
}
