/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicatema2;

import java.util.Scanner;

/**
 *
 * @author Yezid Niño
 */
public class PracticaTema2 {

    public static void main(String[] args) {
      
      System.out.println("--- RETO 1 ---");
      System.out.println("Array: 7 3 9 1 5");
      CuentaYSuma();
      System.out.println("\n--- RETO 2 ---");
      laPalabra();
      System.out.println("\n--- RETO 3 ---");
      cuentaVocales();
      System.out.println("\n--- RETO 4 ---");        
      elRetoDeCadenas();       
      System.out.println("\n--- RETO 5 ---");        
      coordenadas();
      System.out.println("\n--- RETO 6 ---");        
      laMatrizCompleta();
      
      
      
        
    }
    
    public static void CuentaYSuma(){
        int[]lista = {7, 3, 9, 1, 5};
        
        int suma = 0;
                        
        for(int i = 0; i < lista.length; i++){
            suma += lista[i];
                          
        } 
        
        double promedio = (double) suma / lista.length;
        
        System.out.println("La Suma es: " + suma);
        System.out.println("El Promedio es: " + promedio);
    }
    
    public static void laPalabra(){
        char[] palabra = {'H','O', 'L', 'A'};
        
        for(int i = 0; i < palabra.length; i++){
            System.out.println(palabra[i]);
        }
        
        System.out.println("Longitud: " + palabra.length);
        
    }
    
    public static void cuentaVocales(){
        char[] palabra = {'P', 'R', 'O', 'G', 'R', 'A', 'M', 'A', 'C', 'I', 'O', 'N'};
        int vocales = 0;
        
        for(int i = 0; i < palabra.length; i++){
            char letra = palabra[i];
            
            if(letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U'){
                vocales++;
            }   
        }
        System.out.println("Vocales: " + vocales);
    }
    
    public static void elRetoDeCadenas(){
       Scanner scanner = new Scanner(System.in);
             
       
        System.out.print("Escriba la Palabra (Maximo 20 letras): ");
        String texto = scanner.nextLine();
        
        char[] palabra = texto.toCharArray();
        
        int vocales = 0;
        
        System.out.print("Al reves: ");
        for(int i = palabra.length - 1; i >= 0; i--){
            System.out.print(palabra[i]);
        }
        System.out.println();  
        
        System.out.println("Longitud: " + palabra.length);
        
        for(int i = 0; i < palabra.length; i++){
            char letra = Character.toUpperCase(palabra[i]);
            if(letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U'){
                vocales++;
            }
        }
        System.out.println("Vocales: " + vocales);
    }
    
    public static void coordenadas(){
        int coordenadaX = 3;
        int coordenadaY = 5;        
        char[][] matriz = new char[10][10];
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                if(i == coordenadaY && j == coordenadaX){
                    matriz[i][j] = 'X';
                }else{
                    matriz[i][j] = '0';
                }
            }
        }
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            
            System.out.println();
        }
    }
    
    public static void laMatrizCompleta(){
        int[][] matriz = {
            {2, 4, 6},
            {1, 3, 5},
            {7, 8, 9}
        };
    
    int sumaTotal = 0;
    int mayor = matriz[0][0];
    
        System.out.println("Matriz:");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        for(int i = 0; i < matriz.length; i++){
            int sumaFila = 0;
            for(int j = 0; j < matriz.length; j++){
                sumaFila += matriz[i][j];
                sumaTotal += matriz[i][j];
                
                if(matriz[i][j] > mayor){
                    mayor = matriz[i][j];
                }
            } 
            System.out.println("Suma fila " + i + ": " + sumaFila);
        }
        
        System.out.println("Suma total: " + sumaTotal);
        System.out.println("Mayor: " + mayor);
    }
}
