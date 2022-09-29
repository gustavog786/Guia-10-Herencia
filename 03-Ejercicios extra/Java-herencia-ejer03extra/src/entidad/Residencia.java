/*

 */
package entidad;


public class Residencia extends AlojaminetosExtraHoteleros{
    private int cantHabitaciones;
    public boolean descuentoGremios;
    public boolean campoDeportivo;
    
    //constructores

    public Residencia() {
    }

    public Residencia(int cantHabitaciones, boolean descuentoGremios, boolean campoDeportivo, boolean privado, double superficie, String nombre, String direccion, String localidad, String gerente) {
        super(privado, superficie, nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.descuentoGremios = descuentoGremios;
        this.campoDeportivo = campoDeportivo;
    }
    
    //Getter and setters

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public boolean isDescuentoGremios() {
        return descuentoGremios;
    }

    public void setDescuentoGremios(boolean descuentoGremios) {
        this.descuentoGremios = descuentoGremios;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }
    
    //to String

    @Override
    public String toString() {
        return  "Residencia{" + super.toString()+ "cantHabitaciones=" + cantHabitaciones + ", descuentoGremios=" + descuentoGremios + ", campoDeportivo=" + campoDeportivo + '}';
    }
    
    
}
