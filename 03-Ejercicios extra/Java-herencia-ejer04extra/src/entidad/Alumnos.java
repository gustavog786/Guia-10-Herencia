/*
 
 */
package entidad;


public class Alumnos extends Facultad{
    private String curso;

    //Constructores
    public Alumnos() {
    }

    public Alumnos(String curso, String nombre, String apellido, int identificacion, String estadoCivil) {
        super(nombre, apellido, identificacion, estadoCivil);
        this.curso = curso;
    }
    
    //Getter and setter

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    //to String

    @Override
    public String toString() {
        return "Alumnos{" + super.toString() + "curso=" + curso + '}';
    }
    
    
}
