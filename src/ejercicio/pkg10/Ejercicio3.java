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
public class Ejercicio3 {
    
    public int ejercicio3(int x, int y) {
        // TODO code application logic here
        Scanner ingreso = new Scanner(System.in);
        System.out.print("Ingrese le valor de x : ");
        x = ingreso.nextInt();
        System.out.print("Ingrese le valor de y : ");
        y = ingreso.nextInt();
        int[] array= new int[y];
        int m=2, n=0, temp=0;
        if(x<=0||x>=255||y<=0||y>=255)
        {
            return -1;
        }
        else
        {
            for(int k=0; k<=y-1; k++)
            {
                if(k==0)
                {
                      array[k]=x;
                }
                else
                {
                    n=x/m;
                    array[k]=n;
                    m++;
                    temp = array[k];
                }
            }
        }
        return temp;
    }  
}
