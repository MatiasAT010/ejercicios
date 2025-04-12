import java.util.Scanner;
class DatosUsuario {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Hola, ingresa tus datos");
      System.out.print("Ingresa tu nombre: ");
      String nombre = sc.nextLine();         
      System.out.print("Tu correo: ");
      String correo = sc.nextLine(); 
      System.out.print("Tu edad: ");
      int edad = sc.nextInt();
      System.out.println("");
      
      System.out.println("Tus datos son: ");
      System.out.println("Nombre: " + nombre);
      System.out.println("Edad: " + edad);
      System.out.println("Correo: " + correo);
    }
}
