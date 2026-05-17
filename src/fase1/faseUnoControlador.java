package fase1;

import java.util.Scanner;

public class faseUnoControlador {

    public void ejecutar() {

        Scanner scanner = new Scanner(System.in);
        conversionOtrasBases conversor = new conversionOtrasBases();

        int opcion;
        int numero;

        do {
            System.out.println("===== FASE 1: CONVERSION DE DECIMAL A OTRAS BASES =====");
            System.out.println("1. Convertir decimal a binario");
            System.out.println("2. Convertir decimal a octal");
            System.out.println("3. Convertir decimal a hexadecimal");
            System.out.println("4. Convertir decimal a binario, octal y hexadecimal");
            System.out.println("5. Volver al menu principal");
            System.out.print("Seleccione una opcion: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un numero entero decimal positivo: ");
                    numero = scanner.nextInt();

                    if (numero < 0) {
                        System.out.println("Error: el numero debe ser positivo.");
                    } else {
                        System.out.println("Binario: " + conversor.convertirBinario(numero));
                    }
                    break;

                case 2:
                    System.out.print("Ingrese un numero entero decimal positivo: ");
                    numero = scanner.nextInt();

                    if (numero < 0) {
                        System.out.println("Error: el numero debe ser positivo.");
                    } else {
                        System.out.println("Octal: " + conversor.convertirOctal(numero));
                    }
                    break;

                case 3:
                    System.out.print("Ingrese un numero entero decimal positivo: ");
                    numero = scanner.nextInt();

                    if (numero < 0) {
                        System.out.println("Error: el numero debe ser positivo.");
                    } else {
                        System.out.println("Hexadecimal: " + conversor.convertirHexadecimal(numero));
                    }
                    break;

                case 4:
                    System.out.print("Ingrese un numero entero decimal positivo: ");
                    numero = scanner.nextInt();

                    if (numero < 0) {
                        System.out.println("Error: el numero debe ser positivo.");
                    } else {
                        System.out.println("Binario: " + conversor.convertirBinario(numero));
                        System.out.println("Octal: " + conversor.convertirOctal(numero));
                        System.out.println("Hexadecimal: " + conversor.convertirHexadecimal(numero));
                    }
                    break;

                case 5:
                    System.out.println("Volviendo al menu principal...");
                    break;

                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
                    break;
            }

            System.out.println();

        } while (opcion != 5);
    }

    public static void main(String[] args) {
        faseUnoControlador controlador = new faseUnoControlador();
        controlador.ejecutar();
    }
}