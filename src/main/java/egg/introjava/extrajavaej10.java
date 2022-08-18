/*
Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente.
 */
package egg.introjava;
import java.util.Scanner;

public class extrajavaej10 {

    public static void main(String[] args) {
        int num, num1, num2 ;
        Scanner leer = new Scanner(System.in);
        
        do {
            num1= (int) (Math.random()*11);
            num2= (int) (Math.random()*11);
            do{
                System.out.print("Adivine el resultado de la multiplicacion (entre 0 y 10): ");
                num=leer.nextInt();
            }while(num<0 && num>10);
            resultado(num1,num2,num);
            System.out.println("1-Presione culquier numero para vovler a ingresar. ");
            System.out.println("2-Salir.");
            num=leer.nextInt();
            System.out.println("");
        }while(num!=2);        

    }
    
    public static void resultado(int num1, int num2, int num){
        if((num1*num2)==num){
            System.out.println(" !!! Felicitaciones !!! adivinaste el numero.");
        }else{
            System.out.println("Incorrecto, sigue intentando.");
        }
    }
}
