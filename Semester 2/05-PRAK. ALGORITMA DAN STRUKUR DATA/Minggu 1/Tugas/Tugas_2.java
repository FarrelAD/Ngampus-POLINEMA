import java.util.Scanner;

public class Tugas_2 {
    static Scanner scan = new Scanner(System.in);
    static float kecepatan, jarak, waktu;
    static int ulangiPerhitungan = 1;

    private static void menuPerhitungan() {
        do {
            System.out.print(
                "\nMAU HITUNG APA?\n" +
                "   1. Kecepatan\n" +
                "   2. Jarak\n" +
                "   3. Waktu\n" +
                ">>> "
            );
            int pilihanMenu = scan.nextInt();
    
            switch (pilihanMenu) {
                case 1:
                    hitungKecepatan();
                    break;
                case 2:
                    hitungJarak();
                    break;
                case 3:
                    hitungWaktu();
                    break;
                default:
                    tampilInputInvalid();
                    break;
            }

            System.out.println("============================");
            System.out.print(
                "\nUlangi lagi ?\n" +
                "   1. YA\n" + 
                "   2. TIDAK\n" +
                ">>> "
            );
            ulangiPerhitungan = scan.nextInt();
        } while (ulangiPerhitungan == 1);
    }

    private static void hitungKecepatan() {
        System.out.print("Masukkan jarak (km): ");
        jarak = scan.nextFloat();
        System.out.print("Masukkan waktu (jam) : ");
        waktu = scan.nextFloat();

        // Menghitung nilai kecepatan
        kecepatan = jarak / waktu;
        System.out.println("Kecepatan yang dihasilkan : " + kecepatan + " km/jam");
    }

    private static void hitungJarak() {
        System.out.print("Masukkan kecepatan (km/jam) : ");
        kecepatan = scan.nextFloat();
        System.out.print("Masukkan waktu (jam) : ");
        waktu = scan.nextFloat();

        // Menghitung nilai jarak
        jarak = kecepatan * waktu;
        System.out.println("Jarak yang ditempuh : " + jarak + " km");
    }

    private static void hitungWaktu() {
        System.out.print("Masukkan jarak (km) : ");
        jarak = scan.nextFloat();
        System.out.print("Masukkan kecepatan (km/jam) : ");
        kecepatan = scan.nextFloat();

        // Menghitung nilai waktu
        waktu = jarak / kecepatan;
        System.out.println("Waktu yang dihabiskan : " + waktu + " jam");
    }

    private static void tampilInputInvalid() {
        System.out.println("============================");
        System.out.println("  INPUT INVALID!");
        System.out.println("============================");
    }

    public static void main(String[] args) {
        menuPerhitungan();
    }
}
