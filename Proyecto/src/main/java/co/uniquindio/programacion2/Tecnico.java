package co.uniquindio.programacion2;

class Tecnico extends Empleado implements IContribuyente {
    private String especialidad;

    public Tecnico(String nombre, String id, String departamento, String especialidad) {
        super(nombre, id, departamento);
        this.especialidad = especialidad;
    }

    public Tecnico(){
        
    }

    public String contribuir() {
        return "El técnico " + getNombre() + " contribuye con su especialidad en: " + especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}