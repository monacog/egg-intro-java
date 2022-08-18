/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
de hijos para averiguar la media de edad de los hijos de todas las familias.
 */
package egg.introjava;
import java.util.Scanner;

public class extrajavaej14 {

    public static void main(String[] args) {
        int [][] matriz;
        int n,m,edad;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de familias: ");
        n=leer.nextInt();
        matriz= new int[n][];
        
        for(int i=0; i<matriz.length; i++){
            System.out.print("Cuantos hijos tiene la familia nro."+ (i+1)+" : ");
            m=leer.nextInt();
            while(m<1||m>20){
                System.out.print("la cantidad de hijos debe esta entre 1 y 20;");
                m=leer.nextInt();
            }
            matriz[i]= new int[m];
            
            for(int j=0; j<matriz[i].length; j++){
                do{
                    System.out.print("edad hijo " +(j+1)+" : ");
                    edad=leer.nextInt();                   
                }while(edad<1&&edad>105);
                matriz[i][j]=edad;

            }
        }
        System.out.println("La media de edad de los hijos de todas las familias: " + promedio(matriz));
    }
    
    public static int promedio(int[][]matriz){
        int suma=0, elementos=0;
        
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                suma+=matriz[i][j];
            }
            elementos+=matriz[i].length;
        }
        System.out.println("Matriz.length="+elementos);
        return  suma/(elementos);
    }
}
