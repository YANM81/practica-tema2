/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicatema2;

/**
 *
 * @author Yezid Niño
 */
public class PracticaTema2 {

    public static void main(String[] args) {
        
        
        
    }
    
    public static void ejercicio1(){
        int[]lista = {7, 3, 9, 1, 5};
        int suma = 0;
        double promedio = 0.0;
                
        for(int i = 0; i < lista.length; i++){
            suma = suma + lista[i];
            promedio = (double) suma / lista.length;              
        }  
        System.out.println("El promedio es: " + promedio);
    }
}
