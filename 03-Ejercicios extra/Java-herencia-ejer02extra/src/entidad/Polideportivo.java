/*
• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
 */
package entidad;


public final class Polideportivo extends Edificio{
    private String nombre;
    private boolean techado;
    
    //Construtores

    public Polideportivo(String nombre, boolean techado, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.techado = techado;
    }
    
    //getter and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTechado() {
        return techado;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
    }
    
    //to String

    @Override
    public String toString() {
        return "Polideportivo{" + super.toString() + "nombre=" + nombre + ", techado=" + techado + '}';
    }
    

    //Defino los metodos abstractos
    
    @Override
    public double calcularSuperficie() {
        double superficie= ancho*largo;
        return superficie;
    }

    @Override
    public double calcularVolumen() {
       double volumen= ancho*alto*largo;
       return volumen;
    }
    
}
