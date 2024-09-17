package minggu5;

import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Proses input
        // Input jumlah perusahaan
        System.out.print(
            "===================================\n" + 
            "Program Menghitung Keuntungan Total\n" +    
            "Masukkan jumlah perusahaan: "
        );
        int jmlPerusahaan = sc.nextInt();

        // Input jumlah bulan
        System.out.print("===================================\n");
        Sum[] sm = new Sum[jmlPerusahaan];
        for (int i = 0; i < sm.length; i++) {
            sm[i] = new Sum();
            System.out.print(
                "PERUSAHAAN KE-" + (i + 1) + "\n" +
                "Masukkan jumlah bulan: "
            );
            sm[i].elemen= sc.nextInt();
            sm[i].keuntungan = new double[sm[i].elemen];
            for (int j = 0; j < sm[i].elemen; j++) {
                System.out.print("Masukkan jumlah keuntungan: ");
                sm[i].keuntungan[j] = sc.nextDouble();
            }
        }

        // Versi baru
        // Proses output
        System.out.print("===================================\n");
        for (int i = 0; i < sm.length; i++) {
            System.out.println(
                "PERUSAHAAN KE-" + (i + 1) + "\n" +
                "   - Jumlah bulan\t\t: " + sm[i].elemen + "\n" +
                "   - Total Keuntungan: (BRUTE FORCE)\t " + sm[i].totalBF(sm[i].keuntungan) + "\n" +
                "   - Total Keuntungan: (DIVIDE CONQUER)\t " + sm[i].totalDC(sm[i].keuntungan, 0, sm[i].elemen - 1) + "\n"
            );
        }

        // Versi lama
        // // Input jumlah keuntungan
        // System.out.println(
        //     "\n===================================\n" +
        //     "(Satuan juta. Bisa berupa bilangan desimal. Misal input 5.7; 78.5)"
        // );
        // for (int i = 0; i < jmlPerusahaan; i++) {
        //     System.out.printf("Perusahaan [%d]\n", i);
        //     for (int j = 0; j < sm.elemen; j++) {
        //         System.out.print("Masukkan untung bulan ke-"+(i+1)+" = ");
        //         sm.keuntungan[i][j] = sc.nextDouble();
        //     }
        // }

        // // Proses output
        // System.out.println(
        //     "\n===================================\n" +
        //     "Algoritma Brute Force\n" +
        //     "Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = " + sm.totalBF(sm.keuntungan) + "\n" +
        //     "===================================\n" +
        //     "Algoritma Divide Conquer\n" +
        //     "Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = " + sm.totalDC(sm.keuntungan, 0, sm.elemen -1)
        // );
    }
}
