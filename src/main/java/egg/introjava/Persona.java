/*
 Se crea una persona para el ejercicio Extra Java nro. 16
 */
package egg.introjava;


public class Persona {
    String name;
    int edad;
    
    public Persona(String name, int edad){
        this.name=name;
        this.edad=edad;   
    }
    
    public String getName(){
    
        return name;
    }
    
    public int getEdad(){
    
        return edad;
    }
}
