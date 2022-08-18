/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario.
 */
package egg.introjava;
import java.util.Scanner;

public class extrajavaej18 {

    public static void main(String[] args) {
        double []vector;
        double suma=0;
        int dim;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector: ");
        dim=leer.nextInt();
        vector=new double[dim];
        System.out.println("Ingrese a continuacion los numeros: ");
        for(int i=0; i<vector.length;i++){

            if(i==vector.length-1){
                System.out.print("Ultimo nro. : ");
            }else{
                System.out.print("Nro. " + (i+1)+" : ");
            }
            suma+=leer.nextDouble();
        }
        
        System.out.println("La suma de todos los elementos es: " + suma);
    }
    
}
