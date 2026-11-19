import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] gastos = new double[7];
        double total = 0;

        // Registro de los gastos de los 7 días y suma total
        for (int i = 0; i < gastos.length; i++) {
            System.out.print("Gasto del día " + (i + 1) + ": ");
            gastos[i] = teclado.nextDouble();
            total += gastos[i];
        }

        // Promedio diario (se calcula antes de aplicar el aumento)
        double promedio = total / gastos.length;
        System.out.printf("Gasto total: %.2f%n", total);
        System.out.printf("Promedio diario: %.2f%n", promedio);

        // Aumento del 10 % solo a los días que superaron el promedio
        int diasConAumento = 0;
        for (int i = 0; i < gastos.length; i++) {
            if (gastos[i] > promedio) {
                gastos[i] = gastos[i] * 1.10;
                diasConAumento++;
            }
        }

        // Arreglo actualizado en orden inverso
        System.out.println("Arreglo actualizado (orden inverso):");
        for (int i = gastos.length - 1; i >= 0; i--) {
            System.out.printf("Día %d: %.2f%n", i + 1, gastos[i]);
        }
        System.out.println("Días con incremento: " + diasConAumento);
    }
}
