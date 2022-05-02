package csf6.grupo04;

import csf6.grupo04.Controller.ControllerAdministrativo;
import csf6.grupo04.Controller.ControllerCoach;
import csf6.grupo04.Controller.ControllerCurso;
import csf6.grupo04.Controller.ControllerEstudiante;
import csf6.grupo04.Controller.ControllerEvaluacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int repetir = 1;
        int accionRegistro, accionBusqueda, accionEvaluacion;

        while (repetir == 1){
            switch (menu()) {
                case 1 -> ControllerEstudiante.verEstudiantes();
                case 2 -> ControllerCoach.verCoaches();
                case 3 -> ControllerAdministrativo.verAdmins();
                case 4 -> {
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
                        case 1 -> ControllerEstudiante.registrarEstudiante();
                        case 2 -> ControllerCoach.registrarCoach();
                        case 3 -> ControllerAdministrativo.registrarAdmin();
                    }
                }
                case 5 -> {
                    imprimirLN("""
                Que quiere buscar:
                01. Buscar estudiante.
                02. Buscar coach.
                03. Buscar personal administrativo.""");
                    imprimir("\nDigite el número: ");
                    accionBusqueda = lector.nextInt();

                    while (accionBusqueda < 1 || accionBusqueda > 3){
                        imprimir("--------------------------------------------");
                        imprimirLN("Debe seleccionar un número de valido!");
                        imprimir("\nDigite el número: ");
                        accionBusqueda = lector.nextInt();
                        imprimir("--------------------------------------------\n");
                    }

                    switch (accionBusqueda){
                        case 1 -> ControllerEstudiante.buscarEstudiante();
                        case 2 -> ControllerCoach.buscarCoach();
                        case 3 -> ControllerAdministrativo.buscarAdmin();
                    }
                }
                case 6 -> ControllerCurso.verCursos();
                case 7 -> ControllerCurso.registrarCurso();
                case 8 -> ControllerCurso.buscarCursos();
                case 9 -> {
                    imprimirLN("""
                Tipo de evaluacion:
                01. Evaluacion normal.
                02. Evaluacion tipo programa (Entrega de software).""");
                    imprimir("\nDigite el número: ");
                    accionEvaluacion = lector.nextInt();

                    while (accionEvaluacion < 1 || accionEvaluacion > 2){
                        imprimir("--------------------------------------------");
                        imprimirLN("Debe seleccionar un número de valido!");
                        imprimir("\nDigite el número: ");
                        accionEvaluacion = lector.nextInt();
                        imprimir("--------------------------------------------\n");
                    }

                    switch (accionEvaluacion){
                        case 1 -> ControllerEvaluacion.registrarEvaluacion();
                        case 2 -> ControllerEvaluacion.registrarProgramas();
                    }
                }
                case 10 -> ControllerEvaluacion.verEvaluaciones();
            }

            imprimirLN("""
                    \nDesea realizar otra acción:
                    1. Si.
                    2. No.
                    """);
            imprimir("Digite el número: ");
            repetir = lector.nextInt();
        }
    }

    // Métodos para mostrar en pantalla
    public static void imprimir(String texto){
        System.out.println(texto);
    }
    public static void imprimirLN(String texto){
        System.out.println(texto);
    }

    public static int menu(){
        Scanner lector = new Scanner(System.in);
        int accion;

        imprimirLN("Bienvenido al Sistema de manejo de estudiantes!");
        imprimirLN("Por favor escriba el número correspondiente a la acción que desea realizar, del menú que se le presenta a continuación:");
        imprimirLN("""
                01. Listar los estudiantes.
                02. Listar los coaches.
                03. Listar al personal administrativo.
                04. Registrar una persona.
                05. Buscar a una persona.
                06. Listar los cursos.
                07. Añadir un curso nuevo.
                08. Buscar un curso.
                09. Registrar una evaluación.
                10. Listar las evaluaciones.""");
        imprimir("\nDigite el número: ");
        accion = lector.nextInt();

        imprimirLN("");

        while (accion < 1 || accion > 10){
            imprimir("--------------------------------------------");
            imprimirLN("Debe seleccionar un número de valido!");
            imprimir("\nDigite el número: ");
            accion = lector.nextInt();
            imprimir("--------------------------------------------\n");
        }

        return accion;
    }
}
