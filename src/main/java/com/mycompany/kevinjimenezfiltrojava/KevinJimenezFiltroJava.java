/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kevinjimenezfiltrojava;

import com.mycompany.kevinjimenezfiltrojava.MisionNinja.Controlador.MisionNinjaControlador;
import com.mycompany.kevinjimenezfiltrojava.MisionNinja.Modelo.clases.MisionNinja;
import com.mycompany.kevinjimenezfiltrojava.Ninja.Controlador.NinjaControlador;
import com.mycompany.kevinjimenezfiltrojava.Ninja.Modelo.DAO.NinjaDao;
import com.mycompany.kevinjimenezfiltrojava.Ninja.Modelo.clases.Ninja;
import com.mycompany.kevinjimenezfiltrojava.Ninja.Modelo.clases.builder.NinjaBuilder;
import com.mycompany.kevinjimenezfiltrojava.Ninja.Modelo.clases.builder.NinjaConcreteBuilder;
import com.mycompany.kevinjimenezfiltrojava.Persistencia.BDConnection;
import com.mycompany.kevinjimenezfiltrojava.Persistencia.Operations;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author user
 */
public class KevinJimenezFiltroJava {

    public static void main(String[] args) {
        
        Operations.setConnection(BDConnection.MySQLConnection());
        
        //NINJA INICIO
        
//        String sentencia = "SELECT * FROM cargo;";
//        try (PreparedStatement ps = Operations.getConnection().prepareStatement(sentencia)) {
//            ResultSet rs = Operations.query_db(ps);
//            while (rs.next()) {
//                String nombre = rs.getString("nombre");
//                System.out.println(nombre);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }


        NinjaDao ninjaDao = new NinjaDao();

        //Instanciar pero no el productId
        NinjaControlador ninjaControlador = new NinjaControlador();

        NinjaBuilder ninjaBuilder = new NinjaConcreteBuilder();

        Ninja promotion1 = ninjaBuilder
            .id(4)
            .nombre("Pepe")
            .rango("Bajo")
            .aldea("Egipto")
            .build();

        //Instanciar de nuevo EXITOSO
//          ninjaControlador.insertNinja(promotion1);
       
        //TEST DELETE SUCESFULL
//            promotionController.delete(1); 
        
        
        
        //TEST GETALL SUCESFULL     SUCESFULL
        //InstancyList
//        List<Promotion> promotionList = PromotionController.getAll();
//        
//        for (Promotion promotionN : promotionList){
//            System.out.println(promotionN);
//        }
        



       // TEST GETBYID    type is Null
//        Promotion promotionList = PromotionController.getById(1);
//            System.out.println(promotionList);
        


        //TEST updateProduct        SUCESFULL
        //Los coloque igual al orden de ProductDao.java linea 190
//            Promotion promotion2 = promotionBuilder
//            .namePromotion("cupon")
//            .description("Cupon 20%")
//            .statusPromotion(false)
//            .percent(20)
//            .promotionId(1)
//            .build();
//        
//        promotionController.updatePromotion(promotion2);

        //NINJA FIN
        
        
        
        
        
        //MISION_NINJA INICIO
        
        /*
        Esta es la tarea 
        Asignar una misión a un ninja, registrando la fecha de inicio
        Aca registra los datos y no se coloca fecha fin porque esta en mision
        */
        
        //Test save 
//        Operations.setConnection(BDConnection.MySQLConnection());
        
        MisionNinjaControlador misionNinjaControlador = new MisionNinjaControlador();
        
        MisionNinja misionNinja1 = new MisionNinja();
        
        misionNinja1.setIdNinja(1);
        misionNinja1.setIdMision(2);
        misionNinja1.setFechaInicio(LocalDate.of(2012, 10, 10));
        //misionNinja1.setFechaFin(LocalDate.of(2012, 10, 28));
        
        
        //The code of test in ProductController.java EXITOSO
        //Esto es lo que se debe comentar o descomentar
        misionNinjaControlador.insertMisionNinja(misionNinja1);
        
        //MISION_NINJA INICIO
        
    }
}
