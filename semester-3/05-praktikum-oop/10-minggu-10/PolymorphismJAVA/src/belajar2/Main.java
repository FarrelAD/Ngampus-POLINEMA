package belajar2;

public class Main {
    public static void main(String[] args) {
        MobilMewah lambo = new MobilMewah();
        MobilKuno kijang = new MobilKuno();
        GasStation pertamina = new GasStation();

        pertamina.isiBahanBakar(kijang);
        pertamina.isiBahanBakar(lambo);
    }
}
