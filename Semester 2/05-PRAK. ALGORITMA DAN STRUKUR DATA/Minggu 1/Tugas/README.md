<div align="center">

# Laporan Praktikum Algoritma dan Struktur Data
## Pertemuan 1

<img src="../../../../assets/logo-polinema.png" align="center" width="200px">

\
Nama: Farrel Augusta Dinata

NIM: 2341720081

No. Absen: 12

Kelas: TI-1B

</div>

---
### Pemilihan
#### Pertanyaan
Buatlah program untuk menghitung nilai akhir dari mahasiswa dengan ketentuan 20% nilai 
tugas, 20% dari nilai kuis, 30% nilai UTS, dan 40% nilai UAS. Setiap nilai yang dimasukkan 
mempunyai batas nilai 0 ‐ 100. Ketika pengguna memasukkan diluar rentang tersebut maka 
akan keluar output “nilai tidak valid”. Ketika nilai akhir sudah didapatkan selanjutnya 
lakukan konversi nilai dengan ketentuan seperti pada soal yang diberikan.

Jika Nilai Huruf yang didapatkan adalah A,B+,B+C+,C maka LULUS, jika nilai huruf D dan E 
maka TIDAK LULUS.

Jawab:

Kode yang dibuat:
```java
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
```

Hasil yang didapat:

Variasi 1
```
Program Menghitung Nilai Akhir
==============================
Masukkan nilai tugas: 90
Masukkan nilai kuis: 40
Masukkan nilai UTS: 75
Masukkan nilai UAS: 85
==============================
Nilai akhir: 74.0
Nilai huruf: B+
==============================
SELAMAT ANDA TELAH LULUS!
==============================
```

Variasi 2
```
Program Menghitung Nilai Akhir
==============================
Masukkan nilai tugas: 75
Masukkan nilai kuis: 34
Masukkan nilai UTS: 57
Masukkan nilai UAS: 52
==============================
Nilai akhir: 54.5
Nilai huruf: C
==============================
SELAMAT ANDA TELAH LULUS!
==============================
```

---
### Perulangan
#### Pertanyaan
Buatlah program yang dapat menampilkan deretan bilangan dari angka 1 sampai n kecuali 
angka 6 dan 10, angka ganjil dicetak dengan asterik “*”, angka genap dicetak sesuai bilangan 
aslinya, dengan n = 2 digit terakhir NIM anda.  
Bila n<10 maka tambahkan 10 (n+=10)

Jawab: 

Kode yang dibuat:
```java
import java.util.Scanner;

public class Perulangan_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("MASUKKAN NIM ANDA: ");
        long nimPengguna = scan.nextLong();

        long duaDigitTerakhiirNim = nimPengguna % 100;

        if (duaDigitTerakhiirNim < 10) {
            duaDigitTerakhiirNim += 10;
        }
        duaDigitTerakhiirNim = duaDigitTerakhiirNim < 10 ? duaDigitTerakhiirNim + 10 : duaDigitTerakhiirNim;

        for (int i = 1; i <= duaDigitTerakhiirNim; i++) {
            if (i != 6 && i != 10) {
                if (i % 2 == 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print(i);
                }
            }
        }
    }
}
```

Output yang dihasilkan:

Variasi 1
```
MASUKKAN NIM ANDA: 2341720102
 * 2 * 4 *  * 8 *  * 12
```

Variasi 2
```
MASUKKAN NIM ANDA: 2121214536
 * 2 * 4 *  * 8 *  * 12 * 14 * 16 * 18 * 20 * 22 * 24 * 26 * 28 * 30 * 32 * 34 * 36
```

---
### Array
#### Pertanyaan
Buatlah program untuk menghitung IP Semester dari matakuliah yang Anda tempuh 
semester lalu. Formula untuk menghitung IP semester sebagai berikut : 
$IP Semester = \frac{\sum(Nilai setara * bobot SKS)}{\sum SKS}$
Kemudian dikonversi sesuai perintah pada soal!

Jawab: 
Hasil kode yang dibuat:
```java
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

        System.out.println("==============================");
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
```

Output yang bisa dihasilkan
Variasi 1
```
==============================
Program Menghitung IP Semester
==============================

==============================
Masukkan nama mata kuliah!
==============================
Mata kuliah ke-1 : Pancasila
Mata kuliah ke-2 : Konsep Teknologi Informasi
Mata kuliah ke-3 : Critical Thinking and Problem Solving
Mata kuliah ke-4 : Matematika Dasar
Mata kuliah ke-5 : Bahasa Inggris
Mata kuliah ke-6 : Dasar Pemrograman
Mata kuliah ke-7 : Praktikum Dasar Pemrograman
Mata kuliah ke-8 : Keselamatan dan Kesehatan Kerja

==============================
Masukkan bobot SKS tiap matkul!
==============================
Pancasila : 2
Konsep Teknologi Informasi : 2
Critical Thinking and Problem Solving : 2
Matematika Dasar : 3
Bahasa Inggris : 2
Dasar Pemrograman : 2
Praktikum Dasar Pemrograman : 3
Keselamatan dan Kesehatan Kerja : 2

==============================
Masukkan nilai angka!
==============================
Pancasila : 75
Konsep Teknologi Informasi : 85
Critical Thinking and Problem Solving : 70
Matematika Dasar : 85
Bahasa Inggris : 85
Dasar Pemrograman : 62
Keselamatan dan Kesehatan Kerja : 85

==============================
Hasil Konversi Nilai
==============================
MK                                      Nilai Angka             Nilai Huruf             Bobot Nilai
Pancasila                               75                      B+                      3.5
Konsep Teknologi Informasi              85                      A                       4.0
Critical Thinking dan Problem Solving   70                      B                       3.0
Matematika Dasar                        85                      A                       4.0
Bahasa Inggris                          85                      A                       4.0
Dasar Pemrograman                       62                      C+                      2.5
Praktikum Dasar Pemrograman             62                      C+                      2.5
Keselamatan dan Kesehatan Kerja         85                      A                       4.0
==============================
IP : 3.42
```
**Penjelasan**

Disini saya membuat program dengan bisa membuat pengguna bisa input manual nama mata kuliah, bobot SKS tiap matkul, dan nilai angka. Kemudian, nilai tersebut akan dikonversi ke nilai huruf, dan nilai setara. 


---
### Fungsi
#### Pertanyaan
RoyalGarden adalah toko bunga yang memiliki banyak cabang. Setiap hari Stock Bunga dan bunga bunga yang dijual selalu dicatat. 
1. Buatlah fungsi untuk menampilkan pendapatan setiap cabang jika semua bunga habis terjual!
2. Buatlah fungsi untuk mengetahui jumlah stok setiap jenis bunga pada cabang RoyalGarden 4. Jika terdapat informasi tambahan berupa pengurangan stock karena bunga tersbut mati. Dengan rincian Aglonema -1, Keladi -2, Alocasia -0, Mawar -5!

Jawab:

Hasil kode yang dibuat:
```java
import java.util.Scanner;

public class Fungsi_1 {
    static int[] stokBungaRG1 = new int[4];
    static int[] stokBungaRG2 = new int[4];
    static int[] stokBungaRG3 = new int[4];
    static int[] stokBungaRG4 = new int[4];

    private static int hitungPendapatan() {
        int totalPendapatan = 0;
        for (int i = 0; i < stokBungaRG1.length; i++) {
            switch (i) {
                case 0:
                    totalPendapatan += 75000 * (stokBungaRG1[0] + stokBungaRG2[0] + stokBungaRG3[0] + stokBungaRG4[0]);
                    break;
                case 1:
                    totalPendapatan += 50000 * (stokBungaRG1[1] + stokBungaRG2[1] + stokBungaRG3[1] + stokBungaRG4[1]);
                    break;
                case 2:
                    totalPendapatan += 60000 * (stokBungaRG1[2] + stokBungaRG2[2] + stokBungaRG3[2] + stokBungaRG4[2]);
                    break;
                case 3:
                    totalPendapatan += 10000 * (stokBungaRG1[3] + stokBungaRG2[3] + stokBungaRG3[3] + stokBungaRG4[3]);
                    break;
                default:
                    break;
            }
        }
        return totalPendapatan;
    }

    private static void tampilStokBunga(int cabang) {
        switch (cabang) {
            case 1:
                System.out.println("Algonema: " + stokBungaRG1[0]);
                System.out.println("Keladi: " + stokBungaRG1[1]);
                System.out.println("Alocasia: " + stokBungaRG1[2]);
                System.out.println("Mawar: " + stokBungaRG1[3]);
                break;
            case 2: 
                System.out.println("Algonema: " + stokBungaRG2[0]);
                System.out.println("Keladi: " + stokBungaRG2[1]);
                System.out.println("Alocasia: " + stokBungaRG2[2]);
                System.out.println("Mawar: " + stokBungaRG2[3]);
                break;
            case 3:
                System.out.println("Algonema: " + stokBungaRG3[0]);
                System.out.println("Keladi: " + stokBungaRG3[1]);
                System.out.println("Alocasia: " + stokBungaRG3[2]);
                System.out.println("Mawar: " + stokBungaRG3[3]);
                break;
            case 4:
                System.out.println("Algonema: " + stokBungaRG4[0]);
                System.out.println("Keladi: " + stokBungaRG4[1]);
                System.out.println("Alocasia: " + stokBungaRG4[2]);
                System.out.println("Mawar: " + stokBungaRG4[3]);
                break;
            default:
                break;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Memberikan nilai stok bunga pada masing-masing cabang
        stokBungaRG1[0] = 10;
        stokBungaRG1[1] = 5;
        stokBungaRG1[2] = 15;
        stokBungaRG1[3] = 7;

        stokBungaRG2[0] = 6;
        stokBungaRG2[1] = 11;
        stokBungaRG2[2] = 9;
        stokBungaRG2[3] = 12;

        stokBungaRG3[0] = 2;
        stokBungaRG3[1] = 10;
        stokBungaRG3[2] = 10;
        stokBungaRG3[3] = 5;

        stokBungaRG4[0] = 5;
        stokBungaRG4[1] = 7;
        stokBungaRG4[2] = 12;
        stokBungaRG4[3] = 9;

        // Menampilkan pendapatan pada seluruh cabang
        System.out.println("Pendapatan seluruh cabang jika terjual semua");
        System.out.println("Rp "+hitungPendapatan());

        System.out.println("===================================");

        // Perubahan pada data toko RoyalGarden4
        stokBungaRG4[0] -= 1;
        stokBungaRG4[1] -= 2;
        stokBungaRG4[3] -= 5;

        // Menampilkan stok bunga
        System.out.print(
            "Pilih cabang yang ingin dipilih: \n" + 
            " 1. RoyalGarden1\n" + 
            " 2. RoyalGarden2\n" +
            " 3. RoyalGarden3\n" +
            " 4. RoyalGarden4\n" +
            ">>> "
        );
        int cabangDipilih = scan.nextInt();

        tampilStokBunga(cabangDipilih);
    }
}
```
Output yang bisa dihasilkan:
```
Pendapatan seluruh cabang jika terjual semuanya
Rp 6465000
===================================
Pilih cabang yang ingin dipilih:
 1. RoyalGarden1
 2. RoyalGarden2
 3. RoyalGarden3
 4. RoyalGarden4
>>> 4
Algonema: 4
Keladi: 5
Alocasia: 12
Mawar: 4
```

---
### Tugas
1. Susun program untuk membuat dua buah array berikut isinya sebagai berikut. Array 
pertama adalah array satu dimensi char KODE[10], berisi kode plat mobil. Array kedua, array 
dua dimensi char KOTA[10][12] berisi nama kota yang berpasangan dengan kode plat mobil.
    
    Jawab:
    Kode program yang saya buat:
    ```java
    import java.util.Scanner;

    public class Tugas_1 {
        static Scanner scan = new Scanner(System.in);

        // Deklarasi variabel
        static char[] kode = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        static char[][] kota = new char[10][12];

        public static void main(String[] args) {
            inisialisasiVariabel();
            cariPlatNomor();
        }

        private static void inisialisasiVariabel() {
            // Memberikan nilai/nama kota kepada variabel array kota
            String banten = "BANTEN", jakarta = "JAKARTA", bandung = "BANDUNG", cirebon = "CIREBON",
            bogor = "BOGOR", pekalongan = "PEKALONGAN", semarang = "SEMARANG", surabaya = "SURABAYA",
            malang = "MALANG", tegal = "TEGAL";

            for (int i = 0; i < banten.length(); i++) {
                kota[0][i] = banten.charAt(i);
                kota[8][i] = malang.charAt(i);
            }

            for (int i = 0; i < jakarta.length(); i++) {
                kota[1][i] = jakarta.charAt(i);
                kota[2][i] = bandung.charAt(i);
                kota[3][i] = cirebon.charAt(i);
            }

            for (int i = 0; i < bogor.length(); i++) {
                kota[4][i] = bogor.charAt(i);
                kota[9][i] = tegal.charAt(i);
            }

            for (int i = 0; i < semarang.length(); i++) {
                kota[6][i] = semarang.charAt(i);
                kota[7][i] = surabaya.charAt(i);
            }

            for (int i = 0; i < pekalongan.length(); i++) {
                kota[5][i] = pekalongan.charAt(i);
            }
        }

        private static void cariPlatNomor() {
            // Pencarian nama kota berdasarkan kode plat nomor
            int ulangiInput = 1;
            do {
                System.out.print("\nMasukkan kode plat nomor: ");
                char inputKode = scan.next().toUpperCase().charAt(0);

                switch (inputKode) {
                    case 'A':
                        cetakNamaKota(0);
                        break;
                    case 'B':
                        cetakNamaKota(1);
                        break;
                    case 'D':
                        cetakNamaKota(2);
                        break;
                    case 'E':
                        cetakNamaKota(3);
                        break;
                    case 'F':
                        cetakNamaKota(4);
                        break;
                    case 'G':
                        cetakNamaKota(5);
                        break;
                    case 'H':
                        cetakNamaKota(6);
                        break;
                    case 'L':
                        cetakNamaKota(7);
                        break;
                    case 'N':
                        cetakNamaKota(8);
                        break;
                    case 'T':
                        cetakNamaKota(9);
                        break;
                    default:
                        System.out.println(
                            "====================\n" +
                            " INPUT TIDAK VALID!\n" + 
                            "===================="
                        );
                        break;
                }

                System.out.print(
                    "\n\nInput ulang? \n" +
                    "  1. YA\n" +
                    "  2. TIDAK\n" +
                    ">>> "
                );
                ulangiInput = scan.nextInt();
            } while (ulangiInput == 1);
        }

        private static void cetakNamaKota(int kode) {
            System.out.print(" - ");
            for (char nilai : kota[kode]) {
                System.out.print(nilai);
            }
        }
    }
    ```

    Output yang bisa dihasilkan:
    ```
    Masukkan kode plat nomor: n
    - MALANG

    Input ulang? 
    1. YA
    2. TIDAK
    >>> 1

    Masukkan kode plat nomor: e
    - CIREBON

    Input ulang? 
    1. YA
    2. TIDAK
    >>> 1

    Masukkan kode plat nomor: q
    ====================
    INPUT TIDAK VALID!
    ====================


    Input ulang?
    1. YA
    2. TIDAK
    >>> 2
    ```

    Variabel array **kode** saya langsung inisialisasi nilainya untuk efisiensi kode. Sedangkan untuk variabel **kota**, saya inisialisasi secara terpisah agar ukuran dari array bisa menjadi **10 x 12**. Jika saya langsung inisialisasi array, maka panjang dari kolom array bisa berbeda-beda.

    Untuk mekanisme pencarian plat nomor saya gunakan switch case dan akan memanggil method **cetakNamaKota** untuk melakukan perintah cetak nilai nama kota yang diinginkan.

    Saya juga melakukan kreasi pada alur program yaitu dengan menambahkan **do-while** loop. Ini agar pengguna bisa melakukan input berulang kali.

2. Buat program untuk menghitung rumus kecepatan, jarak, dan waktu 
Berikut adalah persamaan untuk menghitung rumus tersebut :

    **Rumus Kecepatan**
    $v = \frac{s}{t}$

    **Rumus Jarak**
    $s = v . t$

    **Rumus Waktu**
    $t = \frac{s}{v}$

    **Keterangan:**

    $v = kecepatan$

    $s = jarak$

    $t = waktu$

    Program yang dibuat memiliki fungsi sebagai berikut:

    a. Menu (Untuk memilih rumus yang akan dihitung (kecepatan/jarak/waktu)
    
    b. Menghitung hasil perhitungan Kecepatan

    c. Menghitung hasil perhitungan Jarak

    d. Menghitung hasil perhitungan Waktu

    Panggil fungsi-fungsi tersebut pada fungsi main!

    Jawab: 

    ```java
    import java.util.Scanner;

    public class Tugas_2 {
        static Scanner scan = new Scanner(System.in);
        static float kecepatan, jarak, waktu;
        static int ulangiPerhitungan = 1;

        private static void menuPerhitungan() {
            do {
                System.out.print(
                    "\nMAU HITUNG APA?\n" +
                    "   1. Kecepatan\n" +
                    "   2. Jarak\n" +
                    "   3. Waktu\n" +
                    ">>> "
                );
                int pilihanMenu = scan.nextInt();
        
                switch (pilihanMenu) {
                    case 1:
                        hitungKecepatan();
                        break;
                    case 2:
                        hitungJarak();
                        break;
                    case 3:
                        hitungWaktu();
                        break;
                    default:
                        tampilInputInvalid();
                        break;
                }

                System.out.println("============================");
                System.out.print(
                    "\nUlangi lagi ?\n" +
                    "   1. YA\n" + 
                    "   2. TIDAK\n" +
                    ">>> "
                );
                ulangiPerhitungan = scan.nextInt();
            } while (ulangiPerhitungan == 1);
        }

        private static void hitungKecepatan() {
            System.out.print("Masukkan jarak (km): ");
            jarak = scan.nextFloat();
            System.out.print("Masukkan waktu (jam) : ");
            waktu = scan.nextFloat();

            // Menghitung nilai kecepatan
            kecepatan = jarak / waktu;
            System.out.println("Kecepatan yang dihasilkan : " + kecepatan + " km/jam");
        }

        private static void hitungJarak() {
            System.out.print("Masukkan kecepatan (km/jam) : ");
            kecepatan = scan.nextFloat();
            System.out.print("Masukkan waktu (jam) : ");
            waktu = scan.nextFloat();

            // Menghitung nilai jarak
            jarak = kecepatan * waktu;
            System.out.println("Jarak yang ditempuh : " + jarak + " km");
        }

        private static void hitungWaktu() {
            System.out.print("Masukkan jarak (km) : ");
            jarak = scan.nextFloat();
            System.out.print("Masukkan kecepatan (km/jam) : ");
            kecepatan = scan.nextFloat();

            // Menghitung nilai waktu
            waktu = jarak / kecepatan;
            System.out.println("Waktu yang dihabiskan : " + waktu + " jam");
        }

        private static void tampilInputInvalid() {
            System.out.println("============================");
            System.out.println("  INPUT INVALID!");
            System.out.println("============================");
        }

        public static void main(String[] args) {
            menuPerhitungan();
        }
    }
    ```

    ```
    MAU HITUNG APA?
    1. Kecepatan
    2. Jarak
    3. Waktu
    >>> 2
    Masukkan kecepatan (km/jam) : 45
    Masukkan waktu (jam) : 0.25
    Jarak yang ditempuh : 11.25 km
    ============================

    Ulangi lagi ?
    1. YA
    2. TIDAK
    >>> 1

    MAU HITUNG APA?
    1. Kecepatan
    2. Jarak
    3. Waktu
    >>> 1
    Masukkan jarak (km): 100
    Masukkan waktu (jam) : 60
    Kecepatan yang dihasilkan : 1.6666666 km/jam
    ============================

    Ulangi lagi ?
    1. YA
    2. TIDAK
    >>> 2
    ```

    Disini saya membuat perhitungan yang berdasarkan pada satuan tertentu. Misalnya, jarak satuannya **km**, kecepatan satuannya **km/jam**, waktu satuannya **jam**. Saya juga melakukan kreasi dengan menambahkan looping agar pengguna bisa melakukan operasi perhitungan jarak, kecepatan, dan waktu berulang kali.