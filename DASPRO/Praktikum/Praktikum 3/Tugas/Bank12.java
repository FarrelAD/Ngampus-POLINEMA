import java.util.Scanner;
public class Bank12 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int jml_tabungan_awal, lama_menabung;
        double prosentase_bunga = 0.02, bunga, jml_tabungan_akhir;

        System.out.println("Masukkan jumlah tabungan awal anda ");
        jml_tabungan_awal = inp.nextInt();

        System.out.println("Masukkan lama menabung anda ");
        lama_menabung = inp.nextInt();

        
        // bunga = lama_menabung*prosentase_bunga*jml_tabungan_awal;
        // jml_tabungan_akhir = bunga+jml_tabungan_awal;
        

        // cara lain selain operasi di atas
        jml_tabungan_akhir = (lama_menabung * prosentase_bunga * jml_tabungan_awal) + jml_tabungan_awal;

        System.out.println("Jumlah tabungan akhir anda adalah " + jml_tabungan_akhir);
        
    }

}
