/*
Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
 */
package egg.introjava;
import java.util.Scanner;


public class extrajavaej09 {

    public static void main(String[] args) {
        int cociente=0, residuo=0 ,num1,num2;
        Scanner leer =new Scanner(System.in);
        
        do{
            System.out.print("Ingrese el 1er numero(dividendo): ");
            num1=leer.nextInt();
        }while(num1<2);
        
        do{
            System.out.print("Ingrese el 2do numero, debe ser menor que el primer numero: ");
            num2=leer.nextInt();
        }while(num2>num1);
        
        residuo=num1;
        
        while(residuo>num2){
            residuo-=num2;
            cociente++;
        }
 
        System.out.println("El residuo es "+ residuo + " y el cociente es " + cociente);
        
    }
    
}
