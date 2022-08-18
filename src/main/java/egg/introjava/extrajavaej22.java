/*
Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
muestre la suma de sus elementos.
 */
package egg.introjava;
import java.util.Scanner;
public class extrajavaej22 {


    public static void main(String[] args) {
        int[][]matriz;
        int dimf, dimc;
        Scanner leer =new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de filas de la matriz: ");
        dimf=leer.nextInt();
        while(dimf<1){
            System.out.println("Ingresar valor mayor a cero: ");
            dimf=leer.nextInt();
        }
        
        System.out.println("Ingrese la cantidad de columnas de la matriz: ");
        dimc=leer.nextInt();
        while(dimc<1){
            System.out.println("Ingresar valor mayor a cero: ");
            dimc=leer.nextInt();
        }
        matriz=new int[dimf][dimc];
        System.out.println("");
        llenarMatriz(matriz,0,100);
        System.out.println("");
        sumaElementos(matriz);
    }//fin MAIN
    
    //El metodo llenarMatriz , rellena con numeros aletorios entre en minimo y maximo indicado.
    public static void llenarMatriz(int[][]matriz, int min, int max){
        
        for(int i=0; i<matriz.length;i++){
            for(int j=0; j<matriz[i].length;j++){
                matriz[i][j]=(int)(Math.random()*(max-min)+1)+min;
            }
        }
    }//fin metodo
    
    public static void sumaElementos(int[][]matriz){
        int suma=0;
        for(int[]filas: matriz){
            for(int columna:filas){
                suma+=columna;
            }
        }
        System.out.println("La suma de todos los elementos de la matriz es: "+suma);
    }    
    
    
    
}//Fin CLASS
