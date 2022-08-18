/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.
 */
package egg.introjava;
import java.util.Scanner;
public class extrajavaej15 {

    public static void main(String[] args) {
        double num1, num2;
        int opcion;
        Scanner leer=new Scanner(System.in);
        
        System.out.print("Ingrese el 1er numero:");
        num1=leer.nextDouble();

        System.out.print("Ingrese el 2do numero:");
        num2=leer.nextDouble();
        
        System.out.println("Que operacion desea realizar:");
        System.out.println("1-Sumar");
        System.out.println("2-Restar");
        System.out.println("3-Multiplicar");
        System.out.println("4-Dividir");
        System.out.println("5-Salir");
        
        opcion=leer.nextInt();
        
        while(opcion<1 || opcion>5){
            System.out.print("Ingrese una de las opciones indicadas: ");
            opcion=leer.nextInt();
        }
        
        switch(opcion){
            case 1:
                System.out.print("el resultado de la suma es: "+ suma(num1,num2));
                break;
            case 2:
                System.out.print("el resultado de la resta es: "+ resta(num1,num2));
                break;
            case 3:
                System.out.print("el resultado de la multiplicacion es: "+ multiplicacion(num1,num2));
                break;
            case 4:
                System.out.print("el resultado de la division es: "+ division(num1,num2));
                break;
            case 5:
                System.out.println("Has salido correctamente.");
                break;
        }
    }
    
    public static double suma(double num1 , double  num2){

        return num1+num2 ;
    }
    public static double resta(double num1 , double  num2){
            System.out.print("el resultado de la resta es: ");
        return num1-num2;
    }
    public static double multiplicacion(double num1 , double  num2){
            System.out.print("el resultado de la multiplicacion es: ");
        return num1*num2;
    }   
    
    public static double division(double num1 , double  num2){
            System.out.print("el resultado de la division es: ");
        return num1/num2;
    }
    
}
