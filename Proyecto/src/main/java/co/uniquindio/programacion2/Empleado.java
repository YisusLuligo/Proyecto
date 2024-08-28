package co.uniquindio.programacion2;

// Clases
class Empleado {
    private String nombre;
    private String id;
    private String departamento;

    public Empleado(String nombre, String id, String departamento) {
        this.nombre = nombre;
        this.id = id;
        this.departamento = departamento;
    }

    public Empleado(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}


