
package Modelo;



public class empleado {

    private String nombre;
    private int edad;
    private String departamento;

    public empleado() {
    }

    public empleado(String nombre, int edad, String departamento) {
        this.nombre = nombre;
        this.edad = edad;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    } 
    
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", departamento='" + departamento + '\'' +
                '}';
    }

}
