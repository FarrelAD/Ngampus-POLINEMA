package BarangDanGudang;

import java.util.Scanner;

public class Utama12 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        // Gudang12 gudang = new Gudang12(7);

        System.out.print(
            "Tentukan kapasitas gudang terlebih dahulu: \n" +
            ">>> "
        );
        int kapasitasGudang = scanner.nextInt();
        Gudang12 gudang = new Gudang12(kapasitasGudang);

        // Menu pengguna
        while (true) {
            System.out.print(
                "\n==============================================\n" +
                "MENU\n" +
                "   1. Tambah barang\n" +
                "   2. Ambil barang\n" +
                "   3. Cari barang\n" + 
                "   4. Lihat barang teratas\n" +
                "   5. Lihat barang terbawah\n" +
                "   6. Tampilkan tumpukan barang\n" +
                "   7. Keluar\n" +
                "Pilih operasi: "
            );
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan nama barang: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan nama kategori: ");
                    String kategori = scanner.nextLine();
                    Barang12 barangBaru = new Barang12(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang12();
                    break;
                case 3:
                    cariDataBarang(gudang);
                    break;
                case 4:
                    gudang.lihatBarangTeratas();
                    break;
                case 5:
                    gudang.lihatBarangTerbawah();
                    break;
                case 6:
                    gudang.tampilkanBarang();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan anda tidak valid. Silakan coba lagi!");
                    break;
            }
        }
    }

    private static void cariDataBarang(Gudang12 gudang) {
        System.out.print(
            "Pilih opsi berikut: \n" +
            "   1. Berdasarkan kode\n" +
            "   2. Berdasarkan nama\n" +
            ">>> "
        );
        int pilihan = scanner.nextInt();
        scanner.nextLine();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan kode barang yang ingin dicari: ");
                int kodeCari = scanner.nextInt();
                gudang.cariBarangKode(kodeCari);
                break;
            case 2:
                System.out.print("Masukkan nama barang yang ingin dicari: ");
                String namaCari = scanner.nextLine();
                gudang.cariBarangNama(namaCari);
                break;
            default:
                System.out.println("Pilihan anda tidak valid. Silakan coba lagi!");
                break;
        }
    }
}
