package fase4;
import fase1.conversionOtrasBases;
import fase2.conversionDecimal;
public class operacionAvanzada {
   //constructores

   public operacionAvanzada() {
}
 conversionOtrasBases decimalBinario = new conversionOtrasBases();
 conversionDecimal conversionDecimal = new conversionDecimal();

public String decimalABinario(int numero) {

        String binario = decimalBinario.convertirDesdeDecimal(numero, 2);
        while (binario.length() < 8) {
            binario = "0" + binario;
        }
        return binario;
    }

    public String complemento2(String binario) {
        char[] bits = binario.toCharArray(); 
        for (int i = 0; i < bits.length; i++) { 
            if (bits[i] == '0') {
                bits[i] = '1';
            } else {
                bits[i] = '0';
            }
        }
        String invertido = new String(bits);

        int numero = conversionDecimal.convertirDecimal(binario, 2);
        numero = numero + 1;
        String complemento = decimalABinario(numero);
        while (complemento.length() < 8) {
            complemento = "0" + complemento;
        }
        if (complemento.length() > 8) {  
            complemento = complemento.substring(complemento.length() - 8);
        }
        return complemento;
    }

    public String sumar(int num1, int num2) {

    String bin1 = decimalABinario(num1);
    String bin2 = decimalABinario(num2);

    int decimal1 = conversionDecimal.convertirDecimal(bin1, 2);
    int decimal2 = conversionDecimal.convertirDecimal(bin2, 2);

    int suma = decimal1 + decimal2;

    String resultado = decimalABinario(suma);

    while (resultado.length() < 8) {
        resultado = "0" + resultado;
    }

    if (resultado.length() > 8) {
        resultado = resultado.substring(resultado.length() - 8);
    }

    return resultado;

    
}

public String restar(int num1, int num2) {

    String bin1 = decimalABinario(num1);
    String bin2 = decimalABinario(num2);

    String comp2 = complemento2(bin2);

    int decimal1 = conversionDecimal.convertirDecimal(bin1, 2);
    int decimal2 = conversionDecimal.convertirDecimal(comp2, 2);

    int suma = decimal1 + decimal2;

    String resultado = decimalABinario(suma);

    if (resultado.length() > 8) {
        resultado = resultado.substring(resultado.length() - 8);
    }

    while (resultado.length() < 8) {
        resultado = "0" + resultado;
    }

    return resultado;
}

public  void mostrarSuma(int num1, int num2) {
    String suma = sumar(num1, num2);

    System.out.println("Número 1: " + num1 + " -> " + decimalABinario(num1));
    System.out.println("Número 2: " + num2 + " -> " + decimalABinario(num2));
    System.out.println("Suma: " + suma);
        System.out.println("El signo de la suma es: " + (suma.charAt(0) == '1' ? "Negativo" : "Positivo"));
}

public void mostrarResta(int num1, int num2) {
    String resta = restar(num1, num2);
    System.out.println("Número 1: " + num1 + " -> " + decimalABinario(num1));
    System.out.println("Número 2: " + num2 + " -> " + decimalABinario(num2));
    System.out.println("Resta: " + resta);
        System.out.println("El signo de la resta es: " + (resta.charAt(0) == '1' ? "Negativo" : "Positivo"));

}
}
