package fase3;

import java.util.Scanner;

public class faseTresControlador {

    complementoADos conversion = new complementoADos();

    Scanner sc = new Scanner(System.in);

    public void iniciarFaseTres() {

        int numero;
        int bits;

        System.out.println("===== FASE 3 - COMPLEMENTO A DOS =====");

        System.out.print("Ingrese un numero decimal: ");
        numero = sc.nextInt();

        System.out.print("Ingrese el numero de bits: ");
        bits = sc.nextInt();


        if (!conversion.verificarRango(numero, bits)) {

            System.out.println("ERROR: Overflow.");
            System.out.println("El numero no puede representarse con "
                    + bits + " bits.");

            return;
        }

 
        String resultado = conversion.convertirCa2(numero, bits);

        System.out.println("Representacion en Complemento a Dos:");
        System.out.println(resultado);


        int decimalOriginal = conversion.convertirDecimal(resultado);

        System.out.println("Verificacion:");
        System.out.println(resultado + " en decimal es: "
                + decimalOriginal);
    }
}