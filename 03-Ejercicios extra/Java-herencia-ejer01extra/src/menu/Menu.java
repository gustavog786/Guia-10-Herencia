/*

 */
package menu;

import entidad.Alquiler;
import entidad.Barco;
import entidad.BarcoAMotor;
import entidad.Velero;
import entidad.YateDeLujo;
import java.util.Date;
import java.util.Scanner;


public class Menu {
    
    public void crearMenu(){
        Alquiler a1 = new Alquiler();
        Scanner scan = new Scanner(System.in).useDelimiter("\n"); 
        System.out.println("Bienvenido al servicio de alquiler de barcos");
        System.out.println("Ingrese su nombre completo: ");
        a1.setNombre(scan.next());
        System.out.println("Ingrese el dni: ");
        a1.setDni(scan.nextInt());
        a1.setPosicionAmarre(1);                //seteo el amarre
        int dia1, mes1, anio1;
        System.out.println("Fecha de inicio de alquiler:");
        System.out.print("Día: ");
        dia1 = scan.nextInt();        
        System.out.print("Mes: ");
        mes1 = scan.nextInt();        
        System.out.print("Año: ");
        anio1 = scan.nextInt() - 1900; 
        a1.setFechaAlquiler( new Date(anio1, mes1 - 1, dia1));               
        int dia2, mes2, anio2;
        System.out.println("Fecha devolución:");
        System.out.print("Día: ");
        dia2 = scan.nextInt();        
        System.out.print("Mes: ");
        mes2 = scan.nextInt();        
        System.out.print("Año: ");
        anio2 = scan.nextInt() - 1900;
        a1.setFechaDevolucion(new Date(anio2, mes2 - 1, dia2));        
        System.out.println("La fecha actual es: "+ a1.getFechaAlquiler().toString());
        System.out.println("La fecha elegida es: " + a1.getFechaDevolucion().toString());
        int diferencia = (int) ((a1.getFechaDevolucion().getTime() - a1.getFechaAlquiler().getTime())/1000/60/60/24);
        System.out.println("Dias entre la fecha alquiler y la fecha de devolucion: " + diferencia);
        int opcion;
        do {
            System.out.println("Ingrese el tipo de barco que quiere: \n1. Velero\n2. Barco a Motor\n3. Yate de Lujo");
            opcion = scan.nextInt();
        switch(opcion){
            case 1:
               System.out.println("Eligio un Velero");
               System.out.println("Ingrese el numero de mastiles que desea en su barco: ");
               int Mastiles= scan.nextInt();
               Barco b1 = new Velero(Mastiles, "AA4400",15 , 1970);
               a1.setBarco(b1);
               break;
            case 2:
                System.out.println("Eligio un Barco a Motor");
                System.out.println("Elija la potencia deseada en CV: ");
                double CV= (scan.nextDouble());
                Barco b2 = new BarcoAMotor(CV, "BB5500", 20, 1980);
                a1.setBarco(b2);
                break;
            case 3:
                System.out.println("Eligio un Yate de Lujo");
                System.out.println("Ingrese la potencia deseada en CV: ");
                double CVyate= scan.nextDouble();
                System.out.println("Ingrese el numero de camarotes: ");
                int ncam = scan.nextInt();
                Barco b3 = new YateDeLujo(CVyate, ncam, "CC6600", 25, 2000);
                a1.setBarco(b3);
                break;
                default:
                    System.out.println("Error eligio un numero incorrecto");
                    break;
            }            
        } while (opcion != 1 && opcion !=2 && opcion != 3);  
        int totalAPagar= (int) (a1.getBarco().modulo()*diferencia);
        System.out.println("Aqui tiene su factura");
        System.out.println("--------------------------------------------");
        System.out.println("");
        System.out.println("");
        System.out.println("Alquiler de barcos SA            Factura:001");
        System.out.println("Nombre: "+ a1.getNombre());
        System.out.println("Dni: "+ a1.getDni());
        System.out.println("Fecha de incio: "+ a1.getFechaAlquiler());
        System.out.println("Fecha de devolucion: "+a1.getFechaDevolucion());
        System.out.println("Cantidad de dias: "+ diferencia);
        System.out.println("Tipo de embarcacion: " + a1.getBarco().getClass().getSimpleName());
        System.out.println("Matricula: " + a1.getBarco().getMatricula());
        System.out.println("");
        System.out.println("");
        System.out.println("Total a pagar: $"+ totalAPagar);
        System.out.println("---------------------------------------------");
    }
}
