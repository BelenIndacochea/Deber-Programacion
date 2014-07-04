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
public class Ejercicio1 {
    /**
     * @param args the command line arguments
     */
    public int ejercicio1(int x,int y) {
        // TODO code application logic here
        int suma=0, mayor=0 ;      
        Scanner ingreso = new Scanner(System.in);
        System.out.print("Ingrese le valor de x : ");
        x = ingreso.nextInt();
        System.out.print("Ingrese le valor de y : ");
        y = ingreso.nextInt();
        int[] array= new int[255];
        

        if(x>y) {  mayor = x;  }
        else    { mayor = y; }
        int i=7, j=6;
        
        if(x<=0||x>=255||y<=0||y>=255)
        {
            System.out.println("el resultado es: -1");
        }
        else
        {
            for(int k=0; k<=mayor-1; k=k+2)
        {
            array[k]=i;
            array[k+1]=j;
            i++;
            j=j-2;             
        }
        suma=array[x-1]+array[y-1];
        for(int k=0; k<=mayor-1;k++)
        {
            System.out.println(array[k]);
        }
         System.out.println("el resultado es :"+suma);
        }       
        return suma;
    }
}
