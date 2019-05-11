package com.company;

public class MegaBytes_Converter {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megaBytes;
        int remKiloBytes;

        if (kiloBytes >= 0) {
            megaBytes = kiloBytes / 1024;
            remKiloBytes = kiloBytes % 1024;

            System.out.println(kiloBytes
                    + " KB = "
                    + megaBytes
                    + " MB and "
                    + remKiloBytes
                    + " KB");
        } else {
            System.out.println("Invalid Value");
        }
    }
}
