import java.util.Scanner;

public class CekPrimaRekursif_12 {

    static boolean isPrime(int n, int i) {
        // Basis: Jika n kurang dari atau sama dengan 1, bukan bilangan prima
        if (n <= 1) {
            return false;
        }
        // Basis: Jika i sama dengan 2, berarti n adalah bilangan prima
        if (i == n) {
            return true;
        }
        // Jika n habis dibagi oleh i, bukan bilangan prima
        if (n % i == 0) {
            return false;
        }
        // Panggil fungsi rekursif dengan i yang ditambah 1
        return isPrime(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input bilangan dari pengguna
        System.out.print("Masukkan suatu bilangan: ");
        int num = scanner.nextInt();

        // Panggil fungsi isPrime dengan parameter default i=2
        if (isPrime(num, 2)) {
            System.out.println(num + " adalah bilangan prima.");
        } else {
            System.out.println(num + " bukan bilangan prima.");
        }

        // Tutup scanner
        scanner.close();
    }
}
