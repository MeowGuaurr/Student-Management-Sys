package csf6.grupo04.Controller;

import com.itextpdf.text.DocumentException;
import csf6.grupo04.Model.Estudiante;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class ControllerEstudiante {
    public static void registrarEstudiante() {
        Estudiante person = new Estudiante();
        Scanner leer = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("REGISTRO DE ESTUDIANTE");
        System.out.print("\nNombre:");
        person.setNombre(leer.nextLine());
        System.out.print("\nApellido:");
        person.setApellido(leer.nextLine());
        System.out.print("\nEdad:");
        person.setEdad(Integer.parseInt(leer.nextLine()));
        System.out.print("\nEmail (example@example.com):");
        person.setEmail(leer.nextLine());
        System.out.print("\nTelefono (Número sin guiones):");
        person.setTelefono(Integer.parseInt(leer.nextLine()));
        System.out.print("\nCarnet:");
        person.setCarnet(leer.nextLine());
        System.out.print("\nCurso:");
        person.setCurso(leer.nextLine());
        System.out.print("\nFecha de inicio (dd/MM/yyyy):");
        String startDate = leer.nextLine();
        try {
            person.setFechaInicio(sdf.parse(startDate));
        }
        catch (ParseException e){
            e.printStackTrace();
        }
        System.out.print("\nFecha de fin (dd/MM/yyyy):");
        String endDate = leer.nextLine();
        try {
            person.setFechaFin(sdf.parse(endDate));
        }
        catch (ParseException e){
            e.printStackTrace();
        }

        String[] data = {person.getCarnet(), person.getNombre(),
                person.getApellido(), person.getEdad()+"" , person.getEmail(),
                person.getTelefono()+"" , person.getCurso(),
                person.getFechaInicio()+"", person.getFechaFin()+""
        };
        String title = "Información de estudiante";
        int action = 3;

        try {
            CSV.writeInCSV("CSV\\Estudiante.csv", data);
            System.out.println("\nRegistrado con exito!");
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Error al ingresar al CSV");
        }

        try {
            PDF.writePDF("PDF\\Estudiante.pdf", title, data, action);
            System.out.println("Información generada con exito!");
        } catch (DocumentException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            EMAIL.sendEmail(person.getEmail(), "PDF\\Estudiante.pdf");
            System.out.println("Información enviada con exito!");
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al ingresar al enviar la informacion");
        }
    }

    public static void verEstudiantes() {
        CSV.readInCSV("CSV\\Estudiante.csv");
    }

    public static void buscarEstudiante() {
        Scanner leer = new Scanner(System.in);
        String id;

        System.out.println("BUSQUEDA DE ESTUDIANTE");
        System.out.print("Digite el carnet del estudiante:");
        id = leer.nextLine();

        try {
            CSV.searchInCSV("CSV\\Estudiante.csv", id);
        }
        catch (Exception e){
            System.out.println("Error al ejecutar la busqueda");
        }
    }
}
