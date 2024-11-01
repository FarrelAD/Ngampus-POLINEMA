package studi_kasus_alat_komunikasi_v2;

public class Laptop extends PerangkatElektronik {
    public String tipeKeyboard; // full-size, 60%, 75%, dll
    public int kapasitasDisk;
    public int kapasitasMemory;

    public Laptop(String merk, String tipe, float berat, float ukuranLayar, String sistemOperasi, String tipeKeyboard,
            int kapasitasDisk, int kapasitasMemory) {
        super(merk, tipe, berat, ukuranLayar, sistemOperasi);
        this.tipeKeyboard = tipeKeyboard;
        this.kapasitasDisk = kapasitasDisk;
        this.kapasitasMemory = kapasitasMemory;
    }

    @Override
    public void cetakInfoPerangkat() {
        super.cetakInfoPerangkat();
        System.out.printf("\tTipe keyboard: %s \tKapasitas disk: %d GB\tKapasitas memory: %d GB",
            this.tipeKeyboard,
            this.kapasitasDisk,
            this.kapasitasMemory
        );
    }
    
}
