package P7;

public class Buku12 {
    int tahunTerbit, stock;
    String judulBuku, pengarang, kodeBuku;

    Buku12(String kodeBuku, String judulBuku, int tahunTerbit, String pengarang, int stock) {
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.pengarang = pengarang;
        this.stock = stock;
    }

    public void tampilDataBuku() {
        System.out.println(
            "======================================\n" +
            "- Kode buku\t: " + kodeBuku +
            "\n- Judul buku\t: " + judulBuku + 
            "\n- Tahun terbit\t: " + tahunTerbit +
            "\n- Pengarang\t: " + pengarang +
            "\nStock\t: " + stock
        );
    }
}
