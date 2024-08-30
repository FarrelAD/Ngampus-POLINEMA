import java.util.Scanner;
/**
 * LoopContinue12
 */
public class LoopContinue12 {
    public static void main(String[] args) {
    Scanner input12 = new Scanner (System.in);

    int angka, b, i, hitung;
    double avg, total;

    b = 0;
    hitung = 0;
    for (i = 0; i < 5; i++) {
        System.out.print("Masukkan sebuah bilangan: ");
        angka = input12.nextInt();
        if (angka >= 50) { // Keadaan ini membuat bilangan di atas 50 tidak akan  dihitung
            continue;
        }
        b += angka;
        hitung++;
    }
    total = (double) b;
    // Di bawah ini yang diprint hanya bilangan input kurang dari 50.
    // Misal input bilangan 55, maka tidak akan dihitung
    System.out.printf("Total bilangan adalah kurang dari 50: %.2f\n", total);
    avg = (double) b / hitung;
    System.out.printf("Rata-rata bilangan kurang dari 50: %.2f\n", avg);

    }
    
}