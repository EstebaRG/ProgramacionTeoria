package taller.pre.parcial;

import java.util.Scanner;

public class ejercisio93 {
    
    public static void main (String[] args){
        Scanner entrada= new Scanner(System.in);
        int n;
        double suma=0;
        double prom=0;
        System.out.print("digite el numero de estudiantes: ");
        n=entrada.nextInt(); 
        double[][]asignaturas= new double[n][5];
        for(int i=0;i<n;i++){
            for(int j=0;j<5;j++){
                System.out.print("digite la nota "+(j+1)+" del estudiante "+(i+1)+": ");
                asignaturas[i][j]=entrada.nextDouble();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<5;j++){
                suma=suma+asignaturas[i][j];
            }
            prom=suma/asignaturas[0].length;
            System.out.println("el promedio del estudiante "+(i+1)+" es: "+prom);
            suma=0;
        }
    }
}