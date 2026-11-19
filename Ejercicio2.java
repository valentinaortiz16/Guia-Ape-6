public class Ejercicio2 {
    public static void main(String[] args) {
        // Declaración del arreglo de texto con los días
        String[] dias = {"Lunes", "Martes", "Miércoles",
                         "Jueves", "Viernes"};

        // Recorrido inverso: del último índice al primero
        System.out.println("Días en orden inverso:");
        for (int i = dias.length - 1; i >= 0; i--) {
            System.out.println(dias[i]);
        }
    }
}
