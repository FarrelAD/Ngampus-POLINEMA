// PRAKTIKUM ALGORITMA DAN STRUKTUR DATA
// JOBSHEET 2 
// 21 Februari 2024

public class Buku12 {
    
    String judul, pengarang;
    int halaman, stok, harga, terjual;

    // Default constructor without parameter
    public Buku12() {

    }

    // Constructor with some parameter
    public Buku12(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    void tampilInformasi() {
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Jumlah halaman : " + halaman);
        System.out.println("Sisa stok : " + stok);
        System.out.println("Harga: Rp" + harga);
        System.out.println("Harga total: " + hitungHargaTotal());
        System.out.println("Diskon: " + hitungDiskon());
        System.out.println("Harga bayar: " + hitungHargaBayar());
        System.out.println("----------------------------------\n");
    }
    
    void terjual(int jml) {
        // Old code
        // stok -= jml;

        // Modified code
        terjual = jml;
        if (stok > 0) {
            stok -= jml;
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }



    // Practical Training
    int hitungHargaTotal() {
        return harga * terjual;
    }

    int hitungDiskon() {
        if (hitungHargaTotal() > 150000) {
            return (int) (hitungHargaTotal() * 0.12);
        } else if (hitungHargaTotal() == 75000 || hitungHargaTotal() == 150000) {
            return (int) (hitungHargaTotal() * 0.05);
        } else {
            return 0;
        }
    }

    int hitungHargaBayar() {
        int hargaTotal = hitungHargaTotal();
        return hargaTotal -= hitungDiskon();
    }
}