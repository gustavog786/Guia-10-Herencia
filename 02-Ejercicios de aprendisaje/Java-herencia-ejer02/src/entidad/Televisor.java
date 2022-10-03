/*
Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos.
 */
package entidad;

import java.util.Scanner;

public class Televisor extends Electrodomestico{
    private double resolucion;
    private boolean sintonizadorTDT;
    
    
    //constructores

    public Televisor() {
    }
    
    public Televisor(double resolucion, boolean sintonizadorTDT, int precio, String color, char letra, int peso) {
        super(precio, color, letra, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }
    
    //getter and setteres

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }
    
    //to String 

    @Override
    public String toString() {
        return super.toString()+"Televisor{" + "resolucion=" + resolucion + ", sintonizadorTDT=" + sintonizadorTDT + '}';
    }
    
    
    //metodos
    
    /*
     Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
    padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
    los atributos del televisor.
    */
    public Televisor crearTelevisor( ){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        Televisor t1 = new Televisor();
        System.out.println("Vamos a crear un televisor: ");
        crearElectrodomestico(t1);
        System.out.println("Ingrese la resolucion: ");
        t1.setResolucion(scan.nextDouble());
        System.out.println("Posee sintonizador TDT ? si/no");
        String posee = scan.next();
        t1.setSintonizadorTDT(posee.equals("si"));
        return t1;
    }
    
    /*
    Método precioFinal(): este método será heredado y se le sumará la siguiente
    funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
    incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
    $500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
    también deben afectar al precio.
    */
    
    @Override
    public int precioFinal(){
        super.precioFinal();
        if (resolucion > 40) {
            precio = (int) ( precio + precio*0.3);
        }
        if (sintonizadorTDT) {
            precio = precio + 500;
        }
        System.out.println("El precio final del televisor es: "+ precio);
        return precio;
    }
}
