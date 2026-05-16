package fase4;

public class OperacionAvanzada {
   //constructores

   public OperacionAvanzada() {
}

//Primer paso convetir los número decimales a binarios de 8 bits
public String decimalABinario(int numero) {

        String binario = Integer.toBinaryString(numero); //Convierte el número decimal a binario
        while (binario.length() < 8) {
            binario = "0" + binario;// Si el número binario tiene menos de 8 bits, se le añaden ceros a la izquierda hasta que tenga 8 bits
        }
        return binario;
    }

//Segundo hallar el complemento a 2 del número binario
    public String complemento2(String binario) {
        char[] bits = binario.toCharArray(); //Separa el número binario en un arreglo de caracteres para poder invertir los bits
        for (int i = 0; i < bits.length; i++) { //invertir los bits
            if (bits[i] == '0') {
                bits[i] = '1';
            } else {
                bits[i] = '0';
            }
        }
        String invertido = new String(bits);
        int numero = Integer.parseInt(invertido, 2);// Convertir el número invertido a decimal
        numero = numero + 1;//sumar 1 al número invertido para obtener el complemento a 2
        String complemento = Integer.toBinaryString(numero);//Devolver el complemento a 2 en binario
        while (complemento.length() < 8) { //completar 8 bits
            complemento = "0" + complemento;
        }
        if (complemento.length() > 8) {  //controlar si el complemento a 2 tiene más de 8 bits, se le quitan los bits sobrantes
            complemento = complemento.substring(complemento.length() - 8);
        }
        return complemento;
    }

    //Suma
    public String sumar(int num1, int num2) {

    // Convertir automáticamente a binario
    String bin1 = decimalABinario(num1);
    String bin2 = decimalABinario(num2);

    // Convertir binarios a decimal
    int decimal1 = Integer.parseInt(bin1, 2);
    int decimal2 = Integer.parseInt(bin2, 2);

    // Sumar
    int suma = decimal1 + decimal2;

    // Convertir resultado a binario
    String resultado = Integer.toBinaryString(suma);

    // Mantener 8 bits
    while (resultado.length() < 8) {
        resultado = "0" + resultado;
    }

    if (resultado.length() > 8) {
        resultado = resultado.substring(resultado.length() - 8);
    }

    return resultado;

    
}
//Resta
public String restar(int num1, int num2) {

    // Convertir números a binario
    String bin1 = decimalABinario(num1);
    String bin2 = decimalABinario(num2);

    // Sacar complemento a 2 automáticamente
    String comp2 = complemento2(bin2);

    // Convertir a decimal
    int decimal1 = Integer.parseInt(bin1, 2);
    int decimal2 = Integer.parseInt(comp2, 2);

    // Sumar
    int suma = decimal1 + decimal2;

    // Convertir resultado a binario
    String resultado = Integer.toBinaryString(suma);

    // Eliminar acarreo extra
    if (resultado.length() > 8) {
        resultado = resultado.substring(resultado.length() - 8);
    }

    // Completar a 8 bits
    while (resultado.length() < 8) {
        resultado = "0" + resultado;
    }

    return resultado;
}

//Metodo mostrar Suma
public  void mostrarSuma(int num1, int num2) {
    String suma = sumar(num1, num2);

    System.out.println("Número 1: " + num1 + " -> " + decimalABinario(num1));
    System.out.println("Número 2: " + num2 + " -> " + decimalABinario(num2));
    System.out.println("Suma: " + suma);
        System.out.println("El signo de la suma es: " + (suma.charAt(0) == '1' ? "Negativo" : "Positivo"));
}

//Mostrar Resta
public void mostrarResta(int num1, int num2) {
    String resta = restar(num1, num2);
    System.out.println("Número 1: " + num1 + " -> " + decimalABinario(num1));
    System.out.println("Número 2: " + num2 + " -> " + decimalABinario(num2));
    System.out.println("Resta: " + resta);
        System.out.println("El signo de la resta es: " + (resta.charAt(0) == '1' ? "Negativo" : "Positivo"));

}
}
