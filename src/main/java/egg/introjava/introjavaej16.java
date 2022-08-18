/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package egg.introjava;
import java.util.Scanner;


public class introjavaej16 {

    public static void main(String[] args) {
        int[]vector;
        int dim;
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector:");
        dim=leer.nextInt();
        vector=new int[dim];
        buscarNum(llenarVector(vector,dim),dim);
        
    }
    public static int[] llenarVector(int[]vector,int dim){
    
        for(int i=0; i<dim-1;i++){
            vector[i]=(int)(Math.random()*101);
        }//fin for
        return vector;
    }//fin metodo llenarVector
    
    public static void buscarNum(int[]vector, int dim){
        int contador=0;
        int num;
        int index=0;
        String mensaje="";
        Scanner leer = new Scanner(System.in);
        boolean encontrado=false;
        System.out.println("ingrese el numero a buscar: ");
        num=leer.nextInt();

        
        for(int i=0; i<dim-1; i++){
            if(vector[i]==num){
                ++contador;
                encontrado=true;
                if(contador==1){

                    index=i+1;
                }
           }

        }//fin bucle for
        
        if(encontrado){
            mensaje="El numero ingresado se encuentra primera vez en la posicion "+ index;
            if(contador>1){
                mensaje +=" y esta repetido en la lista " + contador + " veces.";
            }
            System.out.println(mensaje);
        }else{
            System.out.println("el numero ingresado no se encuentra en la lista.");
        }
    }
    
    
}
