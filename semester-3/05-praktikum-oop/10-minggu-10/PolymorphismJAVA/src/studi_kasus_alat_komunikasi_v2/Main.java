package studi_kasus_alat_komunikasi_v2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<PerangkatElektronik> kumpulanPerangkatElektronik = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        HP xiaomiA = new HP("Xiaomi", "Redmi 9", 1.3f, 5.3f, "Android", 64);
        HP oppoA = new HP("Oppo", "Reno 5", 1.1f, 5.1f, "Android", 16);
        HP appleA = new HP("Apple", "19 Pro", 1.3f, 5.2f, "Apple", 24);
        Laptop asusA = new Laptop("Asus", "ROG", 5.1f, 16.4f, "Linux", "Full size", 512, 16);
        Laptop lenovoA = new Laptop("Lenovo", "LOQ", 6.1f, 15.8f, "Windows", "Full size", 512, 8);

        kumpulanPerangkatElektronik.add(xiaomiA);
        kumpulanPerangkatElektronik.add(oppoA);
        kumpulanPerangkatElektronik.add(appleA);
        kumpulanPerangkatElektronik.add(asusA);
        kumpulanPerangkatElektronik.add(lenovoA);

        System.out.printf("Apakah perangkat lebih dari 3kg? ");
        char lebihDari3Kg = sc.next().charAt(0);
        sc.nextLine();

        if (lebihDari3Kg == 'y') {
            System.out.println("Perangkat anda termasuk laptop");
        } else {
            System.out.println("Perangkat anda termasuk HP");
        }

        System.out.print("Masukkan minimum layar: ");
        float minimumLayar = sc.nextFloat();
        sc.nextLine();

        System.out.print("Masukkan merk: ");
        String merk = sc.nextLine();

        System.out.print("Masukkan sistem operasi: ");
        String sistemOperasi = sc.nextLine();

        for (PerangkatElektronik perangkat : kumpulanPerangkatElektronik) {
            if (lebihDari3Kg == 'y') {
                if (perangkat.berat > 3 &&
                    perangkat.ukuranLayar >= minimumLayar &&
                    perangkat.merk.equals(merk) &&
                    perangkat.sistemOperasi.equals(sistemOperasi)) {
                    Laptop laptop = (Laptop) perangkat;
                    laptop.cetakInfoPerangkat();
                    break;
                }
            } else {
                if (perangkat.berat < 3 &&
                    perangkat.ukuranLayar >= minimumLayar &&
                    perangkat.merk.equals(merk) &&
                    perangkat.sistemOperasi.equals(sistemOperasi)) {
                    HP hp = (HP) perangkat;
                    hp.cetakInfoPerangkat();
                    break;
                }
            }
        }

        sc.close();
    }
}
