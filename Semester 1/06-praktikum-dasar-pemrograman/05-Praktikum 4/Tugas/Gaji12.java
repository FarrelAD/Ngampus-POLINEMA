import java.util.Scanner;
public class Gaji12 {
    public static void main(String[] args) {
        Scanner input12 =new Scanner(System.in);
        
        // Deklarsi variabel
        int jmlmasuk, jmltdkMasuk, totGaji;
        int gaji = 40000, potGaji = 25000;

        // Input jumlah hari masuk kerja 
        System.out.println("Masukakn Jumlah Hari Masuk Kerja Anda ");
        jmlmasuk = input12.nextInt();

        // Input jumlah hari tidak masuk kerja
        System.out.println("Masukakn Jumlah Hari Tidak Masuk Kerja Anda ");
        jmltdkMasuk = input12.nextInt();

        // Perhitungan total gaji
        totGaji= (jmlmasuk * gaji) - (jmltdkMasuk * potGaji);

        // Menampilkan output berupa total gaji yang diterima
        System.out.println("gaji yang anda terima adalah " + totGaji);
    }
}