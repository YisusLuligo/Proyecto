package co.uniquindio.programacion2;
import java.util.Scanner;

// Clase principal
public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        Scanner scanner = new Scanner(System.in);

        inicializarDatos(empresa);

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Mostrar departamentos");
            System.out.println("2. Mostrar proyectos");
            System.out.println("3. Mostrar contribuciones");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarDepartamentos(empresa);
                    break;
                case 2:
                    mostrarProyectos(empresa);
                    break;
                case 3:
                    mostrarContribuciones(empresa);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }

    public static void inicializarDatos(Empresa empresa) {
        // Crear departamentos
        Departamento departamento1 = new Departamento();
        departamento1.setNombre("Administrativo");
        departamento1.setCodigo("2020");
        Departamento departamento2 = new Departamento();
        departamento2.setNombre("Recursos Humanos");
        departamento2.setCodigo("2022");
        Departamento departamento3 = new Departamento();
        departamento3.setNombre("Marketing");
        departamento3.setCodigo("2025");
        Departamento departamento4 = new Departamento();
        departamento4.setNombre("General");
        departamento4.setCodigo("6060");

       
        empresa.getDepartamentos().add(departamento1);
        empresa.getDepartamentos().add(departamento2);
        empresa.getDepartamentos().add(departamento2);
        empresa.getDepartamentos().add(departamento3);
        empresa.getDepartamentos().add(departamento4);

        // Crear empleados
        Gerente gerente = new Gerente();
        gerente.setNombre("Luis");
        gerente.setId("1010");
        gerente.setDepartamento("Administrativo");
        Tecnico tecnico1 = new Tecnico();
        tecnico1.setNombre("Fernando");
        tecnico1.setId("1010");
        tecnico1.setEspecialidad("General");
        tecnico1.setEspecialidad("Electrincista");
        Tecnico tecnico2 = new Tecnico();
        tecnico2.setNombre("Luisa");
        tecnico2.setId("5105");
        tecnico2.setEspecialidad("General");
        tecnico2.setEspecialidad("Mantenimiento");
        Tecnico tecnico3 = new Tecnico();
        tecnico3.setNombre("Alexis");
        tecnico3.setId("6025");
        tecnico3.setEspecialidad("Administrativo");
        tecnico3.setEspecialidad("Desarrollador");
        Tecnico tecnico4 = new Tecnico();
        tecnico4.setNombre("Valeria");
        tecnico4.setId("6868");
        tecnico4.setEspecialidad("Recursos Humanos");
        tecnico4.setEspecialidad("Archivo");

        empresa.addEmpleado(gerente);
        empresa.addEmpleado(tecnico1);
        empresa.addEmpleado(tecnico2);
        empresa.addEmpleado(tecnico3);
        empresa.addEmpleado(tecnico4);

        // Crear proyectos
        Proyecto proyecto1 = new Proyecto();
        proyecto1.setNombre("Colegio");
        proyecto1.setCodigo("3030");
        Proyecto proyecto2 = new Proyecto();
        proyecto2.setNombre("Supermercado");
        proyecto2.setCodigo("9090");
        Proyecto proyecto3 = new Proyecto();
        proyecto3.setNombre("Coliseo");
        proyecto3.setCodigo("8080");

        empresa.addProyecto(proyecto1);
        empresa.addProyecto(proyecto2);
        empresa.addProyecto(proyecto3);

        // Asignar empleados a proyectos a través del gerente
        gerente.asignarEmpleadoAProyecto(tecnico1, proyecto1);
        gerente.asignarEmpleadoAProyecto(tecnico2, proyecto2);
        gerente.asignarEmpleadoAProyecto(tecnico3, proyecto3);
        gerente.agregarProyecto(proyecto1);
        gerente.agregarProyecto(proyecto2);
        gerente.agregarProyecto(proyecto3);
    }

    public static void mostrarDepartamentos(Empresa empresa) {
        for (Departamento departamento : empresa.getDepartamentos()) {
            System.out.println("Departamento: " + departamento.getNombre() + " Código: " + departamento.getCodigo());
            for (Empleado empleado : departamento.getEmpleados()) {
                System.out.println("Empleado: " + empleado.getNombre() + " ID: " + empleado.getId());
            }
            System.out.println();
        }
    }

    public static void mostrarProyectos(Empresa empresa) {
        for (Proyecto proyecto : empresa.getProyectos()) {
            System.out.println("Proyecto: " + proyecto.getNombre() + " Código: " + proyecto.getCodigo());
            for (Empleado empleado : proyecto.getEmpleadosAsignados()) {
                System.out.println("Empleado: " + empleado.getNombre() + " ID: " + empleado.getId());
            }
            System.out.println();
        }
    }

    public static void mostrarContribuciones(Empresa empresa) {
        for (Empleado empleado : empresa.getEmpleados()) {
            if (empleado instanceof IContribuyente) {
                System.out.println(((IContribuyente) empleado).contribuir());
            }
        }
    }
}