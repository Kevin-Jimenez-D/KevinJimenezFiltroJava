/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kevinjimenezfiltrojava;

import com.mycompany.kevinjimenezfiltrojava.Ninja.Controlador.NinjaControlador;
import com.mycompany.kevinjimenezfiltrojava.Ninja.Modelo.DAO.NinjaDao;
import com.mycompany.kevinjimenezfiltrojava.Ninja.Modelo.clases.Ninja;
import com.mycompany.kevinjimenezfiltrojava.Ninja.Modelo.clases.builder.NinjaBuilder;
import com.mycompany.kevinjimenezfiltrojava.Ninja.Modelo.clases.builder.NinjaConcreteBuilder;
import com.mycompany.kevinjimenezfiltrojava.Persistencia.BDConnection;
import com.mycompany.kevinjimenezfiltrojava.Persistencia.Operations;

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

        //Instanciar de nuevo
          ninjaControlador.insertNinja(promotion1);
       
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
        
    }
}
