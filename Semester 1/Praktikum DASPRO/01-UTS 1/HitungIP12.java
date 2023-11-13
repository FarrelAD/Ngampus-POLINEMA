import java.util.Scanner;

public class HitungIP12 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        // Deklarasi variabel
        String nama_mhs, nama_matkul, nilai, input_ulang = "Y";
        int sks = 0, matkulPerluPerbaikan = 0, counter=0;
        double total_nilai_angka = 0, total_sks = 0, nilai_angka, ip;

        System.out.print("Masukkan nama mahasiswa: ");
        nama_mhs = scan1.nextLine();

        // Memulai proses looping dengan apabila input_ulang bernilai "Y", maka prosesnya akan terus berlanjut
        while (input_ulang.equalsIgnoreCase("Y")) {
            System.out.print("Nama mata kuliah: ");
            nama_matkul = scan2.nextLine();
            System.out.print("Nilai (A, B, C, D, E): ");
            nilai = scan2.nextLine();
            
            // Proses konversi nilai dari huruf ke angka
            if (nilai.equals("A")) {
                nilai_angka = 4.0;
            } else if (nilai.equals("B") || (nilai.equalsIgnoreCase("B+"))) {
                nilai_angka = 3.0;
            } else if (nilai.equals("C")) {
                nilai_angka = 2.0;
            } else if (nilai.equals("D")) {
                nilai_angka = 1.0;
                matkulPerluPerbaikan++; //penambahan pada variabel matkulperlu perbaikan
            } else if (nilai.equals("E")) {
                nilai_angka = 0.0;
                matkulPerluPerbaikan++; //penambahan pada variabel matkulperlu perbaikan
            } else {
                System.out.println("Nilai tidak valid. Mohon masukkan nilai yang valid."); //Apabila user input di luar A, B, C, D, atau E maka akan diarahkan ke sini
                continue;
            }

            System.out.print("Masukkan jumlah SKS: ");
            sks = scan1.nextInt();

            // Penghitungan nilai dan SKS
            total_nilai_angka += (nilai_angka * sks);
            total_sks += sks;

            System.out.print("Apakah lanjut input nilai? (Y/N): ");
            input_ulang = scan1.next();
            counter++;
        }

        // Penghitungan IP
        ip = (counter * total_nilai_angka) / (counter * sks);

        // Menampilkan hasil
        System.out.println("-----------------Hasil Perhitungan IP-----------------");
        System.out.println("Nama: " + nama_mhs);
        System.out.println("Indeks Prestasi (IP): " + ip);
        System.out.println("Jumlah mata kuliah: " + counter);
        System.out.println("Jumlah SKS: " + total_sks);
        System.out.println("Jumlah mata kuliah yang harus diperbaiki: " + matkulPerluPerbaikan);
        System.out.println("------------------------------------------------------");

        scan1.close();
    }
}

