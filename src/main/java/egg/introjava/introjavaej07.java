/*
* Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
* pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
* la función equals() en Java.
 */
package egg.introjava;
import java.util.Scanner;

public class introjavaej07 {

    public static void main(String[] args) {
        
        String frase;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase y le indicaremos si es igual o no a 'eureka': ");
        frase=leer.nextLine();
        System.out.println(frase.toLowerCase().equals("eureka")?"Correcto":"Incorrecto");
    }
}
