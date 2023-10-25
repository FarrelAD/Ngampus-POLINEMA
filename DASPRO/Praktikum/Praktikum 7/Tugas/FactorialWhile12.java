import java.util.Scanner;
/**
 * FactorialWhile12
 */
public class FactorialWhile12 {

    public static void main(String[] args) {
    Scanner input12 = new Scanner (System.in);

    int angka, faktorial, i;

    System.out.print("Masukkan sebuah angka: ");
    angka = input12.nextInt();

    faktorial = 1;
    i=1;
    while (i <= angka) {
        faktorial = faktorial * i;
        i++;
    }

    System.out.printf("Faktorial dari %d adalah %d\n", angka, faktorial);
    }
}