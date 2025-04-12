import java.util.Scanner;

public class CalculadoraDosNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Definimos y solicitamos el primer número
        System.out.print("Ingresa el primer numero: ");
         double Numero1 = sc.nextDouble();
        // Definimos y solicitamos el segundo número
        System.out.print("Ingresa el segundo numero: ");
        double Numero2 = sc.nextDouble();
        // Definimos y operamos los números
        double Suma = Numero1 + Numero2;
        double resta = Numero1 - Numero2;
        double multiplicacion = Numero1 * Numero2;
        double division = Numero1/Numero2;
        double modulo = Numero1 % Numero2;
// Mostramos el resultado
        System.out.println("La suma es: " + Suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("La division es: " + division);
        System.out.println("El modulo es: " + modulo);
    }
}
