package unac.edu.co.poo2;

public class Estudiante {
        private int idAlumno;
        private  String nombre;
        private  int idEstudiante;
        private double nota;

        public Estudiante() {
        }

        public Estudiante(int idAlumno, String nombre, int idEstudiante,double nota) {
            this.idAlumno = idAlumno;
            this.nombre = nombre;
            this.idEstudiante = idEstudiante;
            this.nota= nota;
        }
        public int getIdAlumno() {
            return idAlumno;
        }
        public void setIdAlumno(int idAlumno) {
            this.idAlumno = idAlumno;
        }
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public int getIdEstudiante() {
            return idEstudiante;
        }
        public void setIdEstudiante(int idEstudiante) {
            this.idEstudiante = idEstudiante;
        }
        public double getNota() {
            return nota;
        }
        public void setNota(double nota) {
            this.nota = nota;
        }
        public void comprobarRangoNotas(Double nota) throws InsufficientNoteException {
            if(nota <=5 && nota>=0){
                System.out.println("Nota aceptada");
            }else{
                throw new InsufficientNoteException("el valor de la nota es mas elevado que el establecido por la institucion");
            }
        }
        @Override
        public String toString() {
            return "Alumno{" +
                    "idAlumno=" + idAlumno +
                    ", nombre='" + nombre + '\'' +
                    ", idEstudiante=" + idEstudiante +
                    '}';
        }
    }

