/*
 A continuación, se debe crear una subclase llamada Lavadora, con el atributo carga,
además de los atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de los atributos heredados. Recuerda que debes
llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set del atributo carga.
• Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.
 */
package entidad;

import java.util.Scanner;


public class Lavadora extends Electrodomestico{
    private int carga;
    
    
    //constructores
    

    public Lavadora() {
    }

    public Lavadora(int carga) {
        this.carga = carga;
    }

    public Lavadora(int carga, int precio, String color, char letra, int peso) {
        super(precio, color, letra, peso);
        this.carga = carga;
    }

    //getter and setter

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    //to string

    @Override
    public String toString() {
        return super.toString() + "Lavadora{" + "carga=" + carga + '}';
    }
    
    
    /*
    Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
    padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
    el atributo propio de la lavadora.
    */
    public void crearLavadora(){
        
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Vamos a crear una lavadora: ");
        crearElectrodomestico();
        System.out.println("Ingrese la carga: ");
        setCarga(scan.nextInt());
        
    }
    
    /*
     Método precioFinal(): este método será heredado y se le sumará la siguiente
    funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
    carga es menor o igual, no se incrementará el precio. Este método debe llamar al
    método padre y añadir el código necesario. Recuerda que las condiciones que hemos
    visto en la clase Electrodoméstico también deben afectar al precio.
    */
    @Override
    public void precioFinal(){
        super.precioFinal();
        precio = precio + (carga > 30 ? 500 : 0);
        System.out.println("El precio final de la lavadora es "+ precio);
    }
}
