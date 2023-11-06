import java.util.Scanner;
/**
 * PemilihanPercobaan112
 */
public class PemilihanPercobaan112 {

    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);

        System.out.println("Masukkan angka: ");
        int angka = input12.nextInt();
        
        /*
        if (angka % 2 == 0)
            System.out.println("Angka "+angka+" bilangan genap");
        else 
            System.out.println("Angka "+angka+" bilangan ganjil");
        */

        String result = (angka % 2 == 0) ? "Angka "+angka+" bilangan genap" : "Angka "+angka+" bilangan ganjil";
        System.out.println(result);
    }
}
