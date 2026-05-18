package fase3;
import fase1.conversionOtrasBases;
import fase2.conversionDecimal;

public class complementoADos {
    conversionOtrasBases decimalBinario = new conversionOtrasBases();
    conversionDecimal conversionDecimal = new conversionDecimal();


    public boolean verificarRango(int numero, int bits) {

        int minimo = -(int)Math.pow(2, bits - 1);
        int maximo = (int)Math.pow(2, bits - 1) - 1;

        return numero >= minimo && numero <= maximo;
    }
 
    public String convertirCa2(int numero, int bits) {
  
        if (numero >= 0) {

            String binario = decimalBinario.convertirDesdeDecimal(numero, 2);

            while (binario.length() < bits) {
                binario = "0" + binario;
            }

            return binario;
        }

        else {

            int valorAbsoluto = Math.abs(numero);

            String binario = decimalBinario.convertirDesdeDecimal(valorAbsoluto, 2);

            while (binario.length() < bits) {
                binario = "0" + binario;
            }

            String complementoUno = "";

            for (int i = 0; i < binario.length(); i++) {

                if (binario.charAt(i) == '0') {
                    complementoUno += "1";
                } else {
                    complementoUno += "0";
                }
            }

            int decimalTemporal = conversionDecimal.convertirDecimal(complementoUno, 2);

            decimalTemporal += 1;

            String complementoDos = decimalBinario.convertirDesdeDecimal(decimalTemporal, 2);

            if (complementoDos.length() > bits) {
                complementoDos = complementoDos.substring(complementoDos.length() - bits);
            }

            while (complementoDos.length() < bits) {
                complementoDos = "0" + complementoDos;
            }

            return complementoDos;
        }
    }

    public int convertirDecimal(String ca2) {

        int bits = ca2.length();

        if (ca2.charAt(0) == '0') {

            return conversionDecimal.convertirDecimal(ca2, 2);
        }

        else {

            String complementoUno = "";

            for (int i = 0; i < ca2.length(); i++) {

                if (ca2.charAt(i) == '0') {
                    complementoUno += "1";
                } else {
                    complementoUno += "0";
                }
            }

            int decimal = conversionDecimal.convertirDecimal(complementoUno, 2);

            decimal += 1;

            return -decimal;
        }
    }
}