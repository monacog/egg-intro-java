/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse.
 */
package egg.introjava;
import java.util.Scanner;

public class extrajavaej08 {

    public static void main(String[] args) {
        int num=0, leidos=0, pares=0 , impares=0;
        Scanner leer = new Scanner(System.in);
        
        do{       
            do{
                System.out.print("Ingrese un numero: ");
                num=leer.nextInt();
            }while(num<1);
            
            if(num%5!=0){
                leidos++;
                pares+=num%2==0?1:0;
                impares+=num%2!=0?1:0;
            } 
        }while(num%5!=0);
        
        System.out.println("Cantidad de numeros leidos: "+leidos);
        System.out.println("Numeros Pares: " + pares);
        System.out.println("Numeros Impares: " + impares);
    }
}
