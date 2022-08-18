/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
package egg.introjava;
import java.util.Scanner;

public class introjavaej15 {

    public static void main(String[] args) {
    
        int[]vector= new int[100];
        
        mostrarVector(llenarVector(vector));
    }
    
    public static int[] llenarVector(int[]vector){
        for(int i=0;i<100;i++){
        vector[i]=i+1;
        }
        return vector;
    }
    
    public static void mostrarVector(int[]vector){
    
        for(int i= vector.length-1;i>=0;i--){
        
            System.out.println(vector[i]);
        }
    }
}
