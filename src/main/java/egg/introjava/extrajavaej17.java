/*
Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos
por parámetro para que nos indique si es o no un número primo, debe devolver true si es
primo, sino false.
 */
package egg.introjava;
import java.util.Scanner;

public class extrajavaej17 {


    public static void main(String[] args) {
        int num;
        Scanner leer= new Scanner(System.in);
        System.out.println("ingrese un numero positivo: ");
        num=leer.nextInt();
        while(num<1){
            System.out.println("Ingrese un numero mayor a 0 :");
            num=leer.nextInt();
        }
        
        if(esprimo(num)){
            System.out.println("El numero "+ num + " SI es primo.");
        }else{
            System.out.println("El numero "+ num + " NO es primo.");
        }
        
    }
    public static boolean esprimo(int num){
        int contador=1;
        
        for (int i=2 ;i<=num ;i++){
            
            if(num%i==0){
            contador++;
            }
            
            if(contador>2 && i<num){
                break;
            }
        }
        
        return contador<=2; 
    }
    
}//fin class
