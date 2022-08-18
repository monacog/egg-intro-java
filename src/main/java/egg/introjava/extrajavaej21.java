/*
Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos
prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
igual al 7 de sus notas del curso.
 */
package egg.introjava;
import java.util.Scanner;

public class extrajavaej21 {

    public static void main(String[] args) {
        double [][]matriz = new double[10][5];
        System.out.println("");
        llenarVector(matriz);
        System.out.println("");
        aprobados(matriz);
    }
    public static void llenarVector(double[][]matriz){
        Scanner leer=new Scanner(System.in);
        double promedio=0;
        for(int i=0;i<matriz.length; i++){
            System.out.println("Ingrese las notas del alumno nro."+(i+1)+ " : ");
            for(int j=0;j<matriz[i].length; j++){
                switch(j){
                    case 0:
                        System.out.print("Nota 1er T. Practico: ");
                        matriz[i][j]=leer.nextDouble();
                        promedio=(matriz[i][j]*10)/100;
                        break;
                    case 1:
                        System.out.print("Nota 2do T. Practico: ");
                        matriz[i][j]=leer.nextDouble();
                        promedio+=(matriz[i][j]*15)/100;
                        break;
                    case 2:
                        System.out.print("Nota 1er integrador: ");
                        matriz[i][j]=leer.nextDouble();
                        promedio+= (matriz[i][j]*25)/100;
                        break;
                    case 3:
                        System.out.print("Nota 2do integrador: ");
                        matriz[i][j]=leer.nextDouble();
                        promedio+= (matriz[i][j]*50)/100;
                        break;
                    case 4:
                         matriz[i][j]=promedio;
                        break;
                }// fin switch

            }  // fin for j
        }// fin for i

    }//fin metodo
    
    public static void aprobados(double[][]matriz){
        int desaprobados=0, aprobados=0;
        
        for(int i=0; i<matriz.length; i++){
            
            if(matriz[i][matriz[i].length-1]<7){
                desaprobados++;
            }else{
                aprobados++;
            }    
        }
        System.out.println("Aprobados: "+aprobados);
        System.out.println("Desaprobados: "+desaprobados);
    }// fin metodo
    
}//fin class
