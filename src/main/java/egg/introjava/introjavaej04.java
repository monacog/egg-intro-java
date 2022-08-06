/*
* Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
* Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package egg.introjava;
import java.util.Scanner;


public class introjavaej04 {


    public static void main(String[] args) {

        float grados;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los grados centrigrados: ");
        grados= leer.nextFloat();
        System.out.println( grados + "°, es "+ 32 + (9 * grados / 5) + " Fahrenheit");         
    }
}
