import java.util.Scanner;

public class Tugas_1 {
    static Scanner scan = new Scanner(System.in);

    // Deklarasi variabel
    static char[] kode = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
    static char[][] kota = new char[10][12];

    public static void main(String[] args) {
        inisialisasiVariabel();
        cariPlatNomor();
    }

    private static void inisialisasiVariabel() {
        // Memberikan nilai/nama kota kepada variabel array kota
        String banten = "BANTEN", jakarta = "JAKARTA", bandung = "BANDUNG", cirebon = "CIREBON",
        bogor = "BOGOR", pekalongan = "PEKALONGAN", semarang = "SEMARANG", surabaya = "SURABAYA",
        malang = "MALANG", tegal = "TEGAL";

        for (int i = 0; i < banten.length(); i++) {
            kota[0][i] = banten.charAt(i);
            kota[8][i] = malang.charAt(i);
        }

        for (int i = 0; i < jakarta.length(); i++) {
            kota[1][i] = jakarta.charAt(i);
            kota[2][i] = bandung.charAt(i);
            kota[3][i] = cirebon.charAt(i);
        }

        for (int i = 0; i < bogor.length(); i++) {
            kota[4][i] = bogor.charAt(i);
            kota[9][i] = tegal.charAt(i);
        }

        for (int i = 0; i < semarang.length(); i++) {
            kota[6][i] = semarang.charAt(i);
            kota[7][i] = surabaya.charAt(i);
        }

        for (int i = 0; i < pekalongan.length(); i++) {
            kota[5][i] = pekalongan.charAt(i);
        }
    }

    private static void cariPlatNomor() {
        // Pencarian nama kota berdasarkan kode plat nomor
        int ulangiInput = 1;
        do {
            System.out.print("\nMasukkan kode plat nomor: ");
            char inputKode = scan.next().toUpperCase().charAt(0);

            switch (inputKode) {
                case 'A':
                    cetakNamaKota(0);
                    break;
                case 'B':
                    cetakNamaKota(1);
                    break;
                case 'D':
                    cetakNamaKota(2);
                    break;
                case 'E':
                    cetakNamaKota(3);
                    break;
                case 'F':
                    cetakNamaKota(4);
                    break;
                case 'G':
                    cetakNamaKota(5);
                    break;
                case 'H':
                    cetakNamaKota(6);
                    break;
                case 'L':
                    cetakNamaKota(7);
                    break;
                case 'N':
                    cetakNamaKota(8);
                    break;
                case 'T':
                    cetakNamaKota(9);
                    break;
                default:
                    System.out.println(
                        "====================\n" +
                        " INPUT TIDAK VALID!\n" + 
                        "===================="
                    );
                    break;
            }

            System.out.print(
                "\n\nInput ulang? \n" +
                "  1. YA\n" +
                "  2. TIDAK\n" +
                ">>> "
            );
            ulangiInput = scan.nextInt();
        } while (ulangiInput == 1);
    }

    private static void cetakNamaKota(int kode) {
        System.out.print(" - ");
        for (char nilai : kota[kode]) {
            System.out.print(nilai);
        }
    }
}