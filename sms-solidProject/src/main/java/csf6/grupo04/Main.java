package csf6.grupo04;

import csf6.grupo04.Model.Coach;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido!");

        /*
        Evaluacion eval = new Evaluacion("Proyecto SOLID", "Programacion", 10, "Falta aplicar principios SOLID");
        System.out.println(eval.listarEvaluaciones());

        Evaluacion program = new Programas("Proyecto SOLID", "Programacion", 10, "Falta aplicar principios SOLID", "ruta del archivo :P", 1, "Nada importante");
        System.out.println(program.listarEvaluaciones());
        */

        Coach profe = new Coach("Carlos", "Tejada", 33, "email@example.com", 22568978, 1, "Planeta Tierra");
        System.out.print(profe.listarPersonas());
    }
}