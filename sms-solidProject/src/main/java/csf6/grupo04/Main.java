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
                case 4 -> ControllerCurso.verCursos();
                case 5 -> ControllerEvaluacion.verEvaluaciones();
                case 6 -> ControllerEstudiante.registrarEstudiante();
                case 7 -> ControllerCoach.registrarCoach();
                case 8 -> ControllerAdministrativo.registrarAdmin();
                case 9 -> ControllerCurso.registrarCurso();
                case 10 -> ControllerEvaluacion.registrarEvaluacion();
                case 11 -> ControllerEstudiante.buscarEstudiante();
                case 12 -> ControllerCoach.buscarCoach();
                case 13 -> ControllerAdministrativo.buscarAdmin();
                case 14 -> ControllerCurso.buscarCursos();
            }

            imprimirLN("""
                    \nDesea realizar otra acción:
                    1. Si.
                    2. No.
                    """);
            imprimir("Digite el número: ");
            repetir = lector.nextInt();
            imprimir("\n\n");
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
                Listar:
                    1. Listar los estudiantes.
                    2. Listar los coaches.
                    3. Listar al personal administrativo.
                    4. Listar los cursos.
                    5. Listar las evaluaciones.
                
                Registrar:
                    6. Registrar estudiante.
                    7. Registrar coach.
                    8. Registrar personal administrativo.
                    9. Registrar curso.
                    10. Registrar evaluación.
                
                Buscar:
                    11. Buscar estudiante.
                    12. Buscar coach.
                    13. Buscar personal administrativo.
                    14. Buscar curso.
                    """);
        imprimir("\nDigite el número: ");
        accion = lector.nextInt();

        imprimirLN("");

        while (accion < 1 || accion > 15){
            imprimir("--------------------------------------------");
            imprimirLN("Debe seleccionar un número de valido!");
            imprimir("\nDigite el número: ");
            accion = lector.nextInt();
            imprimir("--------------------------------------------\n");
        }

        return accion;
    }
}
