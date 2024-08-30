import java.util.Scanner;
public class FactorialDoWhile12 {
    public static void main(String[] args) {
    Scanner input12 = new Scanner (System.in);

    int angka, faktorial, i;

    System.out.print("Masukkan sebuah angka: ");
    angka = input12.nextInt();

    faktorial = 1;
    i =1;
    do {
        faktorial = faktorial * i;
        i++;
    } while (i <= angka);

    System.out.printf("Faktorial dari %d adalah %d\n", angka, faktorial);

    }
}
