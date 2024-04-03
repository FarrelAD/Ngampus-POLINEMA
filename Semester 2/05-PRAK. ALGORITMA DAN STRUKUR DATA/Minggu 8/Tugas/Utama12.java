import java.util.Scanner;

public class Utama12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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
                "   3. Lihat barang teratas\n" +
                "   4. Tampilkan tumpukan barang\n" +
                "   5. Keluar\n" +
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
                    gudang.lihatBarangTeratas();
                    break;
                case 4:
                    gudang.tampilkanBarang();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan anda tidak valid. Silakan coba lagi!");
                    break;
            }
        }
    }
}
