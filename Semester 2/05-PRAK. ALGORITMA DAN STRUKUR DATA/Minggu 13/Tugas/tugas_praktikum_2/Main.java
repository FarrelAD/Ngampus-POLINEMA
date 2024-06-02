package tugas_praktikum_2;

import java.util.Scanner;

public class Main {
    static Scanner sc12 = new Scanner(System.in);
    public static void main(String[] args) {
        DaftarFilm data = new DaftarFilm();

        int selectedMenu = 0;
        do {
            showMenu();
            selectedMenu = sc12.nextInt();
            switch (selectedMenu) {
                case 1:
                    tambahDataAwal(data);
                    break;
                case 2:
                    tambahDataAkhir(data);
                    break;
                case 3:
                    tambahDiIndex(data);
                    break;
                case 4:
                    hapusDataPertama(data);
                    break;
                case 5:
                    hapusDataTerakhir(data);
                    break;
                case 6:
                    hapusDataTertentu(data);
                    break;
                case 7:
                    cetakDaftarFilm(data);
                    break;
                case 8:
                    cariIdFilm(data);
                    break;
                case 9:
                    urutkanDataRating(data);
                    break;
                case 10:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Input tidak sesuai!");
                    break;
            }
            System.out.println("\n");
        } while (selectedMenu >= 1 && selectedMenu < 10);

    }

    private static void showMenu() {
        System.out.println(
            "============================\n" +
            "   DATA FILM LAYAR LEBAR    \n" +
            "============================\n" +
            "1. Tambah data awal\n" +
            "2. Tambah data akhir\n" +
            "3. Tambah data index tertentu\n" +
            "4. Hapus data pertama\n" +
            "5. Hapus data terakhir\n" +
            "6. Hapus data tertentu\n" +
            "7. Cetak\n" +
            "8. Cari ID film\n" +
            "9. Urut data rating film (DESC)\n" +
            "10. Keluar\n" +
            "============================"
        );
    }

    private static void tambahDataAwal(DaftarFilm data) {
        System.out.print(
            "======PENAMBAHAN FILM=======\n" +
            "Masukkan data film posisi awal\n" +
            "- ID film: "
        );
        int idFilm = sc12.nextInt();
        sc12.nextLine();
        System.out.print("- Judul film: ");
        String judulFilm = sc12.nextLine();
        System.out.print("- Rating film (Skala 10): ");
        float ratingFilm = sc12.nextFloat();
        data.addFirst(idFilm, judulFilm, ratingFilm);
    }

    private static void tambahDataAkhir(DaftarFilm data) {
        System.out.print(
            "======PENAMBAHAN FILM=======\n" +
            "Masukkan data film posisi akhir\n" +
            "- ID film: "
        );
        int idFilm = sc12.nextInt();
        sc12.nextLine();
        System.out.print("- Judul film: ");
        String judulFilm = sc12.nextLine();
        System.out.print("- Rating film (Skala 10): ");
        float ratingFilm = sc12.nextFloat();
        data.addLast(idFilm, judulFilm, ratingFilm);
    }

    private static void tambahDiIndex(DaftarFilm data) {
        System.out.print(
            "======PENAMBAHAN FILM=======\n" +
            "Masukkan data film posisi tertentu\n" +
            "- ID film: "
        );
        int idFilm = sc12.nextInt();
        sc12.nextLine();
        System.out.print("- Judul film: ");
        String judulFilm = sc12.nextLine();
        System.out.print("- Rating film (Skala 10): ");
        float ratingFilm = sc12.nextFloat();
        System.out.print("Data film ini akan masuk di urutan indeks ke-: ");
        int indexData = sc12.nextInt();
        data.addAtIndex(indexData, idFilm, judulFilm, ratingFilm);
    }

    private static void hapusDataPertama(DaftarFilm data) {
        data.removeFirst();
    }

    private static void hapusDataTerakhir(DaftarFilm data) {
        data.removeLast();
    }

    private static void hapusDataTertentu(DaftarFilm data) {
        System.out.print("Masukkan indeks data yang ingin dihapus: ");
        int searchedIndex = sc12.nextInt();
        data.removeAtIndex(searchedIndex);
    }

    private static void cetakDaftarFilm(DaftarFilm data) {
        data.print();
    }

    private static void cariIdFilm(DaftarFilm data) {
        System.out.print("Masukkan ID film yang ingin dicari: ");
        int searchedId = sc12.nextInt();
        sc12.nextLine();
        data.searchData(searchedId);
    }

    private static void urutkanDataRating(DaftarFilm data) {
        data.sortByRatings();
        System.out.println("\nData telah berhasil diurutkan berdasarkan rating!\n");
        data.print();
    }
}
