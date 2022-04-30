package csf6.grupo04.Controller;

import csf6.grupo04.Model.Coach;

import java.util.Scanner;

public class ControllerCoach{
    public static void registrarCSV(){
        Coach person = new Coach();
        Scanner leer = new Scanner(System.in);

        System.out.println("REGISTRO DE COACH");
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
        System.out.print("\nIdentificacion:");
        person.setIdentificacion(leer.nextLine());
        System.out.print("\nDireccion:");
        person.setDireccion(leer.nextLine());

        String[] data = {person.getNombre(), person.getApellido(), person.getEdad()+"" , person.getEmail(), person.getTelefono()+"" , person.getIdentificacion(), person.getDireccion()};

        try {
            CSV.writeInCSV("CSV\\Coach.csv", data);
            System.out.println("Registrado con exito!");
        }
        catch (Exception e){
            System.out.println("Error al ingresar al CSV");
        }
    }
}
