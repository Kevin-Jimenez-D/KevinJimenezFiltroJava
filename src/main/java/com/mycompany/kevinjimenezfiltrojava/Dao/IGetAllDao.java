/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.kevinjimenezfiltrojava.Dao;

import java.util.List;

/**
 *
 * @author user
 */
public interface IGetAllDao<T> extends IDao {
    
    List<T> getAll();
    
}
