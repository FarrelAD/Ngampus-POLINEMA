import java.util.Scanner;
public class Individu1_12 {
    public static void main(String[] args) {
    Scanner sc12 = new Scanner (System.in);

    int jumlahMahasiswa = 30;
    String namaMahasiswa;
    String jenisKelamin;
    int i = 0;

    do {
        System.out.print("Masukkan nama mahasiswa ke " + (i+1) + " ");
        namaMahasiswa = sc12.nextLine();
        System.out.print("Masukkan jenis kelamin (L/P) mahasiswa ke " + (i+1) + " ");
        jenisKelamin = sc12.nextLine();
        if (jenisKelamin.equalsIgnoreCase("P")) {
            System.out.println("Mahasiswa perempuan dengan nama " + namaMahasiswa);
        }
        i++;
    } while (i < jumlahMahasiswa);

    }
}
