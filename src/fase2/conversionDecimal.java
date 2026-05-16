package fase2;

public class conversionDecimal {

    public int convertirDecimal(String numeroEnTexto, int base) {
        int valorDecimal = 0;
        numeroEnTexto = numeroEnTexto.toUpperCase();
        char[] arregloCaracteres = numeroEnTexto.toCharArray();
        int longitud = arregloCaracteres.length;

        for (int i = 0; i < longitud; i++) {
            char caracterActual = arregloCaracteres[longitud - 1 - i];
            int valorDigito;

            if (caracterActual >= '0' && caracterActual <= '9') {
                valorDigito = caracterActual - '0';
            } else if (caracterActual >= 'A' && caracterActual <= 'F') {
                valorDigito = 10 + (caracterActual - 'A');
            } else {
                return -1;
            }

            if (valorDigito >= base) {
                return -1;
            }

            valorDecimal += valorDigito * Math.pow(base, i);
        }

        return valorDecimal;
    }
}

