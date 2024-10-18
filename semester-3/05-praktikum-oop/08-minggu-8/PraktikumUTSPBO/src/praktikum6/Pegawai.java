package praktikum6;

public class Pegawai {
    public String nip, nama, alamat;

    private Pegawai(String nip, String nama, String alamat) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }

    private String getNama() {
        return nama;
    }

    private int getGaji() {
        return 0;
    }
}
