/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoherenciadaniel;

/**
 *
 * @author fierr
 */
public class Animales {//Clase padre, superclases
    
    private String nombre;
    private int edad;

//Metodo constructor
    public Animales(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
//Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
//Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void mostrarDatos(){
        System.out.println("El nombre del animal es: "+getNombre()+"\nLa edad del animal es: "+getEdad());
        
    }
    
    
}
