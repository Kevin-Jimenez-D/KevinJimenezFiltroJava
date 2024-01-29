/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kevinjimenezfiltrojava.Ninja.Modelo.clases.builder;

import com.mycompany.kevinjimenezfiltrojava.Ninja.Modelo.clases.Ninja;

/**
 *
 * @author user
 */
public class NinjaConcreteBuilder implements NinjaBuilder{
    
    private Ninja ninja = new Ninja();

    @Override
    public NinjaBuilder id(long id) {
        ninja.setId(id);
        return this;
    }

    @Override
    public NinjaBuilder nombre(String nombre) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        ninja.setNombre(nombre);
        return this;
    }

    @Override
    public NinjaBuilder rango(String rango) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        ninja.setRango(rango);
        return this;
    }

    @Override
    public NinjaBuilder aldea(String aldea) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        ninja.setAldea(aldea);
        return this;
    }

    @Override
    public Ninja build() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return ninja;
    }
    
    
    
}
