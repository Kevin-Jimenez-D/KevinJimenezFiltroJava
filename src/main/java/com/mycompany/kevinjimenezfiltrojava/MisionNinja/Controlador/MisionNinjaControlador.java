/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kevinjimenezfiltrojava.MisionNinja.Controlador;

import com.mycompany.kevinjimenezfiltrojava.MisionNinja.Modelo.DAO.MisionNinjaDao;
import com.mycompany.kevinjimenezfiltrojava.MisionNinja.Modelo.clases.MisionNinja;
import java.util.List;

/**
 *
 * @author user
 */
public class MisionNinjaControlador{
    
    //Instanciar
    private static MisionNinjaDao misionNinjaDao = new MisionNinjaDao();
    
    //The methods that I created after the static or void "names" were called in HuanSync to test them
    //save, getAll and update are found in all Dao interfaces within the code
    public static void insertMisionNinja(MisionNinja misionNinja){
        misionNinjaDao.save(misionNinja);
    }
    
    public static  List<MisionNinja> getAllMisionNinja(){
        return misionNinjaDao.getAll();
    }
    
    public static MisionNinja getByIdMisionNinja(long misionNinjaId){
        return misionNinjaDao.getById(misionNinjaId); 
    }
    
    public static void updateMisionNinja(MisionNinja misionNinja) {
        misionNinjaDao.update(misionNinja);
    }
    
}
