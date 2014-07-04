/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio.pkg10;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Omar
 */
public class Ejercicio4 {
    
    public String ejercicio4(String S1, String S2) {
        // TODO code application logic here
        //int tamano1,tamano2; 
        Scanner ingreso = new Scanner(System.in);
        System.out.print("Ingrese la primera frase: ");
        S1 = ingreso.next();
        System.out.print("Ingrese la segunda frase: ");
        S2 = ingreso.next();
        S1=S1.toLowerCase();
        S2=S2.toLowerCase();             
        char [] cadenaS1=S1.toCharArray();
        char[] cadenaS2=S2.toCharArray();
        
        for (int i = 0; i < S2.length(); i++) {
            for (int j = 0; j < S1.length(); j++) {
                if (cadenaS1[j]==cadenaS2[i]) {
                    cadenaS1[j]=' ';
                }
            }           
        }
        String salida="";
        String temp="";
        for (int i=0;i<S1.length();i++){
               if (cadenaS1[i]!=' ') {
                   
                  salida=salida+cadenaS1[i]; 
                  temp = salida;
               }
        }
        return temp;
    }
}
