package belajar3;

public class Main {
    public static void main(String[] args) {
        Manajer mm = new Manajer("Bejo", 12000000);
        Supervisor sv = new Supervisor("Arhan", 23000000);

        mm.cetakStatus();
        sv.cetakStatus();

        mm.naikkanGaji();
        sv.naikkanGaji();

        mm.cetakStatus();
        sv.cetakStatus();
    }
}
