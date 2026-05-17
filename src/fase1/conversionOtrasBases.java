package fase1;

public class conversionOtrasBases {

    public String convertirBinario(int numeroDecimal) {
        return convertirDesdeDecimal(numeroDecimal, 2);
    }

    public String convertirOctal(int numeroDecimal) {
        return convertirDesdeDecimal(numeroDecimal, 8);
    }

    public String convertirHexadecimal(int numeroDecimal) {
        return convertirDesdeDecimal(numeroDecimal, 16);
    }

    private String convertirDesdeDecimal(int numeroDecimal, int base) {
        if (numeroDecimal < 0) {
            return "Error";
        }

        if (numeroDecimal == 0) {
            return "0";
        }

        String caracteres = "0123456789ABCDEF";
        String resultado = "";

        while (numeroDecimal > 0) {
            int residuo = numeroDecimal % base;
            resultado = caracteres.charAt(residuo) + resultado;
            numeroDecimal = numeroDecimal / base;
        }

        return resultado;
    }
}
