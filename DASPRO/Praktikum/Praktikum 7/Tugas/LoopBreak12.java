import java.util.Scanner;
public class LoopBreak12 {
    public static void main(String[] args) {
    Scanner input12 = new Scanner (System.in);

    int angka, b;

    for (b = 0; true;) {
        System.out.print("Masukkan sebuah angka: ");
        angka = input12.nextInt();
        b += angka;
        if (b > 50) {
            break;
        }
    }
    System.out.printf("Angka berhenti di saat penjumlahan angka %d\n", b);
    }
}
