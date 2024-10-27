import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GestorFunciones gestor = new GestorFunciones();

        // Registrar todas las funciones definidas en el archivo Definicion.java
        Definicion.registrarFunciones(gestor);

        // Mostrar las funciones disponibles
        gestor.mostrarFunciones();

        // Seleccionar y ejecutar una función
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Ingresa el número de función que quieres probar: ");
        int nMetodo = keyboard.nextInt();
        gestor.ejecutarFuncion(nMetodo);

        // Cerrar el Scanner para liberar el recurso
        keyboard.close();
    }
}
