package src.inheritance.dua.soal;

public class BangunDatar {
    public float luas() {
        // Metode 1 
        // if (this instanceof PersegiPanjang) {
        //     PersegiPanjang pp = (PersegiPanjang) this;
        //     return pp.panjang * pp.lebar;
        // } else if (this instanceof Segitiga) {
        //     Segitiga ss = (Segitiga) this;
        //     return ss.alas * ss.tinggi / 2;
        // } else if (this instanceof Lingkaran) {
        //     Lingkaran ll = (Lingkaran) this;
        //     return (float) Math.PI * ll.r * ll.r;
        // }

        // Metode 2
        if (this.getClass() == PersegiPanjang.class) {
            PersegiPanjang pp = (PersegiPanjang) this;
            return pp.panjang * pp.lebar;
        } else if (this.getClass() == Segitiga.class) {
            Segitiga ss = (Segitiga) this;
            return ss.alas * ss.tinggi / 2;
        } else if (this.getClass() == Lingkaran.class) {
            Lingkaran ll = (Lingkaran) this;
            return (float) Math.PI * ll.r * ll.r;
        }

        return 0;
    }

    public float keliling() {
        // Metode 1
        // if (this instanceof PersegiPanjang) {
        //     PersegiPanjang pp = (PersegiPanjang) this;
        //     return 2 * (pp.panjang + pp.lebar);
        // } else if (this instanceof Segitiga) {
        //     Segitiga ss = (Segitiga) this;
        //     return ss.alas * 3;
        // } else if (this instanceof Lingkaran) {
        //     Lingkaran ll = (Lingkaran) this;
        //     return 2 * (float) Math.PI * ll.r;
        // }

        // Metode 2
        if (this.getClass() == PersegiPanjang.class) {
            PersegiPanjang pp = (PersegiPanjang) this;
            return 2 * (pp.panjang + pp.lebar);
        } else if (this.getClass() == Segitiga.class) {
            Segitiga ss = (Segitiga) this;
            return ss.alas * 3;
        } else if (this.getClass() == Lingkaran.class) {
            Lingkaran ll = (Lingkaran) this;
            return 2 * (float) Math.PI * ll.r;
        }

        return 0;
    }
}
