package ArrayBalok;

public class Segitiga12 {
    int alas, tinggi, luas;
    double sisiMiring, keliling;

    public Segitiga12(int a, int t) {
        alas = a;
        tinggi = t;
    }

    // Perhitungan ini dengan asumsi segitiga siku-siku
    public int hitungLuas() {
        luas = (alas * tinggi) / 2;
        return luas;
    }

    public double hitungKeliling() {
        sisiMiring = Math.sqrt((alas * alas) + (tinggi * tinggi));
        keliling = alas + sisiMiring + tinggi;
        return keliling;
    }

    public static void main(String[] args) {
        Segitiga12[] sgArray = new Segitiga12[4];

        sgArray[0] = new Segitiga12(10, 4);
        sgArray[1] = new Segitiga12(20, 10);
        sgArray[2] = new Segitiga12(15, 6);
        sgArray[3] = new Segitiga12(25, 10);

        // Mencetak luas dari objek yang dibuat
        for (int i = 0; i < sgArray.length; i++) {
            System.out.printf("Luas segitiga ke-%d: %d\n", (i + 1), sgArray[i].hitungLuas());
        }

        // Mencetak keliling dari objek yang dibuat
        for (int i = 0; i < sgArray.length; i++) {
            System.out.printf("Keliling segitiga ke-%d: %.2f\n", (i + 1), sgArray[i].hitungKeliling());
        }
    }
}
