import java.util.ArrayList;
import java.util.List;

public class GestorFunciones {
    private List<Funcion> funciones;

    // Constructor para inicializar la lista de funciones
    public GestorFunciones() {
        funciones = new ArrayList<>();
    }

    // Método para agregar funciones a la lista
    public void agregarFuncion(Funcion funcion) {
        funciones.add(funcion);
    }

    // Método para mostrar todas las funciones disponibles
    public void mostrarFunciones() {
        System.out.println("Funciones disponibles:");
        for (Funcion funcion : funciones) {
            System.out.println("Función " + funcion.getNumero() + ": " + funcion.getNombre() + " - " + funcion.getDescripcion());
        }
    }

    // Método para seleccionar y ejecutar una función según el número ingresado
    public void ejecutarFuncion(int numero) {
        for (Funcion funcion : funciones) {
            if (funcion.getNumero() == numero) {
                funcion.ejecutar();
                return;
            }
        }
        System.out.println("Función no encontrada.");
    }
}
