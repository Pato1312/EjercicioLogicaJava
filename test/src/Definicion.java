import java.util.Arrays;
import java.util.Scanner;

public class Definicion {

    public static void registrarFunciones(GestorFunciones gestor) {
        gestor.agregarFuncion(fizzBuzz());
        gestor.agregarFuncion(anagramas());
        gestor.agregarFuncion(fibonacci());
        gestor.agregarFuncion(esPrimo());
    }

    public static Funcion fizzBuzz() {
        return new Funcion(1, "FizzBuzz", "Imprime números del 1 al 100, con 'Fizz' para múltiplos de 3 y 'Buzz' para múltiplos de 5.", () -> {
            System.out.println("Ejecutando FizzBuzz : ");
            for (int i = 1; i <= 100; i++) {
                System.out.print(i + " : ");
                if (i % 3 == 0) System.out.print("Fizz");
                if (i % 5 == 0) System.out.print("Buzz");
                System.out.println();
            }
        });
    }

    public static Funcion anagramas() {
        return new Funcion(2, "Anagramas", "Verifica si dos palabras son anagramas.", () -> {
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Ingresa la primera palabra : ");
            String palabra1 = keyboard.nextLine();
            System.out.print("Ingresa la segunda palabra : ");
            String palabra2 = keyboard.nextLine();

            if (palabra1.equals(palabra2)) {
                System.out.println("No pueden ser anagramas ya que ambas palabras son iguales");
            } else {
                char[] arrayPalabra1 = palabra1.toLowerCase().toCharArray();
                char[] arrayPalabra2 = palabra2.toLowerCase().toCharArray();
                Arrays.sort(arrayPalabra1);
                Arrays.sort(arrayPalabra2);
                if (Arrays.equals(arrayPalabra1, arrayPalabra2)) {
                    System.out.println(palabra1 + " y " + palabra2 + " SI son anagramas.");
                } else {
                    System.out.println(palabra1 + " y " + palabra2 + " No son anagramas.");
                }
            }
        });
    }

    public static Funcion fibonacci() {
        return new Funcion(3, "Fibonacci", "Imprime los primeros 50 números de la serie Fibonacci.", () -> {
            System.out.println("Ejecutando Fibonacci : ");
            for (int i = 0; i <= 50; i++) {
                System.out.print(funcionFibonacci(i));
                if (i < 50) System.out.print(", ");
            }
            System.out.println();
        });
    }

    public static Funcion esPrimo() {
        return new Funcion(4, "¿Es Primo?", "Verifica si un número es primo.", () -> {
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Ingresa el número que quieres probar : ");
            int num = keyboard.nextInt();

            boolean esPrimo = num >= 2;
            for (int i = 2; i < num && esPrimo; i++) {
                if (num % i == 0) {
                    esPrimo = false;
                }
            }
            System.out.println(num + (esPrimo ? " SI es Primo" : " NO es Primo"));
        });
    }

    // Método estático para calcular Fibonacci
    private static int funcionFibonacci(int num) {
        if (num == 0 || num == 1)
            return num;
        else
            return funcionFibonacci(num - 1) + funcionFibonacci(num - 2);
    }
}
