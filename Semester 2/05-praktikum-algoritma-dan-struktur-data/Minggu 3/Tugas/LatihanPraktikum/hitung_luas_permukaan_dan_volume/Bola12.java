package LatihanPraktikum.hitung_luas_permukaan_dan_volume;

public class Bola12 {
    double jariJari;
    double volume, luasPermukaan;

    public Bola12(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungVolume() {
        volume = (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
        return volume;
    }

    public double hitungLuasPermukaan() {
        luasPermukaan = 4 * (Math.PI * Math.pow(jariJari, 2));
        return luasPermukaan;
    }
}
