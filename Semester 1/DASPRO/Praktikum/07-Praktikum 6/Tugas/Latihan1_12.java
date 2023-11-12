// Sebuah perintah untuk menentukan bilangan terbesar dari bilangan yang telah diinput
import java.util.Scanner;
public class Latihan1_12 {
    public static void main(String[] args) {
        Scanner scan12 = new Scanner(System.in);

        int bil1, bil2, bil3;

        System.out.print("Input bilangan pertama: ");
        bil1 = scan12.nextInt();
        System.out.print("Input bilangan kedua: ");
        bil2 = scan12.nextInt();
        System.out.print("Input bilangan ketiga: ");
        bil3 = scan12.nextInt();

        if (bil1 > bil2) {
            if (bil1 > bil3) {
                System.out.println("Bilangan 1 (" + bil1 + ") adalah bilangan terbesar");
            } else {
                System.out.println("Bilangan 3 (" + bil3 + ") adalah bilangan terbesar");
            }
        } else if (bil2 > bil1) {
            if (bil2 > bil3) {
                System.out.println("Bilangan 2 (" + bil2 +") adalah bilangan terbesar");
            } else {
                System.out.println("Bilangan 3 (" + bil3 + ") adalah bilangan terbesar");
            }
        } else {
            System.out.println("Bilangan 3 (" + bil3 + ") adalah bilangan terbesar");
        }
    }
    
}