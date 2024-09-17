/* 
 * UTS PRAKTIKUM ALGORITMA DAN STRUKTUR DATA
 * 17 APRIL 2024
 * Nama: Farrel Augusta Dinata
 * NIM: 2341720081
 * 
 * METODE:
 * - Sorting ascending: Insertion sort
 * - Sorting descending: Selection sort
 * - Searching: Binary search
 */

import java.util.Scanner;

public class MainUts {
    static Scanner sc12 = new Scanner(System.in);
    public static void main(String[] args) {
        // Pengisian data ke dalam array of objek
        Data[] arrayData = new Data[17];
        arrayData[0] = new Data(1);
        arrayData[1] = new Data(43);
        arrayData[2] = new Data(50);
        arrayData[3] = new Data(6);
        arrayData[4] = new Data(26);
        arrayData[5] = new Data(5);
        arrayData[6] = new Data(21);
        arrayData[7] = new Data(10);
        arrayData[8] = new Data(24);
        arrayData[9] = new Data(6);
        arrayData[10] = new Data(25);
        arrayData[11] = new Data(4);
        arrayData[12] = new Data(8);
        arrayData[13] = new Data(27);
        arrayData[14] = new Data(18);
        arrayData[15] = new Data(46);
        arrayData[16] = new Data(36);

        // Menyalin data ke class Operasi
        Operasi tugas = new Operasi();
        tugas.tambahData(arrayData);

        // Menampilkan data awal
        tugas.tampilData();

        // Melakukan operasi algoritma
        char mengulangi;
        do {
            System.out.print(
                "\nPilih metode yang diinginkan: \n" +
                "   1. Pengurutan\n" +
                "   2. Pencarian\n" +
                "   3. Keluar\n" +
                ">>> "
            );
            int pilihan = sc12.nextInt();
    
            switch (pilihan) {
                case 1:
                    operasiPengurutan(tugas);
                    break;
                case 2:
                    operasiPencarian(tugas, arrayData);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    break;
            }

            System.out.print(
                "\nIngin mengulangi lagi? (Y/N)\n" +
                ">>> "
            );
            mengulangi = sc12.next().charAt(0);
        } while (Character.toUpperCase(mengulangi) == 'Y');
    }

    private static void operasiPengurutan(Operasi tugas) {
        System.out.print(
            "========================\n" +
            "   1. Ascending\n" +
            "   2. Descending\n" +
            ">>> "
        );
        int pilihan = sc12.nextInt();
        switch (pilihan) {
            case 1:
                tugas.pengurutanAscending();
                break;
            case 2:
                tugas.pengurutanDescending();
            default:
                break;
        }
        tugas.tampilData();
    }

    private static void operasiPencarian(Operasi tugas, Data[] arrayData) {
        System.out.print(
            "========================\n" +
            "Masukkan data yang ingin dicari: \n" +
            ">>> "
        );
        int target = sc12.nextInt();
        int hasil = tugas.pencarianData(target, arrayData, 0, arrayData.length - 1);
        tampilStatusPencarian(hasil);

        // Data ditemukan setelah sorting ascending
        tugas.pengurutanAscending();
        tugas.tampilData();
        
        int hasil2 = tugas.pencarianData(target, tugas.arrayData, 0, arrayData.length - 1);
        tampilStatusPencarian(hasil2);

        // Data ditemukan setelah sorting descending
        tugas.pengurutanDescending();
        tugas.tampilData();

        int hasil3 = tugas.pencarianData(target, tugas.arrayData, 0, arrayData.length - 1);
        tampilStatusPencarian(hasil3);
    }

    private static void tampilStatusPencarian(int hasil) {
        if (hasil != -1) {
            System.out.printf("\nData ditemukan pada indeks : %d\n", hasil);
        } else {
            System.out.println("\nData tidak ditemukan!");
        }
    }
}