import java.util.Scanner;

public class Mahasiswa_12 {
    static String[][] dataMahasiswa = new String[8][5];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        InputData();
        System.out.println("Enter untuk melanjutkan --> ");
        scanner.nextLine();
        TampilNilai();
        System.out.println("Enter untuk melanjutkan --> ");
        scanner.nextLine();
        TampilNilaiTertinggi();
    }

    public static void InputData() {
        System.out.println("--!!INPUT NILAI MAHASISWA!!--");

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Masukkan jumlah tugas: ");
        int jumlahTugas = scanner.nextInt();
        scanner.nextLine(); 

        dataMahasiswa = new String[jumlahTugas + 1][jumlahMahasiswa];

        for (int i = 0; i < dataMahasiswa[0].length; i++) {
            System.out.println("-----------------------------------");
            System.out.print("Nama mahasiswa: ");
            dataMahasiswa[0][i] = scanner.nextLine();
            for (int j = 1; j <= jumlahTugas; j++) {
                System.out.printf("Nilai tugas ke-%d : ", j);
                dataMahasiswa[j][i] = scanner.nextLine();
            }
        }
        System.out.println("");
    }

    public static void TampilNilai() {
        System.out.println("--!!TAMPILKAN NILAI MAHASISWA!!--");
        for (int i = 0; i < dataMahasiswa[0].length; i++) {
            System.out.println("-----------------------------------");
            System.out.println(dataMahasiswa[0][i]);
            System.out.println("");
            for (int j = 1; j < dataMahasiswa.length; j++) {
                System.out.printf("Nilai tugas ke-%d : %s%n", j, dataMahasiswa[j][i]);
            }
        }
    }

    public static String[] CariNilaiTertinggi() {
        // System.out.println("--!!CARI NILAI TERTINGGI MAHASISWA!!--");

        String mahasiswaTertinggi = "";
        int nilaiTertinggi = Integer.MIN_VALUE;
        int mingguTertinggi = -1;

        for (int i = 0; i < dataMahasiswa[0].length; i++) {
            int totalNilai = 0;

            for (int j = 1; j < dataMahasiswa.length; j++) {
                int nilai;
                try {
                    nilai = Integer.parseInt(dataMahasiswa[j][i]);
                } catch (NumberFormatException e) {
                    System.out.println("Input nilai invalid");
                    return new String[]{"", "", ""};
                }
                totalNilai += nilai;

                if (nilai > nilaiTertinggi) {
                    nilaiTertinggi = nilai;
                    mingguTertinggi = j;
                    mahasiswaTertinggi = dataMahasiswa[0][i];
                }
            }
        }

        return new String[]{mahasiswaTertinggi, String.valueOf(nilaiTertinggi), String.valueOf(mingguTertinggi)};
    }

    public static void TampilNilaiTertinggi() {
        System.out.println("--!!TAMPILKAN NILAI TERTINGGI!!--");

        String[] result = CariNilaiTertinggi();

        System.out.println("Mahasiswa dengan nilai tertinggi: " + result[0]);
        System.out.println("Nilai tertinggi yang diperoleh: " + result[1]);
        System.out.println("Mmahasiswa tersebut memperoleh \nnilai tertinggi pada tugas ke: " + result[2]);
    }
}
