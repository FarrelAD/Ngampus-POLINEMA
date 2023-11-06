import java.util.Scanner;
public class Individu1 {
    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);

        System.out.println("Input nilai N: ");
        int N = sc12.nextInt();

        // Perulangan untuk mencetak baris
        for (int i = 1; i <= N; i++) {

            // Perulangan untuk mencetak spasi
            for (int k = 1; k <= N - i; k++) {
                System.out.print(" ");
            }

            // Perulangan untuk mencetak angka
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
        System.out.println();
        }
    }
}
