package belajar4;

public class Main {
    public static void main(String[] args) {
        Buah bb = new Buah();
        Apel a = new Apel();
        Pisang b = new Pisang();
        Manusia mmm = new Manusia();

        mmm.makanBuah(b);
        System.out.println("\n");
        mmm.makanBuah(a);
    }
}
