/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseString;

/**
 *
 * @author gabriel
 */
public class ClaseString {
    
    public static void main(String[] args) {
    
        String s= "iesmardealboran.com";
     
        // Tamaño de la cadena
        System.out.println("Tamaño: " + s.length());
        
        //Obtener el char de una posición concreta
        System.out.println("Char asociado a la posición 5: " + s.charAt(5));
        
        //obtener subcadena desde el caracter i-ésimo hasta el final de la cadena
        String subcadena= s.substring(3);
        System.out.println("Subcadena= " + subcadena);
        
        //Caracter j-ésimo de la cadena
        subcadena= s.substring(8,15);
        System.out.println("Subcadena= " + subcadena);
        
        //Concatenar cadenas. Equivale al operador +
        String s1= "ies";
        String s2="Mardealboran.com";
        String nuevo = s1+s2;
        System.out.println(nuevo);
        
    }
}
