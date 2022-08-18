/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas.
 */
package egg.introjava;
import java.util.Scanner;

public class introjavaej12 {


    public static void main(String[] args) {
        String cadena;
        int contadorok=0;
        int contadornot=0;
        Scanner leer = new Scanner(System.in);
    
       do{
           System.out.print("ingrese una cadena:");
           cadena=leer.nextLine();
           
          if(esCorrecta(cadena)){
                contadorok++;
            }else if(!cadena.equals("&&&&&")){
                contadornot++;
          }
       
       }while(!cadena.toLowerCase().equals("&&&&&"));
            
            System.out.println("INFORME:");
            System.out.println("lecturas correctas: " + contadorok );
            System.out.println("lecturas incorectas: " + contadornot); 
    }
    
    public static boolean esCorrecta(String cadena){
    
        boolean longitud;
        boolean caracteres;
        
        longitud=(cadena.length())==5;
        caracteres= cadena.startsWith("x") && cadena.endsWith("o");
        
        return longitud && caracteres;
    }
    

}
