public abstract class Convert {
    
    public static String decimalToBinary(int decimalNumber) {
        String binaryNumber = "";
        while (decimalNumber != 0) {
            binaryNumber = (decimalNumber % 2) + binaryNumber;
            decimalNumber = decimalNumber / 2;
        }
        return binaryNumber;
    }
    
    public static int binaryToDecimal(String binaryNumber) {
        int decimalNumber = 0;
        int exponent = 0;
        for (int i = binaryNumber.length() - 1; i >= 0 ; i--) {        
            if (binaryNumber.charAt(i) != '0') {              
                decimalNumber = decimalNumber + (int) Math.pow(2, exponent);
            }
            exponent++;
        }
        return decimalNumber;
    }
    
    public static String decimalToOctal(int decimalNumber) {
        String octalNumber = "";
        while (decimalNumber != 0) {
            octalNumber = (decimalNumber % 8) + octalNumber;
            decimalNumber = decimalNumber / 8;
        }
        return octalNumber;
    }
    
    public static int octalToDecimal(String octalNumber) {
        int decimalNumber = 0, exponent = 0;
        for (int i = octalNumber.length() - 1; i >= 0 ; i--) {
            decimalNumber = decimalNumber + (int) (((int) octalNumber.charAt(i) - 48) * Math.pow(8, exponent));
            exponent++;
        }
        return decimalNumber;
    }
    
    public static String decimalToHexadecimal(int decimalNumber) {
        char letter = '0';
        String hexadecimalNumber = "";
        int remainder;
        while (decimalNumber != 0) {
            remainder = decimalNumber % 16;
            if (remainder >= 10) {
                switch (remainder) {
                    case 10: letter = 'A';
                    break;
                    case 11: letter = 'B';
                    break;
                    case 12: letter = 'C';
                    break;
                    case 13: letter = 'D';
                    break;
                    case 14: letter = 'E';
                    break;
                    case 15: letter = 'F';
                    break;
                }
                hexadecimalNumber = letter + hexadecimalNumber;
            } else {
                hexadecimalNumber = remainder + hexadecimalNumber;
            }
            decimalNumber = decimalNumber / 16;
        }
        return hexadecimalNumber;        
    }
    
    public static int hexadecimalToDecimal(String hexadecimalNumber) {
        int exponent = 0, decimalNumber = 0, number = 0;
        for (int i = hexadecimalNumber.length() - 1; i >= 0 ; i--) {
            switch (hexadecimalNumber.charAt(i)) {
                case 'A': number = 10;
                break;
                case 'B': number = 11;
                break;
                case 'C': number = 12;
                break;
                case 'D': number = 13;
                break;
                case 'E': number = 14;
                break;
                case 'F': number = 15;
                break;
                default: number = (int) hexadecimalNumber.charAt(i) - 48;
                break;
            }
            decimalNumber = decimalNumber + (int) (number * Math.pow(16, exponent));
            exponent++;
        }
        return decimalNumber;
    }
    
}
