import java.util.Scanner;

public class Arrray_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Deklarasi variabel
        String[] namaMatkul = new String[8];
        int[] bobotSks = new int[namaMatkul.length];
        int totalSks = 0;
        int[] nilaiAngka = new int[namaMatkul.length];
        String[] nilaiHuruf = new String[namaMatkul.length];
        double[] nilaiSetara = new double[namaMatkul.length];

        // Pengguna input nilai
        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        // Input nama mata kuliah
        System.out.println("\n==============================");
        System.out.println("Masukkan nama mata kuliah!");
        System.out.println("==============================");
        for (int i = 0; i < namaMatkul.length; i++) {
            System.out.printf("Mata kuliah ke-%d : ", i+1);
            namaMatkul[i] = scan.nextLine();
        }
        
        // Input bobot SKS tiap matkul
        System.out.println("\n==============================");
        System.out.println("Masukkan bobot SKS tiap matkul!");
        System.out.println("==============================");
        for (int i = 0; i < namaMatkul.length; i++) {
            System.out.print(namaMatkul[i] + " : ");
            bobotSks[i] = scan.nextInt();
            totalSks += bobotSks[i];
        }

        // Input nilai huruf tiap matkul
        System.out.println("\n==============================");
        System.out.println("Masukkan nilai angka!");
        System.out.println("==============================");
        for (int i = 0; i < namaMatkul.length; i++) {
            System.out.print(namaMatkul[i] + " : ");
            nilaiAngka[i] = scan.nextInt();
        }

        // Proses konversi nilai
        for (int i = 0; i < nilaiAngka.length; i++) {
            if (nilaiAngka[i] > 80) {
                nilaiHuruf[i] = "A";
                nilaiSetara[i] = 4;
            } else if (nilaiAngka[i] > 73) {
                nilaiHuruf[i] = "B+";
                nilaiSetara[i] = 3.5;
            } else if (nilaiAngka[i] > 65) {
                nilaiHuruf[i] = "B";
                nilaiSetara[i] = 3;
            } else if (nilaiAngka[i] > 60) {
                nilaiHuruf[i] = "C+";
                nilaiSetara[i] = 2.5;
            } else if (nilaiAngka[i] > 50) {
                nilaiHuruf[i] = "C";
                nilaiSetara[i] = 2;
            } else if (nilaiAngka[i] > 39) {
                nilaiHuruf[i] = "D";
                nilaiSetara[i] = 1;
            } else {
                nilaiHuruf[i] = "E";
                nilaiSetara[i] = 0;
            }
        }

        // Menghitung nilai IP 
        float totalIp = 0;
        for (int i = 0; i < nilaiSetara.length; i++) {
            totalIp += (nilaiSetara[i] * bobotSks[i]);
        }

        float nilaiIp = totalIp / totalSks;
        String nilaiIpString = String.format("%.2f", nilaiIp);

        System.out.println("\n==============================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("==============================");
        System.out.println("MK\t\t\t\t\tNilai Angka\t\tNilai Huruf\t\tBobot Nilai");
        System.out.println("Pancasila\t\t\t\t"+nilaiAngka[0]+"\t\t\t"+nilaiHuruf[0]+"\t\t\t"+nilaiSetara[0]);
        System.out.println("Konsep Teknologi Informasi\t\t"+nilaiAngka[1]+"\t\t\t"+nilaiHuruf[1]+"\t\t\t"+nilaiSetara[1]);
        System.out.println("Critical Thinking dan Problem Solving\t"+nilaiAngka[2]+"\t\t\t"+nilaiHuruf[2]+"\t\t\t"+nilaiSetara[2]);
        System.out.println("Matematika Dasar\t\t\t"+nilaiAngka[3]+"\t\t\t"+nilaiHuruf[3]+"\t\t\t"+nilaiSetara[3]);
        System.out.println("Bahasa Inggris\t\t\t\t"+nilaiAngka[4]+"\t\t\t"+nilaiHuruf[4]+"\t\t\t"+nilaiSetara[4]);
        System.out.println("Dasar Pemrograman\t\t\t"+nilaiAngka[5]+"\t\t\t"+nilaiHuruf[5]+"\t\t\t"+nilaiSetara[5]);
        System.out.println("Praktikum Dasar Pemrograman\t\t"+nilaiAngka[6]+"\t\t\t"+nilaiHuruf[6]+"\t\t\t"+nilaiSetara[6]);
        System.out.println("Keselamatan dan Kesehatan Kerja\t\t"+nilaiAngka[7]+"\t\t\t"+nilaiHuruf[7]+"\t\t\t"+nilaiSetara[7]);
        System.out.println("==============================");
        System.out.println("IP : " + nilaiIpString);
    }
}