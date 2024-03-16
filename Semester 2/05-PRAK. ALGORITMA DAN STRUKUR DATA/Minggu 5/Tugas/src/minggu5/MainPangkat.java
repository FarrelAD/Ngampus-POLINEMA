package minggu5;

import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=======================");
        System.out.print("Masukkan jumlah elemen yang dihitung: ");
        int elemen = sc.nextInt();

        // Input nilai dan pangkat
        Pangkat png[] = new Pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            // Input nilai atribut tanpa menggunakan konstruktor berparameter
            // png[i] = new Pangkat();
            // System.out.println("=======================");
            // System.out.print("Masukkan nilai yang hendak dihitung: ");
            // png[i].nilai = sc.nextInt();
            // System.out.print("Masukkan nilai pemangkat: ");
            // png[i].pangkat = sc.nextInt();

            // Input nilai atribut dengan menggunakan konstruktor berparameter
            System.out.println("=======================");
            System.out.print("Masukkan nilai yang hendak dihitung: ");
            int nilai = sc.nextInt();
            System.out.print("Masukkan nilai pemangkat: ");
            int pangkat = sc.nextInt();
            png[i] = new Pangkat(nilai, pangkat);
        }

        System.out.print(
            "Pilih metode perhitungan:\n" + 
            "   1. Brute Force\n" +
            "   2. Divide and Conquer\n" +
            ">>> "
        );
        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                hasilPangkatBruteForce(png, elemen);
                break;
            case 2:
                hasilPangkatDivideAndConquer(png, elemen);
                break;
            default:
                tampilDefaultError();
                break;
        }
    }


    private static void hasilPangkatBruteForce(Pangkat[] png, int elemen) {
        System.out.println("\nHASIL PANGKAT - BRUTE FORCE");
        for (int i = 0; i < elemen; i++) {
            System.out.println(
                "Hasil dari " + png[i].nilai + "pangkat " +
                png[i].pangkat + " adalah " + png[i].pangkatBF(png[i].nilai, png[i].pangkat)
            );
        }
    }

    private static void hasilPangkatDivideAndConquer(Pangkat[] png, int elemen) {
        System.out.println("\nHASIL PANGKAT - DIVIDE AND CONQUER");
        for (int i = 0; i < elemen; i++) {
            System.out.println(
                "Hasil dari " + png[i].nilai + " pangkat " + 
                png[i].pangkat + " adalah " + png[i].pangkatDC(png[i].nilai, png[i].pangkat)
            );
        }
    }

    private static void tampilDefaultError() {
        System.out.println("INPUT ANDA ERROR!");
    }
}
