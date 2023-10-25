import java.util.Scanner;
public class ArrayNilai12 {
    public static void main(String[] args) {
        Scanner scan12 = new Scanner(System.in);

        // Deklarasi variabel array
        int [] nilaiAkhir = new int [10];
        
        // Proses input variabel array 'nilaiAkhir' oleh pengguna sebanyak 10 nilai
        /* for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nilai akhir ke-" + i + ": ");
            nilaiAkhir[i] = scan12.nextInt();
        } */

        // Modifikasi proses input variabel 'array'
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir ke-"+i+": ");
            nilaiAkhir[i] = scan12.nextInt();
        }

        // Proses penampilan seluruh nilai yang ada di array
        /* for (int i = 0; i < 10; i++) {
            System.out.println("Nilai akhir ke-"+i+" adalah "+nilaiAkhir[i]);
        } */

        // Modifikasi proses penampilan output
        for (int i=0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-"+i+" lulus!");
            } else {
                System.out.println("Mahasiswa ke-"+i+" tidak lulus!");
            }
        }
    }
    
}
