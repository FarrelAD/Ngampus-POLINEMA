package jobsheet6;

public class Mahasiswa {
    String nama;
    int thnMasuk, umur;
    double ipk;

    Mahasiswa(String n, int t, int u, double i) {
        nama = n;
        thnMasuk = t;
        umur = u;
        ipk = i;
    }

    void tampil() {
        System.out.println(
            "Nama = " + nama +
            "\nTahun masuk = " + thnMasuk +
            "\nUmur = " + umur + 
            "\nIPK = " + ipk
        );
    }
}