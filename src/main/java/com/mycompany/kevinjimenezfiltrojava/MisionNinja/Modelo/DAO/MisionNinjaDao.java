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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
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
    public MisionNinja getById(long misionNinjaId) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        
        Operations.setConnection(BDConnection.MySQLConnection());
        String stm = "select * from MisionNinja where ID_Ninja = ? ;";
        try (PreparedStatement ps = Operations.getConnection().prepareStatement(stm)) {
            ps.setLong(1, misionNinjaId);
            ResultSet rs = Operations.query_db(ps);
            
            //private long idNinja;
            //    private long idMision;
            //    private LocalDate fechaInicio;
            //    private LocalDate fechaFin;

            //String stmInsert = "INSERT INTO MisionNinja (ID_Ninja, ID_Mision, FechaInicio, FechaFin) VALUES (?, ?, ?, ?)";
 
            
            if (rs.next()) {
                MisionNinja misionNinja = new MisionNinja();
                
                misionNinja.setIdNinja(rs.getLong("ID_Ninja"));
                misionNinja.setIdMision(rs.getLong("ID_Mision"));
                misionNinja.setFechaInicio(LocalDate.parse(rs.getString("fechaInicio")));
                
                //La logica puede ser si todo eso da nullo, se envia nullo o no se envia nada, pero sino, se coloca el comando
                misionNinja.setFechaFin(LocalDate.parse(rs.getString("FechaFin")));
                
//                List<String> listActivities = Arrays.asList(rs.getString("activitiesWorkerRole").split("\\|"));
//                order.setWorkerRoleActivities(listActivities);
                
                return misionNinja;
            } else {
                System.out.println("ERROR: The id has not been found");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
        
        
    }

    @Override
    public void update(MisionNinja t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
