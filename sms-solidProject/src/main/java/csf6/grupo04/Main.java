package csf6.grupo04;
public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido!");

        Evaluacion eval = new Evaluacion("Proyecto SOLID", "Programacion", 10, "Falta aplicar principios SOLID");
        System.out.println(eval.listarEvaluaciones());

        Evaluacion program = new Programas("Proyecto SOLID", "Programacion", 10, "Falta aplicar principios SOLID", "ruta del archivo :P", 1, "Nada importante");
        System.out.println(program.listarEvaluaciones());
    }
}