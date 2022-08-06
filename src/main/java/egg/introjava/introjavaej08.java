/*
 * Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
 * usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
 * pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
 */
package egg.introjava;

import java.util.Scanner;

public class introjavaej08 {


    public static void main(String[] args) {
        String frase;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase y le indicaremos si tiene 8 caracteres:");
        frase=leer.nextLine();
        System.out.print("Tiene 8 caracteres? : ");
        System.out.print(ochoCaracteres(frase));
    }
    
    public static String ochoCaracteres(String frase){
        return frase.length()==8?"CORRECTO":"INCORRECTO";
    }
}
