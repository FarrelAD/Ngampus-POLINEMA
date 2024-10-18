package praktikum5;

// KTM : Kartu Tanda Mahasiswa
public class Ktm {
    private String nama, nim, prodi;

    public Ktm(String nama, String nim, String prodi) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getProdi() {
        return prodi;
    }
}
