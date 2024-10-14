import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

/*
 * En este programa desarrollo ejercicios de programación para mejorar en cuanto a logica
 * Los ejercicios los saco de la siguiente pagina: "https://retosdeprogramacion.com/ejercicios"
 */

public class Main {

    // Definir algunas funciones
    public void funcion1() {
        System.out.println("Ejecutando FizzBuzz : ");

        for(int i = 1; i <= 100; i++){
            System.out.print(i + " : ");
            if(i % 3 == 0) System.out.print("Fizz");
            if(i % 5 == 0) System.out.print("Buzz");
            System.out.println(" ");
        }

    }

    public void funcion2() {
        System.out.println("Ejecutando Anagramas : ");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Ingresa la primera palabra : ");
        String palabra1 = keyboard.nextLine();

        System.out.print("Ingresa la segunda palabra : ");
        String palabra2 = keyboard.nextLine();

        if(palabra1.equals(palabra2)){
            System.out.println("No pueden ser anagramas ya que ambas palabras son iguales");
        }
        else{
            // Convertir las palabras a minúsculas y luego a arreglos de caracteres
            char[] arrayPalabra1 = palabra1.toLowerCase().toCharArray();
            char[] arrayPalabra2 = palabra2.toLowerCase().toCharArray();

            // Ordenar los arreglos de caracteres
            Arrays.sort(arrayPalabra1);
            Arrays.sort(arrayPalabra2);

            if(Arrays.equals(arrayPalabra1, arrayPalabra2)){
                System.out.println(palabra1 + " y " + palabra2 + " SI son anagramas.");
            }
            else{
                System.out.println(palabra1 + " y " + palabra2 + " No son anagramas.");
            }
        }
    }

    public void funcion3(){

        System.out.println("Ejecutando Fibonacci : ");

        for(int i = 0; i <= 50; i++){
            System.out.print(funcionFibonacci(i));
            if(i<50) System.out.print(", ");
        }
    }

    private static int funcionFibonacci(int num){
        if(num == 0 || num==1)
             return num;
        else
             return funcionFibonacci(num-1) + funcionFibonacci(num-2);
    }    

    public void funcion4(){
        System.out.println("Ejecutando ¿Es Primo? :");

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Ingresa el número que quieres probar : ");
        int num = keyboard.nextInt();

        boolean esPrimo = true;

        if (num < 2) {
            System.out.println (num + " No es primo.");
        }
        else{  
            for(int i = 2; i < num; i++){
                if(num % i == 0){
                    esPrimo = false;
                    break;
                }
            }
        }     
        if (esPrimo) {
            System.out.println(num + " SI es Primo");
        }
        else System.out.println(num + " NO es primo");
    }


    public static void main(String[] args) {
        try {
            // Crear una instancia de la clase donde están las funciones
            Main instancia = new Main();

            // Definir el nombre del método que deseas llamar
            //String nombreMetodo = "1";

            Scanner keyboard = new Scanner(System.in);
            System.out.print("Ingresa el número de función que quieres probar : ");
            int nMetodo = keyboard.nextInt();

            // Obtener el método usando reflexión
            //Method metodo = Main.class.getMethod("funcion" + nombreMetodo);
            Method metodo = Main.class.getMethod("funcion" + nMetodo);

            // Invocar el método
            metodo.invoke(instancia);
            

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
