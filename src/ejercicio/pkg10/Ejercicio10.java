/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio.pkg10;
import javax.swing.*;

/**
 *
 * @author Maria Belen
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x;
        int y;
        int SumaResiduo=0;
        x = Integer.parseInt(JOptionPane.showInputDialog(null,"INGRESE UN NUMERO INICIAL"));
        y = Integer.parseInt(JOptionPane.showInputDialog(null,"INGRESE UN NUMERO FINAL" ));
        for (int i = x; i <= y; i
                
                ++) {
                   SumaResiduo=0; 
            for (int j = 1  ; j < i; j++) {
                if ((i % j)==0) {
                   SumaResiduo =SumaResiduo+j;
                }
                if ((i==y)&&((i%j)!=0)) {
                    SumaResiduo=0; 
                }
            }
            if (SumaResiduo==i) {
                JOptionPane.showMessageDialog(null, "EL PRIMER NUMERO PERFECTO ENTRE "+ x+" y "+y+ " es = " +SumaResiduo);
                i=y;
            }
        }
            if(SumaResiduo==0) {
                JOptionPane.showMessageDialog(null, "NO HAY NUMEROS PERFECTOS ENTRE "+ x+" y "+y);
            }
    
                
              
            
        }
        
        
        
    
        
        
        
    }
    

