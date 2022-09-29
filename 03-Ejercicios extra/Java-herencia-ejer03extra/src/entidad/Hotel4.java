/*
 Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
*/
package entidad;


public class Hotel4 extends Hoteles{
    private String gimnasio;
    private String nombreRestaurante;
    private int capacidadRestaurante;
    private double precioHabitaciones;
    
    //constructores

    public Hotel4() {
    }

    public Hotel4(String gimnasio, String nombreRestaurante, int capacidadRestaurante, double precioHabitaciones, int cantidadHabitaciones, int numeroCamas, int pisos, String nombre, String direccion, String localidad, String gerente) {
        super(cantidadHabitaciones, numeroCamas, pisos, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
        this.precioHabitaciones = precioHabitaciones;
    }

    
    
    //getter and setters

    public String getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(int capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public double getPrecioHabitaciones() {
        return precioHabitaciones;
    }

    public void setPrecioHabitaciones(double precioHabitaciones) {
        this.precioHabitaciones = precioHabitaciones;
    }
    
    //to String

    @Override
    public String toString() {
        return "Hotel4{" + super.toString() + "gimnasio=" + gimnasio + ", nombreRestaurante=" + nombreRestaurante + ", capacidadRestaurante=" + capacidadRestaurante + ", precioHabitaciones=" + precioHabitaciones + '}';
    }
    
    //Metodos
    @Override
    public double precioHabitacion(){
     double precioHab = 50 + getCantidadHabitaciones() + valorAgregadoRest()+ valorAGregadoGim();
     return precioHab;
    }


    public double valorAgregadoRest() {
       double vRest;
        if (capacidadRestaurante <30 ) {
            vRest=10;
        }else if( capacidadRestaurante>=30 && capacidadRestaurante <=50){
            vRest=30;
        }else{
            vRest=50;
        }
        return vRest;
    }

    public double valorAGregadoGim() {
        double vGim;
        if (gimnasio.equals("A")) {
            vGim= 50;
        }else{ vGim = 30;}
        return vGim;
    }
}
