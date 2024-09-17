package ArrayBalok;

public class ArrayBalok12 {
    public static void main(String[] args) {
        Balok12[] blArray = new Balok12[3];

        // Mengisi nilai array
        blArray[0] = new Balok12(100, 30, 12);
        blArray[1] = new Balok12(120, 40, 15);
        blArray[2] = new Balok12(210, 50, 25);

        // Menampilkan seluruh nilai pada blArray
        for (int i = 0; i < 3; i++) {
            System.out.println("Volume balok ke-"+ (i+1) + ": " + blArray[i].hitungVolume());
        }
    }
}
