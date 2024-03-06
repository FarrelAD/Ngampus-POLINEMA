package LatihanPraktikum.hitung_luas_permukaan_dan_volume;

import java.util.Scanner;

public class Main12 {
    static Scanner sc12 = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print(
            "Anda ingin hitung apa kawan?\n" +
            "   1. Kerucut\n" + 
            "   2. Limas Segi Empat\n" +
            "   3. Bola\n" +
            ">>>  "
        );
        int pilihanMenu = sc12.nextInt();

        switch (pilihanMenu) {
            case 1:
                perhitunganKerucut();
                break;
            case 2:
                perhitunganLimasSegiEmpat();
                break;
            case 3:
                perhitunganBola();
                break;
            default:
                invalidInput();
                break;
        }
    }

    public static void perhitunganKerucut() {
        System.out.print("Masukkan jumlah kerucut: ");
        int jmlKerucut = sc12.nextInt();

        System.out.println("");

        Kerucut12[] krc = new Kerucut12[jmlKerucut];

        // Proses input panjang jari-jari dan sisi miring kerucut
        for (int i = 0; i < krc.length; i++) {
            // Proses input tanpa konstruktor berparameter
            // krc[i] = new Kerucut12();
            // System.out.println("Kerucut ke-" + (i+1));
            // System.out.print("Masukkan panjang jari-jari: ");
            // krc[i].jariJari = sc12.nextDouble();
            // System.out.print("Masukkan panjang sisi-miring: ");
            // krc[i].sisiMiring = sc12.nextInt();

            // Proses input dengan konstruktor berparameter
            System.out.print("Masukkan panjang jari-jari: ");
            double jariJari = sc12.nextDouble();
            System.out.print("Masukkan panjang sisi-miring: ");
            int sisiMiring = sc12.nextInt();
            krc[i] = new Kerucut12(jariJari, sisiMiring);
        }

        System.out.println("");

        // Menampilkan output dari luas permukaan dan volume
        for (int i = 0; i < krc.length; i++) {
            System.out.println("Luas permukaan kerucut ke-" + (i + 1) + ": " + krc[i].hitungLuasPermukaan());
            System.out.println("Volume kerucut ke-" + (i + 1 + ": " + krc[i].hitungVolume()));
        }
    }

    public static void perhitunganLimasSegiEmpat() {
        System.out.print("Masukkan jumlah limas segi empat: ");
        int jmlLimasSegiEmpat = sc12.nextInt();

        System.out.println("");

        LimasSegiEmpat12[] lse = new LimasSegiEmpat12[jmlLimasSegiEmpat];

        // Proses input panjang sisi alas dan tinggi limas
        for (int i = 0; i < lse.length; i++) {
            lse[i] = new LimasSegiEmpat12();
            System.out.printf("\nLimas segi empat [%d]\n", (i+1));
            System.out.print("Masukkan panjang sisi alas: ");
            lse[i].panjangSisiAlas = sc12.nextInt();
            System.out.print("Masukkan tinggi limas: ");
            lse[i].tinggi = sc12.nextInt();
        }

        System.out.println("");

        // Menampilkan dari luas permukaan dan volume
        for (int i = 0; i < lse.length; i++) {
            System.out.println("Luas permukaan limas ke-" + (i + 1) + ": " + lse[i].hitungLuasPermukaan());
            System.out.println("Volume limas ke-" + (i + 1) + ": " + lse[i].hitungVolume());
        }
    }

    public static void perhitunganBola() {
        System.out.print("Masukkan jumlah bola: ");
        int jmlBola = sc12.nextInt();

        System.out.println("");

        Bola12[] bl = new Bola12[jmlBola];

        // Proses input panjang jari-jari
        for (int i = 0; i < bl.length; i++) {
            System.out.printf("\nBola ke-[%d]\n", (i+1));
            System.out.print("Masukkan panjang jari-jari: ");
            double jariJari = sc12.nextDouble();
            bl[i] = new Bola12(jariJari);
        }

        System.out.println("");

        // Menampilkan dari luas permukaan dan volume
        for (int i = 0; i < bl.length; i++) {
            System.out.println("Luas permukaan bola ke-" + (i + 1) + ": " + bl[i].hitungLuasPermukaan());
            System.out.println("Volume bola ke-" + (i + 1) + ": " + bl[i].hitungVolume());
        }
    }

    private static void invalidInput() {
        System.out.println("Input yang anda masukkan tidak valid!!");
    }
}
