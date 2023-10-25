import java.util.Scanner;

public class WhileGaji12 {
    public static void main(String[] args) {
        Scanner scan12 = new Scanner(System.in);

        // Deklarasi variabel int, double, String
        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur = 0, totalGajiLembur = 0;
        String jabatan;

        // Proses input 'Jumlah Karyawan'
        System.out.print("Masukkan jumlah karyawan: ");
        jumlahKaryawan = scan12.nextInt();

        // Proses operasi looping menggunakan while
        int i = 0;
        while (i < jumlahKaryawan) {
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
            System.out.print("Masukkan jabatan karyawan ke-" + (i + 1) + ": ");
            jabatan = scan12.next();
            System.out.print("Masukkan jumlah jam lembur: ");
            jumlahJamLembur = scan12.nextInt();

            // Logika pemilihan di dalam while terkait jabatan yang dipilih
            if (jabatan.equalsIgnoreCase("direktur")) {
                // Tidak ada gaji lembur untuk direktur
            } else if (jabatan.equalsIgnoreCase("manajer")) {
                gajiLembur = jumlahJamLembur * 100000;
            } else if (jabatan.equalsIgnoreCase("karyawan")) {
                gajiLembur = jumlahJamLembur * 75000;
            } else {
                System.out.println("Jabatan Invalid");
                continue; // Mengulangi lagi ke tahap input jenis karyawan
            }

            // Proses penghitungan 'Gaji Lembur'
            totalGajiLembur += gajiLembur;

            i++; // Perlu menginkrementasi i untuk menghindari loop tak terbatas
        }

        // Menampilkan hasil perhitungan jumlah gaji
        System.out.println("Total gaji lembur: " + totalGajiLembur);
    }
}
