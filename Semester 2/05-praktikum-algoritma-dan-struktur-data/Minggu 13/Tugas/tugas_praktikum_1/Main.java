package tugas_praktikum_1;

import java.util.Scanner;

public class Main {
    static Scanner sc12 = new Scanner(System.in);
    public static void main(String[] args) {

        Antrian antrianVaksin = new Antrian();

        int selectedMenu = 0;
        do {
            showMenu();
            selectedMenu = sc12.nextInt();
            switch (selectedMenu) {
                case 1:
                    tambahPenerimaVaksin(antrianVaksin);
                    break;
                case 2:
                    selesaikanSatuAntrian(antrianVaksin);
                case 3:
                    tampilkanSeluruhAntrian(antrianVaksin);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Input tidak sesuai!");
                    break;
            }

            System.out.println("\n");
        } while (selectedMenu >= 1 && selectedMenu < 4 );
    }

    private static void showMenu() {
        System.out.println(
            "===================================\n" +
            "   PENGANTRI VAKSIN EXTRAVAGANZA   \n" +
            "===================================\n\n" +
            "1. Tambah data penerima vaksin\n" +
            "2. Hapus data pengantri vaksin\n" +
            "3. Daftar penerima vaksin\n" +
            "4. Keluar\n" +
            "===================================\n"
        );
    }

    private static void tambahPenerimaVaksin(Antrian antrianVaksin) {
        System.out.print(
            "===================================\n" +
            "   Masukkan data penerima vaksin   \n" +
            "===================================\n" +
            "Nomor antrian : "
        );
        int nomorAntrian = sc12.nextInt();
        sc12.nextLine();
        System.out.print("Nama penerima : ");
        String namaPenerima = sc12.nextLine();

        antrianVaksin.add(nomorAntrian, namaPenerima);
    }

    private static void selesaikanSatuAntrian(Antrian antrianVaksin) {
        antrianVaksin.remove();
    }

    private static void tampilkanSeluruhAntrian(Antrian antrianVaksin) {
        antrianVaksin.print();
    }
}
