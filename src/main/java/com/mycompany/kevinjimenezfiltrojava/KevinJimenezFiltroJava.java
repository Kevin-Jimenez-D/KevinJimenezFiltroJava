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
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
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

        Ninja ninja1 = ninjaBuilder
            .id(4)
            .nombre("Pepe")
            .rango("Bajo")
            .aldea("Egipto")
            .build();

        //Instanciar de nuevo EXITOSO
//          ninjaControlador.insertNinja(ninja1);
       
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
        //Esto es lo que se debe comentar o descomentar si deseo agregar esos datos o no
//        misionNinjaControlador.insertMisionNinja(misionNinja1);


        /*
        Esta es la tarea 
        Mostrar las misiones disponibles para un ninja en especifico; hay un pequeño error porque le llegan nulos pero asi seria la logica
        
        Mostrar las misiones completadas para un ninja en especifico; lo hace bien porque no arroja resultados nulos
        */

        //Test getById EXITOSO, solo que analiza de a uno
            MisionNinja ninjaList = MisionNinjaControlador.getByIdMisionNinja(1);
//            System.out.println(ninjaList);
            
            
            if(ninjaList.getFechaFin()==null){
                System.out.println("Misiones disponibles");
                System.out.println(ninjaList);
            }else{
                System.out.println("Misiones completadas");
                System.out.println(ninjaList);
            }
            
        
        
        //MISION_NINJA INICIO
        
        
        
        
        //LECTURA INICIO
        //Abrir el archivo que esta en 
        /*
        //C:\Users/user\Documents\NetBeansProjects\KevinJimenezFiltroJava\src\main\java\com\mycompany\kevinjimenezfiltrojava\archivo.txt
        */
        
        
        //Leer todo el contenido de un archivo
        File archivo = null;
        FileReader reader = null;
        BufferedReader buffer = null;
        try {
            javax.swing.JFileChooser j = new javax.swing.JFileChooser();
            j.showOpenDialog(j);
            String path = j.getSelectedFile().getAbsolutePath();
            archivo = new File(path);
            reader = new FileReader(archivo);
            buffer = new BufferedReader(reader);
            String linea;
            while ((linea = buffer.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != reader) {
                    reader.close();
                }
                if (null != buffer) {
                    buffer.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        
        //LECTURA FIN
        
        
        
        //ESCRITURA INICIO
        
//        /*
//        Estado booleano que determina si se desea escribir en el archivo desde el principio o desde cero False
//        o agregar al contenido existente True
//        */        
        
        File archivo1 = null;
        FileWriter writer1 = null;
        PrintWriter pw = null;
        
        try {
            javax.swing.JFileChooser j = new javax.swing.JFileChooser();
            j.showOpenDialog(j);
            String path = j.getSelectedFile().getAbsolutePath();
            archivo1 = new File(path);
            writer1 = new FileWriter(archivo1);
            pw = new PrintWriter(writer1);
//            for(int i=0; i<10;i++){
//                pw.println("Linea " + i);
//            }
                pw.println(ninjaList);
            
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (null != archivo1) {
                    writer1.close();
                }
                if (null != archivo1) {
                    writer1.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }


        //ESCRITURA INICIO
        
        
    }
}
