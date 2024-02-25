import java.util.Scanner;

public class Perulangan_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("MASUKKAN NIM ANDA: ");
        long nimPengguna = scan.nextLong();

        long duaDigitTerakhiirNim = nimPengguna % 100;

        if (duaDigitTerakhiirNim < 10) {
            duaDigitTerakhiirNim += 10;
        }
        duaDigitTerakhiirNim = duaDigitTerakhiirNim < 10 ? duaDigitTerakhiirNim + 10 : duaDigitTerakhiirNim;

        for (int i = 1; i <= duaDigitTerakhiirNim; i++) {
            if (i != 6 && i != 10) {
                if (i % 2 == 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print(i);
                }
            }
        }
    }
}
