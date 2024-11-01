package studi_kasus_alat_komunikasi_v2;

public class PerangkatElektronik {
    public String merk;
    public String tipe;
    public float berat;
    public float ukuranLayar;
    public String sistemOperasi;

    public PerangkatElektronik(String merk, String tipe, float berat, float ukuranLayar, String sistemOperasi) {
        this.merk = merk;
        this.tipe = tipe;
        this.berat = berat;
        this.ukuranLayar = ukuranLayar;
        this.sistemOperasi = sistemOperasi;
    }

    public void cetakInfoPerangkat() {
        System.out.printf("Merk: %s \tTipe: %s \tBerat: %.2f kg \tUkuran layar : %.2f inch \tSistem operasi: %s",
            this.merk,
            this.tipe,
            this.berat,
            this.ukuranLayar,
            this.sistemOperasi
        );
    }

}
