package tugas.kelompok.oop;

public class Segitiga {

    private float tinggi;
    private float alas;

    public Segitiga() {

    }

    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }

    public void setAlas(float alas) {
        this.alas = alas;
    }

    public float hitungLuas() {
        return alas * tinggi / 2;
    }
}