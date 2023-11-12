import java.util.Scanner;
public class Toko12 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in); // Scanner pertama digunakan untuk proses input yang berada di luar fungsi 'while'
        Scanner scan2 = new Scanner(System.in); // Scanner kedua digunakan untuk proses input yang berada di dalam fungsi 'while'
        // Scanner scan3 = new Scanner(System.in); // Scanner kedua digunakan untuk proses input yang berada di dalam fungsi 'while'

        // Deklarasi variabel
        String nama_plnggn, nama_produk, stats_plnggn, input_ulang = "Y";
        int kuantitas = 0, harga = 0, total_produk = 0, jum_har = 0, subtotal = 0, total_pembelian, total_barang;
        double diskon_prod = 0, nom_diskon = 0, nom_diskon_member, diskon_tambahan = 0, diskon_rupiah, total_belanja;

        // Input nama pelanggan
        System.out.print("Masukkan nama Anda: ");
        nama_plnggn = scan2.nextLine();
        
        // Menggunakan while karena perlu adanya perualangan jika ada input barang lagi
        while (input_ulang.equalsIgnoreCase("Y")) {
            System.out.print("Masukkan produk yang Anda beli: ");
            nama_produk = scan1.nextLine();
            System.out.print("Banyaknya: ");
            kuantitas = scan2.nextInt();
            total_produk += kuantitas;
            System.out.print("Harga: ");
            harga = scan2.nextInt();
            jum_har = kuantitas * harga;
            subtotal += jum_har;
            System.out.print("Diskon: (%) ");
            diskon_prod = scan2.nextFloat() / 100;
            nom_diskon = jum_har * diskon_prod;
            // Menanyakan apakah pengguna ingin input item ulang apa tidak
            System.out.println("Apakah Anda ingin menambahkan item? (Y/T)");
            input_ulang = scan1.nextLine();
        }
        // Menanyakan apakah pelannggan adalah seorang member atau bukan
        System.out.println("Apakah Anda punya kartu member? (Y/T)");
        stats_plnggn = scan1.nextLine();

        total_pembelian = subtotal * total_produk; // Penghitungan total pembelian sebelum diskon

        // Proses pemberian diskon tambahan jika pelanggan adalah member
        if (stats_plnggn.equalsIgnoreCase("Y")) {
            if (total_pembelian >= 200000) {
                diskon_tambahan = 0.1;
            } else {
                diskon_tambahan = 0.05;
            }
        }
        // Total diskon yang didapat
        nom_diskon_member = diskon_tambahan * subtotal;
        total_belanja = subtotal - (nom_diskon_member);

        // Penampilan output dari seluruh data yang diinput
        System.out.println("-----------------Total Pembelian-----------------");
        System.out.println("Nama pelanggan: " + nama_plnggn);
        System.out.println("Tipe:" + stats_plnggn);
        System.out.println("Total barang yang dibeli: " + total_produk);
        System.out.println("Subtotal : " + subtotal);
        System.out.println("Total harga sebelum diskon: " + total_pembelian);
        System.out.println("Total harga diskon: " + (nom_diskon_member + nom_diskon));
        System.out.println("Total belanja yang harus dibayar: " + total_belanja);
        System.out.println("-------------------------------------------------");

    }
}
