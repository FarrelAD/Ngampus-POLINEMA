package LatihanPraktikum.hitung_luas_permukaan_dan_volume;

public class Kerucut12 {
    double jariJari, tinggi, luasPermukaan, volume;
    int sisiMiring;

    public Kerucut12(double jariJari, int sisiMiring) {
        this.jariJari = jariJari;
        this.sisiMiring = sisiMiring;
    } 

    public double hitungTinggi() {
        tinggi = Math.sqrt((sisiMiring * sisiMiring) - (jariJari * jariJari));
        return tinggi;
    }

    public double hitungLuasPermukaan() {
        luasPermukaan = Math.PI * jariJari * (sisiMiring + jariJari);
        return luasPermukaan;
    }

    public double hitungVolume() {
        volume = (1.0/3.0) * Math.PI * (jariJari * jariJari) * hitungTinggi();
        return volume;
    }
}
