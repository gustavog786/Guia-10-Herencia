/*
 El ejercicio consiste, en primer lugar, en definir la jerarquía de clases de esta aplicación. A
continuación, debe programar las clases definidas en las que, además de los constructores,
hay que desarrollar los métodos correspondientes a las siguientes operaciones:
• Cambio del estado civil de una persona.
• Reasignación de despacho a un empleado.
• Matriculación de un estudiante en un nuevo curso.
• Cambio de departamento de un profesor.
• Traslado de sección de un empleado del personal de servicio.
• Imprimir toda la información de cada tipo de individuo. Incluya un programa de prueba
que instancie objetos de los distintos tipos y pruebe los métodos desarrollados.
 */
package servicio;

import entidad.Facultad;
import entidad.Profesores;
import enums.Departamento;
import java.util.Scanner;


public class Menu {
    Scanner scan = new Scanner(System.in).useDelimiter("\n");  
    public void crearMenu(){
        System.out.println("Bienvenido al servicio de personal de la facultad: ");
        int opcion;
        do {
            System.out.println("Seleccione una opcion: \n1. Registrar  una nueva persona persona en el sistema\n2. "
                    + "Cambiar el estado civil de una persona\n3. Reasinar el despacho de un empleado\n4. Matricular un estudiante"
                    + " en un nuevo curso\n5. Cambiar de departtamento a un profesor\n6. Trasladar de seccion a un empleado del"
                    + "personal de servicio\n7. Mostrar la informacion de una persona \n0. Para salir");
            opcion = scan.nextInt();
        switch(opcion){
            case 1:
                registrarPersona();
                
               break;
            case 2:
                cambiarEstadoCivil();
                
                break;
            case 3:
                
                
                break;
            case 4:
                
               
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
                
                default:
                    System.out.println("Error eligio un numero incorrecto");
                    break;
            }            
        } while (opcion !=0);  
    }
    public void registrarPersona(){
        
        int opc;
        do {
            System.out.println("Vamos a registar una nueva persona en el sistema: ");
            System.out.println("Ingrese una opcion: \n1. Profesores\n2. Personal de servicio\n3. Alumno");
            opc =scan.nextInt();
            switch(opc){
                case 1:
                    System.out.println("Eligio registrar un profesor");
                    
                    
                    //Facultad p1 = new Profesores(Departamento.LENGUAJES, opc, opc, nombre, apellido, opc, estadoCivil);
                    break;
                    
                    /*
                    public Profesores(Departamento departamento, int anioIncorporacion, int numDespacho, String nombre, String apellido, int identificacion, String estadoCivil) {
        super(anioIncorporacion, numDespacho, nombre, apellido, identificacion, estadoCivil);
        this.departamento = departamento;
                    */
                case 2:
                    System.out.println("Eligio registrar a un personal de servicio");
                    break;
                case 3:
                    System.out.println("Eligio registrar a un alumno");
                    break;
                    default:
                        System.out.println("Error, ingreso un numero incorrecto");
                    break;
            }   
        } while (opc !=1 && opc !=2 && opc !=3);
    }
    
    
    public void cambiarEstadoCivil(){
    
    }
}
