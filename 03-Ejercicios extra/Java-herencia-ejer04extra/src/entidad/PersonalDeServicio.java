/*
 
 */
package entidad;

import enums.Seccion;


public class PersonalDeServicio extends Empleados{
    private Seccion seccion;
    
    //Constructores

    public PersonalDeServicio() {
    }

    public PersonalDeServicio(Seccion seccion, int anioIncorporacion, int numDespacho, String nombre, String apellido, int identificacion, String estadoCivil) {
        super(anioIncorporacion, numDespacho, nombre, apellido, identificacion, estadoCivil);
        this.seccion = seccion;
    }
    
    //getter and setter

    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }
    
    //to String

    @Override
    public String toString() {
        return "PersonalDeServicio{" +super.toString() + "seccion=" + seccion + '}';
    }
    
}
