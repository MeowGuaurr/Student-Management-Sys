package csf6.grupo04.Controller;

import csf6.grupo04.Model.Curso;
import csf6.grupo04.Model.Evaluacion;
import csf6.grupo04.Model.Programas;

import java.util.Scanner;

public class ControllerEvaluacion {
    public static void registrarEvaluacion() {
        Evaluacion eva = new Evaluacion();
        Scanner leer = new Scanner(System.in);

        System.out.println("REGISTRO DE EVALUACIONES");
        System.out.print("\nNombre:");
        eva.setNombre(leer.nextLine());
        System.out.print("\nMateria:");
        eva.setMateria(leer.nextLine());
        System.out.print("\nNota:");
        eva.setNota(Double.parseDouble(leer.nextLine()));
        System.out.print("\nObservaciones:");
        eva.setObservaciones(leer.nextLine());
        System.out.print("\nCurso:");
        eva.setCodigoCurso(leer.nextLine());
        System.out.print("\nEstudiante:");
        eva.setCarnetEstudiante(leer.nextLine());

        String[] data = {eva.getCarnetEstudiante(), eva.getCodigoCurso(),
                eva.getNombre(), eva.getMateria(),
                eva.getNota()+"" , eva.getObservaciones()
        };

        try {
            CSV.writeInCSV("CSV\\Evaluaciones.csv", data);
            System.out.println("Registrado con exito!");
        }
        catch (Exception e){
            System.out.println("Error al ingresar al CSV");
        }
    }

    public static void registrarProgramas() {
        Programas eva = new Programas();
        Scanner leer = new Scanner(System.in);

        System.out.println("REGISTRO DE PROGRAMAS");
        System.out.print("\nNombre:");
        eva.setNombre(leer.nextLine());
        System.out.print("\nMateria:");
        eva.setMateria(leer.nextLine());
        System.out.print("\nNota:");
        eva.setNota(Double.parseDouble(leer.nextLine()));
        System.out.print("\nObservaciones:");
        eva.setObservaciones(leer.nextLine());
        System.out.print("\nCurso:");
        eva.setCodigoCurso(leer.nextLine());
        System.out.print("\nEstudiante:");
        eva.setCarnetEstudiante(leer.nextLine());
        System.out.print("\nEnlace de GitHub:");
        eva.setEnlace(leer.nextLine());
        System.out.print("\nVersion:");
        eva.setVersion(leer.nextDouble());

        String[] data = {eva.getCarnetEstudiante(), eva.getCodigoCurso(),
                eva.getNombre(), eva.getMateria(),
                eva.getNota()+"" , eva.getObservaciones(),
                eva.getEnlace(), eva.getVersion()+""
        };

        try {
            CSV.writeInCSV("CSV\\Evaluaciones.csv", data);
            System.out.println("Registrado con exito!");
        }
        catch (Exception e){
            System.out.println("Error al ingresar al CSV");
        }
    }

    public static void verEvaluaciones() {
        CSV.readInCSV("CSV\\Evaluaciones.csv");
    }
}
