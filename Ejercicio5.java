import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] piezas = new int[10];
        int sumaTotal = 0;
        int sumaPares = 0;
        int turnosImpares = 0;

        for (int i = 0; i < piezas.length; i++) {
            System.out.print("Piezas del turno " + (i + 1) + ": ");
            piezas[i] = teclado.nextInt();
            sumaTotal += piezas[i];

            // Suma solo de los índices pares (0, 2, 4...)
            if (i % 2 == 0) {
                sumaPares += piezas[i];
            }
            // Turnos con cantidad impar y mayor a 15
            if (piezas[i] % 2 != 0 && piezas[i] > 15) {
                turnosImpares++;
            }
        }

        double promedio = (double) sumaTotal / piezas.length;
        System.out.println("Suma en índices pares: " + sumaPares);
        System.out.println("Turnos impares > 15: " + turnosImpares);
        System.out.printf("Promedio general: %.2f%n", promedio);
    }
}
