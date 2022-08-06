/*
* Crear un programa que dado un numero determine si es par o impar.
 */
package egg.introjava;
import java.util.Scanner;

public class introjavaej06 {

    public static void main(String[] args) {
        int num;
        Scanner leer = new Scanner(System.in);
        do{
            System.out.print("Ingrese un numero entero positivo:");
            num=leer.nextInt();
        }while(num<1);
        
        if(numeroPar(num))
            System.out.println("El numero es PAR ");
        else{
            System.out.println("El numero es IMPAR ");
        }
    }
    
    public static boolean numeroPar(int num){
        return (num%2==0);    
    }
    
}
