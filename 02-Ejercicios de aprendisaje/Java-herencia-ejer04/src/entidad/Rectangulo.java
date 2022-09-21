/*
 Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
package entidad;

import interfaces.calculosFormas;

/**
 *
 * @author gusta
 */
public class Rectangulo implements calculosFormas{
    private double base;
    private double altura;
    
    //contrutores

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    
    //to String

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    //Metodos
    
    @Override
    public double CalcularArea() {
        double area = base*altura;
        System.out.println("El area del rectangulo es: "+ area);
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro;
        perimetro = base*2 + altura*2;
        System.out.println("El perimetro del rectangulo es: " + perimetro);
        return perimetro;
    }
    
}
