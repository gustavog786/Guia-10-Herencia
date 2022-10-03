/*
 
 */
package enums;

public enum Departamento {
    MATEMATICAS("Matematicas"), LENGUAJES("Lenguajes"), ARQUITECTURA("Arquitectura"), INGENIERIA("Ingenieria"),
    ABOGACIA("Abogacia"), MEDICINA("Medicina");
    private String departamento;

    private Departamento() {
    }

    private Departamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public String toString() {
        return "Departamento{" + departamento + '}';
    }
    
    
}
