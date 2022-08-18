/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje.
 */
package egg.introjava;
import java.util.Scanner;

public class extrajavaej03 {

    public static void main(String[] args) {
        
        String letra;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra: ");
        letra=(leer.next()).substring(0,1);
        switch(letra){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("Es una vocal.");
                break;
            default:
                System.out.println("NO es una volca.");
        }        
    }
}
