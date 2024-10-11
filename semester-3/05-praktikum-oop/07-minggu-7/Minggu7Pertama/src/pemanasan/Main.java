package src.pemanasan;

public class Main {
    public static void main(String[] args) {
        Makanan sarapan = new Makanan();
        sarapan.setMenu("Pecel");

        Makan a = new Makan("sarapan", sarapan);

        System.out.println(a.getMakanan().getMenu());
    }
}
