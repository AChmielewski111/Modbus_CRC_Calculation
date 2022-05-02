package pl.chmielewskiadam;

import java.util.Scanner;
import javax.xml.bind.DatatypeConverter;
import java.util.Arrays;

import static pl.chmielewskiadam.Converter.toByteArray;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CRC crc = new CRC();
        Converter convNumber = new Converter();
        System.out.printf("Podaj dane do wyznaczenia CRC : ");
        String numberHex = scanner.nextLine();
        int len = (numberHex.length()/2);
        byte [] table = new byte[len];
        table = convNumber.hexStringToByteArray(numberHex);
        System.out.println(Arrays.toString(table));

      System.out.println("Obliczone CRC wynosi:  "  + Integer.toHexString(crc.computing_Crc(table , len )));
    //  System.out.println("Obliczone CRC 2 wynosi: "  + Integer.toHexString(crc.computingCRCtable(table , len )));

        String input = "A";
        Integer crcRes = crc.crc16(input.getBytes());
        System.out.println("Calculated CRC-CCITT: 0x" + Integer.toHexString(crcRes));
    }


}
