package csf6.grupo04.Controller;

import com.itextpdf.text.DocumentException;
import csf6.grupo04.Model.Administrativo;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ControllerAdministrativo {
    public static void registrarAdmin() {
        Administrativo person = new Administrativo();
        Scanner leer = new Scanner(System.in);

        System.out.println("REGISTRO DE PERSONAL ADMINISTRATIVO");
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
        System.out.print("\nCargo:");
        person.setCargo(leer.nextLine());

        String[] data = {person.getNombre(), person.getApellido(),
                person.getEdad()+"" , person.getEmail(), person.getTelefono()+"" ,
                person.getIdentificacion(), person.getDireccion(), person.getCargo()
        };

        try {
            CSV.writeInCSV("CSV\\Administrativo.csv", data);
            System.out.println("\nRegistrado con exito!");
        }
        catch (Exception e){
            System.out.println("Error al ingresar al CSV");
        }

        try {
            String title = "Información de personal";
            PDF.writePDF("PDF\\Administrativo.pdf", title, data);
            System.out.println("Información generada con exito!");
        } catch (DocumentException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            EMAIL.sendEmail(person.getEmail(), "PDF\\Administrativo.pdf");
            System.out.println("Información enviada con exito!");
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al ingresar al enviar la informacion");
        }
    }

    public static void verAdmins() {
        CSV.readInCSV("CSV\\Administrativo.csv");
    }
}
