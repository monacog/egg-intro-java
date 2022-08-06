/*
* Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
* pantalla.
 */
package egg.introjava;

import java.util.Scanner;

public class introjavaej02 {

    public static void main(String[] args) {
        
        String name;
        Scanner leer =new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        name=leer.nextLine();
        System.out.println("Su nombre es: " + name);
    }    
}
