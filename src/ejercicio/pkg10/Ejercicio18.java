/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio.pkg10;

/**
 *
 * @author Omar
 */
public class Ejercicio18 {
    
    public String[] ejercicio18(String[] palabras){
        for(int i=0;i<palabras.length;i++) {
            for(int j=0;j<palabras.length-i;j++) {
                if (palabras[j].compareTo(palabras[j+1])>0) {
                    String aux;
                    aux=palabras[j];
                    palabras[j]=palabras[j+1];
                    palabras[j+1]=aux;
                }
            }
        }
        return palabras;
    }
}
