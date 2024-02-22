// PRAKTIKUM ALGORITMA DAN STRUKTUR DATA
// JOBSHEET 2 
// 21 Februari 2024

public class BukuMain12 {

    public static void main(String[] args) {
        // Create a new object with no parameter : bk1
        Buku12 bk1 = new Buku12();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        // Create a new object with parameter: bk2
        Buku12 bk2 = new Buku12("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        // Create a new object with my name as the object name
        Buku12 bukuFarrel = new Buku12("Atomic Habits", "James Clear", 352, 9, 85000);
        bukuFarrel.terjual(3);
        bukuFarrel.tampilInformasi();
    }
}