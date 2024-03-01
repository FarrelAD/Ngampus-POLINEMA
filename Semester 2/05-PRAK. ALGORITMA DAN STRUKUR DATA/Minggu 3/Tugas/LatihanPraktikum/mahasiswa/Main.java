package LatihanPraktikum.mahasiswa;

import java.util.Scanner;

public class Main {
    static Scanner sc12 = new Scanner(System.in);
    public static void main(String[] args) {
        Mahasiswa12[] dataMahasiswa = new Mahasiswa12[3];

        inputData(dataMahasiswa);

        System.out.println("\n");

        tampilData(dataMahasiswa);

        System.out.println("\n");

        hitungTampilRataRataIpk(dataMahasiswa);

        System.out.println("\n");

        tampilIpkTerbesar(dataMahasiswa);
    }

    private static void inputData(Mahasiswa12[] mhs) {
        for (int i = 0; i < mhs.length; i++) {
            mhs[i] = new Mahasiswa12();
            System.out.printf("Masukkan data mahasiswa ke-%d: \n", (i + 1));
            System.out.print("Masukkan nama: ");
            mhs[i].namaMhs = sc12.nextLine();
            System.out.print("Masukkan NIM: ");
            mhs[i].nimMhs = sc12.nextInt();
            System.out.print("Masukkan jenis kelamin: ");
            mhs[i].jenisKelamin = sc12.next().toUpperCase().charAt(0);
            System.out.print("Masukkan IPK: ");
            mhs[i].ipk = sc12.nextFloat();
            sc12.nextLine();
        }
    }

    private static void tampilData(Mahasiswa12[] mhs) {
        int i = 1;
        for (Mahasiswa12 data : mhs) {
            System.out.println("Data mahasiswa ke-" + i);
            System.out.println("Nama: " + data.namaMhs);
            System.out.println("NIM: " + data.nimMhs);
            System.out.println("Jenis kelamin: " + data.jenisKelamin);
            System.out.println("Nilai IPK: " + data.ipk);
            i++;
        }
    }

    private static void hitungTampilRataRataIpk(Mahasiswa12[] mhs) {
        float jumlahIpk = 0;
        for (Mahasiswa12 data : mhs) {
            jumlahIpk += data.ipk;
        }
        float rataRata = jumlahIpk / mhs.length;

        System.out.println("Nilai rata-rata: " + rataRata);
    }

    private static void tampilIpkTerbesar(Mahasiswa12[] mhs) {
        float temp, max_ipk = 0;
        int indexMhsMaxIpk = 0;
        for (int i = 0; i < mhs.length; i++) {
            if (i == 0) {
                max_ipk = mhs[i].ipk;
                indexMhsMaxIpk = i;
            } else {
                temp = mhs[i].ipk;
                if (temp > max_ipk) {
                    max_ipk = temp;
                    indexMhsMaxIpk = i;
                }
            }
        }

        System.out.println("Nilai IPK tertinggi: " + max_ipk);
        System.out.println("Mahasiswa nilai tertinggi: " + mhs[indexMhsMaxIpk].namaMhs);
    }
}
