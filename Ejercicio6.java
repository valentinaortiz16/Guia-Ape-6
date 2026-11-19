import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Cantidad de estudiantes: ");
        int n = teclado.nextInt();
        int[] notas = new int[n];
        int suma = 0;

        // Llenado del arreglo validando notas entre 0 y 20
        for (int i = 0; i < n; i++) {
            do {
                System.out.print("Nota del estudiante " + (i + 1) + ": ");
                notas[i] = teclado.nextInt();
                if (notas[i] < 0 || notas[i] > 20) {
                    System.out.println("Nota inválida (0 a 20).");
                }
            } while (notas[i] < 0 || notas[i] > 20);
            suma += notas[i];
        }

        // Promedio sin división entera
        double promedio = (double) suma / n;

        // Conteo de aprobados (>= 14) y reprobados
        int aprobados = 0;
        int reprobados = 0;
        for (int i = 0; i < n; i++) {
            if (notas[i] >= 14) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        System.out.printf("Promedio general: %.2f%n", promedio);
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Reprobados: " + reprobados);

        // Estudiantes con nota estrictamente menor al promedio
        System.out.println("Estudiantes bajo el promedio:");
        for (int i = 0; i < n; i++) {
            if (notas[i] < promedio) {
                System.out.println("Estudiante " + (i + 1)
                    + " (nota " + notas[i] + ")");
            }
        }
    }
}
