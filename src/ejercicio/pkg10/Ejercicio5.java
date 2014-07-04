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
public class Ejercicio5 {
    
    public int[] ejercicio5(int x) {
        // TODO code application logic here
        int num=0;
        Scanner ingreso = new Scanner(System.in);
        System.out.print("Cuántos valores va a ingresar? : ");
        x = ingreso.nextInt();
        int[] array= new int[x];
        for(int i=0; i<x;i++)
        {
            num=ingreso.nextInt();
            array[i]=num;
        }
        //ordenar array
        int temp;
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<x-1;j++){
                if(array[j+1]<array[j])
                {
                    temp=array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                }
            }
        }       
        int aux;
        for(int i=0; i<x;i++)
        {
            if(i==0) System.out.print(array[i]+" ");
            if(i!=0){
                aux=i-1;
                temp = array[i];
                if(array[aux]!=temp){
                    System.out.print(array[i]+" ");
                }
            }
        }
        return  array;  
    }
}
