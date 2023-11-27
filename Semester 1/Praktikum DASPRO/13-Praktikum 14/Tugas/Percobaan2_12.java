import java.util.Scanner;
public class Percobaan2_12 {
    static int hitungPangkat (int x, int y) {
        if (y == 0) {
            return (1);
        } else {
            if (y >= 1) {
                System.out.print(x);
                if (y > 1) {
                    System.out.print("x"); // tanda perkalian
                } else {
                    System.out.print(" = "); // tanda sama dengan karena perhitungan telah selesai
                }
            }
            return (x * hitungPangkat(x, y - 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);
        int bilangan, pangkat;
        System.out.print("Bilangan yang dihitung: ");
        bilangan  = sc12.nextInt();
        System.out.print("Pangkat: ");
        pangkat = sc12.nextInt();
        System.out.println(hitungPangkat(bilangan, pangkat));
    }
}
