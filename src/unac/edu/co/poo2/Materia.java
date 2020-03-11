package unac.edu.co.poo2;

    public class Materia {
        private int IdMateria;
        private String nombreMateria;

        public Materia() {
        }
        public Materia(int idMateria, String nombreMateria) {
            IdMateria = idMateria;
            this.nombreMateria = nombreMateria;
        }
        public int getIdMateria() {
            return IdMateria;
        }
        public void setIdMateria(int idMateria) {
            IdMateria = idMateria;
        }
        public String getNombreMateria() {
            return nombreMateria;
        }
        public void setNombreMateria(String nombreMateria) {
            this.nombreMateria = nombreMateria;
        }
        @Override
        public String toString() {
            return "\nID Materia: " + IdMateria + " \nNombre: " + nombreMateria ;
        }
    }


