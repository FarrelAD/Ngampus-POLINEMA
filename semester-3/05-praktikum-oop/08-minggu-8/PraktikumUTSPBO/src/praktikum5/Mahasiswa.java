package praktikum5;

public class Mahasiswa {
    private String nama;
    private Stnk stnk;
    private Ktm ktm;
    private Motor motor;
    
    public Mahasiswa(String nama, Ktm ktm) {
        this.nama = nama;
        this.ktm = ktm;
    }

    public String getNama() {
        return nama;
    }

    public Stnk getStnk() {
        return stnk;
    }

    public void setStnk(Stnk stnk) {
        this.stnk = stnk;
    }

    public Ktm getKtm() {
        return ktm;
    }

    public void setKtm(Ktm ktm) {
        this.ktm = ktm;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void keluarParkiran(PetugasParkir petugas) {
        petugas.cekStnk(this);
    }
}
