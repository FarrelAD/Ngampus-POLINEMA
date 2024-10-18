package praktikum5;

public class Stnk {
    private String nomorStnk, namaPemilik, 
            merk, nomorRangka, warnaKendaraan;
    private int isiSilinder;

    public Stnk(String nomorStnk, String namaPemilik, String merk, String nomorRangka, String warnaKendaraan, int isiSilinder) {
        this.nomorStnk = nomorStnk;
        this.namaPemilik = namaPemilik;
        this.merk = merk;
        this.nomorRangka = nomorRangka;
        this.warnaKendaraan = warnaKendaraan;
        this.isiSilinder = isiSilinder;
    }

    public String getNomorStnk() {
        return nomorStnk;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public String getMerk() {
        return merk;
    }

    public String getNomorRangka() {
        return nomorRangka;
    }

    public String getWarnaKendaraan() {
        return warnaKendaraan;
    }

    public int getIsiSilinder() {
        return isiSilinder;
    }

    public void setNomorStnk(String nomorStnk) {
        this.nomorStnk = nomorStnk;
    }

    public void setNamaPemilik(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }

    public void setWarnaKendaraan(String warnaKendaraan) {
        this.warnaKendaraan = warnaKendaraan;
    }

    public void setIsiSilinder(int isiSilinder) {
        this.isiSilinder = isiSilinder;
    }
}
