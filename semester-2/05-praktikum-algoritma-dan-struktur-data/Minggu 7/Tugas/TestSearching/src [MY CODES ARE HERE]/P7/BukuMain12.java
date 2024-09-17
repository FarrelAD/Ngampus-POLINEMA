package P7;

import java.util.Scanner;

public class BukuMain12 {
    static Scanner sc1 = new Scanner(System.in);
    static int jmlBuku = 5;
    public static void main(String[] args) {

        PencarianBuku12 data = new PencarianBuku12();

        System.out.println(
            "======================================================\n" +
            "Masukkan data buku secara urut dari kode buku terkecil! : "
        );
        for (int i = 0; i < jmlBuku; i++) {
            System.out.print(
                "======================================================\n" +
                "- Kode buku\t: "
            );
            String kodeBuku = sc1.nextLine();
            System.out.print("- Judul buku\t: ");
            String judulBuku = sc1.nextLine();
            System.out.print("- Tahun terbit\t: ");
            int tahunTerbit = sc1.nextInt();
            sc1.nextLine();
            System.out.print("- Pengarang\t: ");
            String pengarang = sc1.nextLine();
            System.out.print("- Stock\t\t: ");
            int stock = sc1.nextInt();
            sc1.nextLine();

            Buku12 m = new Buku12(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }

        System.out.println(
            "======================================================\n" +
            "DATA KESELURUHAN BUKU: "
        );
        data.tampil();

        System.out.print(
            "======================================================\n" +
            "PILIH OPSI PENCARIAN BUKU: \n" +
            "   1. Kode buku\n" +
            "   2. Judul buku\n" +
            ">>> "
        );
        int pilihanPencarian = sc1.nextInt();
        sc1.nextLine();

        switch (pilihanPencarian) {
            case 1:
                cariBuku(data, "kode");
                break;
            case 2:
                cariBuku(data, "judul");
                break;
            default:
                invalidInput();
                break;
        }
    }

    private static void cariBuku(PencarianBuku12 data, String jenis) {
        String cari;
        if (jenis.equals("kode")) {
            System.out.print(
                "======================================================\n" +
                "PENCARIAN DATA: : \n" +
                "Masukkan kode buku yang dicari: "
            );
            cari = sc1.nextLine();

            System.out.println(
                "=========================================================\n" +
                "Menggunakan Sequential Search"
            );
            int posisi = data.findSeqSearch(cari);
            data.tampilPosisi(cari, posisi);
            data.tampilData(posisi);
        
            System.out.println(
                "=========================================================\n" +
                "Sequential search part 2 (nilai disimpan ke dalam object)"
            );
            Buku12 dataBuku = data.findBuku(cari);
            dataBuku.tampilDataBuku();

            System.out.println(
                "=========================================================\n" +
                "Menggunakan Binary Search "
            );
            posisi = data.findBinarySearch(cari, 0, jmlBuku - 1);
            data.tampilPosisi(cari, posisi);
            data.tampilData(posisi);
        } else {
            System.out.print(
                "======================================================\n" +
                "PENCARIAN DATA: : \n" +
                "Masukkan judul buku yang dicari: "
            );
            cari = sc1.nextLine();

            System.out.println(
                "=========================================================\n" +
                "Sequential search"
            );
            Buku12 dataBuku = data.findJudulBuku(cari);
            dataBuku.tampilDataBuku();

            System.out.println(
                "=========================================================\n" +
                "Menggunakan Binary Search "
            );
            int posisi = data.findBinarySearchJudulBuku(cari, 0, jmlBuku - 1);
            data.tampilPosisi(cari, posisi);
            data.tampilData(posisi);
        }
    }

    private static void invalidInput() {
        System.out.println("INPUT TIDAK VALID!");
    }
}
