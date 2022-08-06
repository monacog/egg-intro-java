/* Ejercicio 1
 * Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. 
 * El programa deberá después mostrar el resultado de la suma
 * 
 */
package egg.introjava;
import java.util.Scanner;

public class introjavaEj01 {


    public static void main(String[] args) {
        
        double a;
        double b;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los valores a sumar:");
        System.out.print("Primer numero:");
        a=leer.nextDouble();
        System.out.println();
        System.out.print("Segundo numero:");
        b=leer.nextDouble();
        System.out.println();
        System.out.println(" la suma de los numeros es:" + suma(a,b));
    }
    
    public static double suma(double a , double b){
        return a+b;
    }
    
}
