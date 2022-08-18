/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package egg.introjava;

public class extrajavaej02 {

    public static void main(String[] args) {
        
        int a=1,b=2,c=3,d=4;
        int[]aux={a,b,c,d};
        
        System.out.println("valor inicial: A=" + a +" B="+ b+" C=" + c + " D=" +d);
        a=aux[3];
        b=aux[2];
        c=aux[0];
        d=aux[1];
        System.out.println("valor inicial: A=" + a +" B="+ b+" C=" + c + " D=" +d);
    }
    
    

    
}
