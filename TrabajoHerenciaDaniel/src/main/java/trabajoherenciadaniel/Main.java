/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package trabajoherenciadaniel;

/**
 *
 * @author fierr
 */
public class Main {

    public static void main(String[] args) {
        
    /*RECORDAR QUE SE VA ES A CREAR UN OBJETO DE LA CLASE PADRE POR ELLO GENERA ERROR AL HACERLO
        CON LAS CLASES HIJAS,Y PARA QUE TOME TODOS LOS DATOS DE LA CLASE PADRE
        
        Osita osi1=new Osita("Panda","Bambu","Anita",19);
        Lion lio1=new Lion("","def","hjlk",18);
        osi1.mostrarDatos();
        lio1.mostrarDatos();
    */
    
    Animales ani05=new Animales("Anita",19);
    ani05.mostrarDatos();
     Osita osi=new Osita("Panda","Bambu","holaMiVidaTeAmoMuchoEsperoTeSirva",19);/*Suele aparecer un error que menciona algo sobre
     las variables, recordar revisar donde dice REQUIRED y FOUND, las required son aquellos datos que
     son necesarios en la ejecucion del programa para que no queden vacíos, mientras que found son los 
     datos que ya se ingresaron en el programa,recordar el uso de las comas y también,que según los datos
     que salen en required se tienen que ingresar en ese mismo orden.
     */
     osi.mostrarDatos();
     
        System.out.println("----------------------////////////////////------------------------");
     Animales ani07=new Animales("Danielito",18);
     ani07.mostrarDatos();
     Lion lio=new Lion("80 KM/H","Sabanas africanas","Hola amor siempre sobra una linea pero igual es necesario colocarla para que la sintaxis de required y found aparezca bien y corra africanas",18);
     lio.mostrarDatos();
            
    }
}
