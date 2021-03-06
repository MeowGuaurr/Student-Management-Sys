package csf6.grupo04.Controller;

import com.itextpdf.text.DocumentException;
import csf6.grupo04.Model.Coach;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ControllerCoach{
    public static void registrarCoach(){
        Coach person = new Coach();
        Scanner leer = new Scanner(System.in);

        System.out.println("REGISTRO DE COACH");
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
        System.out.print("\nIdentificacion:");
        person.setIdentificacion(leer.nextLine());
        System.out.print("\nDireccion:");
        person.setDireccion(leer.nextLine());

        String[] data = {person.getIdentificacion(), person.getNombre(),
                person.getApellido(), person.getEdad()+"" , person.getEmail(),
                person.getTelefono()+"" , person.getDireccion()
        };
        String title = "Información de coach";
        int action = 2;
        try {
            CSV.writeInCSV("CSV\\Coach.csv", data);
            System.out.println("Registrado con exito!");
        }
        catch (Exception e){
            System.out.println("Error al ingresar al CSV");
        }

        try {

            PDF.writePDF("PDF\\Coach.pdf", title, data, action);
            System.out.println("Información generada con exito!");
        }
        catch (DocumentException e) {
            throw new RuntimeException(e);
        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }

        try {
            EMAIL.sendEmail(person.getEmail(), "PDF\\Coach.pdf");
            System.out.println("Información enviada con exito!");
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al ingresar al enviar la informacion");
        }
    }

    public static void verCoaches() {
        CSV.readInCSV("CSV\\Coach.csv");
    }

    public static void buscarCoach() {
        Scanner leer = new Scanner(System.in);
        String id;

        System.out.println("BUSQUEDA DE COACH");
        System.out.print("Digite el identificador del coach:");
        id = leer.nextLine();

        try {
            CSV.searchInCSV("CSV\\Coach.csv", id);
        }
        catch (Exception e){
            System.out.println("Error al ejecutar la busqueda");
        }
    }
}
