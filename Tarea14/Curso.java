package Tarea14;

public class Curso {
    protected String nom;
    protected Docente[] docente;
    protected int contador;

    public Curso(String nom) {
        this.nom = nom;
        this.contador = 0;
        this.docente= new Docente[2];
    }

    public String getNom() {
        return nom;
    }


    public Docente[] getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente[this.contador++] = docente;
    }
}
