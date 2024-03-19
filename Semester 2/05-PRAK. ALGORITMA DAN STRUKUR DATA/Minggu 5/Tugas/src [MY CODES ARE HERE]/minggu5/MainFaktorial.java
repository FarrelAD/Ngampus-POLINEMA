package minggu5;

import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=========================");
        System.out.print("Masukkan jumlah elemen: ");
        int iJml = sc.nextInt();


        // Membuat array of object
        Faktorial fk [] = new Faktorial[10];
        for (int i = 0; i < iJml; i++) {
            fk[i] = new Faktorial();
            System.out.printf("\nMasukkan nilai data ke-%d: ", (i + 1));
            fk[i].nilai = sc.nextInt();
        }

        // Menampilkan hasil pemanggilan method faktorialDC() dan faktorialBF()
        System.out.println("HASIL -- BRUTE FORCE");
        for (int i = 0; i < iJml; i++) {
            System.out.println(
                "Hasil perhitungan faktorial menggunakan Brute Force adalah: " + 
                fk[i].faktorialBF(fk[i].nilai)
            );
        }

        System.out.println("\nHASIL -- DIVIDE AND CONQUER");
        for (int i = 0; i < iJml; i++) {
            System.out.println(
                "Hasil perhitungan faktorial menggunakan Divide and Conquer adalah: " +
                fk[i].faktorialDC(fk[i].nilai)
            );
        }
    }
}
