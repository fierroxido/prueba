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
public class Lion extends Animales {//Recordar que el extends es necesario para definir que la clase lion es una clase hija de la clase Animales
    private String velocidad;
    private String habitat;
    
     //Primero se coloca el extends antes de pasar a hacer el metodo constructor para que se pueda tomar los atributos de la clase padre

    public Lion(String velocidad, String habitat, String nombre, int edad) {//Metodo constructor
        super(nombre, edad);
        this.velocidad = velocidad;
        this.habitat = habitat;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    
    /*Lanotación @Override simplemente se utiliza, para forzar al compilador a comprobar en tiempo de compilación que estás sobrescribiendo correctamente 
    un método,y de este modo evitar errores en tiempo de ejecución, los cuales serían mucho más difíciles de detectar.
    */
    @Override
    public void mostrarDatos(){
        System.out.println("La velocidad que alcanza su animal por hora es: "+getVelocidad()+"\nEl habitat de su animal es: "+getHabitat());
    }
 
}