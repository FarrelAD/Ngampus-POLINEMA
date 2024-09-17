package latihan_praktikum;

import java.util.Scanner;

public class MainHotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HotelService listHotels = new HotelService();

        // Menambahkan data hotel
        Hotel h1 = new Hotel("SAVANA", "Bandung", 12000000, (byte) 4);
        Hotel h2 = new Hotel("Cemara", "Surabaya", 9125000, (byte) 3);
        Hotel h3 = new Hotel("Mawar", "Semarang", 3210000, (byte) 4);
        Hotel h4 = new Hotel("Bunga", "Blitar", 800000, (byte) 5);

        listHotels.tambah(h1);
        listHotels.tambah(h2);
        listHotels.tambah(h3);
        listHotels.tambah(h4);

        System.out.println(
            "SELAMAT DATANG DI TRAVEL PHOENIX\n" +
            "===============================================\n" +
            "Berikut adalah daftar hotel yang tersedia: "
        );

        // Menampilkan keseluruhan data
        listHotels.tampilAll();

        System.out.print(
            "===============================================\n" +
            "Filter daftar hotel? (Y/T) >>> "
        );
        char konfirmasiFilter = sc.next().charAt(0);

        if (Character.toUpperCase(konfirmasiFilter) == 'Y') {
            System.out.print(
                "Urutkan berdasarkan: \n" +
                "   1. Harga\n" +
                "   2. Rating\n" +
                ">>> "
            );
            int pilihanFilter = sc.nextInt();
            System.out.println("===============================================");
            switch (pilihanFilter) {
                case 1:
                    // Mengurutkan berdasarkan data harga termurah ke tertinggi
                    System.out.println("List harga hotel dari yang paling termurah");
                    listHotels.bubbleSort();
                    break;
                case 2:
                    // Mengurutkan berdasarkan data rating tertinggi ke terendah
                    System.out.println("List harga hotel dari rating paling tinggi");
                    listHotels.selectionSort();
                    break;
                default:
                    System.out.println("Input anda salah!");
                    break;
            }

            listHotels.tampilAll();
        }
    }
}
