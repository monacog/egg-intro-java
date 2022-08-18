/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
 */
package egg.introjava;
import java.util.Scanner;


public class extrajavaej07 {


    public static void main(String[] args) {
        int dim=0;
        int[] vector;
        Scanner leer =new Scanner(System.in);
        do{
            System.out.print("Ingrese la cantidad de numeros a ingesar: ");
            dim=leer.nextInt();
        }while(dim<1);
        
        vector=new int[dim];
        llenarVectorWhile(vector);
        System.out.println("WHILE - El valore maximo es: " + maxWhile(vector));
        System.out.println("DO WHILE - El valore maximo es: " + maxDoWhile(vector));
        System.out.println("WHILE -El valore minimo es: " + minWhile(vector));
        System.out.println("DO WHILE -El valore minimo es: " + minDoWhile(vector));
        System.out.println("WHILE El promedio de los valores es: " + promedioWhile(vector));
        System.out.println("DO WHILE El promedio de los valores es: " + promedioDoWhile(vector));
        
    }
    
    public static void llenarVectorWhile(int[]vector){
        Scanner leer = new Scanner(System.in);
        int i=0;
        while(i<vector.length){
            System.out.print("Valor "+(i+1)+" : ");
            vector[i]=leer.nextInt();
            i++;
        }
    }
    public static int maxWhile(int[]vector){
        int max=vector[0];
        int i=0;
        while(i<vector.length){
            if(max<vector[i]){
                max=vector[i];
            }
            i++;
        }
        return max;
    }// fin metodo
    
    public static int maxDoWhile(int[]vector){
        int max=vector[0];
        int i=0;
        do{
            if(max<vector[i]){
                max=vector[i];
            }
            i++;
        }while(i<vector.length);
        return max;
    }// fin metodo
    
    public static int minWhile(int[]vector){
        int min=vector[0];
        int i=0;
        while(i<vector.length){
            if(min>vector[i]){
                min=vector[i];
            }
            i++;
        }
        return min;
    }// fin metodo
    
    public static int minDoWhile(int[]vector){
        int min=vector[0];
        int i=0;
        do{
            if(min>=vector[i])
                min=vector[i];
                i++;
        }while(i<vector.length);
        return min;
    }// fin metodo
    
    
    public static int promedioWhile(int[]vector){
        int suma=0;
        int i=0;
        while(i<vector.length){
            suma+=vector[i];
            i++; 
        }
        return suma/vector.length;
    }// fin metodo
    
    public static int promedioDoWhile(int[]vector){
        int suma=0;
        int i=0;
        do{
            suma+=vector[i];
           i++; 
        }while(i<vector.length);
        return suma/vector.length;
    }// fin metodo
    
}// fin class
