package ArrayBalok;

public class Balok12 {
    public int panjang, lebar, tinggi;

    public Balok12(int p, int l, int t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    public int hitungVolume() {
        return panjang * lebar * tinggi;
    }
}
