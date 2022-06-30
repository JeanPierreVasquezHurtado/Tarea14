package Tarea14;

public class Main {
    public static void main(String[] args) {

        Alumno alumno = new Alumno("Jean Pierre","Vasquez Hurtado",71240978,"11/10/2001");
        alumno.setAnioAct(2022);
        alumno.setAnioNac(2001);

        Docente docente = new Docente("Freddy Clayderman","Vigilio Arratea",86520112,"02/03/1991");
        docente.setAnioAct(2022);
        docente.setAnioNac(1991);
        Docente docente1 = new Docente("Michael Franco","Romero Illatopa",86975145,"26/07/1999");
        docente1.setAnioAct(2022);
        docente1.setAnioNac(1999);

        Curso curso = new Curso("Programacion Orientada a Objetos");

        Matricula matricula = new Matricula(124512452);

        matricula.setAlumno(alumno);
        matricula.setCurso(curso);
        curso.setDocente(docente);
        curso.setDocente(docente1);

        System.out.println(" ");
        System.out.println("Codigo de Matricula: "+matricula.getCodMatri());
        System.out.println(" ");

        for (Alumno al: matricula.getAlumno())
        {
            System.out.println("-----Alumno-----");
            System.out.println("Nombre: "+al.getNombres());
            System.out.println("Apellidos: "+al.getApellidos());
            System.out.println("DNI: "+al.getDni());
            System.out.println("fecha de Nacimiento: "+al.getFechaNacimiento());
            System.out.println("Edad: "+al.calcularEdad());
            System.out.println(" ");
        }

        for (Curso cu: matricula.getCurso()){
            System.out.println("Curso: "+cu.getNom());
            System.out.println(" ");
            for (Docente doc: cu.getDocente())
            {
                System.out.println("----DOCENTE----");
                System.out.println("Nombre: "+doc.getNombres());
                System.out.println("Apellidos: "+doc.getApellidos());
                System.out.println("DNI: "+doc.getDni());
                System.out.println("Fecha de Nacimiento: "+doc.getFechaNacimiento());
                System.out.println("Edad: "+doc.calcularEdad());
            }
        }
    }
}
