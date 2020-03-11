import unac.edu.co.poo2.Estudiante;
import unac.edu.co.poo2.InsufficientNoteException;
import unac.edu.co.poo2.Materia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Materia> asignatura = new ArrayList<Materia>();
        List<Estudiante> estudiante = new ArrayList<Estudiante>();
        Materia listaMateria = new Materia();

        Materia m1 = new Materia(02,"POO II");
        asignatura.add(m1);
        Materia m2 = new Materia(04, "Estructura de Datos");
        asignatura.add(m2);
        Materia m3 = new Materia(03, "projecto integrador");
        asignatura.add(m3);

        Scanner seleccion = new Scanner(System.in);
        String respuesta;
        int i = 1;
        do {
            System.out.println("Registro de Alumnos \n");
            System.out.println("1. Agregar alumno");
            System.out.println("2. Ver historial");
            System.out.println("3. Salir");

            respuesta = seleccion.next();
            switch (respuesta) {
                case "1":
                    System.out.println("Ingrese nombre");
                    String nombre = seleccion.next();
                    System.out.println("ingrese id");
                    int idEstudiante = seleccion.nextInt();
                    System.out.println("ingrese Materia a escoger");
                    for (int j = 0; j < asignatura.size(); j++) {
                        System.out.println("Nombre de la Materia " + asignatura.get(j));
                    }
                    int m = seleccion.nextInt();
                    System.out.println("Nota de la Materia " + m);
                    Double nota = seleccion.nextDouble();
                    Estudiante es = new Estudiante(i, nombre, idEstudiante,nota);
                    estudiante.add(es);
                    i++;
                    try {
                        es.comprobarRangoNotas(nota);
                    } catch (InsufficientNoteException ex) {
                        System.out.println("Invalid Operation Exception");
                        System.out.println(ex.getMessage());
                    } finally {
                        System.out.println("Nota agregada");
                    }
                    respuesta = "0";
                    break;
                case "2":
                    System.out.println("Alumnos en la clase: \n" + estudiante + listaMateria.toString());
                    respuesta = "0";
                    break;
                case "3":
                    System.out.println("adios, gracias por su consulta.");
                    respuesta = "1";
                    break;
                default:
                    System.out.println("Opción invalida");
                    System.out.println("Debes elegir 1 6, 2 ó 3");
                    respuesta = "0";
            }
        } while (respuesta == "0");

    }
}

