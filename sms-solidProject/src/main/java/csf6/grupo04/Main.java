package csf6.grupo04;

import csf6.grupo04.Controller.ControllerCoach;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int accion;

        imprimirLN("Bienvenido al Sistema de manejo de estudiantes!");
        imprimirLN("Por favor escriba el número correspondiente a la acción que desea realizar, del menú que se le presenta a continuación:");
        imprimirLN("""
                01. Listar los estudiantes.
                02. Listar los coaches.
                03. Listar al personal administrativo.
                04. Registrar una persona.
                05. Modificar los datos de una persona.
                06. Listar los cursos.
                07. Añadir un curso nuevo.
                08. Modificar un curso.
                09. Registrar una evaluación.
                10. Listar las evaluaciones.
                11. Abrir carpeta contenedora de trabajos.""");
        imprimir("\nDigite el número: ");
        accion = lector.nextInt();

        imprimirLN("");

        while (accion < 1 || accion > 11){
            imprimir("--------------------------------------------");
            imprimirLN("Debe seleccionar un número de valido!");
            imprimir("\nDigite el número: ");
            accion = lector.nextInt();
            imprimir("--------------------------------------------\n");
        }

        switch (accion) {
            case 1 -> {
                imprimirLN("Lista de estudiantes:");
                imprimirLN("En proceso....");
            }
            case 2 -> {
                imprimirLN("Lista de coaches:");
                imprimirLN("En proceso....");
            }
            case 3 -> {
                imprimirLN("Lista de personal administrativo:");
                imprimirLN("En proceso....");
            }
            case 4 -> {
                int accionRegistro;
                imprimirLN("""
                Que quiere registrar:
                01. Registrar estudiante.
                02. Registrar coach.
                03. Registrar personal administrativo.""");
                imprimir("\nDigite el número: ");
                accionRegistro = lector.nextInt();

                while (accionRegistro < 1 || accionRegistro > 3){
                    imprimir("--------------------------------------------");
                    imprimirLN("Debe seleccionar un número de valido!");
                    imprimir("\nDigite el número: ");
                    accionRegistro = lector.nextInt();
                    imprimir("--------------------------------------------\n");
                }

                switch (accionRegistro){
                    case 1 -> imprimirLN("En proceso");
                    case 2 -> ControllerCoach.registrarCSV();
                    case 3 -> imprimirLN("En proceso...");
                }
            }
            case 5 -> {
                imprimirLN("Modificación de datos de persona:");
                imprimirLN("En proceso....");
            }
            case 6 -> {
                imprimirLN("Lista de cursos:");
                imprimirLN("En proceso....");
            }
            case 7 -> {
                imprimirLN("Añadir curso:");
                imprimirLN("En proceso....");
            }
            case 8 -> {
                imprimirLN("Modificación de curso:");
                imprimirLN("En proceso....");
            }
            case 9 -> {
                imprimirLN("Registrar evaluación:");
                imprimirLN("En proceso....");
            }
            case 10 -> {
                imprimirLN("Listar evaluaciones:");
                imprimirLN("En proceso....");
            }
            case 11 -> {
                imprimirLN("Abrir carpeta contenedora de archivos.");
                imprimirLN("En proceso....");
            }
        }

    }

    // Métodos para mostrar en pantalla
    public static void imprimir(String texto){
        System.out.println(texto);
    }
    public static void imprimirLN(String texto){
        System.out.println(texto);
    }
}