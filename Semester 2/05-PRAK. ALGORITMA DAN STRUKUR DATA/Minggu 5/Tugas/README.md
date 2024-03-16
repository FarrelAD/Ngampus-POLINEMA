<div align="center">

# Laporan Praktikum Algoritma dan Struktur Data
## Pertemuan 5

<img src="./assets/logo-polinema.png" align="center" width="200px">

\
Nama: Farrel Augusta Dinata

NIM: 2341720081

No. Absen: 12

Kelas: TI-1B

</div>

---
### Percobaan 1 - Menghitung Nilai Faktorial dengan Algoritma Brute Force dan Divide and Conquer
Output yang dihasilkan:
```
=========================
Masukkan jumlah elemen: 3

Masukkan nilai data ke-1: 5

Masukkan nilai data ke-2: 8

Masukkan nilai data ke-3: 3
HASIL -- BRUTE FORCE
Hasil perhitungan faktorial menggunakan Brute Force adalah: 120
Hasil perhitungan faktorial menggunakan Brute Force adalah: 40320
Hasil perhitungan faktorial menggunakan Brute Force adalah: 6

HASIL -- DIVIDE AND CONQUER
Hasil perhitungan faktorial menggunakan Divide and Conquer adalah: 120
Hasil perhitungan faktorial menggunakan Divide and Conquer adalah: 40320
Hasil perhitungan faktorial menggunakan Divide and Conquer adalah: 6
```

**Pertanyaan**
1. Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan perbedaan bagian kode pada penggunaan if dan else!

    Jawab: Kondisi yang terdapat pada bagian **if** dinamakan dengan **base case**. Sedangkan pada bagian **else** disebut dengan **recursion call**. Proses pertama dalam fungsi rekursif adalah masuk ke bagian blok kode pada **recursion call**. Disini akan terjadi proses pembagian data dan memanggil fungsinya sendiri. Disini peran **base case** bekerja, dia akan menghentikan proses pembagian dan akan mengembalikan nilai yang ditentukan. Proses selanjutnya akan disebut **conquer** karena sudah menggabungkan nilai dari yang sudah dipecah-pecah sebelumnya.

2. Apakah memungkinkan perulangan pada method **faktorialBF()** dirubah selain menggunakan for? Buktikan!

    Jawab: Bisa, disini saya menggunakan looping dengan jenis **while loop**. Berikut adalah kode modifikasi dari saya:
    ```java
    int faktorialBF(int n) {
        int fakto = 1;
        int i = n;
        while (i >= 1) {
            fakto = fakto * i;
            i--;
        }
        return fakto;
    }
    ```
    Bisa juga menggunakan **do-while loop**:
    ```java
    int faktorialBF(int n) {
        int fakto = 1;
        int i = n;
        do {
            fakto = fakto * i;
            i--;
        } while (i >= 1);
        return fakto;
    }
    ```
    Kedua blok kode tersebut akan menghasilkan output yang sama. 
    ```
    =========================
    Masukkan jumlah elemen: 3

    Masukkan nilai data ke-1: 5

    Masukkan nilai data ke-2: 8

    Masukkan nilai data ke-3: 3
    HASIL -- BRUTE FORCE
    Hasil perhitungan faktorial menggunakan Brute Force adalah: 120
    Hasil perhitungan faktorial menggunakan Brute Force adalah: 40320
    Hasil perhitungan faktorial menggunakan Brute Force adalah: 6

    HASIL -- DIVIDE AND CONQUER
    Hasil perhitungan faktorial menggunakan Divide and Conquer adalah: 120
    Hasil perhitungan faktorial menggunakan Divide and Conquer adalah: 40320
    Hasil perhitungan faktorial menggunakan Divide and Conquer adalah: 6
    ```

3. Jelaskna perbedaan antara **fakto *= i*** dan **int fakto = n * faktorialDC(n-1)**!

    Jawab: **fakto *= i*** akan melakukan operasi perhitungan nilai faktor yang ada dengan nilai yang menjadi variabel **i**. Sedangkan untuk **int fakto = n * faktorialDC(n-1)**, merupakan operasi yang dilakukan agar fungsi rekursif bekerja. Jadi nilai dari **fakto** merupakan nilai dari **n** dikali dengan hasil fungsi **faktorialDC(n-1)**

---
### Percobaan 2 - Menghitung hasil pangkat dengan algoritma Brute Force dan Divide and Conquer
Output yang dihasilkan setelah beberapa kali perbaikan:
```java
=======================
Masukkan jumlah elemen yang dihitung: 2
=======================
Masukkan nilai yang hendak dihitung: 6
Masukkan nilai pemangkat: 2
=======================
Masukkan nilai yang hendak dihitung: 4
Masukkan nilai pemangkat: 3

HASIL PANGKAT - BRUTE FORCE
Hasil dari 6pangkat 2 adalah 36
Hasil dari 4pangkat 3 adalah 64

HASIL PANGKAT - DIVIDE AND CONQUER
Hasil dari 6 pangkat 2 adalah 36
Hasil dari 4 pangkat 3 adalah 64
```
**Pertanyaan**
1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu **PangkatBF()** dan **PangkatDC**!

    Jawab: **PangkatBF** digunakan untuk menyelesaikan perpangkatan dengan metode brute force, yaitu dengan mengalikan dengan dirinya sendiri sejumlah nilai pangkat yang diinginkan. Sedangkan **PangkatDC**, digunakan untuk menyelesaikan dengan metode divide and conquer, yaitu dengan mengkalikan bilangan yang diinginkan dengan hasil fungsi yang dipanggil.

2. Apakah tahap *combine* sudah termasuk dalam kode tersebut? Tunjukkan!

    Jawab: **Combine** ada pada method **PangkatDC**. Proses combine terjadi ketika method yang dipanggil sudah mencapai **base-case** dari method **PangkatDC**.

3. Modifikasi kode program tersebut, anggap proses pengisian atribut dilakukan dengan konstruktor!

    Jawab: Ini modifikasi kode yang saya buat:
    ```java
    System.out.println("=======================");
    System.out.print("Masukkan nilai yang hendak dihitung: ");
    int nilai = sc.nextInt();
    System.out.print("Masukkan nilai pemangkat: ");
    int pangkat = sc.nextInt();
    png[i] = new Pangkat(nilai, pangkat);
    ```

4. Tambahkan menu agar salah satu method yang terpilih saja yang akan dijalankan menggunakan **switch-case!**

    Jawab: Ini hasil modifikasi kode saya:
    ```java
    package minggu5;

    import java.util.Scanner;

    public class MainPangkat {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("=======================");
            System.out.print("Masukkan jumlah elemen yang dihitung: ");
            int elemen = sc.nextInt();

            // Input nilai dan pangkat
            Pangkat png[] = new Pangkat[elemen];
            for (int i = 0; i < elemen; i++) {
                // Input nilai atribut dengan menggunakan konstruktor berparameter
                System.out.println("=======================");
                System.out.print("Masukkan nilai yang hendak dihitung: ");
                int nilai = sc.nextInt();
                System.out.print("Masukkan nilai pemangkat: ");
                int pangkat = sc.nextInt();
                png[i] = new Pangkat(nilai, pangkat);
            }

            System.out.print(
                "Pilih metode perhitungan:\n" + 
                "   1. Brute Force\n" +
                "   2. Divide and Conquer\n" +
                ">>> "
            );
            int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    hasilPangkatBruteForce(png, elemen);
                    break;
                case 2:
                    hasilPangkatDivideAndConquer(png, elemen);
                    break;
                default:
                    tampilDefaultError();
                    break;
            }
        }


        private static void hasilPangkatBruteForce(Pangkat[] png, int elemen) {
            System.out.println("\nHASIL PANGKAT - BRUTE FORCE");
            for (int i = 0; i < elemen; i++) {
                System.out.println(
                    "Hasil dari " + png[i].nilai + "pangkat " +
                    png[i].pangkat + " adalah " + png[i].pangkatBF(png[i].nilai, png[i].pangkat)
                );
            }
        }

        private static void hasilPangkatDivideAndConquer(Pangkat[] png, int elemen) {
            System.out.println("\nHASIL PANGKAT - DIVIDE AND CONQUER");
            for (int i = 0; i < elemen; i++) {
                System.out.println(
                    "Hasil dari " + png[i].nilai + " pangkat " + 
                    png[i].pangkat + " adalah " + png[i].pangkatDC(png[i].nilai, png[i].pangkat)
                );
            }
        }

        private static void tampilDefaultError() {
            System.out.println("INPUT ANDA ERROR!");
        }
    }
    ```
---
### Percobaan 3 - Menghitung Sum Array dengan Algoritma Brute Force dan Divide and Conquer
Hasil percobaan
```
===================================
Program Menghitung Keuntungan Total
Masukkan jumlah bulan: 5

===================================
(Satuan juta. Bisa berupa bilangan desimal. Misal input 5.7; 78.5)
Masukkan untung bulan ke-1 = 8.5
Masukkan untung bulan ke-2 = 9.54
Masukkan untung bulan ke-3 = 7.2
Masukkan untung bulan ke-4 = 9.1
Masukkan untung bulan ke-5 = 6

===================================
Algoritma Brute Force
Total keuntungan perusahaan selama 5 bulan adalah = 40.339999999999996
===================================
Algoritma Divide Conquer
Total keuntungan perusahaan selama 5 bulan adalah = 40.339999999999996
```
**Pertanyaan**
1. Mengapa terdapat formulasi *return value*  berikut? Jelaskan!

    Jawab: Itu digunakan sebagai proses penggabungan dari proses **divide** yang telah dilakukan sebelumnya. Sekaligus mengembalikan nilai output dari fungsi rekursif tersebut.

2. Kenapa dibutuhkan variabel **mid** pada method **TotalDC()**?

    Jawab: Sebagai pembagi atau pembatas antara pembagian di sisi kiri dan kanan. Jadi, saat proses **dividing** pada algoritma **divide and conquer** akan mengacu pada nilai mid. Ini perlu dibuat karena komputer tidak tahu mana titik tengah yang bisa membagi suatu nilai menjadi dua sama rata.

3. Program perhitungan keuntungan suatu perusahaan ini hanya untuk satu perusahaan saja. Bagaiamana cara menghitung sekaligus keuntungan beberapa bulan untuk beberapa perusahaan? (Setiap perusahaan bisa saja memiliki jumlah bulan berbeda-beda). Buktikan dengan program!

    Jawab: Proram yang saya buat ada pada [link ini (MainSum.java)](./src/minggu5/MainSum.java) dan [link ini (Sum.java)](./src/minggu5/Sum.java)


### Latihan Praktikum
Sebuah showroom memiliki daftar mobil dengan data sesuai tabel di bawah ini:
| merk | tipe | tahun | top_acceleration | top_power |
| -- | -- | -- | -- | -- |
| BMW | M2 Coupe | 2016 | 6816 | 728 |
| Ford | Fiesta ST | 2014 | 3921 | 575 |
| Nissan | 370Z | 2009 | 4360 | 657 |
| Subaru | BRZ | 2014 | 4058 | 609 |
| Subaru | Impreza WRX STI | 2013 | 6255 | 703 |
| Toyota | AE86 Trueno | 1986 | 3700 | 553 |
| Toyota | 86/GT86 | 2014 | 4180 | 609 |
| Volkswagen | Golf GTI | 2014 | 4180 | 631 |

Tentukan: 

a. top_acceleration tertinggi menggunakan Divide and Conquer!

b. top_acceleration terendah menggunakan Divide and Conquer!

c. Rata-rata top_power dari seluruh mobil menggunakan Brute Force!

Jawab:

a. Program yang saya buat lebih lengkapnya ada pada link berikut [klik aku](../src/latihan_praktikum/).
Saya membuat method baru yang fungsinya untuk mencari nilai tertinggidari data **top_acceleration**
```java
static int cariTopAccelerationTertinggi(int topAccelera[], int l, int r) {
        if (l == r) {
            return topAccelera[l];
        } else {
            int mid = (l + r) / 2;
            int lTop = cariTopAccelerationTertinggi(topAccelera, l, mid);
            int rTop = cariTopAccelerationTertinggi(topAccelera, mid + 1, r);
            if (lTop > rTop) {
                return lTop;
            } else {
                return rTop;
            }
        }
    }
```
Saya membuat fungsi tersebut di dalam class yang terdapat method main, tidak pada method showroom. Ini karena perhitungan ini tidak sebatas pada satu objek melainkan banyak objek (Sebelumnya saya membuat data mobil yang ada di showroom dengan array of object). Tidak bergantungnya pada salah satu objek aja inilah yang membuat saya menggunakan keyword **static** agar bisa digunakan pada objek apapun.

Untuk outputnya akan seperti ini:
```
Top Acceleration tertinggi (DIVIDE AND CONQUER): 6816
```

b. Program yang saya buat lebih lengkapnya ada pada link berikut [klik aku](./src/latihan_praktikum/).
Sama seperti sebelumnya, tapi untuk pengkondisiannya saya balik. 

```java
static int cariTopAccelerationTerendah(int topAccelera[], int l, int r) {
        if (l == r) {
            return topAccelera[l];
        } else {
            int mid = (l + r) / 2;
            int lTop = cariTopAccelerationTerendah(topAccelera, l, mid);
            int rTop = cariTopAccelerationTerendah(topAccelera, mid + 1, r);
            if (lTop < rTop) {
                return lTop;
            } else {
                return rTop;
            }
        }
    }
```

Yang paling membedakan adalah pada blok kode berikut: 
```java
if (lTop < rTop) {
    return lTop;
} else {
    return rTop;
}
```
Sebeanarnya bisa menggunakan ternary operator agar lebih singkat. Tapi untuk memudahkan keterbacaan kode, saya membuat blok kode if else seperti pada umumnya.
```java
return (lTop <> rTop) ? lTop : rTop;
```
Untuk outputnya seperti ini:
```
Top Acceleration terendah (DIVIDE AND CONQUER): 3700
```

c. Menghitung rata-rata **top_power**
Program yang saya buat bisa dilihat pada link berikut [klik aku](./src/latihan_praktikum/MainShowroom.java)
Untuk spesifiknya sebagai berikut:

```java
static double hitungRataRataTopPower(int topPower[]) {
    int totalPower = 0;
    for (int i : topPower) {
        totalPower += i;
    }

    return totalPower / topPower.length;
}
```

Saya membuatnya di class yang terdapat method main. Lagi-lagi karena ini tidak bergantung ke salah satu objek saja. Disini saya menggunakan for each karena tidak perlu nilai indeks dari array yang ada. Secara konsep ini sama dengan metode **for (int i=0; i<arr.length; i++)**. Keduanya menerapkan metode algoritma **Brute Force**, yaitu mengecek satu persatu elemen yang dimiliki dari keseluruhan array.

Untuk outputnya sebagai berikut:
```
Rata-rata top power (BRUTE FORCE) : 633.0
```