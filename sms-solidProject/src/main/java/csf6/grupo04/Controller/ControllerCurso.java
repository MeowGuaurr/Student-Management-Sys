package csf6.grupo04.Controller;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import csf6.grupo04.Model.Curso;

import java.io.FileReader;
import java.util.List;
import java.util.Scanner;

public class ControllerCurso {
    public static void registrarCurso() {
        Curso course = new Curso();
        Scanner leer = new Scanner(System.in);

        System.out.println("REGISTRO DE CURSO");
        System.out.print("\nNombre:");
        course.setNombre(leer.nextLine());
        System.out.print("\nCodigo:");
        course.setCodigo(leer.nextLine());
        System.out.print("\nAño:");
        course.setAnnio(Integer.parseInt(leer.nextLine()));
        System.out.print("\nVacantes:");
        course.setVacantes(Integer.parseInt(leer.nextLine()));
        System.out.print("\nInscritos:");
        course.setInscritos(Integer.parseInt(leer.nextLine()));
        System.out.print("\nFinalizado:");
        course.setFinalizado(leer.nextBoolean());

        String[] data = {course.getNombre(), course.getCodigo(),
                course.getAnnio()+"" , course.getVacantes()+"", course.getInscritos()+"" ,
                course.isFinalizado()+""
        };

        try {
            CSV.writeInCSV("CSV\\Cursos.csv", data);
            System.out.println("Registrado con exito!");
        }
        catch (Exception e){
            System.out.println("Error al ingresar al CSV");
        }
    }

    public static void verCursos() {
        CSV.readInCSV("CSV\\Cursos.csv");
    }
}
