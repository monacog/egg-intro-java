/*
    Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
    números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package egg.introjava;

import java.util.Scanner;

public class introjavaej10 {

    public static void main(String[] args) {
        int limite;
        int num;
        int contador;
        contador=0;
        Scanner leer = new Scanner(System.in);
        
        do{
            System.out.println("Ingrese un numero positivo:");
            limite=leer.nextInt();
        }while(limite<1);
        
        System.out.println("A continuacion le pediremos el ingreso de numeros hasta que la suma de los números introducidos supere el límite inicial.");
            
        while(limite>=contador){
           System.out.print("Ingrese un numero:");
           num=leer.nextInt();
           contador+=num;
        }
        
    }
    
}
