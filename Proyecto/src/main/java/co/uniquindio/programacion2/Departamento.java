package co.uniquindio.programacion2;
import java.util.List;

class Departamento {
    private String nombre;
    private String codigo;
    private List<Empleado> empleados;

   
    public Departamento(String nombre, String codigo, List<Empleado> empleados) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.empleados = empleados;
    }

    public Departamento(){

    }

    public void addEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

   
    
}