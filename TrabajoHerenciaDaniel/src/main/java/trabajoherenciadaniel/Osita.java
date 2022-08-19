/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoherenciadaniel;

/**
 *
 * @author fierr
 */
//Clase hija, subclases
public class Osita extends Animales {//Recordar que el extends es necesario para definir que la clase Osita es una clase hija de la clase Animales
    private String raza;
    private String alimentacion;

    //Primero se coloca el extends antes de pasar a hacer el metodo constructor para que se pueda tomar los atributos de la clase padre
    //El super se coloca automaticamente
    public Osita(String raza, String alimentacion, String nombre, int edad) {
        super(nombre, edad);
        this.raza = raza;
        this.alimentacion = alimentacion;
    }

    public String getRaza() {
        return raza;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }
    /*
    La anotación @Override simplemente se utiliza, para forzar al compilador a comprobar en tiempo de compilación que estás sobrescribiendo correctamente 
    un método,y de este modo evitar errores en tiempo de ejecución, los cuales serían mucho más difíciles de detectar.
    */
    @Override
    public void mostrarDatos(){
        System.out.println("La raza de la osita es: "+getRaza()+"\nLa alimentación de la osita es: "+getAlimentacion());
        
        
        
    }
    
    
    
}
