/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio.pkg10;

import java.util.List;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author Maria Belen
 */
public class Ejercicio17 {
      String[] Letras = {"UNO", "DOS", "TRES", "CUATRO", "CINCO", "SEIS", "SIETE", "OCHO", "NUEVE",
        "DIEZ", "ONCE", "DOCE", "TRECE", "CATORCE", "QUINCE", "DIECISEIS", "DIECISIETE", "DIECIOCHO", "DIECINUEVE",
        "VEINTE", "TREINTA", "CUARENTA", "CINCUENTA", "SESENTA", "SETENTA", "OCHENTA", "NOVENTA",
        "CIEN", "CIENTO", "DOSCIENTOS", "TRESCIENTOS", "CUATROCIENTOS", "QUINIENTOS", "SEISCIENTOS", "SETECIENTOS", "OCHOCIENTOS", "NOVECIENTOS"};
 
    Integer[] Valores = {1, 2, 3, 4, 5, 6, 7, 8, 9,
        10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
        20, 30, 40, 50, 60, 70, 80, 90,
        100, 100, 200, 300, 400, 500, 600, 700, 800, 900};
 
    List lstLetras = java.util.Arrays.asList(Letras);
    public static void main(String[] args) {
    new Ejercicio17().Letras();
    }
 
    public void Letras() {
        String a =" ";
        a =(JOptionPane.showInputDialog("Ingrese el valor del entero X"));
        StringTokenizer st = new StringTokenizer(a);
        Integer numero = 0;
 
        while (st.hasMoreTokens()) {
            String t = st.nextToken();
            if (t.equals("MIL")) {
                numero *= 1000;
            }
            if (lstLetras.indexOf(t) > -1) {
                numero += Valores[lstLetras.indexOf(t)];
            }
        }
 
        System.out.println("Resultado : " + String.valueOf(numero));
    }
    
}
