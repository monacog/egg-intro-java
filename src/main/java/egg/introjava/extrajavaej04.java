/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
 */
package egg.introjava;
import java.util.Scanner;

public class extrajavaej04 {

    public static void main(String[] args) {
        int num;
        String[]romano= {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
        Scanner leer= new Scanner(System.in);
        
        do{
            System.out.print("Ingrese un numero del 1 al 10: ");
            num=leer.nextInt();
        }while(num<1 || num>10);
        
        System.out.println("El numero romano es: "+ romano[num-1]);
        
    }
    
}
