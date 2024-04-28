package TugasAkhir;

import java.util.Scanner;

public class Main {
    static Scanner sc12 = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print(
            "---SELAMAT DATANG DI WARUNG LANCAR JAYA---\n" +
            "      Anda senang, kami pun senang :)\n" +
            "==========================================\n" +
            "\n" +
            "   - Masukkan jumlah antrian maksimal: "
        );
        int jmlAntrian = sc12.nextInt();
        Queue antrian = new Queue(jmlAntrian);

        boolean ulangiMenu = false;
        menu();
        do {
            int pilihMenu = sc12.nextInt();
            sc12.nextLine();
            if (pilihMenu >= 1 && pilihMenu <= 6) {
                ulangiMenu = true;
            }

            switch (pilihMenu) {
                case 1:
                    tambahAntrian(antrian);
                    break;
                case 2:
                    selesaikanAntrian(antrian);
                    break;
                case 3:
                    tampilkanKeseluruhanAntrian(antrian);
                    break;
                case 4:
                    tampilkanAntrianTerdepan(antrian);
                    break;
                case 5:
                    tampilkanAntrianBelakang(antrian);
                    break;
                case 6: 
                    cariDataAntrian(antrian);
                    break;
                case 7:
                    keluarSistem();
                    break;
                default:
                    invalidInput();
                    break;
            }
            menu();
        } while (ulangiMenu);
    }

    private static void menu() {
        System.out.print(
            "\n\n==========================================\n" +
            "   1. Tambahkan antrian\n" +
            "   2. Selesaikan antrian\n" +
            "   3. Tampilkan keseluruhan antrian\n" +
            "   4. Tampilkan antrian terdepan\n" +
            "   5. Tampilkan antrian paling belakang\n" +
            "   6. Cari data dari antrian\n" +
            "   7. KELUAR\n" +
            " >>> "
        );
    }

    private static void tambahAntrian(Queue antrian) {
        System.out.print(
            "\nMasukkan antrian ke-" + (antrian.size + 1) + 
            "\n - Nama pembeli : "
        );
        String nama = sc12.nextLine();
        System.out.print(" - Nomor HP : ");
        int noHp = sc12.nextInt();
        sc12.nextLine();
        Pembeli data = new Pembeli(nama, noHp);
        antrian.enqueue(data);
    }

    private static void selesaikanAntrian(Queue antrian) {
        Pembeli pb = antrian.dequeue();
        System.out.println("\nPembeli " + pb.nama + " telah berhasil dilayani!");
    }

    private static void tampilkanKeseluruhanAntrian(Queue antrian) {
        antrian.print();
    }

    private static void tampilkanAntrianTerdepan(Queue antrian) {
        antrian.peek();
    }

    private static void tampilkanAntrianBelakang(Queue antrian) {
        antrian.peekRear();
    }

    private static void cariDataAntrian(Queue antrian) {
        System.out.print(
            "\nMasukkan pembeli yang ingin dicari: \n" +
            ">>> "
        );
        String dicari = sc12.nextLine();
        antrian.peekPosition(dicari);
    }

    private static void keluarSistem() {
        System.out.println(
            "==========================================\n" +
            "   -- Anda telah keluar dari sistem --\n" +
            "=========================================="
        );
        System.exit(0);
    }

    private static void invalidInput() {
        System.out.println("Input tidak valid!");
    }
}
