package fase3;

public class complementoADos {

    public boolean verificarRango(int numero, int bits) {

        int minimo = -(int)Math.pow(2, bits - 1);
        int maximo = (int)Math.pow(2, bits - 1) - 1;

        return numero >= minimo && numero <= maximo;
    }
 
    public String convertirCa2(int numero, int bits) {
  
        if (numero >= 0) {

            String binario = Integer.toBinaryString(numero);

            while (binario.length() < bits) {
                binario = "0" + binario;
            }

            return binario;
        }

        else {

            int valorAbsoluto = Math.abs(numero);

            String binario = Integer.toBinaryString(valorAbsoluto);

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

            int decimalTemporal = Integer.parseInt(complementoUno, 2);

            decimalTemporal += 1;

            String complementoDos = Integer.toBinaryString(decimalTemporal);

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

            return Integer.parseInt(ca2, 2);
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

            int decimal = Integer.parseInt(complementoUno, 2);

            decimal += 1;

            return -decimal;
        }
    }
}