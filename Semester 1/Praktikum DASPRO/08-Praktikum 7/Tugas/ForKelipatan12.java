import java.util.Scanner;
public class ForKelipatan12 {
    public static void main(String[] args) {
    Scanner scan12 = new Scanner (System.in);

    int kelipatan, jumlah = 0, counter = 0, avg; // Deklarasi variabel

    System.out.print("Masukkan bilangan kelipatan (1-9): ");
    kelipatan = scan12.nextInt();

    // Membuat logika looping menggunakan 'for'
    for (int i = 1; i <= 50; i++) {
        if (i % kelipatan == 0) {
            jumlah += i;
            counter++;
        }
    }
    // Menghitung rata-rata
    if (counter != 0) {
        avg = jumlah / counter;
    } else {
        avg = 0; 
    }

    // Menampilkan hasil program
    System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
    System.out.printf("Total bilangan keilpatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah, kelipatan, counter);
    System.out.printf("Rata-rata dari seluruh bilangan kelipatan adalah: " + avg);





    }
}
