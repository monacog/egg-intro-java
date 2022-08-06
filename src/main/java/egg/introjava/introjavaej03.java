/*
* Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
* en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package egg.introjava;
import java.util.Scanner;


public class introjavaej03 {

    public static void main(String[] args) {
        
        String frase;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        frase=leer.nextLine();
        System.out.println("Se muestra la frase en mayusculas: " );
        System.out.println(frase.toUpperCase());
        System.out.println("Se muestra la frase en minusculas: " );
        System.out.println(frase.toLowerCase());  
    }
    
}
