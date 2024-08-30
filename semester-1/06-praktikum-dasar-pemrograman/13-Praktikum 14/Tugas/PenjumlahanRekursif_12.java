import java.util.Scanner;
public class PenjumlahanRekursif_12 {
    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);
        System.out.print("Masukkan bilangan yang anda ingin jumlahkan: ");
        int bilangan = sc12.nextInt();
        System.out.println(PenjumlahanRekursif(bilangan));
    }

    static int PenjumlahanRekursif(int x) {
        if (x == 0) {
            return 0;
        } else {
            if (x >= 1) {
                System.out.print(x);
                if (x > 1) {
                    System.out.print(" + "); // tanda perkalian
                } else {
                    System.out.print(" = "); // tanda sama dengan karena perhitungan telah selesai
                }
            }
            return x + PenjumlahanRekursif(x - 1);
        }
    }
}
