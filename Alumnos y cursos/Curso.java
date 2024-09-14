public class Curso {

    String nombreCurso, nombreInstructor;
    int CodCurso;

        public Curso(String nombreCurso, String nombreInstructor, int CodCurso) {

            this.nombreCurso = nombreCurso;
            this.nombreInstructor = nombreInstructor;
            this.CodCurso = CodCurso;

        }

        public void MostrarCurso() {

            System.out.println("Nombre Curso: " + nombreCurso);
            System.out.println("Nombre Instructor: " + nombreInstructor);
            System.out.println("Código del curso: " + CodCurso);
        }


}