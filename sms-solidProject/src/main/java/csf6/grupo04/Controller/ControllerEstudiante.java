package csf6.grupo04.Controller;

import csf6.grupo04.Model.Estudiante;

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
        System.out.print("\nEmail:");
        person.setEmail(leer.nextLine());
        System.out.print("\nTelefono:");
        person.setTelefono(Integer.parseInt(leer.nextLine()));
        System.out.println("\nCarnet:");
        person.setCarnet(leer.nextLine());
        System.out.print("\nCurso:");
        person.setCurso(leer.nextLine());
        System.out.print("\nFecha de inicio:");
        String startDate = leer.nextLine();
        try {
            person.setFechaInicio(sdf.parse(startDate));
        }
        catch (ParseException e){
            e.printStackTrace();
        }
        System.out.print("\nFecha de fin:");
        String endDate = leer.nextLine();
        try {
            person.setFechaFin(sdf.parse(endDate));
        }
        catch (ParseException e){
            e.printStackTrace();
        }

        String[] data = {person.getNombre(), person.getApellido(),
                person.getEdad()+"" , person.getEmail(), person.getTelefono()+"" ,
                person.getCarnet(), person.getCurso(),
                person.getFechaInicio()+"", person.getFechaFin()+""
        };

        String email = person.getEmail();

        try {
            CSV.writeInCSV("CSV\\Estudiante.csv", data);
            System.out.println("Registrado con exito!");

            String title = "Información de estudiante";
            PDF.writePDF("PDF\\Estudiante.pdf", title, data);

            EMAIL.sendEmail(email);
            System.out.println("Información enviada con exito!");
        }
        catch (Exception e){
            System.out.println("Error al ingresar al CSV");
            System.out.println("Error al ingresar al PDF");
        }
    }

    public static void verEstudiantes() {
        CSV.readInCSV("CSV\\Estudiante.csv");
    }

}
