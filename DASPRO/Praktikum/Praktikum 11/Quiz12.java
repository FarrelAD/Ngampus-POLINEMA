import java.util.Scanner;
import java.util.Random;
public class Quiz12 {
    public static void main(String[] args) {
        Random random12 = new Random();
        Scanner input12 = new Scanner(System.in);

        char menu = 'y';
        do {
            int number = random12.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.print("Tebak angka (1-10): ");
                int answer = input12.nextInt();
                input12.nextLine();
                if (answer > number) {
                    System.out.println("Bilangan yang anda tebak TERLALU BESAR");
                } else if (answer < number) {
                    System.out.println("Bilangan yang anda tebak TERLALU KECIL");
                } else {
                    System.out.println("TEPAT SEKALI!! ANDA MENEBAK DENGAN BENAR");
                }
                success = (answer == number);
            } while (!success);
            System.out.print("Apakah Anda ingin mengulang permainan (Y/y) ?");
            menu = input12.nextLine().charAt(0);
        } while (menu == 'Y' || menu == 'y');
    }
}
