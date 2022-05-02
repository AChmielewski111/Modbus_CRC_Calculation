package pl.chmielewskiadam;

import javax.xml.bind.DatatypeConverter;

public class Converter {
    public static String decToHex(int dec)
    {
        return Integer.toHexString(dec);
    }
    private static int hexToDec(String hex)
    {
        return Integer.parseInt(hex, 16);
    }
    public static String toHexString(byte[] array) {
        return DatatypeConverter.printHexBinary(array);
    }

    public static byte[] toByteArray(String s) {
        return DatatypeConverter.parseHexBinary(s);
    }

    /* s must be an even-length string. */
    public static byte[] hexStringToByteArray(String s) {
        int len = s.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
                    + Character.digit(s.charAt(i+1), 16));
        }
        return data;
    }
}
