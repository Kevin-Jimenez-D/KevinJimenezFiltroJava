/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.kevinjimenezfiltrojava.Dao;

/**
 *
 * @author user
 */
public interface ISaveDao<T> extends IDao {
    
    void save(T t);
    
}
