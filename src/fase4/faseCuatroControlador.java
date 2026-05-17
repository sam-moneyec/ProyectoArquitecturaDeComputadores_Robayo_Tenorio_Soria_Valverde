package fase4;
import java.util.Scanner;
public class faseCuatroControlador {
    public void MostrarFaseCuatro() {

        int opcion;
     operacionAvanzada op = new operacionAvanzada();
     Scanner sc = new Scanner(System.in);

        do {
            System.out.println("=============FASE SUMA Y RESTA BINARIA COMPLEMENTO 2=============");
            System.out.println("Seleccione una opción:");
            System.out.println("1. Sumar dos números decimales");
            System.out.println("2. Restar dos números decimales");
            System.out.println("0. Salir");
       
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Sumar dos números decimales");
                    System.out.println("Ingrese el primer número decimal:");
                    int num1 = sc.nextInt();
                    System.out.println("Ingrese el segundo número decimal:");
                    int num2 = sc.nextInt();
                   op.mostrarSuma(num1, num2);
                
                    break;
                case 2:
                    System.out.println("Restar dos números decimales");
                    System.out.println("Ingrese el primer número decimal:");
                    int num3 = sc.nextInt();
                    System.out.println("Ingrese el segundo número decimal:");
                    int num4 = sc.nextInt();
                    op.mostrarResta(num3, num4);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);

}
}
