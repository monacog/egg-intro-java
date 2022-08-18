/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
 */
package egg.introjava;
import java.util.Scanner;

public class extrajavaej23 {


    public static void main(String[] args) {
        String palabra;
        int contador=1;
        String[][]matriz=new String[20][20];
        
        do{
            palabra=crearPalabra();
            IngresarPalabra(matriz,palabra);
            contador++;
        }while(contador<5);
        System.out.println("Se crearon todas las palabras y se ingresaron en la matriz");
        completarMatriz(matriz);
        System.out.println("Matriz completada.");
        System.out.println("");
        imprimirMatriz(matriz);
        
    }
    
    
    public static String crearPalabra(){
        Scanner leer=new Scanner(System.in);
        String palabra="";
        do{
            System.out.println("Ingrese una palabra de entre 3 y 5 caracteres: ");
            palabra=leer.next();
        }while(palabra.length()<3||palabra.length()>5);
        
        return palabra;
    }
    
    public static void IngresarPalabra(String[][]matriz, String palabra){
        
        int indexf;
        int indexc;
        int max;
        boolean vacio;
        
        //establece de forma aleatoria el indice de la fila
        do{
            vacio=true;
            indexf=(int)(Math.random()*(matriz.length));
            for(int i=0;i<matriz[indexf].length;i++){
                if(matriz[indexf][i]!=null){
                    vacio=false;
                    break;
                }
            }
        }while(!vacio);
        
        //establece de forma aleatoria el indice de la columna
        max=(matriz[indexf].length) - palabra.length();
        indexc=(int)(Math.random()*max);
        
        for(int i=0, j=indexc;i<palabra.length();i++,j++){
            matriz[indexf][j]=palabra.substring(i,(i+1));
        }
    
    }//Fin Metodo
    
    public static void completarMatriz(String[][]matriz){
        for(int i=0; i<matriz.length;i++){
            for(int j=0; j<matriz.length;j++){
                if(matriz[i][j]==null){
                    matriz[i][j]= Integer.toString((int)(Math.random()*10));
                }
            }
        }
    }//fin metodo
    
    public static void imprimirMatriz(String[][]matriz){
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println("");
        }
    }//fin metodo
                    
}//FIN CLASS
