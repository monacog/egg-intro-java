/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package egg.introjava;
import java.util.Scanner;

public class introjavaej19 {

    public static void main(String[] args) {
        int[][]matriz=new int[3][3];   
        llenarMatriz(matriz);
        System.out.println("");
        mostrarMatriz(matriz);
        System.out.println("");
        traspuestaAntisimetrica(matriz);
        
    }//fin metodo
    
    public static void llenarMatriz(int[][]matriz){
        
        Scanner leer= new Scanner(System.in);
        for(int i=0;i<matriz.length;i++){
            System.out.println("Ingrese los datos en la fila nro. " + (i+1));
            for(int j=0;j<matriz.length; j++){
                System.out.print("valor "+(j+1)+" : "); 
                matriz[i][j]=leer.nextInt();
            }
            System.out.println("");
        }
    }
    
    public static void mostrarMatriz(int[][]matriz){
        System.out.println("Se muestra matriz original:");
        for(int f=0;f<matriz.length;f++){
            for(int c=0;c<matriz.length;c++){
                
                System.out.print(matriz[f][c] + " ");
            }
            System.out.println("");
        }
        System.out.println("Se muestra matriz traspuesta:");
        for(int f=0;f<matriz.length;f++){
            for(int c=0;c<matriz.length;c++){
                System.out.print(matriz[c][f] + " ");
            }
            System.out.println("");
        }
    
    }
    
    public static void traspuestaAntisimetrica(int[][]matriz){
        boolean simetrica=true;
        for(int f=0;f<matriz.length;f++){
            for(int c=0;c<matriz.length;c++){
                
                if(matriz[c][f]==0){
                    if(matriz[c][f]!=matriz[f][c]){
                        simetrica=false;
                        break;
                    }
                }else if(matriz[c][f]<1){
                    if(!(Math.abs(matriz[c][f])==matriz[f][c])){
                        simetrica=false;
                        break;
                    }
                }else{
                        if(!(matriz[c][f]== (-(matriz[f][c])))){
                        simetrica=false;
                        break;
                        }
                }
            } // for secundario
        
        }//for principal
        System.out.println();
        if(simetrica){
            System.out.println("La matriz es magica");
        }else{
            System.out.println("La matriz no es magica.");
        }
    }
}