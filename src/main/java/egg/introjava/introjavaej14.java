/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €e
 */
package egg.introjava;
import java.util.Scanner;

public class introjavaej14 {

    public static void main(String[] args) {
        double euros;
        Scanner leer = new Scanner(System.in);
        String moneda;
        System.out.print("Ingrese la cantidad de Euros: ");
        euros=leer.nextDouble();
        System.out.print("Ingres la monea a convertir (Dolar, Yen , Libra): ");
        moneda=leer.next().toLowerCase();
        convertir(euros, moneda);
    }
    
    public static void convertir(double euros, String moneda){
        
        switch(moneda){
            case "dolar": 
                System.out.println( euros + " Euros es igual a "+ euros*1.28611 + " Dolares.");
                break;
            case "yen": 
                System.out.println( euros + " Euros es igual a "+ euros*129.852 + " Yenes.");
                break;
            case "libra": 
                System.out.println( euros + " Euros es igual a "+ euros*0.86 + " Libras.");
                break;
            default:
                System.out.println("La moneda ingresada no es correcta");
        }
    }
}
