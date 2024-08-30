package TugasAkhir.Nomor2;

import java.util.Scanner;

public class SLLMain {
    static Scanner sc12 = new Scanner(System.in);
    public static void main(String[] args) {
        SingleLinkedList singLL = new SingleLinkedList();

        System.out.println(
            "--Selamat datang di layanan unit kemahasiswaan!--\n" +
            "================================================="
        );

        do {
            menu();
            int pilihanMenu = sc12.nextInt();
            switch (pilihanMenu) {
                case 1:
                    tambahAntrian(singLL);
                    break;
                case 2:
                    selesaikanAntrian(singLL);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    break;
            }

            System.out.println("\n");
            singLL.print();
            System.out.println("\n=================================================");
        } while (true);
    }

    private static void menu() {
        System.out.print(
            "--Silakan pilih menu yang tersedia--\n" +
            "   1. Tambahkan data antrian\n" +
            "   2. Selesaikan satu antrian\n" +
            "   3. Hentikan program\n" +
            ">>> "
        );
    }

    private static void tambahAntrian(SingleLinkedList singLL) {
        System.out.print(
            "=================================================\n" +
            "Isi data berikut: \n" +
            "   - NIM: "
        );
        int nim = sc12.nextInt();
        sc12.nextLine();
        System.out.print("   - Nama: ");
        String nama = sc12.nextLine();
        singLL.addData(nim, nama);
    }

    private static void selesaikanAntrian(SingleLinkedList singLL) {
        String[] dataTerselesaikan = singLL.getData(0);
        singLL.remove();
        System.out.printf("Data mahasiswa dengan nim: %s dan nama: %s telah diselesaikan", dataTerselesaikan[0], dataTerselesaikan[1]);
    }
}
