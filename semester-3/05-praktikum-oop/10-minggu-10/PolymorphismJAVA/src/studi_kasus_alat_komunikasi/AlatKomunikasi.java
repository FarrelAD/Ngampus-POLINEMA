package studi_kasus_alat_komunikasi;

public class AlatKomunikasi {
    public String merk;
    public float berat;
    public float ukuranLayar;
    public boolean sedangNyala;
    public String sandi;
    public String tipe;
    public String sistemOperasi;

    public AlatKomunikasi(String merk, String tipe, float berat, float ukuranLayar, String sandi, String sistemOperasi) {
        this.merk = merk;
        this.berat = berat;
        this.ukuranLayar = ukuranLayar;
        this.sandi = sandi;
        this.tipe = tipe;
        this.sistemOperasi = sistemOperasi;
    }

    public void bukaKunciPerangkat(String sandi) {
        this.sedangNyala = true;
        if (sandi.equals(this.sandi)) {
            System.out.println("Perangkat berhasil dibuka kunci dengan kunci sandi");
        } else {
            System.out.println("Sandi salah!");
        }
    }

    public void cetakInfoPerangkat() {
        System.out.printf("Merk : %s \tBerat: %.2f kg \tUkuran layar : %.2f inch \tAktif: %b",
            this.merk,
            this.berat,
            this.ukuranLayar,
            this.sedangNyala
        );
    }

}
