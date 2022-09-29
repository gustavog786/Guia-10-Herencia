/*

 */
package entidad;


public class Camping extends AlojaminetosExtraHoteleros {
    public int maxCarpas;
    public int cantidadBanios;
    public boolean restaurante;
    
    //constructores

    public Camping() {
    }

    public Camping(int maxCarpas, int cantidadBanios, boolean restaurante, boolean privado, double superficie, String nombre, String direccion, String localidad, String gerente) {
        super(privado, superficie, nombre, direccion, localidad, gerente);
        this.maxCarpas = maxCarpas;
        this.cantidadBanios = cantidadBanios;
        this.restaurante = restaurante;
    }

    
    
    //Getter and Setters

    public int getMaxCarpas() {
        return maxCarpas;
    }

    public void setMaxCarpas(int maxCarpas) {
        this.maxCarpas = maxCarpas;
    }

    public int getCantidadBanios() {
        return cantidadBanios;
    }

    public void setCantidadBanios(int cantidadBanios) {
        this.cantidadBanios = cantidadBanios;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
    }
    
    //to String

    @Override
    public String toString() {
        return "Camping{" + super.toString()+ "maxCarpas=" + maxCarpas + ", cantidadBanios=" + cantidadBanios + ", restaurante=" + restaurante + '}';
    }
    
            
}
