/*
Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división.
*/
package egg.introjava;
import java.util.Scanner;

public class extrajavaej11 {

    public static void main(String[] args) {
        
        int num ;
        Scanner leer = new Scanner(System.in);
        do{
            System.out.println("Ingrese un numero entero: ");
            num=leer.nextInt();
        }while(num<1);
        System.out.println("el numero ingresado tiene " + digitos(num)+ " digitos.");
        
    }
    
    public static int digitos(int num){
        int digitos=1;
            while(num>9){
                num/=10;
                digitos++;
        }
        
        return digitos;
    }
    
}
