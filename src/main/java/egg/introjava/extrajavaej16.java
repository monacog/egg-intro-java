/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package egg.introjava;
import java.util.Scanner;

public class extrajavaej16 {

    public static void main(String[] args) {
        Persona []personas;
        int dim, edad;
        String nombre;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de personas a registrar: ");
        dim=leer.nextInt();
        personas=new Persona[dim];
        ingresarDatos(personas);
        System.out.println("");
        System.out.println("Se imprime a continuacion los datos ingresados:");
        System.out.println("");
        mostrarPersonas(personas);
        
    }
    
    public static void ingresarDatos(Object[] personas){
        Scanner leer=new Scanner(System.in);
        leer.useDelimiter("\n");
        String nombre;
        int edad;
        for(int i=0; i<personas.length; i++){
           
            System.out.print("Ingrese el nombre de la persona "+ (i+1)+" : ");
            nombre=leer.next();
            while(nombre.equals("") || nombre.equals(" ")){
                System.out.print("El nombre de la persona no puede estar vacio: ");
                nombre=leer.next(" ");
            }
            System.out.print("Ingrese la edad de "+ nombre + " : ");
            edad=leer.nextInt();
            while(edad<1 || edad>105){
                System.out.print("La edad debe se entre 1 y 105: ");
                edad=leer.nextInt();
            }
             personas[i]= new Persona(nombre,edad);
        }
    }
    
    public static void mostrarPersonas(Persona[]personas){
        String mensaje,continuar;
        Scanner leer= new Scanner(System.in);
        for(int i=0; i<personas.length;i++){
                
            mensaje=" Nombre: " + personas[i].getName() + ", Edad: "+personas[i].getEdad()+ " .";
            
            //determina si la persona es menor de edad.
            if(personas[i].getEdad()<18){
                mensaje+=" Es menor de edad.";
            }else{
                mensaje+=" Es mayor de edad.";
            }
            System.out.println(mensaje);
            System.out.println("");
            //determina si se quiere seguir mostrando a la siguiente persona.
            System.out.println("Queres continuar viendo la siguente persona? (s/n)");
            continuar=leer.next();
            while(!((continuar.toLowerCase()).equals("s")) && !((continuar.toLowerCase()).equals("n"))){
                System.out.println("Ingres una de las opciones: s/n " );
                continuar=leer.next();
            }
            
            if(continuar.toLowerCase().equals("n")){
                break;
            }
        }
    }
    
}//fin class
