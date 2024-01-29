/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kevinjimenezfiltrojava.Ninja.Controlador;

import com.mycompany.kevinjimenezfiltrojava.Ninja.Modelo.DAO.NinjaDao;
import com.mycompany.kevinjimenezfiltrojava.Ninja.Modelo.clases.Ninja;

/**
 *
 * @author user
 */
public class NinjaControlador {
    
    private static NinjaDao ninjaDao = new NinjaDao();
    
    public static void insertNinja(Ninja ninja) {
        ninjaDao.save(ninja);
    }
    
}
