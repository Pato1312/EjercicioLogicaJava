public class Funcion {
    private int numero;
    private String nombre;
    private String descripcion;
    private Runnable metodo;

    // Constructor para inicializar los atributos
    public Funcion(int numero, String nombre, String descripcion, Runnable metodo) {
        this.numero = numero;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.metodo = metodo;
    }

    public int getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    // Método para ejecutar la lógica de la función
    public void ejecutar() {
        metodo.run();
    }
}
