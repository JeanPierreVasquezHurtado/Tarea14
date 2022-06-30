package Tarea14;

public class Matricula {
    protected int codMatri;
    protected Curso[] curso;
    protected int contador;
    protected Alumno[] alumno;
    protected int conta;

    public Matricula(int codMatri) {
        this.codMatri = codMatri;
        this.curso = new Curso[1];
        this.contador = 0;
        this.alumno = new Alumno[1];
        this.conta = 0;
    }

    public int getCodMatri() {
        return codMatri;
    }

    public Curso[] getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso[this.contador++] = curso;
    }

    public Alumno[] getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno[this.conta++]= alumno;
    }
}
