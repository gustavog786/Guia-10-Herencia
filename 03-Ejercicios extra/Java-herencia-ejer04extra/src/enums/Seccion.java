/*
(biblioteca, decanato, secretaría, ...).
 */
package enums;


public enum Seccion {
    BIBLIOTECA("Biblioteca"), DECANATO("Decanato"),SECRETARIA ("Secretaria"),POSGRADO("Posgrado"), LIMPIEZA("Limpieza");
    
    private String seccion;

    private Seccion() {
    }

    private Seccion(String seccion) {
        this.seccion = seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return "Seccion{" + seccion + '}';
    }
    
    
}
