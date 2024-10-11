package src.inheritance.satu;

public class Main {
    public static void main(String[] args) {
        Mahasiswa a = new Mahasiswa("Soleh", "0202020202", "TI-2F");

        System.out.println(a.getNama());
        System.out.println(a.getNim());
        System.out.println(a.getKelas());
    }
}
