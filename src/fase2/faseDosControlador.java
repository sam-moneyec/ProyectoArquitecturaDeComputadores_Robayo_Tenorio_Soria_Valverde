package fase2;

import java.util.Scanner;

public class faseDosControlador {
    conversionDecimal conversion = new conversionDecimal();
    Scanner sc = new Scanner(System.in);
    int opcion;
    int base;
    String numeroEnTexto;
    
    public void iniciarFaseDos() {

    do{
        System.out.println("===== CONVERSION DE OTRAS BASES A DECIMAL - MENU =====");
        System.out.println("1. Convertir un número en base 2 (binario) a decimal");
        System.out.println("2. Convertir un número en base 8 (octal) a decimal");
        System.out.println("3. Convertir un número en base 16 (hexadecimal) a decimal");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                base = 2;
                System.out.print("Ingrese el número en base 2 (en binario): ");
                numeroEnTexto = sc.next();
                int resultadoBinario = conversion.convertirDecimal(numeroEnTexto, base);
                if (resultadoBinario != -1) {
                    System.out.println("El número " + numeroEnTexto + " en base " + base + " es igual a "
                            + resultadoBinario + " en decimal.\n");
                } else {
                    System.out.println("Número inválido para la base " + base);
                }
                break;
            case 2:
                base = 8;
                System.out.print("Ingrese el número en base 8 (en octal): ");
                numeroEnTexto = sc.next();
                int resultadoOctal = conversion.convertirDecimal(numeroEnTexto, base);
                if (resultadoOctal != -1) {
                    System.out.println("El número " + numeroEnTexto + " en base " + base + " es igual a "
                            + resultadoOctal + " en decimal.\n");
                } else {
                    System.out.println("Número inválido para la base " + base);
                }
                break;

            case 3:
                base = 16;
                System.out.print("Ingrese el número en base 16 (en hexadecimal): ");
                numeroEnTexto = sc.next();
                int resultadoHexadecimal = conversion.convertirDecimal(numeroEnTexto, base);
                if (resultadoHexadecimal != -1) {
                    System.out.println("El número " + numeroEnTexto + " en base " + base + " es igual a "
                            + resultadoHexadecimal + " en decimal.\n");
                } else {
                    System.out.println("Número inválido para la base " + base);
                }

                break;
            case 0:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.\n");
                break;

        }
    } while (opcion != 0);  
    }

}

