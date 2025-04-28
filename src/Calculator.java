import java.util.InputMismatchException; // Importa la clase que maneja errores de entrada inválida
import java.util.Scanner; // Importa la clase para leer datos que el usuario ingresa por teclado

public class Calculator { // Define la clase principal llamada Calculator
    public static void main(String[] args) { // Método principal donde empieza a ejecutarse el programa
        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para leer datos del usuario

        System.out.println("Bienvenido a la Calculadora Básica"); // Mensaje de bienvenida

        try { // Intenta ejecutar el bloque de código, por si ocurre un error

            System.out.print("Ingresa el primer número: 2485"); // Solicita el primer número
            double num1 = scanner.nextDouble(); // Lee el primer número (puede ser decimal)

            System.out.print("Ingresa el segundo número:283.89"); // Solicita el segundo número
            double num2 = scanner.nextDouble(); // Lee el segundo número

            System.out.print("Elige una operación (+, -, *, /): *"); // Pide al usuario que ingrese una operación
            char operator = scanner.next().charAt(0); // Lee el primer carácter que el usuario ingresa

            double result; // Variable para guardar el resultado

            // Estructura de control para decidir la operación según el operador
            switch (operator) {
                case '+':
                    result = num1 + num2; // Suma
                    System.out.println("Resultado: " + result); // Muestra el resultado
                    break;
                case '-':
                    result = num1 - num2; // Resta
                    System.out.println("Resultado: " + result);
                    break;
                case '*':
                    result = num1 * num2; // Multiplicación
                    System.out.println("Resultado: " + result);
                    break;
                case '/':
                    if (num2 == 0) { // Verifica si el segundo número es cero
                        System.out.println("Error: No se puede dividir por cero."); // Mensaje de error
                    } else {
                        result = num1 / num2; // División
                        System.out.println("Resultado: " + result);
                    }
                    break;
                default:
                    System.out.println("Error: Operador inválido."); // Si no es +, -, *, / muestra error
                    break;
            }

        } catch (InputMismatchException e) { // Captura si el usuario ingresó algo que no es un número
            System.out.println("Error: Entrada inválida. Por favor ingresa solo números.");
        } finally { // Este bloque siempre se ejecuta, haya error o no
            scanner.close(); // Cierra el objeto Scanner para liberar recursos
     }
   }
}