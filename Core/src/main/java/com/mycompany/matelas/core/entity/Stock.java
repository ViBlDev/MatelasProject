/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.matelas.core.entity;

import java.util.HashSet;

/**
 *
 * @author Administrateur
 */
public class Stock {
    
     public HashSet<Matelas> stock = new HashSet();
     
     public Stock(){
         
         stock.add(new Matelas(1L, "Matelas 1", 200, 120, 800));
         stock.add(new Matelas(2L, "Matelas 2", 240, 180, 2200));
         stock.add(new Matelas(3L, "Matelas 3", 180, 90, 600));
         
     }
    
}
