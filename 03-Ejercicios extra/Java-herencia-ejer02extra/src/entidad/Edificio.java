/*
Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
edificio tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico.
 */
package entidad;

public abstract class Edificio {
    protected double ancho;
    protected double alto;
    protected double largo;
    
    //Constructores

    public Edificio(double ancho, double alto, double largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    //Getter and setters
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }
    
    //to String

    @Override
    public String toString() {
        return '{'+ "ancho=" + ancho + ", alto=" + alto + ", largo=" + largo + '}';
    }
    
    
    //Metodos abstractos
    public abstract double calcularSuperficie();  //calcula la superficie del edificio.
    public abstract double calcularVolumen(); //calcula el volumen del edifico.
    
}
