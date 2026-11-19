public class Ejercicio3 {
    public static void main(String[] args) {
        // Arreglo de calificaciones
        int[] notas = {14, 16, 12, 19};

        // Acumulador para la suma total
        int suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }

        // Conversión a double para evitar la división entera
        double promedio = (double) suma / notas.length;

        System.out.println("Suma total: " + suma);
        System.out.println("Promedio: " + promedio);
    }
}
