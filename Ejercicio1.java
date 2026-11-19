public class Ejercicio1 {
    public static void main(String[] args) {
        // Declaración e inicialización del arreglo de edades
        int[] edades = {18, 21, 19, 25, 30};

        // Imprimir el primer elemento (índice 0)
        System.out.println("Primer elemento: " + edades[0]);

        // Cambiar el elemento del índice 2 por el valor 22
        edades[2] = 22;
        System.out.println("Índice 2 modificado: " + edades[2]);

        // Mostrar el último elemento usando length
        int ultimo = edades[edades.length - 1];
        System.out.println("Último elemento: " + ultimo);
    }
}
