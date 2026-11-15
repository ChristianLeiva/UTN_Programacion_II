import Exeption.EdadInvalidaException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== EJERCICIOS DE MANEJO DE EXCEPCIONES ===\n");

        // 1. División segura
        //ejercicio1DivisionSegura(scanner);

        // 2. Conversión de cadena a número
        //ejercicio2ConversionCadena(scanner);

        // 3. Lectura de archivo (capturando primero la más específica)
        ejercicio3LecturaArchivo(scanner);

        // 4. Excepción personalizada (EdadInvalidaException)
        //ejercicio4ExcepcionPersonalizada(scanner);

        // 5. Uso de try-with-resources
        //ejercicio5TryWithResources(scanner);

        scanner.close();
    }

    // --- Ejercicio 1
    public static void ejercicio1DivisionSegura(Scanner scanner) {
        System.out.println("--- Ejercicio 1: Division Segura");
        try {
            System.out.print("Ingrese el dividendo: ");
            int num1 = Integer.parseInt(scanner.nextLine());
            System.out.print("Ingrese el divisor: ");
            int num2 = Integer.parseInt(scanner.nextLine());

            if (num2 == 0) {
                throw new ArithmeticException("Error: No se puede dividir por cero.");
            }

            int resultado = num1 / num2;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Debe ingresar un numero entero valido.");
        } finally {
            System.out.println("Fin del programa... (bloque finally ejecutado).\n");
        }
    }

    // --- Ejercicio 2
    public static void ejercicio2ConversionCadena(Scanner scanner) {
        System.out.println("--- Ejercicio 2: Conversion de Cadena a Numero");
        System.out.print("Ingrese un texto para convertir a numero: ");
        String texto = scanner.nextLine();

        try {
            int numero = Integer.parseInt(texto);
            System.out.println("Conversion realizada con exito! El numero es: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: '" + texto + "' no es una cadena numerica valida.\n");
        }
    }

    // --- Ejercicio 3
public static void ejercicio3LecturaArchivo(Scanner scanner) {
        System.out.println("--- Ejercicio 3: Lectura de Archivo");
        System.out.print("Ingrese la ruta/nombre del archivo a leer: ");
        String ruta = scanner.nextLine();

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(ruta));
            String linea;
            System.out.println("Contenido del archivo:");
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error específico: El archivo especificado no existe.");
        } catch (IOException e) {
            System.out.println("Error general de lectura I/O: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo.");
            }
            System.out.println();
        }
    }

    // --- Ejercicio 4
    public static void ejercicio4ExcepcionPersonalizada(Scanner scanner) {
        System.out.println("--- Ejercicio 4: Excepcion Personalizada");
        System.out.print("Ingrese su edad: ");
        try {
            int edad = scanner.nextInt();
            scanner.nextLine();
            validarEdad(edad);
            System.out.println("Edad ingresada: " + edad);
        } catch (EdadInvalidaException e) {
            System.out.println("Excepcion capturada: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Ingrese un valor numerico entero.");
        }
        System.out.println();
    }

    private static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("Error: La edad debe estar entre 0 y 120 años.");
        }
    }

    // --- Ejercicio 5
    public static void ejercicio5TryWithResources(Scanner scanner) {
        System.out.println("--- Ejercicio 5: Try-With-Resources");
        System.out.print("Ingrese el nombre del archivo a leer con try-with-resources: ");
        String ruta = scanner.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            System.out.println("Contenido del archivo:");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al procesar el archivo: " + e.getMessage());
        }
        System.out.println();
    }
}