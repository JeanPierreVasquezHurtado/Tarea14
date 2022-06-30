package Tarea14;

public class Alumno extends Persona{

    protected int anioAct;
    protected int anioNac;
    protected int edad;


    protected Alumno(String nombres, String apellidos, int dni, String fechaNacimiento)
    {
        super(nombres, apellidos, dni, fechaNacimiento);
    }



    protected void setAnioAct(int anioAct) {
        this.anioAct = anioAct;
    }



    protected void setAnioNac(int anioNac) {
        this.anioNac = anioNac;
    }

    @Override
    protected int calcularEdad() {
        edad =anioAct-anioNac;
        return edad;
    }

}
