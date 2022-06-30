package Tarea14;

public abstract class Persona {
    protected String nombres;
    protected String apellidos;
    protected int dni;
    protected String fechaNacimiento;

    protected Persona(String nombres, String apellidos, int dni, String fechaNacimiento) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }

    protected String getNombres() {
        return nombres;
    }

    protected String getApellidos() {
        return apellidos;
    }

    protected int getDni() {
        return dni;
    }

    protected String getFechaNacimiento() {
        return fechaNacimiento;
    }

    protected abstract int calcularEdad();


}
