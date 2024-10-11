package src.inheritance.dua.soal;

public class Main {
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang();
        pp.panjang = 12;
        pp.lebar = 5;
        Lingkaran ll = new Lingkaran();
        ll.r = 20;
        Segitiga ss = new Segitiga();
        ss.alas = 6;
        ss.tinggi = 8;

        System.out.println("Luas persegi panjang: " + pp.luas());
        System.out.println("Keliling persegi panjang: " + pp.keliling());

        System.out.println("\n");

        System.out.println("Luas lingkaran: " + ll.luas());
        System.out.println("Keliling lingkaran: " + ll.keliling());

        System.out.println("\n");

        System.out.println("Luas segitiga: " + ss.luas());
        System.out.println("Keliling segitiga: " + ss.keliling());
    }
}
