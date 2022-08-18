/*
Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
  todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
  los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
  tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
  real que represente el costo del tratamiento (previo al descuento) y determine el
  importe en efectivo a pagar por dicho socio.
 */
package egg.introjava;
import java.util.Scanner;

public class extrajavaej05 {

    public static void main(String[] args) {
        String socio;
        double costoTratamiento=0;
        Scanner leer=new Scanner(System.in);
        do{
            System.out.println("Ingres el tipo de socio (A ,B o C) o para salir ( S ):");
            socio=(leer.next()).toLowerCase();
        }while( !socio.equals("a") && !socio.equals("b") && !socio.equals("c") && !socio.equals("s"));

        if(!socio.equals("s")){
            System.out.print("Ingrese el costo del tratamiento: ");
            costoTratamiento=leer.nextDouble();
        }
        switch(socio){
            case "a":
                System.out.println("Por ser socio A, el costro del tratemiento es de : $" + (int)(costoTratamiento*0.50) );
                break;
            case "b":
                System.out.println("Por ser socio B, el costro del tratemiento es de : $" + (int)(costoTratamiento*0.65));
                break;
            case "c":
                System.out.println("Por ser socio C, el costro del tratemiento es de : $" + (int)(costoTratamiento));
            default:
                System.out.println("has salido.");
        }
    }
}
