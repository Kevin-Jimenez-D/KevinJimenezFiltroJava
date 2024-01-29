/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kevinjimenezfiltrojava.MisionNinja.Controlador;

import com.mycompany.kevinjimenezfiltrojava.Dao.IGetAllDao;
import com.mycompany.kevinjimenezfiltrojava.Dao.IGetByIdDao;
import com.mycompany.kevinjimenezfiltrojava.Dao.ISaveDao;
import com.mycompany.kevinjimenezfiltrojava.Dao.IUpdateDao;
import com.mycompany.kevinjimenezfiltrojava.MisionNinja.Modelo.clases.MisionNinja;
import java.util.List;

/**
 *
 * @author user
 */
public class MisionNinjaControlador implements ISaveDao<MisionNinja>, IGetByIdDao<MisionNinja>, IUpdateDao<MisionNinja>, IGetAllDao<MisionNinja> {

    @Override
    public void save(MisionNinja t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public MisionNinja getById(long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(MisionNinja t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<MisionNinja> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
