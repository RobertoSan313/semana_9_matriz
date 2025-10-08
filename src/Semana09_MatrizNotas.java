import java.util.Scanner;

public class Semana09_MatrizNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir cantidad de estudiantes y materias
        System.out.print("Ingrese el número de estudiantes: ");
        int estudiantes = sc.nextInt();

        System.out.print("Ingrese el número de materias: ");
        int materias = sc.nextInt();

        // Crear matriz de notas
        double[][] notas = new double[estudiantes][materias];

        // Llenar la matriz con las notas
        System.out.println("\n--- Ingrese las notas ---");
        for (int i = 0; i < estudiantes; i++) {
            System.out.println("Estudiante " + (i + 1) + ":");
            for (int j = 0; j < materias; j++) {
                System.out.print("  Nota en materia " + (j + 1) + ": ");
                notas[i][j] = sc.nextDouble();
            }
        }

        // Variables para máximo y mínimo
        double max = notas[0][0];
        double min = notas[0][0];

        System.out.println("\n--- Promedios por estudiante ---");

        // Calcular promedios y buscar máximo y mínimo
        for (int i = 0; i < estudiantes; i++) {
            double suma = 0;
            for (int j = 0; j < materias; j++) {
                double nota = notas[i][j];
                suma += nota;

                // Actualizar máximo y mínimo
                if (nota > max) max = nota;
                if (nota < min) min = nota;
            }
            double promedio = suma / materias;
            System.out.printf("Estudiante %d -> Promedio: %.2f%n", (i + 1), promedio);
        }

        // Mostrar resultados finales
        System.out.println("\n--- Resultados globales ---");
        System.out.println("Nota máxima: " + max);
        System.out.println("Nota mínima: " + min);

        sc.close();
    }
}
