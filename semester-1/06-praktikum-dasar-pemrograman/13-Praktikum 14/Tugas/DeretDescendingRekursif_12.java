import java.util.Scanner;

public class DeretDescendingRekursif_12 {
    // Fungsi rekursif
    static void cetakRekursif(int n) {
        // Basis (base case) - berhenti ketika n mencapai 0
        if (n == 0) {
            return;
        }

        // Langkah rekursif
        System.out.print(n + " ");
        cetakRekursif(n - 1);
    }

    // Fungsi iteratif
    static void cetakIteratif(int n) {
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner12 = new Scanner(System.in);

        // Menerima input dari pengguna
        System.out.print("Masukkan sebuah angka: ");
        int inputNumber = scanner12.nextInt();

        // Memanggil fungsi rekursif
        System.out.print("Mencetak dengan fungsi rekursif: ");
        cetakRekursif(inputNumber);
        System.out.println();

        // Memanggil fungsi iteratif
        System.out.print("Mencetak dengan fungsi iteratif: ");
        cetakIteratif(inputNumber);
    }
}
