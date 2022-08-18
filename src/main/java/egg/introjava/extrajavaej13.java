/*
Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
 */
package egg.introjava;
import java.util.Scanner;

public class extrajavaej13 {

    public static void main(String[] args) {
        int alt,k=1;
        Scanner leer = new Scanner(System.in);
        System.out.println("Introducir la altura de la escalera de numeros: ");
        alt=leer.nextInt();
        System.out.println();
        for(int i=1;i<=alt;i++){
            
            for(int j=1;j<=k;j++){

                    System.out.print(j+" ");
            }
            k++;
            System.out.println();
            }
        }
    }
    
