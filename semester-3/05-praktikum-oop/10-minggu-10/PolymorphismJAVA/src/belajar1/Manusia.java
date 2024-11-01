package belajar1;

public class Manusia {
    private String nama, alamat;
    private int umur;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setBiodata(String nama) {
        this.nama = nama;
    }

    public void setBiodata(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void setBiodata(String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }
}
