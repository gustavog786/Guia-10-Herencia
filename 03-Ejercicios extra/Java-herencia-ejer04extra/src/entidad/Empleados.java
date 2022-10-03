/*
 
 */
package entidad;

public class Empleados extends Facultad{
    protected int anioIncorporacion;
    protected int numDespacho;
    
    //constructores

    public Empleados() {
    }

    public Empleados(int anioIncorporacion, int numDespacho, String nombre, String apellido, int identificacion, String estadoCivil) {
        super(nombre, apellido, identificacion, estadoCivil);
        this.anioIncorporacion = anioIncorporacion;
        this.numDespacho = numDespacho;
    }
    
    //Getter and setters

    public int getAnioIncorporacion() {
        return anioIncorporacion;
    }

    public void setAnioIncorporacion(int anioIncorporacion) {
        this.anioIncorporacion = anioIncorporacion;
    }

    public int getNumDespacho() {
        return numDespacho;
    }

    public void setNumDespacho(int numDespacho) {
        this.numDespacho = numDespacho;
    }
    
    // to String
    @Override
    public String toString() {
        return super.toString()+ "{" + "anioIncorporacion=" + anioIncorporacion + ", numDespacho=" + numDespacho + '}';
    }
    
}
