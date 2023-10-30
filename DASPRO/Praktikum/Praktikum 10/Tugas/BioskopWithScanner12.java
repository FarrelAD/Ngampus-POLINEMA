import java.util.Scanner;
public class BioskopWithScanner12 {
    public static void main(String[] args) {
        Scanner scan12 = new Scanner(System.in);

        int baris, kolom;
        String nama, next;

        String[][] penonton = new String [4][2];

        while (true) {
            System.out.print("Masukkan nama: ");
            nama = scan12.nextLine();
            System.out.print("Masukkan baris: ");
            baris = scan12.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom = scan12.nextInt();
            scan12.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input penonton lainnya? (Y/N): ");
            next = scan12.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
