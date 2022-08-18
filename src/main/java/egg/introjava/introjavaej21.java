/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.

3 2 1 
1 2 3
2 1 3

 */
package egg.introjava;
import java.util.Arrays;
import java.util.Scanner;

public class introjavaej21 {

    
    public static void main(String[] args) {
        
        int[][] matrizM ={{3,3,3,4,5,6,7,8,9,10},{3,3,3,4,5,6,7,8,9,10},{3,3,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10}};
        int[][] matrizP = {{3,3,3},{3,3,3},{3,3,3}};
        

        /*llenarMatriz(matrizM);
        llenarMatriz(matrizP);*/
        buscar(matrizM, matrizP);

    }//Fin MAIN
    
    public static void llenarMatriz(int[][]matriz){
        int num;
        Scanner leer = new Scanner(System.in);
            System.out.println(" En esta matriz tendras que ingresar "+ (matriz.length*2)+" numeros.");
    
            for (int i=0;i<matriz.length;i++){
                System.out.println("Fila "+ (i+1));
                for (int j=0;j<matriz.length;j++){
                   System.out.print("V " + (j+1) + " : ");
                   num=leer.nextInt();
                   matriz[i][j]=num;
                } //fin for secundario
            } //fin for principal
    }// Fin Metodo LLENAR MATRIZ
    
    public static void buscar(int [][]matrizM, int [][]matrizP){
        
        int [][]matriz3=new int[3][3];
        boolean iguales=false;
        boolean finMatriz=false;
        for(int i=0; i<matrizM.length;i++){
            for(int j=0; j<matrizM.length;j++){
        
                if(i==7 && j==8){
                    finMatriz=true;
                    break;
                }
                
                if(matrizM[i][j]==matrizP[0][0]){
                    matriz3=llenarMatriz3(matrizM ,i ,j);
                    iguales= Arrays.deepEquals(matrizP,matriz3);
                    if(iguales){
                        System.out.println("Como podemos observar nuestra submatriz P se encuentra en la matriz M en los índices:");
                        for(int f=i;f<(i+3);f++){
                            for(int c=j;c<(j+3);c++){
                                if(f==(i+2) && c==(j+2)){
                                    System.out.print( f+","+c+".");
                                }else{
                                    System.out.print( f+","+c+" - ");
                                }
                            } 
                        }
                        
                    }
                
                }//Fin IF
                if(iguales)
                    break;
            }//Fin for secundario
            if(iguales || finMatriz)
                    break;
        }//Fin for primario
    
    }//fin metodo buscar
    
    
    public static int[][] llenarMatriz3(int[][] matrizM , int indexi ,int indexj){
        int[][]matriz=new int[3][3];
        for(int f=0 , k=indexi; f<3;k++,f++){
            for(int c=0 ,l=indexj; c<3;l++,c++){
                matriz[f][c]= matrizM[k][l];
            }//fin for secundario
        
        }//fin for principal        
        
        return matriz;
    }//fin metodo llenarMatriz3
    
    
} //Fin CLASS
