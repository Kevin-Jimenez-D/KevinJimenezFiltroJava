/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kevinjimenezfiltrojava.Ninja.Modelo.DAO;

import com.mycompany.kevinjimenezfiltrojava.Dao.ISaveDao;
import com.mycompany.kevinjimenezfiltrojava.Ninja.Modelo.clases.Ninja;
import com.mycompany.kevinjimenezfiltrojava.Persistencia.Operations;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class NinjaDao implements ISaveDao<Ninja>{

    @Override
    public void save(Ninja ninja) {
        String stmInsert = "INSERT INTO Ninja(ID, Nombre, Rango, Aldea) VALUES(?,?,?,?);";
        try (PreparedStatement ps = Operations.getConnection().prepareStatement(stmInsert)) {
            ps.setLong(1, ninja.getId());
            ps.setString(2, ninja.getNombre());
            ps.setString(3, ninja.getRango());
            ps.setString(4, ninja.getAldea());

            int rows = Operations.insert_update_delete_db(ps);
            if (rows <= 0) {
                System.out.println("Cannot push event");
            } else {
                System.out.println("Successful push event");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
