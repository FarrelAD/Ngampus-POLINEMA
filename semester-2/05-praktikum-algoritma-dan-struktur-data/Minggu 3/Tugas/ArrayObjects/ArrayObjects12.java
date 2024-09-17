package ArrayObjects;
import java.util.Scanner;

public class ArrayObjects12 {
    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);

        // PersegiPanjang12[] ppArray = new PersegiPanjang12[3];

        // Percobaan 2 - pertanyaan 4 - modifikasi pembuatan panjang dari array
        System.out.print("Masukkan panjang dari array: ");
        int length = sc12.nextInt();
        PersegiPanjang12[] ppArray = new PersegiPanjang12[length];

        // Percobaan 1 - Proses pembuatan objek baru
        // ppArray[0] = new PersegiPanjang12();
        // ppArray[0].panjang = 110;
        // ppArray[0].lebar = 30;

        // ppArray[1] = new PersegiPanjang12();
        // ppArray[1].panjang = 80;
        // ppArray[1].lebar = 40;

        // ppArray[2] = new PersegiPanjang12();
        // ppArray[2].panjang = 100;
        // ppArray[2].lebar = 20;

        // Percobaan 2 - modifikasi kode dari percobaan 1
        for (int i = 0; i < ppArray.length; i++) {
            ppArray[i] = new PersegiPanjang12();
            System.out.println("Persegi panjang ke-" + (i + 1));
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = sc12.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc12.nextInt();
        }


        // Percobaan 1 - Mencetak semua atribut yang ada ari objek ppAarray
        // System.out.println("Peresgi panjang ke-0, panjang: " + ppArray[0].panjang + ", lebar: " + ppArray[0].lebar);
        // System.out.println("Peresgi panjang ke-0, panjang: " + ppArray[1].panjang + ", lebar: " + ppArray[1].lebar);
        // System.out.println("Peresgi panjang ke-0, panjang: " + ppArray[2].panjang + ", lebar: " + ppArray[2].lebar);

        // Percobaan 2 - modifikasi penampilan output dengan looping
        for (int i = 0; i < ppArray.length; i++) {
            System.out.println("Persegi panjang ke-" + (i + 1));
            System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
        }
    }
}
