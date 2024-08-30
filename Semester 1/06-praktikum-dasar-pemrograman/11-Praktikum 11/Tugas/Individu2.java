import java.util.Scanner;
public class Individu2 {
    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);
        System.out.print("Masukkan Nilai N (minimal 5) = ");
        int N = sc12.nextInt();

        if (N < 5) {
            System.out.println("Nilai N harus minimal 5.");
            return;
        }

        int i = N; // Mulai dari baris terakhir ke atas

        while (i >= 1) {
            int j = 1; // Mulai dari kolom pertama
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println(); // Baris baru setelah setiap baris bintang
            i--;
        }
    }
}