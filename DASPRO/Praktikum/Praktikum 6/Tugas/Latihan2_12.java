// Latihan kasus pemberian diskon buku
import java.util.Scanner;

public class Latihan2_12 {
    public static void main(String[] args) {
        // Deklrasi variabel-variabel
        String jenisBuku;
        double diskon = 0;
        float hargaAwal, potonganHarga, hargaAkhir;
        int jumlahBarang;

        Scanner sc12 = new Scanner(System.in);

        // Ini adalah bagian header sederhana dari sistem ini
        System.out.println("==============================================================================");
        System.out.println("SISTEM PEMBERIAN DISKON");
        System.out.println("==============================================================================");

        // Proses input jenis barang yang dibeli
        System.out.println("Masukkan jenis buku anda: (Kamus, Novel, atau lainnya) ");
        jenisBuku = sc12.nextLine().toLowerCase(); // Convert input to lowercase for case-insensitive comparison

        // Proses input harga per item/barang oleh user
        System.out.println("Masukkan harga per item/barang: ");
        hargaAwal = sc12.nextFloat();

        // Proses input jumlah barang yang akan dibeli
        System.out.println("Masukkan jumlah barang yang anda beli: ");
        jumlahBarang = sc12.nextInt();

        // Menghitung total biaya yang harus dibayar
        if (jenisBuku.equals("kamus")) {
            if (jumlahBarang > 2) {
                diskon = 0.12;
            } else {
                diskon = 0.10;
            }
        } else if (jenisBuku.equals("novel")) {
            if (jumlahBarang > 3) {
                diskon = 0.09;
            } else {
                diskon = 0.08;
            }
        } else {
            if (jumlahBarang > 3) {
                diskon = 0.05;
            }
        }

        //Proses penghitungan besaran diskon
        potonganHarga = (float) (hargaAwal * diskon);
        hargaAkhir = (float) (jumlahBarang * (hargaAwal - potonganHarga));

        // Di bawah ini adalah bagian output yang dihasilkan dari data yang telah diberikan
        System.out.println("==============================================================================");
        System.out.println("Jumlah diskon yang diterima:" + diskon);
        System.out.println("Jumlah diskon yang diterima (dalam rupiah): Rp " + potonganHarga);
        System.out.println("Total harga yang harus anda bayar: Rp " + hargaAkhir);
        System.out.println("==============================================================================");

    }
}
