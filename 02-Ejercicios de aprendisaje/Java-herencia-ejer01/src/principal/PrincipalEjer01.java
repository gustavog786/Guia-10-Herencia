/*
 Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:
 */
package principal;

import entidad.Animal;
import entidad.Caballo;
import entidad.Gato;
import entidad.Perro;


public class PrincipalEjer01 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaro un perro
        Animal perro1 = new Perro("Toto", "carne", 8, "caniche");
        perro1.Alimentarse();
        
        //Declaro un perro
        Animal gato1 = new Gato("Filomena", "ratones", 12, "naranjoso");
        gato1.Alimentarse();
        
        //Declaro un perro
        Animal Caballo1 = new Caballo("Piojo", "pasto", 15, "pura sangre");
        Caballo1.Alimentarse();
    }
    
}
