public class Convertir {       
    
    public static String decimalABinario(int numeroDecimal) {
        String numeroEnBinario = "";
        while (numeroDecimal != 0) {
            numeroEnBinario = (numeroDecimal % 2) + numeroEnBinario;
            numeroDecimal = numeroDecimal / 2;
        }
        return numeroEnBinario;
    }
    
    public static int binarioADecimal(String numeroBinario) {
        int numeroDecimal = 0;
        int exponente = 0;
        for (int i = numeroBinario.length() - 1; i >= 0 ; i--) {        
            if (numeroBinario.charAt(i) != '0') {              
                numeroDecimal = numeroDecimal + (int) Math.pow(2, exponente);
            }
            exponente++;
        }
        return numeroDecimal;
    }
    
    public static String decimalAOctal(int numeroDecimal) {
        String numeroOctal = "";
        while (numeroDecimal != 0) {
            numeroOctal = (numeroDecimal % 8) + numeroOctal;
            numeroDecimal = numeroDecimal / 8;
        }
        return numeroOctal;
    }
    
    public static int octalADecimal(String numeroOctal) {
        int numeroDecimal = 0, exponente = 0;
        for (int i = numeroOctal.length() - 1; i >= 0 ; i--) {
            numeroDecimal = numeroDecimal + (int) (((int) numeroOctal.charAt(i) - 48) * Math.pow(8, exponente));
            exponente++;
        }
        return numeroDecimal;
    }
    
    public static String decimalAHexadecimal(int numeroDecimal) {
        char letra = '0';
        String numeroEnHexadecimal = "";
        int resto;
        while (numeroDecimal != 0) {
            resto = numeroDecimal % 16;
            if (resto >= 10) {
                switch (resto) {
                    case 10: letra = 'A';
                    break;
                    case 11: letra = 'B';
                    break;
                    case 12: letra = 'C';
                    break;
                    case 13: letra = 'D';
                    break;
                    case 14: letra = 'E';
                    break;
                    case 15: letra = 'F';
                    break;
                }
                numeroEnHexadecimal = letra + numeroEnHexadecimal;
            } else {
                numeroEnHexadecimal = resto + numeroEnHexadecimal;
            }
            numeroDecimal = numeroDecimal / 16;
        }
        return numeroEnHexadecimal;        
    }
    
    public static int hexadecimalADecimal(String numeroHexadecimal) {
        int exponente = 0, numeroDecimal = 0, numeroEnPosicion = 0;
        for (int i = numeroHexadecimal.length() - 1; i >= 0 ; i--) {
            switch (numeroHexadecimal.charAt(i)) {
                case 'A': numeroEnPosicion = 10;
                break;
                case 'B': numeroEnPosicion = 11;
                break;
                case 'C': numeroEnPosicion = 12;
                break;
                case 'D': numeroEnPosicion = 13;
                break;
                case 'E': numeroEnPosicion = 14;
                break;
                case 'F': numeroEnPosicion = 15;
                break;
                default: numeroEnPosicion = (int) numeroHexadecimal.charAt(i) - 48;
                break;
            }
            numeroDecimal = numeroDecimal + (int) (numeroEnPosicion * Math.pow(16, exponente));
            exponente++;
        }
        return numeroDecimal;
    }
    
}
