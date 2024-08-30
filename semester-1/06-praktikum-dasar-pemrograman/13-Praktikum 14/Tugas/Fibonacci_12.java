import java.util.Scanner;

public class Fibonacci_12 {
    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);
        System.out.print("Masukkan bulan ke: ");
        int bulan = sc12.nextInt();

        int[] jumlahMarmut = hitungPasanganMarmut(bulan);

        System.out.println("Total pasangan marmut pada bulan ke-" + bulan + " adalah " + jumlahMarmut[0]);
        System.out.println("Jumlah marmut produktif pada bulan ke-" + bulan + " adalah " + jumlahMarmut[1]);
        System.out.println("Jumlah marmut belum produktif pada bulan ke-" + bulan + " adalah " + jumlahMarmut[2]);
    }

    public static int[] hitungPasanganMarmut(int bulan) {
        int[] hasil = new int[3];
        if (bulan <= 2) {
            hasil[0] = 1; // Total pasangan marmut
            hasil[1] = 0; // Jumlah marmut produktif
            hasil[2] = 1; // Jumlah marmut belum produktif
            return hasil;
        }

        int[] marmutSebelumnya = hitungPasanganMarmut(bulan - 1);
        int totalPasangan = marmutSebelumnya[0] + marmutSebelumnya[2]; // Jumlah marmut belum produktif
        int jumlahProduktif = marmutSebelumnya[2]; // Jumlah marmut produktif
        hasil[0] = totalPasangan;
        hasil[1] = jumlahProduktif;
        hasil[2] = totalPasangan - jumlahProduktif;
        return hasil;
    }
}