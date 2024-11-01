package studi_kasus_alat_komunikasi;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<AlatKomunikasi> kumpulanPerangkat = new ArrayList<>();
    static ArrayList<AlatKomunikasi> kumpulanPerangkat2 = new ArrayList<>();

    public static void main(String[] args) {
        // Data awal
        // HP ab = new HP("Xiaomi", 1.2f, 5.3f, 32, "ABCD");
        // HP ac = new HP("Oppo", 1.5f, 6f, 16, "A123");
        // Laptop bb = new Laptop("Asus", 4.1f, 15.3f, "75% layout", "ABAB", 128, 8);

        // kumpulanPerangkat.add(ab);
        // kumpulanPerangkat.add(ac);
        // kumpulanPerangkat.add(bb);


        // Dataset
        HP xiaomiA = new HP("Xiaomi", "AAA", 1.5f, 6.1f, 12, "A999", "Android");
        HP oppoA = new HP("Oppo", "AKA", 1.2f, 5.5f, 25, "111P", "Android");
        HP xiaomiB = new HP("Xiaomi", "CKCK", 1.7f, 6.0f, 64, "AMAM", "Android");
        HP appleA = new HP("Apple", "19 Pro", 1.1f, 5.3f, 34, "AJAJ", "iOS");
        Laptop asusA = new Laptop("Asus", "ROG", 5, 17.1f, "Full size", "APP1", "Windows", 512, 8);
        Laptop asusB = new Laptop("Asus", "TUF", 4.6f, 16.5f, "75%", "ABCD", "Windows", 256, 32);


        kumpulanPerangkat2.add(xiaomiA);
        kumpulanPerangkat2.add(oppoA);
        kumpulanPerangkat2.add(xiaomiB);
        kumpulanPerangkat2.add(appleA);
        kumpulanPerangkat2.add(asusA);
        kumpulanPerangkat2.add(asusB);

        int pilihanMenu = 1;
        System.out.println(
        """
        Menu
        ===================
        1. Lihat daftar perangkat
        2. Cek perangkat
        3. Cek perangkat lain
        4. Buka perangkat
        5. Upgrade spesifikasi laptop
        9. Berhenti
        >>> 
        """
        );

        while (pilihanMenu > 0 && pilihanMenu < 6 && pilihanMenu != 9) {
            pilihanMenu = sc.nextInt();
            sc.nextLine();
            switch (pilihanMenu) {
                case 1:
                    lihatDaftarPerangkat();
                    break;
                case 2:
                    cekPerangkat();
                    break;
                case 3:
                    cekPerangkatLain();
                    break;
                case 4:
                    bukaKunciPerangkat();
                    break;
                case 5:
                    upgradeSpesifikasiLaptop();
                    break;
                case 9:
                    System.out.println("Program berhenti!");
                    System.exit(0);
                    break;
                default:
                    break;
            }

            System.out.println(
            """
            \nMenu
            ===================
            1. Lihat daftar perangkat
            2. Cek perangkat
            3. Cek perangkat lain
            4. Buka perangkat
            5. Upgrade spesifikasi laptop
            9. Berhenti
            >>> """
            );
        }
    }

    private static void lihatDaftarPerangkat() {
        for (int i = 0; i < kumpulanPerangkat2.size(); i++) {
            System.out.print("\n["+i+"] ");
            kumpulanPerangkat2.get(i).cetakInfoPerangkat();
        }
    }

    private static void cekPerangkat() {
        System.out.print("Masukkan indeks perangkat: ");
        int indeksPerangkat = sc.nextInt();
        sc.nextLine();
        if (kumpulanPerangkat.get(indeksPerangkat).berat < 3) {
            System.out.println("Perangkat termasuk ke dalam kategori HP");
        } else {
            System.out.println("Perangkat termasuk ke dalam kategori Laptop");
        }
        
        kumpulanPerangkat.get(indeksPerangkat).cetakInfoPerangkat();
    }

    public static void cekPerangkatLain() {
        System.out.println("Jawab dengan (y/t)");
        System.out.print("Apakah perangkat memiliki berat lebih dari 3kg: ");
        char lebihDari3Kg = sc.next().charAt(0);
        sc.nextLine();

        System.out.print("Sistem operasi: ");
        String sistemOperasi = sc.nextLine();

        System.out.print("Masukkan merk: ");
        String merkPerangkat = sc.nextLine();

        System.out.print("Ukuran layar minimum: ");
        float layarMinimum = sc.nextFloat();
        sc.nextLine();

        String layoutKeyboard = null;
        if (lebihDari3Kg > 't') {
            System.out.print("Layout keyboard: ");
            layoutKeyboard = sc.nextLine();
        }

        if (lebihDari3Kg > 't') {
            for (AlatKomunikasi perangkat : kumpulanPerangkat) {
                if (perangkat instanceof HP) {
                    HP hh = ((HP) perangkat);
                    if (hh.sistemOperasi.equals(sistemOperasi) &&
                        hh.merk.equals(merkPerangkat) &&
                        hh.ukuranLayar >= layarMinimum) {
                        System.out.println("Perangkat ditemukan!");
                        hh.cetakInfoPerangkat();
                        return;
                    }
                }
            }
        } else {
            for (AlatKomunikasi perangkat : kumpulanPerangkat) {
                if (perangkat instanceof Laptop) {
                    Laptop pp = (Laptop) perangkat;
                    if (pp.sistemOperasi.equals(sistemOperasi) &&
                        pp.merk.equals(merkPerangkat) &&
                        pp.ukuranLayar >= layarMinimum &&
                        pp.tipeKeyboard.equals(layoutKeyboard)) {
                        System.out.println("Perangkat laptop ditemukan!");
                        pp.cetakInfoPerangkat();
                        return;
                    }
                }
            }
        }

        System.out.println("Data tidak ditemukan!");
    }

    private static void bukaKunciPerangkat() {
        System.out.print("Masukkan indeks perangkat: ");
        int indeksPerangkat = sc.nextInt();
        sc.nextLine();
        if (kumpulanPerangkat.get(indeksPerangkat) instanceof HP) {
            HP hpDipilih = (HP) kumpulanPerangkat.get(indeksPerangkat);
            System.out.println(
            """
            Opsi buka HP
            1. Face ID
            2. Sandi
            >>> 
            """
            );
            int pilihanMenu = sc.nextInt();
            switch (pilihanMenu) {
                case 1:
                    hpDipilih.bukaKunciPerangkat();
                    break;
                case 2:
                    System.out.print("Masukkan sandi: ");
                    String sandi = sc.nextLine();
                    hpDipilih.bukaKunciPerangkat(sandi);
                    break;
                default:
                    break;
            }
        } else {
            System.out.print("Masukkan sandi: ");
            String sandi = sc.nextLine();
            kumpulanPerangkat.get(indeksPerangkat).bukaKunciPerangkat(sandi);
        }
        
    }

    private static void upgradeSpesifikasiLaptop() {
        System.out.println("Daftar laptop yang tersedia: ");
        for (int i = 0; i < kumpulanPerangkat.size(); i++) {
            if (kumpulanPerangkat.get(i) instanceof Laptop) {
                System.out.print("\n["+i+"] ");
                kumpulanPerangkat.get(i).cetakInfoPerangkat();
            }
        }

        System.out.print("\nPilih indeks laptop: ");
        int indeksPilihan = sc.nextInt();
        Laptop ll = (Laptop) kumpulanPerangkat.get(indeksPilihan);

        System.out.println(
        """
        Pilih opsi upgrade: 
        1. Memory
        2. Memory & disk
        """
        );
        int pilihanUpgrade = sc.nextInt();
        int memoriTambahan;
        switch (pilihanUpgrade) {
            case 1:
                System.out.print("Masukkan kapasitas memori baru: ");
                memoriTambahan = sc.nextInt();
                ll.upgradeSpekLaptop(memoriTambahan);
                break;
            case 2:
                System.out.print("Masukkan kapasitas memori baru: ");
                memoriTambahan = sc.nextInt();
                System.out.print("Masukkan kapasitas disk baru: ");
                int diskTambahan = sc.nextInt();
                ll.upgradeSpekLaptop(memoriTambahan, diskTambahan);
                break;
            default:
                break;
        }
        
    }
}
