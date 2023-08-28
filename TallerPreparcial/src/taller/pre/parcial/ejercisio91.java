package taller.pre.parcial;

import java.util.Scanner;

public class ejercisio91 {

    public static void main (String[] args){
       Scanner entrada=new Scanner(System.in);
       int n;
       System.out.print("digite la cantidad de numeros: ");
       n = entrada.nextInt();
       int[] numeros = new int[n];
       int[] orden=new int[n];
       System.out.println("digite los elementos");
       for (int i=0;i<n;i++){
           System.out.print("numero "+(i+1)+": ");
           numeros[i] = entrada.nextInt();
       }
       System.out.println("\nlos numeros son: ");
       for(int i=0;i<n;i++){
           System.out.print(numeros[i]+" ");
       }
       for (int i=0;i<numeros.length;i++){
           for(int j=0;j<numeros.length && j!=i;j++){
               if(numeros[i]<numeros[j]){
                   int aux=numeros[i];
                   numeros[i]=numeros[j];
                   numeros[j]=aux;
               }
           }
        }
        System.out.println("\n el orden asendente de los elementos es:");
        for(int i: numeros){
            System.out.print(i+" ");
        }
    }
}