/*
 * Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
 * es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
 * diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
 * la función Substring y equals() de Java.
 */
package egg.introjava;
import java.util.Scanner;

public class introjavaej09 {

    public static void main(String[] args) {
        
        String frase;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese una frese: ");
        frase=leer.nextLine();      
        System.out.print("Comienza con A? : " + (frase.toUpperCase().startsWith("A")?"CORRECTO":"INCORRECTO"));
    }
    
}
