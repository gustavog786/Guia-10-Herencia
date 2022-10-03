/*

 */
package entidad;

import enums.Departamento;


public class Profesores extends Empleados{
    private Departamento departamento;
    
    //Construtores

    public Profesores() {
    }

    public Profesores(Departamento departamento, int anioIncorporacion, int numDespacho, String nombre, String apellido, int identificacion, String estadoCivil) {
        super(anioIncorporacion, numDespacho, nombre, apellido, identificacion, estadoCivil);
        this.departamento = departamento;
    }
    
    //Getter and setter

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    //To String

    @Override
    public String toString() {
        return "Profesores {" + super.toString() + "departamento=" + departamento + '}';
    }
    
    
}
