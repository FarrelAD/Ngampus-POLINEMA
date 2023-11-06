import java.util.Scanner;

public class HargaBayar12 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);

        // Deklarasi variabel
        int harga, jumlah, jmlHalBuku;
        double diskon, total, bayar, jmlDis;
        String merkBuku; 

        // Input merk buku
        System.out.print("Masukkan merk buku : ");
        merkBuku = input12.nextLine();

        // Input jumlah halaman buku
        System.out.print("Masukkan jumlah halaman buku : ");
        jmlHalBuku = input12.nextInt();

        // Input nilai diskon
        System.out.print("Masukkan diskon : ");
        diskon = input12.nextInt();

        // Input harga barang
        System.out.print("Masukkan harga barang : ");
        harga = input12.nextInt();

        // Input jumlah barang yang diberli
        System.out.print("Masukkan jumlah barang yang dibeli : ");
        jumlah = input12.nextInt();

        // Perhitungan total harga, jumlah diskon, dan total harga yang perlu dibayar
        total = harga * jumlah;
        jmlDis = total * (diskon / 100);
        bayar = total - jmlDis;

        // Menampilkan hasil total diskon dan total harga yang harus dibayar
        System.out.println("Diskon yang anda dapatkan adalah : " + jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah : " + bayar);
    }
}