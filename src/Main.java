import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Operaciones con lenguajes \n");
        menu();
    }

    public static void menu() {

        // Variables for development
        Scanner l = new Scanner(System.in);
        Exercise exercise = new Exercise();
        boolean exit = false;
        int option;

        // Variables for exercises

        while (!exit) {

            System.out.print("Menú de opciones \n 0) Salir \n 1) Leer E1 \n 2) Leer E2 \n 3) Leer dos cadenas W1 y W2 pertenecientes a E1 \n" +
                    " 4) Generar (W1W2)^n \n 5) Obtener |W1|x \n 6) Relacion W1 con W2 (No está) \n 7) Generar E^n \n 8) Generar E1.E2 \n 9) Generar E1.E2.E1 \n");

            option = l.nextInt();

            switch (option) {
                case 0:
                    exit = true;
                    break;
                case 1:
                    exercise.incisoA();
                    break;
                case 2:
                    exercise.incisoB();
                    break;
                case 3:
                    exercise.incisoC();
                    exercise.incisoCB();
                    break;
                case 4:
                    exercise.incisoD();
                    break;
                case 5:
                    exercise.incisoE();
                    break;
                case 6:
                    // No está
                    break;
                case 7:
                    exercise.incisoG();
                    break;
                case 8:
                    exercise.incisoH();
                    break;
                case 9:
                    exercise.incisoI();
                    break;
                default:
                    System.out.println("Opción invalida");
            }
        }
    }

}
