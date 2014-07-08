/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio.pkg10;

import javax.swing.JOptionPane;

/**
 *
 * @author Maria Belen
 */
public class Ejercicio15 {
        public static void main(String[] args) {
        // TODO code application logic here
        int num=0;int pos =0;int suma=0; int suma1=0; int mayor =0;
        num=Integer.parseInt(JOptionPane.showInputDialog("INGRESE LA DIMENSION DEL VECTOR"));
        int[] arreglo1=new  int[num];
        
        for (int i = 0; i < num; i++) {
            arreglo1 [i] = Integer.parseInt(JOptionPane.showInputDialog("INGRESE VALORES"));
        }
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {
                if (i == j) {
                    suma= i;
                    mayor = suma;
                }
               suma1= i+j;
                if (suma1 > mayor) {
                    mayor = suma1;
                 }
            }
        }
         System.out.println(mayor);   
        }
    
    
}
