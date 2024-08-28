package co.uniquindio.programacion2;
import java.util.ArrayList;
import java.util.List;

class Empresa {
    private List<Departamento> departamentos;
    private List<Proyecto> proyectos;
    private List<Empleado> empleados;

    public Empresa(List<Departamento> departamentos, List<Proyecto> proyectos, List<Empleado> empleados) {
        this.departamentos = new ArrayList<>();
        this.proyectos = new ArrayList<>();
        this.empleados = new ArrayList<>();
    }


    public Empresa() {
    
    }

    public void addProyecto(Proyecto proyecto) {
        proyectos.add(proyecto);
    }

    public void addEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }
  

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public List<Proyecto> getProyectos() {
        return proyectos;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public void setProyectos(List<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    


}
