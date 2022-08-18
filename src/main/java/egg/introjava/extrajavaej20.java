/*
Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector.
 */
package egg.introjava;
import java.util.Scanner;

public class extrajavaej20 {
    
    public static void main(String[] args) {
        int[] vector;
        int dim;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector: ");
        dim=leer.nextInt();
        while(dim<1){
            System.out.println("Ingrese numero mayor a cero : ");
            dim=leer.nextInt();
        }
        vector=new int[dim];
        System.out.println("");
        llenarVector(vector,0,100);
        System.out.println("");
        mostrarVector(vector);
    }
    
    public static void llenarVector(int[]vector, int min , int max){
        for(int i=0;i<vector.length;i++){
            vector[i]=(int)(Math.random()*((max-min)+1))+min;
        }    
    }
    
    public static void mostrarVector(int[]vector){
        for(int i=0;i<vector.length;i++){
            if(i!=vector.length-1){
                System.out.print(vector[i]+" - ");
            }else{
                System.out.print(vector[i]);
            }
        }  
    }
}
