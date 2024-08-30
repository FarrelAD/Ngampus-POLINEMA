import java.util.Scanner;

public class Mahasiswa1_12 {
    // Deklarasi array 2 dimensi untuk menyimpan nilai mahasiswa
    static int[][] dataMahasiswa = new int[5][7];
    static String[] namaMahasiswa = new String[5];
    static int mingguTertinggi = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String enter;

        // Input data nilai mahasiswa
        inputDataNilai(scanner);
        System.out.println("Enter untuk melanjutkan --> ");
        enter = scanner.nextLine();

        // Menampilkan seluruh nilai mahasiswa
        tampilkandataMahasiswa();
        System.out.println("Enter untuk melanjutkan --> ");
        enter = scanner.nextLine();

        // Mencari minggu dengan nilai tertinggi
        mingguTertinggi = cariMingguTertinggi() + 1;
        System.out.println("Enter untuk melanjutkan --> ");
        enter = scanner.nextLine();

        // Cari dan tampil mahasiswa dengan nilai tertinggi
        cariMahasiswaNilaiTertinggi();
        System.out.println("Enter untuk melanjutkan --> ");
        enter = scanner.nextLine();

        scanner.close();
    }

    // Fungsi untuk menginputkan data nilai mahasiswa
    public static void inputDataNilai(Scanner scanner) {
        System.out.println("--!!INPUT NILAI MAHASISWA!!--");
        for (int i = 0; i < namaMahasiswa.length; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            namaMahasiswa[i] = scanner.nextLine();

            for (int j = 0; j < dataMahasiswa[1].length; j++) {
                System.out.print("Masukkan nilai tugas minggu ke-" + (j + 1) + " untuk " + namaMahasiswa[i] + ": ");
                dataMahasiswa[i][j] = scanner.nextInt();
            }
            scanner.nextLine();
        }
    }

    // Fungsi untuk menampilkan seluruh nilai mahasiswa
    public static void tampilkandataMahasiswa() {
        System.out.println("--!!TAMPILKAN NILAI MAHASISWA!!--");
        for (int i = 0; i < namaMahasiswa.length; i++) {
            System.out.printf("Nama mahasiswa: %s%n", namaMahasiswa[i]);
            for (int j = 0; j < dataMahasiswa[1].length; j++) {
                System.out.printf("Nilai tugas ke-%d : %s %n", (j+1), dataMahasiswa[i][j]);
            }
            System.out.println("-----------------------------------");
            System.out.println("");
        }
    }

    // Mencari hari dengan nilai tertinggi
    public static int cariMingguTertinggi() {
        System.out.println("--!!MINGGU NILAI TERTINGGI!!--");
        int indexMingguTertinggi = 0;
        int nilaiTertinggi = 0;
        for (int i = 0; i < namaMahasiswa.length; i++ ) {
            for (int j = 0; j < dataMahasiswa[1].length; j++) {
                if (dataMahasiswa[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = dataMahasiswa[i][j];
                    indexMingguTertinggi = j;
                }
            }
        }
        System.out.printf("Minggu dengan nilai tertingginya adalah --> %d%n", (indexMingguTertinggi + 1));
        return indexMingguTertinggi;
    }

    // Mencari nilai tertinggi
    public static void cariMahasiswaNilaiTertinggi() {
        System.out.println("--!!MAHASISWA NILAI TERTINGGI!!--");
        int nilaiTertinggi = 0;
        int indexMahasiswa = 0;
        String mahasiswaNilaiTertinggi = null;
        for (int i = 0; i < namaMahasiswa.length; i++) {
            for (int j = 0; j < dataMahasiswa[1].length; j++) {
                if (dataMahasiswa[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = dataMahasiswa[i][j];
                    indexMahasiswa = i;
                }
            }
        }

        for (int i = 0; i < namaMahasiswa.length; i++ ) {
            if (i == indexMahasiswa) {
                mahasiswaNilaiTertinggi = namaMahasiswa[i];
            }
        }

        System.out.printf("Nilai tertinggi dari keseluruhan mahasiswa \t--> %d%n", nilaiTertinggi);
        System.out.printf("Mahasiswa dengan nilai tertinggi \t-->  %s%n", mahasiswaNilaiTertinggi);
        System.out.printf("Didapatkan pada minggu ke \t\t\t--> %d%n", mingguTertinggi);
    }
}