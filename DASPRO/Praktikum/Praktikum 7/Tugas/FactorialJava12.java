import java.util.Scanner;
public class FactorialJava12 {

    public static void main(String[] args) {
    Scanner input12 = new Scanner (System.in);
    
    int angka, faktorial, i;

    System.out.print("Masukkan sebuah angka: ");
    angka = input12.nextInt();

    faktorial = 1;
    for (i = 1; i <= angka; i++) {
        faktorial = faktorial * i;
    }

    System.out.printf("Faktorial dari %d adalah %d\n", angka, faktorial);
    }
}