/*
En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler.
 */
package entidad;

import java.util.Date;
import java.util.Scanner;


public class Alquiler {
    protected String nombre;
    protected int dni;
    protected Date fechaAlquiler;
    protected Date fechaDevolucion;
    protected int posicionAmarre;
    protected Barco barco;
    
    //Contructores

    public Alquiler() {
    }

    public Alquiler(String nombre, int dni, Date fechaAlquiler, Date fechaDevolucion, int posicionAmarre, Barco barco) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }
    
    //getter and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }
    
    //to String

    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", dni=" + dni + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion + ", posicionAmarre=" + posicionAmarre + ", barco=" + barco + '}';
    }
    
    //Metodo
    /*
    Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
    alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
    multiplicando por 10 los metros de eslora).
    */
    public void calcularAlquiler(){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        int dia1, mes1, anio1;
        System.out.println("Fecha de inicio de alquiler:");
        System.out.print("Día: ");
        dia1 = scan.nextInt();        
        System.out.print("Mes: ");
        mes1 = scan.nextInt();        
        System.out.print("Año: ");
        anio1 = scan.nextInt() - 1900; 
        fechaAlquiler = new Date(anio1, mes1 - 1, dia1);               
        int dia2, mes2, anio2;
        System.out.println("Fecha devolución:");
        System.out.print("Día: ");
        dia2 = scan.nextInt();        
        System.out.print("Mes: ");
        mes2 = scan.nextInt();        
        System.out.print("Año: ");
        anio2 = scan.nextInt() - 1900;
        fechaDevolucion = new Date(anio2, mes2 - 1, dia2);        
        System.out.println("La fecha actual es: "+ fechaAlquiler.toString());
        System.out.println("La fecha elegida es: " + fechaDevolucion.toString());
        int diferencia = (int) ((fechaDevolucion.getTime() - fechaAlquiler.getTime())/1000/60/60/24);
        System.out.println("Dias entre la fecha alquiler y la fecha de devolucion: " + diferencia);        
        double valorAlquiler = diferencia * (barco.getEslora()* 10);        
        System.out.println("El valor del alquiler es $"+ valorAlquiler);
    }
    
    
}
