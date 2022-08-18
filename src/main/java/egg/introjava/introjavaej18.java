/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
 */
package egg.introjava;
public class introjavaej18 {


    public static void main(String[] args) {
        int[][]matriz=new int[4][4];   
        llenarMatriz(matriz);
        System.out.println("");
        traspuesta(matriz);
        
    }//fin metodo
    
    public static void llenarMatriz(int[][]matriz){
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length ; j++){
                matriz[i][j]=(int)(Math.random()*101);
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println();
        }
    }
    
    public static void traspuesta(int[][]matriz){
        
        for (int c=0;c<matriz.length;c++){
            for(int f=0;f<matriz.length;f++){
                System.out.print(matriz[f][c] + " ");
            }
            System.out.println();
        }
    
    
    }



}
