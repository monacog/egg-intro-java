/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
 */
package egg.introjava;

public class extrajavaej19 {


    public static void main(String[] args) {
        int[]vector1=new int[10];
        int[]vector2=new int[10];
        System.out.println("");
        llenarVector(vector1, 2 ,2);
        llenarVector(vector2, 2 ,2);
        if(iguales(vector1,vector2)){
            System.out.println("Los vectores son iguales.");
        }else{
            System.out.println("Los vectores NO son iguales.");
        }
    }
    
    public static void llenarVector(int[]vector, int val1 ,int val2){
        
        for(int i=0; i<vector.length;i++){
            if(i<vector.length/2){
                vector[i]=val1;
            }else{
                vector[i]=val2;
            }
        }
    }
    
    public static boolean iguales(int[]vector1, int[]vector2){
        
        if(vector1.length==vector2.length){
            for(int i=0;i<vector1.length;i++ ){
                if(vector1[i]!=vector2[i]){
                    return false;
                }
            }
        }else{
            return false;
        }
        return true;
    }
    
}
