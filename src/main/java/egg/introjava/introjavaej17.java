/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package egg.introjava;
import java.util.Scanner;

public class introjavaej17 {


    public static void main(String[] args) {
        int[] vector ;
        int dim;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector: ");
        dim=leer.nextInt();
        vector=new int[dim];
        cuantosDigitos(llenarVector(vector));
    }
    
    
    public static int[] llenarVector(int[] vector){
        for(int i=0; i<vector.length-1 ; i++){
            vector[i]=(int)(Math.random()*100000);
        }
        return vector;
    }//fin metodo
    
    
    public static void cuantosDigitos(int[]vector){
        int uno=0;
        int dos=0;
        int tres=0;
        int cuatro=0;
        int cinco=0;
        int digitos;
        int element;
        
        for(int i=0;i<vector.length-1; i++){
            element=vector[i];
            digitos=0;
            while(element!=0){
                element=element/10;
                digitos++;
            }
            
            switch(digitos){
                case 1:
                    uno++;
                    break;
                case 2:
                    dos++;
                    break;
                case 3:
                    tres++;
                    break;
                case 4:
                    cuatro++;
                    break;
                case 5:
                    cinco++;
                    break;
            }//fin switch
        }
            
        System.out.println("Numeros con: ");
        System.out.println("Un digito: " + uno);
        System.out.println("Dos digito: " + dos);
        System.out.println("Tres digito: " + tres);
        System.out.println("Cuatro digito: " + cuatro);
        System.out.println("Cinco digito: " + cinco); 
    
    }//fin metodo
    
    
}//Fin metodo
