import java.util.Scanner;
public class Percobaan6_12 {
    /* public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);
    
        int p, l, t, L, vol;

        System.out.println("Masukkan panjang: ");
        p = input12.nextInt();
        System.out.println("Masukkan lebar: ");
        l = input12.nextInt();
        System.out.println("Masukkan tinggi: ");
        t = input12.nextInt();

        L = p * l; 
        System.out.println("Luas persegi panjang adalah " + L);

        vol = p * l * t;
        System.out.println("Volume balok adalah: " + vol);
    } */
    static int hitungLuas (int pjg, int lb) {
        int Luas = pjg * lb;
        return Luas;
    }
    static int hitungVolume (int tinggi, int a, int b) {
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
    }
    public static void main(String[] args) {
        Scanner input12 = new Scanner (System.in);
        int p, l, t, L, vol;
        System.out.println("Masukkan panjang: ");
        p = input12.nextInt();
        System.out.println("Masukkan lebar: ");
        l = input12.nextInt();
        System.out.println("Masukkan tinggi: ");
        t = input12.nextInt();

        L = hitungLuas(p, l);
        System.out.println("Luas persegi panjang adalah " + L);
        vol = hitungVolume(t, p, l);
        System.out.println("Volume balok adalah " + vol);
    }
    
    
}
