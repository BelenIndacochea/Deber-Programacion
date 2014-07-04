/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio.pkg10;
import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author Omar
 */
public class Ejercicio2 {
    
    public int ejercicio2(int x, int y) {
        // TODO code application logic here
        Scanner ingreso = new Scanner(System.in);
        System.out.print("Ingrese le valor de x : ");
        x = ingreso.nextInt();
        System.out.print("Ingrese le valor de y : ");
        y = ingreso.nextInt();
        int [] array= new int[y];
        int m=1; int n=x; int temp=0;
        if(x<=0||x>=255||y<=0||y>=255)
        {
            return -1;
        }
        else
        {
            for(int k=0; k<=y-1; k++)
            {
                n=n*m;
                array[k]=n;
                m++;
                temp = array[k];
            }
        } 
        return temp;                  
    }      
}
