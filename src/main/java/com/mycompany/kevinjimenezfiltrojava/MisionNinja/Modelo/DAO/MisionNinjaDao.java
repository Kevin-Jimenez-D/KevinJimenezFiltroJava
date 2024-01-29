/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kevinjimenezfiltrojava.MisionNinja.Modelo.DAO;

import com.mycompany.kevinjimenezfiltrojava.Dao.IGetAllDao;
import com.mycompany.kevinjimenezfiltrojava.Dao.IGetByIdDao;
import com.mycompany.kevinjimenezfiltrojava.Dao.ISaveDao;
import com.mycompany.kevinjimenezfiltrojava.Dao.IUpdateDao;
import com.mycompany.kevinjimenezfiltrojava.MisionNinja.Modelo.clases.MisionNinja;
import com.mycompany.kevinjimenezfiltrojava.Persistencia.BDConnection;
import com.mycompany.kevinjimenezfiltrojava.Persistencia.Operations;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author user
 */
public class MisionNinjaDao implements ISaveDao<MisionNinja>,IGetAllDao<MisionNinja>, IGetByIdDao<MisionNinja>, IUpdateDao<MisionNinja>{

    @Override
    public void save(MisionNinja misionNinja) {
        Operations.setConnection(BDConnection.MySQLConnection());
//        String stmInsert = "INSERT INTO MisionNinja (ID_Ninja, ID_Mision, FechaInicio, FechaFin) VALUES (?, ?, ?, ?)";
        String stmInsert = "INSERT INTO MisionNinja (ID_Ninja, ID_Mision, FechaInicio) VALUES (?, ?, ?)";
        try (PreparedStatement ps = Operations.getConnection().prepareStatement(stmInsert)) {
            ps.setLong(1, misionNinja.getIdNinja());
            ps.setLong(2, misionNinja.getIdMision());
            ps.setString(3, misionNinja.getFechaInicio().toString());
            //ps.setString(4, misionNinja.getFechaFin().toString());


            int rows = Operations.insert_update_delete_db(ps);
            if (rows <= 0) {
                System.out.println("Cannot insert in table product_order");
            } else {
                System.out.println("Successful insert in tableproduct_order");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<MisionNinja> getAll() {
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
    
}
