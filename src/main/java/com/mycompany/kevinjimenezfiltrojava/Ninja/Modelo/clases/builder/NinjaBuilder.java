/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.kevinjimenezfiltrojava.Ninja.Modelo.clases.builder;

import com.mycompany.kevinjimenezfiltrojava.Ninja.Modelo.clases.Ninja;

/**
 *
 * @author user
 */
public interface NinjaBuilder {
    
    NinjaBuilder id(long id);
    NinjaBuilder nombre(String nombre);
    NinjaBuilder rango(String rango);
    NinjaBuilder aldea(String aldea);
    
    Ninja build();
    
}
