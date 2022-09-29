/*
 Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
 */
package entidad;

public class Hotel5 extends Hoteles{
    private String gimnasio;
    private String NombreRestaurante;
    private int capacidadRestaurante;
    private int salonesConferencia;
    private int cantidadSuites;
    private int cantidadLimosinas;
    private double precioHabitaciones;
    
    //Constructores

    public Hotel5() {
    }

    public Hotel5(String gimnasio, String NombreRestaurante, int capacidadRestaurante, int salonesConferencia, int cantidadSuites, int cantidadLimosinas, double precioHabitaciones, int cantidadHabitaciones, int numeroCamas, int pisos, String nombre, String direccion, String localidad, String gerente) {
        super(cantidadHabitaciones, numeroCamas, pisos, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.NombreRestaurante = NombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
        this.salonesConferencia = salonesConferencia;
        this.cantidadSuites = cantidadSuites;
        this.cantidadLimosinas = cantidadLimosinas;
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
        return NombreRestaurante;
    }

    public void setNombreRestaurante(String NombreRestaurante) {
        this.NombreRestaurante = NombreRestaurante;
    }

    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(int capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public int getSalonesConferencia() {
        return salonesConferencia;
    }

    public void setSalonesConferencia(int salonesConferencia) {
        this.salonesConferencia = salonesConferencia;
    }

    public int getCantidadSuites() {
        return cantidadSuites;
    }

    public void setCantidadSuites(int cantidadSuites) {
        this.cantidadSuites = cantidadSuites;
    }

    public int getCantidadLimosinas() {
        return cantidadLimosinas;
    }

    public void setCantidadLimosinas(int cantidadLimosinas) {
        this.cantidadLimosinas = cantidadLimosinas;
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
        return "Hotel5{" + super.toString() + "gimnasio=" + gimnasio + ", NombreRestaurante=" + NombreRestaurante + ", capacidadRestaurante=" + capacidadRestaurante + ", salonesConferencia=" + salonesConferencia + ", cantidadSuites=" + cantidadSuites + ", cantidadLimosinas=" + cantidadLimosinas + ", precioHabitaciones=" + precioHabitaciones + '}';
    }
    
    
    @Override
     public double precioHabitacion(){
     double precioHab = 50 + getCantidadHabitaciones() + valorAgregadoRest()+ valorAGregadoGim()+
             valorAgregadoLimo();
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
    
    public double valorAgregadoLimo() {
        return 15*cantidadLimosinas;
    } 
}
