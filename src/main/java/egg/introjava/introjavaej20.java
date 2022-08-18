/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package egg.introjava;

import java.util.Scanner;

public class introjavaej20 {

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        llenarMatriz(matriz);
        System.out.println("");
        mostrarMatriz(matriz);
        System.out.println("");
        esmagica(matriz);
        

    }//Fin MAIN

    public static void llenarMatriz(int[][] matriz) {
        int num;
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Fila " + (i+1)+ ". Ingrese un numero entre 1 y 9: ");
            for (int j = 0; j < matriz.length; j++) {
                do {
                    System.out.print("valor "+ (j+1)+ " : ");
                    num = leer.nextInt();
                } while (num < 1 || num > 9);
                matriz[i][j] = num;
            }//fin for j
            System.out.println("");
        }//fin for i

    }//Fin metodo llenarMatriz
    
    public static void mostrarMatriz(int[][]matriz){
        
        for(int[]filas:matriz){
            for(int columna:filas){
                System.out.print(columna+" ");
            }
            System.out.println("");
        }
    }

    public static void esmagica(int[][] matriz) {
        boolean iguales = true;
        int num;
        int columnas;
        int filas;
        int diagonal1 = 0;
        int diagonal2 = 0;
        num = sumarFila(matriz,0);

        for(int i=0, j=0 ,k=2 ; i<matriz.length ; i++ , j++ , k--){
            
            filas = sumarFila(matriz,i);
            columnas = sumarColumna(matriz,i);
            diagonal1 += matriz[i][j];
            diagonal2 += matriz[i][k];
            if(filas != num || columnas != num){
                iguales = false;
                break;
            }//fin if
            if((i== 2 && j == 2) && (diagonal1 != num && diagonal2 != num)){
                iguales = false;
                break;
            }
        }//fin for filas
        if(iguales){
            System.out.println(" La matriz es magica.");
        }else{
            System.out.println(" La matriz NO es magica.");
        }
        
    } // Fin método esmagica

    public static int sumarFila(int[][] matriz, int x) {
        int suma = 0;
        int i=x;
        for (int j = 0; j < matriz.length; j++) {
            suma += matriz[i][j];
        }//fin for
        return suma;
    }//fin método sumarFila

    public static int sumarColumna(int[][] matriz, int x) {
        int suma = 0;
        int i=x;
        for (int j = 0; j < matriz.length; j++) {
            suma += matriz[j][i];
        }//fin for
        return suma;
    }//fin método sumarFila

}
