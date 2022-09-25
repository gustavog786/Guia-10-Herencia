/*
 • Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
 */
package entidad;

import java.util.Scanner;


public final class EdificioDeOficinas extends Edificio{
    private int numOficinas;
    private int personasOficina;
    private int numPisos;
    
    //Constructores

    public EdificioDeOficinas(int numOficinas, int personasOficina, int numPisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.numOficinas = numOficinas;
        this.personasOficina = personasOficina;
        this.numPisos = numPisos;
    }
    
    //Getter and setters

    public int getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(int numOficinas) {
        this.numOficinas = numOficinas;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }
    
    //to String

    @Override
    public String toString() {
        return "EdificioDeOficinas{ " + super.toString() + " numOficinas=" + numOficinas + ", personasOficina=" + personasOficina + ", numPisos=" + numPisos + '}';
    }
    
    
    //defino los metodos abstractos

    @Override
    public double calcularSuperficie() {
        double superficie= ancho*largo;
        return superficie;
    }

    @Override
    public double calcularVolumen() {
        double volumen =  ancho*alto*largo*numPisos;
        return volumen;
    }
    
    /*
    De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
    usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
    (suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
    cuantas personas entrarían en un piso y cuantas en todo el edificio.
    */
    
    public void cantPersonas(){
        Scanner scan = new Scanner(System.in).useDelimiter("\n"); 
        System.out.println("Ingrese cuantas personas entran en cada oficina: ");
        int perXOficina=scan.nextInt();
        System.out.println("En cada piso habra una oficina, ingrese el numero de pisos de edicicio: ");
        int numDeOficinas= scan.nextInt();
        System.out.println("Calculando que por m2 entra una persona ");
        System.out.println("En un piso entrarian " + ancho*largo + "personas");
        System.out.println("Y en todo el edificio "+ ancho*largo*numPisos);
    }
    
    
}
