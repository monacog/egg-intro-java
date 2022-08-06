/*
* Escribir un programa que lea un número entero por teclado y muestre por pantalla el
* doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
package egg.introjava;
import java.util.Scanner;


public class introjavaej05 {

    public static void main(String[] args) {
        int num;        
        Scanner leer = new Scanner(System.in);
        System.out.println(" Ingrese un numero entero:");
        num=leer.nextInt();
        System.out.println("El doble del numero ingresado es:"+num*2);
        System.out.println("El triple del numero ingresado es:"+num*3);
        System.out.println("La raiz cuadrada del numero ingresado es: "+Math.sqrt(num));
    }
    
}
