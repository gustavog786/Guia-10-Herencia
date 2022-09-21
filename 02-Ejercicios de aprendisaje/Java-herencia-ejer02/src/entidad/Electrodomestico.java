package entidad;

import java.util.Scanner;

public class Electrodomestico {
    protected int precio;
    protected String color;
    protected char letra;
    protected int peso;
    
    //construtores

    public Electrodomestico() {
    }

    public Electrodomestico(int precio, String color, char letra, int peso) {
        this.precio = precio;
        this.color = color;
        this.letra = letra;
        this.peso = peso;
    }
    
    //Metodos
    //getters and setters

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    //to String

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", letra=" + letra + ", peso=" + peso + '}';
    }
    
    
    /*
    Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
    sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
    objeto y no será visible.
    */
    
    public void comprobarConsumoEnergetico(char letra){
        if (letra == 'A' || letra == 'B' || letra == 'C'
                || letra == 'D' || letra =='E' ||letra == 'F') {
            return;
        } 
        setLetra('F');
    }
    
    /*
    Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
    usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
    blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
    minúsculas. Este método se invocará al crear el objeto y no será visible.
    */
    
    public void comprobarColor(String color){
        if (color.toLowerCase().equals("blanco") || color.toLowerCase().equals("negro") || color.toLowerCase().equals("rojo") ||
                color.toLowerCase().equals("azul") || color.toLowerCase().equals("gris")) {
                return;
        }
        setColor("blanco");
    }
    
    /*
    Metodo crearElectrodomestico(): le pide la información al usuario y llena el
    electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
    precio se le da un valor base de $1000.
    */
    
    public void crearElectrodomestico(){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el precio: ");
        setPrecio(scan.nextInt());
        System.out.println("Ingrese el color: ");
        setColor(scan.next());
        comprobarColor(getColor());
        System.out.println("Ingrese el consumo: ");
        setLetra(scan.next().charAt(0));
        comprobarConsumoEnergetico(getLetra());
        System.out.println("Ingrese el peso: ");
        setPeso(scan.nextInt());
    }
    
    /*
    Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
    precio. Esta es la lista de precios:
    LETRA PRECIO
    A $1000
    B $800
    C $600
    D $500
    E $300
    F $100

    PESO PRECIO
    Entre 1 y 19 kg $100
    Entre 20 y 49 kg $500
    Entre 50 y 79 kg $800
    Mayor que 80 kg $1000
    */
    public void precioFinal(){
        switch(letra){
            case 'A':
                precio = precio +1000;
                break;
            case 'B':
                precio = precio +800;
                break;
            case 'C':
                precio = precio + 600;
                break;
            case 'D':
                precio = precio + 500;
                break;
            case 'E' :
                precio = precio +300;
                break;
            case 'F':
                precio = precio +100;
                break;
                default:
                    System.out.println("Error");
        }
        if(peso>=1&&peso<=19){
            precio=precio+100;
        }
        if(peso>=20&&peso<=49)        {
            precio=precio+500;
        }
        if(peso>=50&&peso<=79)        {
            precio=precio+800;
        }
        if(peso>80)        {
            precio=precio+1000;
        }
        System.out.println("El precio final es: "+ precio);
    }
    
    //Metodo precio final en pocas linas
    public void precioFinalCorto()
    {
        precio=precio+(letra=='A' ? 1000 : 0)+
                (letra=='B' ? 800 : 0)+
                (letra=='C' ? 600 : 0)+
                (letra=='D' ? 500 : 0)+
                (letra=='E' ? 300 : 0)+
                (letra=='F' ? 100 : 0)+
                (peso>=1&&peso<=19 ? 100 : 0)+
                (peso>=20&&peso<=49 ? 500 : 0)+
                (peso>=50&&peso<=79 ? 800 : 0)+
                (peso>=80 ? 1000 : 0);
         System.out.println("Precio Final: "+ precio);
    }

    
}
