import java.util.Scanner; 
public class Lingkaran12 {
    public static void main(String[] args) {
        Scanner input12 =new Scanner(System.in);
        // Deklarasi variabel 
        int r;
        double keliling, luas;
        
        // Proses input panjang jari-jari lingkaran
        System.out.println("Masukkan jari-jari lingkaran");
        r = input12.nextInt();

        // Perhitungan keliling dan luas lingkaran
        // keliling= 2*3.14*r;
        // luas=3.14*r*r;

        // Cara lain perhitungan keliling dan luas lingkaran
        // Nilai phi sudah dideklarasikan
        double phi = 3.14;
        // Perhitungan keliling dan luas lingkaran
        keliling = 2*phi*r;
        luas = phi*r*r;

        // Menampilkan output dari nilai keliling dan luas
        System.out.println(keliling);
        System.out.println(luas);
    
    }
}