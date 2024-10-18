package praktikum5;

public class Motor {
    private String merk, platKendaraan, warnaKendaraan;
    private int isiSilinder;
    
    public Motor(String merk, String platKendaraan, String warnaKendaraan, int isiSilinder) {
        this.merk = merk;
        this.platKendaraan = platKendaraan;
        this.warnaKendaraan = warnaKendaraan;
        this.isiSilinder = isiSilinder;
    }

    public String getMerk() {
        return merk;
    }

    public String getPlatKendaraan() {
        return platKendaraan;
    }

    public String getWarnaKendaraan() {
        return warnaKendaraan;
    }

    public int getIsiSilinder() {
        return isiSilinder;
    }

    public void setPlatKendaraan(String platKendaraan) {
        this.platKendaraan = platKendaraan;
    }

    public void setWarnaKendaraan(String warnaKendaraan) {
        this.warnaKendaraan = warnaKendaraan;
    }

    public void setIsiSilinder(int isiSilinder) {
        this.isiSilinder = isiSilinder;
    }
}
