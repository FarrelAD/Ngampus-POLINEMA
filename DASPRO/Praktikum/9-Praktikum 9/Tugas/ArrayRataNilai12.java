import java.util.Scanner;
public class ArrayRataNilai12 {
    public static void main(String[] args) {
        Scanner scan12 = new Scanner(System.in);
        // Deklarasi variabel array
        int[] nilaiMhs;
        // Deklarasi variabel double
        double total = 0, rata2, rataLulus = 0, rataTdkLulus = 0;
        int mhsLulus = 0, jmlMhs = 0;
        // Input jumlah mahasiswa yang akan menentukan jumlah perulangan selanjutnya
        System.out.print("Masukkan jumlah mahasiswa: ");
        jmlMhs = scan12.nextInt();
        // Inisialisasi array sesuai dengan jumlah mahasiswa
        nilaiMhs = new int[jmlMhs];
        // Proses input variabel array dari pengguna
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = scan12.nextInt();
        }
        // Proses menghitung jumlah keseluruhan nilai dalam array 'nilaiMhs'
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }

        // Proses menghitung rata-rata nilai mahasiswa yang telah diinpu
        rata2 = total / nilaiMhs.length;
        System.out.println("Rata-rata nilai = "+rata2);

        // Proses penghitungan jumlah mahasiswa yang lulus apabila nilainya lebih dari 70
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                mhsLulus++;
                rataLulus += nilaiMhs[i];
            } else {
                rataTdkLulus += nilaiMhs[i];
            }
        }

        // Menampilkan jumlah mahasiswa yang lulus
        System.out.println("Banyak mahasiswa yang lulus: "+mhsLulus);

        // Menghitung rata-rata nilai mahasiswa yang lulus
        if (mhsLulus > 0) {
            rataLulus /= mhsLulus;
        }

        // Menghitung rata-rata nilai mahasiswa yang tidak lulus
        int mhsTdkLulus = nilaiMhs.length - mhsLulus;
        if (mhsTdkLulus > 0) {
            rataTdkLulus /= mhsTdkLulus;
        }

        // Menampilkan rata-rata nilai mahasiswa yang lulus dan yang tidak lulus
        System.out.println("Rata-rata nilai mahasiswa yang lulus: "+rataLulus);
        System.out.println("Rata-rata nilai mahasiswa yang tidak lulus: "+rataTdkLulus);
    }
}
