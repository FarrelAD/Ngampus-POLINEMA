package src.inheritance.satu;

public class Mahasiswa extends Orang {
    private String nim;
    private String kelas;

    public Mahasiswa(String nama, String nim, String kelas) {
        super(nama);
        super.nomor = 20;
        this.nim = nim;
        this.kelas = kelas;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
}
