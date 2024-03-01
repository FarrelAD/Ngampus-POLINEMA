package LatihanPraktikum.hitung_luas_permukaan_dan_volume;

public class LimasSegiEmpat12 {
    int panjangSisiAlas, tinggi;
    double volume, luasPermukaan, luasSisiTegak;

    public double hitungVolume() {
        volume = (1.0/3.0) * luasAlas() * tinggi;
        return volume;
    }

    public double hitungLuasPermukaan() {
        luasPermukaan = luasAlas() + hitungLuasSisiTegak();
        return luasPermukaan;
    }

    public int luasAlas() {
        return panjangSisiAlas * panjangSisiAlas;
    }

    public double hitungLuasSisiTegak() {
        double panjangSisiMiring = Math.sqrt(Math.pow(0.5 * panjangSisiAlas, 2) + Math.pow(tinggi, 2));
        luasSisiTegak = 4 * ((panjangSisiAlas * panjangSisiMiring) / 2);
        return luasSisiTegak;
    }
}
