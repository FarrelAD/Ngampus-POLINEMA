package studi_kasus_alat_komunikasi;

public class HP extends AlatKomunikasi {
    public float kameraMegaPixel;

    public HP(String merk, String tipe, float berat, float ukuranLayar, float kameraMegaPixel, String sandi, String sistemOperasi) {
        super(merk, tipe, berat, ukuranLayar, sandi, sistemOperasi);
        this.kameraMegaPixel = kameraMegaPixel;
    }

    // Overloading
    public void bukaKunciPerangkat() {
        super.sedangNyala = true;
        System.out.println("HP berhasil dibuka dengan FaceID");
    }

    @Override
    public void cetakInfoPerangkat() {
        System.out.printf("Merk : %s \tBerat: %.2f kg \tUkuran layar : %.2f inch \tAktif: %b \tKamera : %.2f MP",
            this.merk,
            this.berat,
            this.ukuranLayar,
            this.sedangNyala,
            this.kameraMegaPixel
        );
    }
}
