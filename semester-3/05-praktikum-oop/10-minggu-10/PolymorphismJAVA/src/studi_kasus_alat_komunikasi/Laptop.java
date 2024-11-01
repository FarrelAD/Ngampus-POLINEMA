package studi_kasus_alat_komunikasi;

public class Laptop extends AlatKomunikasi {
    public String tipeKeyboard; // full-size, 60%, 75%, dll
    public int kapasitasDisk;
    public int kapasitasMemory;

    public Laptop(String merk, String tipe, float berat, float ukuranLayar, String tipeKeyboard, String sandi, String sistemOperasi, int kapasitasDisk, int kapasitasMemory) {
        super(merk, tipe, berat, ukuranLayar, sandi, sistemOperasi);
        this.tipeKeyboard = tipeKeyboard;
        this.kapasitasDisk = kapasitasDisk;
        this.kapasitasMemory = kapasitasMemory;
    }


    // Overloading
    public void upgradeSpekLaptop(int kapasitasMemory) {
        this.kapasitasMemory = kapasitasMemory;
        System.out.println("Laptop berhasil diupgrade. Kapasitas memory terbaru: " + kapasitasMemory + "GB");
    }

    public void upgradeSpekLaptop(int kapasitasMemoryBaru, int kapasitasDiskBaru) {
        this.upgradeSpekLaptop(kapasitasMemoryBaru);
        this.kapasitasDisk = kapasitasDiskBaru;
        System.out.println("Laptop berhasil diupgrade. Kapasitas disk : " + kapasitasDisk + "GB. Kapasitas memory: " + kapasitasMemory + "GB");
    }

    @Override
    public void cetakInfoPerangkat() {
        System.out.printf("Merk : %s \tBerat: %.2f kg \tUkuran layar : %.2f inch  \tAktif: %b \tKapasitas disk : %d GB \tKapasitas memory : %d GB",
            this.merk,
            this.berat,
            this.ukuranLayar,
            this.sedangNyala,
            this.kapasitasDisk,
            this.kapasitasMemory
        );
    }
}
