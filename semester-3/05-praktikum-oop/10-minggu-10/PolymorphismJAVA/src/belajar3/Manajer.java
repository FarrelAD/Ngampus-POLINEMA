package belajar3;

public class Manajer {
    protected String nama;
    protected int gaji;

    public Manajer(String nama, int gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public void naikkanGaji() {
        this.gaji += 1000000;
    }

    public void cetakStatus() {
        System.out.printf(
        """
        \n
        Nama : %s
        Gaji : %d
        """,
        this.nama,
        this.gaji);
    }
}
