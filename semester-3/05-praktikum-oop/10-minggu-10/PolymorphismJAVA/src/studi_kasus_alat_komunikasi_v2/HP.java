package studi_kasus_alat_komunikasi_v2;

public class HP extends PerangkatElektronik {
    public float kameraMegaPixel;

    public HP(String merk, String tipe, float berat, float ukuranLayar, String sistemOperasi, float kameraMegaPixel) {
        super(merk, tipe, berat, ukuranLayar, sistemOperasi);
        this.kameraMegaPixel = kameraMegaPixel;
    }

    @Override
    public void cetakInfoPerangkat() {
        super.cetakInfoPerangkat();
        System.out.printf("\tKamera: %.2f MP",
            this.kameraMegaPixel
        );
    }
}
