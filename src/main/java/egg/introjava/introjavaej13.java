/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
*/
package egg.introjava;

import java.util.Scanner;

public class introjavaej13 {

    public static void main(String[] args) {
        int lado;
        
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de lados que tendra el cuadrado: ");
        lado=leer.nextInt();
        dibujarCuadrado(lado);
    }
    public static void dibujarCuadrado(int lado){
    
        for(int i=0 ; i<= lado-1; i++){
            for (int j=0; j<=lado-1; j++){
                if(i==0 || i==lado-1 || j==0 || j==lado-1 ){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }    
}
