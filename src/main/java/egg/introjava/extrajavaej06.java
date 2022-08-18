/*
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package egg.introjava;
import java.util.Scanner;

public class extrajavaej06 {

    public static void main(String[] args) {
        int dim;
        double[] alturas;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de personas a registrar la altura:");
        dim=leer.nextInt();
        while(dim<1){
            System.out.print("Ingres un valor mayor a 0(cero):");
            dim=leer.nextInt();
        }
        alturas=new double[dim];
        llenarAlturas(alturas);
        
        promedioAlturas(alturas,1.60);
    }
    
    public static void llenarAlturas(double[]alturas){
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Acontinuacion ingrese las alturas:");
        for(int i=0;i<alturas.length;i++){
            System.out.print("Altura "+ (i+1) + " : ");
            alturas[i]=leer.nextDouble();
        }
    }//fin metodo
    
    public static void promedioAlturas(double[]alturas,double limite){
    
        double contador=0;
        double promedioLimite=0;
        double promedioEstatura=0;
        for(int i=0; i<alturas.length ; i++){
            if(alturas[i]<limite){
                contador++;
            }//fin if
            promedioEstatura+=alturas[i];
        }//fin for     
        promedioEstatura=promedioEstatura/alturas.length;
        promedioLimite=(contador/(alturas.length))*100;
        System.out.println("El promedio de estaturas en general es de: " + Math.round(promedioEstatura*100.0)/100.0+" mts.");
        System.out.println(" El promedio de estatura por debajo de "+ limite+ " es del :"+ (int)promedioLimite +"% .");
    }// fin metodo
    
    public static double maximo(double[]alturas){
        double maximo =alturas[0];
        for( int i=0; i<alturas.length;i++){
           
            if(maximo<alturas[i]){
                maximo=alturas[i];
            }//fin si 
        
        }//fin for
        return maximo;
        
    }//Fin metodo
    
}//Fin Class
