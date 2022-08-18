/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
 */
package egg.introjava;

import java.util.Scanner;

public class introjavaej11 {

    public static void main(String[] args) {
        double a;
        double b;
        int opcMenu;
        String opcSalir;
        boolean continuar=true;
        
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el primer nro. : ");
        a=leer.nextDouble();
        System.out.print("Ingrese el segundo nto. : ");
        b=leer.nextDouble();
        
        do{
            System.out.println("Ingrese una de las opciones del MENU:");
            System.out.println("1. SUMAR");
            System.out.println("2. RESTAR");
            System.out.println("3. MULTIPLICAR");
            System.out.println("4. DIVIDIR");
            System.out.println("5. SALIR");
            opcMenu=leer.nextInt();
            switch(opcMenu){
                case 1:
                     System.out.println("SUMA: "+ (a+b));
                    break;
                case 2:
                    System.out.println("RESTA: "+ (a-b));
                    break;
                case 3:
                    System.out.println("MULTIPLICACION: "+ (a*b));
                    break;
                case 4:
                    System.out.println("DIVICION: "+ (a/b));
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    opcSalir=leer.next();
                    if(opcSalir.toLowerCase().substring(0,0).equals("s")){
                    continuar=false;
                    }
                    break;
            }
            
        }while( (opcMenu<1 || opcMenu>5) && continuar);
    }
    
}
