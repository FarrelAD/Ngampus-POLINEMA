package ArrayObjects;

public class ExperimenKonstruktor {
    int panjang, lebar, sisi, sisiA, sisiB, tinggi;
    public ExperimenKonstruktor() {

    }

    public ExperimenKonstruktor(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public ExperimenKonstruktor(int sisi) {
        this.sisi = sisi;
    }

    public ExperimenKonstruktor(int sisiA, int sisiB, int tinggi) {
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.tinggi = tinggi;
    }
    public static void main(String[] args) {
        ExperimenKonstruktor pp1 = new ExperimenKonstruktor(20, 10);
        ExperimenKonstruktor pg1 = new ExperimenKonstruktor(5);
        ExperimenKonstruktor tr1 = new ExperimenKonstruktor(12, 8, 7);

        System.out.println("Panjang sisi pp1: " + pp1.panjang);
        System.out.println("Lebar sisi pp1: " + pp1.lebar);
        System.out.println("===================================");
        System.out.println("Sisi persegi pg1: " + pg1.sisi);
        System.out.println("===================================");
        System.out.println("Sisi a tr1: " + tr1.sisiA);
        System.out.println("Sisi b tr1: " + tr1.sisiB);
        System.out.println("Tinggi : " + tr1.tinggi);
    }
}
