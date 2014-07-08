/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio.pkg10;

import java.util.Scanner;


/**
 *
 * @author Omar
 */
public class Ejercicio16 {
    
    public int ejercicio16(int x, int y, int z) {
        // TODO code application logic here
        Scanner ingreso = new Scanner(System.in);
        System.out.print("Ingrese le valor de x : ");
        x = ingreso.nextInt();
        System.out.print("Ingrese le valor de y : ");
        y = ingreso.nextInt();
        System.out.print("Ingrese le valor de z : ");
        z = ingreso.nextInt();   
        int [] cadena = null;
        
        int valor=z-y;
        int resultado=0,i=0;
        if (x>255||y>255||z>255||x<=0||y<=0||z<=0) {
            return -1;
        }
        else{
            if (y>z) {
            resultado=0;
            i=z;
            }
        }
        
        for (int j =i; j < z; j++) {            
            x=x*valor;
            valor=valor+2;
            cadena[j]=x;            
        }
        for (int m = 0; m <z; m++) {
            if (m>(y-1)) {
              resultado=resultado+cadena[m];  
            }

        }
        System.out.println(resultado);
        return resultado;
    }
}
