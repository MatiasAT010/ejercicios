import java.util.Scanner;
class Figuras {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("A que figura quieres sacarle el area?");
         System.out.println("1. Al circulo");
         System.out.println("2. Al triangulo");
         System.out.println("3. Al rectangulo");
         String opcion = sc.nextLine();
         double resultado=0;
         
         switch(opcion){
         case "1":
             System.out.println("Ingresa el radio del circulo: ");
             double radioC = sc.nextDouble();
             resultado = radioC * radioC * 3.1416;
             System.out.println("El area de tu circulo es: " + resultado);
         break;
         case "2":
             System.out.println("Ingresa la base de tu triangulo: ");
             double base = sc.nextDouble();
             System.out.println("Ingresa la altura de tu triangulo: ");
             double altura = sc.nextDouble();
             resultado = base * altura / 2;
             System.out.println("El area de tu triangulo es: " + resultado);
             break;
         case "3":
             System.out.println("Ingresa el ancho de tu rectangulo: ");
             double ancho = sc.nextDouble();
             System.out.println("Ingresa el largo de tu rectangulo: ");
             double largo = sc.nextDouble();
             resultado = largo * ancho;
             System.out.println("El area de tu rectangulo es: " + resultado);
             break;
         default: 
             System.out.print("Ingresaste un numero incorrecto");
             
         }
    }
}
