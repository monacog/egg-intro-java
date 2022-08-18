/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package egg.introjava;
import java.util.Scanner;

public class extrajavaej01 {


    public static void main(String[] args) {
        double minutos;
        double horas;
        String mensaje;
        
        Scanner leer = new Scanner(System.in);
        do{
            System.out.print("Ingrese la cantidad de minutos: ");
            minutos=leer.nextInt();
        }while(minutos<1);
                
        
       horas=minutos/60;
       
       if(horas>=24){
            if((calcDias(horas))>2){
                mensaje= (int)calcDias(horas) + " dias , " + (int)calcHoras(calcDias(horas)) + " horas.";
            }else{
                if(calcHoras(calcDias(horas))>1){
                    mensaje= (int)calcDias(horas)+ " dia , " +  (int)calcHoras(calcDias(horas)) + " horas.";
                }else{
                    mensaje= (int)calcDias(horas) + " dia , " +  (int)calcHoras(calcDias(horas)) + " hora.";
                }
            
            }
        }else {
            mensaje= (int)calcHoras(calcDias(horas)) + " horas ,"  + (int)calcMinutos(horas) + " minutos.";
        }//Fin IF

          System.out.println(mensaje);
    }//Fin MAIN
    
    public static double calcDias(double horas){
    
        return horas/24;
    }//metodo dias
    
    public static double calcHoras(double dias){
    
        return ((dias - ((int)dias))*24);
    }//metodo horas
    
    public static double calcMinutos(double horas){
        
        return ((horas- ((int)horas))*60);
    
    }//metodo minutos


}// Fin CLASS
