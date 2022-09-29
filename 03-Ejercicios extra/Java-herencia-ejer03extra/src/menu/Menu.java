/*
 Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento.
 */
package menu;

import entidad.Alojamientos;
import entidad.Camping;
import entidad.Hotel4;
import entidad.Hotel5;
import entidad.Residencia;
import java.util.ArrayList;
import java.util.Scanner;


public class Menu {
     //Creo los Arraylist
     ArrayList<Alojamientos> alojamientos = new ArrayList();
    
    public void crearMenu(){
        alojamientos.add(new Hotel5("Fitnes", "Restaurante El Asador", 300, 2, 4, 8, 2000, 20, 30, 6, "Hotel La Posada", "Centro", "VCP", "Fernando Chiquito"));
        alojamientos.add(new Hotel4("El GYM", "REstaurante Vegano", 200, 1500, 12, 20, 4, "Hotel del Lago", "Centro", "Santa Rosa Calamuchita", "Juan Lopez"));
        alojamientos.add(new Camping(30, 10, true, true, 500, "Camping El Zorro", "Frente al rio", "Santa Rosa Calamuchita", "Pedro Marmol"));
        alojamientos.add(new Camping(40, 10, false, true, 600, "Camping El Tobal", "Centro", "VCP", "Jorge Torres"));
        alojamientos.add(new Residencia(10, true, true, true, 100, "Residencia el Manantial", "Centro", "VCP", "Hugo Lopez"));
        alojamientos.add(new Residencia(15, false, true, true, 130, "Residencia El Nogal", "Centro", "Santa Rosa Calamuchita", "Rolo Bueno"));
        
        Scanner scan = new Scanner(System.in).useDelimiter("\n"); 
        System.out.println("Bienvenido a Turismo Cordoba: ");
        
        int opcion;
        do {
            System.out.println("Seleccione una opcion: \n1. Ver todos los alojamientos disponibles\n2. "
                    + "Ver todos los Hoteles\n3. Ver los Camping con restaurantes\n4. Ver todas las residencias"
                    + " con descuento\n0. Para salir");
            opcion = scan.nextInt();
        switch(opcion){
            case 1:
                System.out.println("La lista de Alojamientos disponibles es: ");
                mostrarAlojamientos();
               break;
            case 2:
                System.out.println("La lista de Hoteles es: ");
                mostrarHoteles();
                break;
            case 3:
                System.out.println("La lista de Campings con restaurantes es: ");
                mostrarCampingConRestaurante();
                break;
            case 4:
                System.out.println("La lista de residencias con descuento es: ");
                mostrarResidenciasConDescuento();
                break;
                default:
                    System.out.println("Error eligio un numero incorrecto");
                    break;
            }            
        } while (opcion !=0);  
    
    } 
        
    public void mostrarAlojamientos(){
        for (Alojamientos alojamiento : alojamientos) {
            System.out.println(alojamiento);
        }
    }
    public void mostrarHoteles(){
        for (Alojamientos alojamiento : alojamientos) {
            if (alojamiento instanceof Hotel5) {
                Hotel5 object = (Hotel5) alojamiento;
                System.out.println(object);
            }
            if (alojamiento instanceof Hotel4) {
                Hotel4 object1 = (Hotel4) alojamiento;
                System.out.println(alojamiento);
            }
             
        }
    }

    public void mostrarCampingConRestaurante() {
        for (Alojamientos alojamiento : alojamientos) {
            if (alojamiento instanceof Camping) {
                Camping object = (Camping) alojamiento;
                if (object.isRestaurante()) {
                    System.out.println(object);
                }
            }
        }
    }

    public void mostrarResidenciasConDescuento() {
        for (Alojamientos alojamiento : alojamientos) {
            if (alojamiento instanceof Residencia) {
                Residencia object = (Residencia) alojamiento;
                if (object.descuentoGremios) {
                    System.out.println(object);
                }
            }
        }
    }
}
