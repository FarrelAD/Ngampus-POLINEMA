import java.util.Scanner;

public class Pemilihan_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nilaiHuruf;
        double nilaiAngka;

        // Pengguna input nilai
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        System.out.print("Masukkan nilai tugas: ");
        int nilaiTugas = scan.nextInt();
        System.out.print("Masukkan nilai kuis: ");
        int nilaiKuis = scan.nextInt();
        System.out.print("Masukkan nilai UTS: ");
        int nilaiUts = scan.nextInt();
        System.out.print("Masukkan nilai UAS: ");
        int nilaiUas = scan.nextInt();
        System.out.println("==============================");
        
        // Menghitung total nilai keseluruhan
        nilaiAngka = (0.2 * nilaiTugas) + (0.2 * nilaiKuis) + (0.3 * nilaiUts) + (0.3 * nilaiUas);

        // Memberikan nilai huruf dan angka dari akumulasi seluruh nilai
        if (nilaiTugas > 100 || nilaiKuis > 100 || nilaiUts > 100 || nilaiUas > 100 || nilaiTugas < 0 || nilaiKuis < 0 || nilaiUts < 0 || nilaiUas < 0) {
            System.out.println("==============================");
            System.out.println("NILAI TIDAK VALID !!");
            System.out.println("==============================");
        } else {
            // Menentukan nilai huruf
            if (nilaiAngka > 80) {
                nilaiHuruf = "A";
            } else if (nilaiAngka > 73) {
                nilaiHuruf = "B+";
            } else if (nilaiAngka > 65) {
                nilaiHuruf = "B";
            } else if (nilaiAngka > 60) {
                nilaiHuruf = "C+";
            } else if (nilaiAngka > 50) {
                nilaiHuruf = "C";
            } else if (nilaiAngka > 39) {
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
            }

            System.out.println("Nilai akhir: " + nilaiAngka);
            System.out.println("Nilai huruf: " + nilaiHuruf);

            // Menentukan lulus tidaknya mahasiswa
            if (nilaiHuruf.equals("D") || nilaiHuruf.equals("E")) {
                System.out.println("==============================");
                System.out.println("ANDA TIDAK LULUS!!");
                System.out.println("==============================");
            } else {
                System.out.println("==============================");
                System.out.println("SELAMAT ANDA TELAH LULUS!");
                System.out.println("==============================");
            }
        }
    }
}