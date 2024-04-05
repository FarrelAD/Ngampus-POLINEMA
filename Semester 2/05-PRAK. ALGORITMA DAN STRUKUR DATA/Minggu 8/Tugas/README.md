<div align="center">

# Laporan Praktikum Algoritma dan Struktur Data
## Pertemuan 8

<img src="../../../../assets/logo-polinema.png" align="center" width="200px">

\
Nama: Farrel Augusta Dinata

NIM: 2341720081

No. Absen: 12

Kelas: TI-1B

</div>

---
### Percobaan 1 - Penyimpanan Tumpukan Barang dalam Gudang
Verifikasi hasil percobaan:
```
==============================================
MENU
   1. Tambah barang
   2. Ambil barang
   3. Tampilkan tumpukan barang
   4. Keluar
Pilih operasi: 1
Masukkan kode barang: 21
Masukkan nama barang: Majalah
Masukkan nama kategori: Buku

Barang Majalah berhasil ditambahkan ke gudang
==============================================
MENU
   1. Tambah barang
   2. Ambil barang
   3. Tampilkan tumpukan barang
   4. Keluar
Pilih operasi: 1
Masukkan kode barang: 26
Masukkan nama barang: Jaket
Masukkan nama kategori: Pakaian

Barang Jaket berhasil ditambahkan ke gudang
==============================================
MENU
   1. Tambah barang
   2. Ambil barang
   3. Tampilkan tumpukan barang
   4. Keluar
Pilih operasi: 2

Barang Jaket diambil dari gudang
==============================================
MENU
   1. Tambah barang
   2. Ambil barang
   3. Tampilkan tumpukan barang
   4. Keluar
Pilih operasi: 1
Masukkan kode barang: 33
Masukkan nama barang: Pizza
Masukkan nama kategori: Makanan

Barang Pizza berhasil ditambahkan ke gudang
==============================================
MENU
   1. Tambah barang
   2. Ambil barang
   3. Tampilkan tumpukan barang
   4. Keluar
Pilih operasi: 3
Rincian tumpukan barang di gudang
Kode 33: Pizza (Kategori Makanan)
Kode 21: Majalah (Kategori Buku)
```

**Pertanyaan:**
1. Lakukan perbaikan pada kode program, sehingga keluaran yang dihasilkan sama dengan verifikasi hasil percobaan! Bagian mana saja yang perlu diperbaiki?

    Jawab:
    - Pada method **lihatBarangTeratas()**, kondisi yang ada di dalam if seharusnya bukan `!isEmpty()`. Kondisi yang benar adalah `!cekKosong()`
    - Pada method **tampilkanBarang()**, kondisi perulangan yang benar bukanlah `(int i = 0; i <= top; i++>)`, tapi yang benar adalah `(int i = top; i >= 0; i++)`. Dengan demikian proses penampilan hasil sesuai dengan mekanisme stack yaitu mengambil data pertama dari yang paling atas terlebih dahulu.
    - Pada method **main** di class **Utama12** untuk switch case 4, akan terjadi proses looping tak terhingga. Solusinya adalah memberikan baris kode berikut di dalam case 4:
        ```java
            case 4:
            System.exit(0);
        ```

2. Berapa banyak data barang yang dapat ditampung di dalam tumpukan? Tunjukkan potongan kode 
programnya! 

    Jawab: Terdapat 7 data yang bisa ditampung oleh gudang. Buktinya pada kode berikut:
    ```java
        Gudang12 gudang = new Gudang12(7);
    ```
    Pada baris kode tersebut melakukan instansiasi kelas dengan nama objek **gudang** dengan memberikan argumen 7. Jika kita lihat di dalam konstruktor **Gudang12**,
    ```java
    public Gudang12(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang12[size];
        top = -1;
    }
    ``` 
    Dari konstruktor tersebut, nilai parameter yang menunjukkan ukuran dari data yang ditampung.

3. Mengapa perlu pengecekan kondisi `!cekKosong()` pada method `tampilkanBarang`? Kalau kondisi 
tersebut dihapus, apa dampaknya? 

    Jawab: Pengecekan kondisi tersebut untuk mengetahui apakah di dalam tumpukan tersebut memiliki data atau tidak. Jika itu dihapus, sebenarnya prosesnya sama saja dan tidak akan terjadi eror sama sekali. Tapi jika pengecekan kondisi itu dihapus, output yang tampil adalah data kosong saja karena data yang kosong berarti nilai `top = -1`, maka dari itu proses looping tidak memenuhi. Bagi pengguna awam mungkin akan kebingungan karena tidak ada pemberitahuan bahwa data yang ada kosong. 

    Berikut adalah contohnya jika pengecekan kondisi `!cekKosong()` dihapus:
    ```
    ==============================================
    MENU
    1. Tambah barang
    2. Ambil barang
    3. Tampilkan tumpukan barang
    4. Keluar
    Pilih operasi: 3

    ==============================================
    MENU
    1. Tambah barang
    2. Ambil barang
    3. Tampilkan tumpukan barang
    4. Keluar
    Pilih operasi: 4
    ```
    Jadi, pengecekan kondisi `!cekKosong()` bisa berguna untuk memberitahu pengguna kalau datanya kosong.

4. Modifikasi kode program pada class **Utama** sehingga pengguna juga dapat memilih operasi lihat 
barang teratas, serta dapat secara bebas menentukan kapasitas gudang! 

    Jawab: Modifikasi agar pengguna bisa melihat barang teratas saja. Kode yang saya rubah sebagai berikut:
    Membuat opsi pilihan menu baru:
    ```java
    ///////////// Kode lain
    switch(pilihan) {
        ///////////// Kode lain
        case 3:
        gudang.lihatBarangTeratas();
        break;
        //////////// Kode lain
    }
    ```
    Berikut adalah isi dari method `lihatBarangTeratas`:
    ```java
    public Barang12 lihatBarangTeratas() {
        if (!cekKosong()) {
            Barang12 barangTeratas = tumpukan[top];
            System.out.printf("\nBarang teratas:  %s", barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong!");
            return null;
        }
    }
    ```

    Membuat pengguna agar bisa input kapasitas:
    ```java
    System.out.print(
            "Tentukan kapasitas gudang terlebih dahulu: \n" +
            ">>> "
    );
    int kapasitasGudang = scanner.nextInt();
    Gudang12 gudang = new Gudang12(kapasitasGudang);
    ```

    Untuk contoh hasilnya berikut:
    ```
    Tentukan kapasitas gudang terlebih dahulu: 
    >>> 4

    ==============================================
    MENU
    1. Tambah barang
    2. Ambil barang
    3. Lihat barang teratas
    4. Tampilkan tumpukan barang
    5. Keluar
    Pilih operasi: 1
    Masukkan kode barang: 123
    Masukkan nama barang: Mi Ayam
    Masukkan nama kategori: Makanan

    Barang Mi Ayam berhasil ditambahkan ke gudang
    ==============================================
    MENU
    1. Tambah barang
    2. Ambil barang
    3. Lihat barang teratas
    4. Tampilkan tumpukan barang
    5. Keluar
    Pilih operasi: 1
    Masukkan kode barang: 12
    Masukkan nama barang: Demonslayer
    Masukkan nama kategori: Film

    Barang Demonslayer berhasil ditambahkan ke gudang
    ==============================================
    MENU
    1. Tambah barang
    2. Ambil barang
    3. Lihat barang teratas
    4. Tampilkan tumpukan barang
    5. Keluar
    Pilih operasi: 1
    Masukkan kode barang: 23
    Masukkan nama barang: NIKE
    Masukkan nama kategori: Sepatu

    Barang NIKE berhasil ditambahkan ke gudang
    ==============================================
    MENU
    1. Tambah barang
    2. Ambil barang
    3. Lihat barang teratas
    4. Tampilkan tumpukan barang
    5. Keluar
    Pilih operasi: 3

    Barang teratas NIKE
    ```

5. Commit dan push kode program ke Github

    Jawab: Untuk hasil percobaan 1 bisa dilihat pada link berikut [Klik aku](https://github.com/FarrelAD/Ngampus-POLINEMA/tree/main/Semester%202/05-PRAK.%20ALGORITMA%20DAN%20STRUKUR%20DATA/Minggu%208/Tugas)

---
### Percobaan 2 - Konversi Kode Barang ke Biner
Verifikasi hasil percobaan 2:
```
Tentukan kapasitas gudang terlebih dahulu: 
>>> 5

==============================================
MENU
   1. Tambah barang
   2. Ambil barang
   3. Lihat barang teratas
   4. Tampilkan tumpukan barang
   5. Keluar
Pilih operasi: 1
Masukkan kode barang: 13
Masukkan nama barang: Setrika
Masukkan nama kategori: Elektronik

Barang Setrika berhasil ditambahkan ke gudang
==============================================
MENU
   1. Tambah barang
   2. Ambil barang
   3. Lihat barang teratas
   4. Tampilkan tumpukan barang
   5. Keluar
Pilih operasi: 2

Barang Setrika diambil dari gudang
Kode unik dalam biner: 1101
```

**Pertanyaan:**
1. Pada method `konversiDesimalKeBiner`, ubah kondisi perulangan menjadi `while (kode != 0)`, bagaimana hasilnya? Jelaskan alasannya!

    Jawab: 
    Saya lakukan perubahan kode menjadi seperti ini: 
    ```java
    while (kode != 0) {
        int sisa = kode % 2;
        stack.push(sisa);
        kode = kode / 2;
    }
    ```
    Dan hasilnya sebagai berikut:
    ```
    Tentukan kapasitas gudang terlebih dahulu: 
    >>> 5

    ==============================================
    MENU
    1. Tambah barang
    2. Ambil barang
    3. Lihat barang teratas
    4. Tampilkan tumpukan barang
    5. Keluar
    Pilih operasi: 1
    Masukkan kode barang: 13
    Masukkan nama barang: Setrika
    Masukkan nama kategori: Elektronik

    Barang Setrika berhasil ditambahkan ke gudang
    ==============================================
    MENU
    1. Tambah barang
    2. Ambil barang
    3. Lihat barang teratas
    4. Tampilkan tumpukan barang
    5. Keluar
    Pilih operasi: 2

    Barang Setrika diambil dari gudang
    Kode unik dalam biner: 1101
    ```
    Tidak ada pengaruh dari kode tersebut. Itu karena memang konsep dari konversi biner pada looping itu adalah selama nilai dari kode tidak 0. Untuk membuat kondisi tidak 0 bisa dilakukan dengan `(kode != 0)` atau `(kode > 0)`. Untuk kasus lain, dua kondisi itu bisa saja berbeda. Misalnya terdapat program perhitungan yang menghitung bilangan-bilangan positif, maka lebih cocok untuk menggunakan pengkondisian yang kedua `(kode > 0)`. Itu karena bilangan apapun di bawah 0 pasti negatif.

2. Jelaskan alur kerja dari method `konversiDesimalKeBiner`!

    Jawab: 
    - Tahap pertama adalah membuat objek baru yang bernama **stack**. Ini digunakan untuk bisa melakukan proses konversi dari desimal ke biner dan menyimpannya dalam bentuk stack.
    - Setelah itu proses konversi akan berlangsung pada proses blok kode ini:

        ```java
        while (kode != 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        ```
    - Tahap pertama adalah melakukan proses pembagian dan mengetahui sisa baginya `int sisa = kode % 2;`
    - Hasil dari sisa bagi itu akan dijadikan argumen pada method `push(sisa)`. Jadi hasil sisa ini akan disimpan di stack objek stack.
    - Masuk ke class `StackKonversi12`. Jika masih ada tempat untuk menyimpan data stack, maka nilai dari parameter push akan disimpan di stack.
    - Proses selanjutnya adalah nilai dari kode akan diperbarui dengan dibagi 2.
    - Proses tersebut dilakukan berulang kali selama nilai dari `kode` tidak 0.

---
### Percobaan 3 - Konversi Notasi Infix ke Postfix
Verifikasi hasil percobaan:
```
Masukkan ekspresi matematika (infix) : a+b*(c+d-e)/f
Postfix: abcd+e-*f/+
```

**Pertanyaan:**
1. Pada method **derajat**, mengapa return value beberapa case bernilai sama? Apabila return value diubah dengan nilai berbeda-beda setiap case-nya, apa yang terjadi?

    Jawab: Itu karena ada beberapa karakter memiliki bobot yang sama. Jika terdapat return value yang dirubah, bisa saja urutan operator tidak sesuai dengan semestinya saat proses konversi ke dalam bentuk postfix. 

    Ini adalah contoh kode yang saya rubah bobot nilai:
    ```java
    public int derajat(char c) {
        switch (c) {
            case '^':
                return 3;
            case '%':
                return 2;
            case '/':
                return 6;
            case '*':
                return 4;
            case '-':
                return 1;
            case '+':
                return 8;
            default:
                return 0;
        }
    }
    ```
    Ini hasilnya:
    ```
    Masukkan ekspresi matematika (infix) : a+b*(c+d-e)/f
    Postfix: ab+cd+e-f/*
    ```


2. Jelaskan alur kerja method **konversi**!

    Jawab: Method konversi adalah method utama dalam proses pengkonversian ke bentuk postfix. Seluruh hasil dari bentuk postfix akan disimpan ke dalam variabel **P** dengan tipe data String.
    - Proses konversi akan dilakukan selama panjang dari String input infix sebelumnya. Panjang disimpan di dalam di variabel **n**.
    - Char c berperan sebagai penyimpan karakter sementara dari String input sebelumnya.
    - Tahap pertama adalah jika karakter **c** adalah operan, maka akan langsung dimasukkan ke variabel **P**.
    - Kemudian, jika karakter **c** adalah `'('`, maka akan masuk ke method `push`. Disini, operator `'('` akan disimpan ke array char `stack`. 
    - Setelah itu, jika karakter **c** adalah `')'`, maka akan melakukan operasi `pop` hingga menemui operator buka kurung `')'`. Hasil dari `pop` ini akan disimpan di variabel **P**.
    - Selanjutnya, jika karakter **c** adalah operator, maka akan melakukan operasi `pop` selama derajat dari top stack lebih tinggi daripada derajat karakter saat ini. Untuk hasil dari `pop` akan disimpan ke **P**

3. Pada method konversi, apa fungsi dari potongan kode berikut?

    ```java
    c = Q.charAt(i);
    ```
    Jawab: Potongan fungsi tersebut bertujuan untuk membaca dan lakukan penyimpanan karakter dari String **Q** pada indeks ke-i

---
### Latihan Praktikum
Ppada Percobaan 1, tambahkan dua method berikut 
pada class Gudang: 
- Method lihatBarangTerbawah digunakan untuk mengecek barang pada tumpukan terbawah 
- Method cariBarang digunakan untuk mencari ada atau tidaknya barang berdasarkan kode barangnya atau nama barangnya

Jawab: 
- Menambahkan method **lihatBarangTerbawah**

    Jawab: Saya melakukan proses ini dengan membuat 3 method baru, yaitu `lihatBarangTerbawah`, `pop`, dan `push`. `pop` dan `push` sebenarnya sama saja dengan method `tambahBarang` dan `ambilBarang` tapi disini saya pisahkan sendiri karena saya tidak ingin mekanisme `push` dan `pop` ini ikut campur dengan proses sebelumnya.

    ```java
    public Barang12 lihatBarangTerbawah() {
        if (!cekKosong()) {
            Barang12 tumpukanSementara[] = new Barang12[size];
            Barang12 barangTerbawah = null;

            // Melakukan proses 'pop' agar bisa tahu data pertama
            for (int i = top; i >= 0; i--) {
                tumpukanSementara[i] = pop();
                if (i == 0) {
                    barangTerbawah = tumpukan[i];
                }
            }

            // Mengembalikan data yang telah di 'pop'
            for (int i = 0; i < tumpukanSementara.length; i++) {
                if (tumpukanSementara[i] != null) {
                    push(tumpukanSementara[i]);
                }
            }
            System.out.printf("\nBarang terbawah: %s", barangTerbawah.nama);
            return barangTerbawah;
        } else {
            System.out.println("Tumpukan barang kosong!");
            return null;
        }
    }

    public Barang12 pop() {
        Barang12 item = tumpukan[top];
        top--;
        return item;
    }

    public void push(Barang12 data) {
        top++;
        tumpukan[top] = data;
    }
    ```
    Contoh output:
    ```
    Tentukan kapasitas gudang terlebih dahulu: 
    >>> 3

    ==============================================
    MENU
    1. Tambah barang
    2. Ambil barang
    3. Lihat barang teratas
    4. Lihat barang terbawah
    5. Tampilkan tumpukan barang
    6. Keluar
    Pilih operasi: 1
    Masukkan kode barang: 12981
    Masukkan nama barang: Jaket
    Masukkan nama kategori: Pakaian

    Barang Jaket berhasil ditambahkan ke gudang
    ==============================================
    MENU
    1. Tambah barang
    2. Ambil barang
    3. Lihat barang teratas
    4. Lihat barang terbawah
    5. Tampilkan tumpukan barang
    6. Keluar
    Pilih operasi: 1
    Masukkan kode barang: 1129
    Masukkan nama barang: Lampu
    Masukkan nama kategori: Elektronik

    Barang Lampu berhasil ditambahkan ke gudang
    ==============================================
    MENU
    1. Tambah barang
    2. Ambil barang
    3. Lihat barang teratas
    4. Lihat barang terbawah
    5. Tampilkan tumpukan barang
    6. Keluar
    Pilih operasi: 1
    Masukkan kode barang: 132
    Masukkan nama barang: Sepatu
    Masukkan nama kategori: Pakaian

    Barang Sepatu berhasil ditambahkan ke gudang
    ==============================================
    MENU
    1. Tambah barang
    2. Ambil barang
    3. Lihat barang teratas
    4. Lihat barang terbawah
    5. Tampilkan tumpukan barang
    6. Keluar
    Pilih operasi: 3

    Barang teratas:  Sepatu
    ==============================================
    MENU
    1. Tambah barang
    2. Ambil barang
    3. Lihat barang teratas
    4. Lihat barang terbawah
    5. Tampilkan tumpukan barang
    6. Keluar
    Pilih operasi: 4

    Barang terbawah: Jaket
    ==============================================
    MENU
    1. Tambah barang
    2. Ambil barang
    3. Lihat barang teratas
    4. Lihat barang terbawah
    5. Tampilkan tumpukan barang
    6. Keluar
    Pilih operasi: 3

    Barang teratas:  Sepatu
    ```
    Pada struktur data **stack**, kita tidak bisa melihat data paling bawah secara langsung karena data tersebut tertimpa data-data lain di atasnya. Maka dari itu saya membuat array baru yang gunanya adalah untuk menampung data lain secara sementara. 

    Untuk lebih detilnya saya menggunakan perulangan *for-loop* untuk proses perpindahan data hingga menemui data paling bawah. Jika sudah mencapai indeks ke-0, maka data sudah ditemukan. Data tersebut disalin ke variabel baru **barangTerbawah**. Karena data sudah ditemukan, maka proses selanjutnya adalah mengembalikan data yang telah dipindah di array lain secara sementara (**tumpukanSementara**). Saya menggunakan *for-loop* juga dan memanggil method `push` yang telah saya buat agar data yang ada bisa ditambahkan.

- Menambahkan method **cariBarang**

    Jawab: Jadi disini saya membuat dua method baru yang bernama `cariBarangNama` dan `cariBarangKode`. Pemisahan ini didasarkan pada perbedaan nilai input yang dimiliki oleh perbedaan input yang dijadikan parameter method. Pada method `cariBarangKode` memiliki input dengan tipe integer sedangkann `cariBarangNama` memiliki input dengan tipe String. Selebihnya proses pencarian sama saja satu sama lain. Untuk lebih detailnya, berikut kode yang telah saya buat:
    ```java
    public Barang12 cariBarangKode(int kodeDicari) {
        if (!cekKosong()) {
            Barang12 tumpukanSementara[] = new Barang12[size];
            Barang12 barangDicari = null;

            // Proses 'pop' sekaligus pencarian data yang diinginkan
            for (int i = top; i >= 0; i--) {                
                if (tumpukan[i].kode == kodeDicari) {
                    barangDicari = tumpukan[i];
                    break;
                }
                tumpukanSementara[i] = pop();
            }

            // Mengembalikan data yang telah di-'pop' ke tempat semula
            for (int i = 0; i < tumpukanSementara.length; i++) {
                if (tumpukanSementara[i] != null) {
                    push(tumpukanSementara[i]);
                }
            }

            if (barangDicari != null) {
                System.out.println(
                    "Barang yang dicari: \n" +
                    "   - Kode : " + barangDicari.kode +
                    "\n   - Nama : " + barangDicari.nama + 
                    "\n   - Kategori : " + barangDicari.kategori
                );
                return barangDicari;
            } else {
                System.out.println("Data tidak ditemukan!");
                return null;
            }
        } else {
            System.out.println("Tumpukan barang kosong!");
            return null;
        }
    }

    public Barang12 cariBarangNama(String namaDicari) {
        if (!cekKosong()) {
            Barang12 tumpukanSementara[] = new Barang12[size];
            Barang12 barangDicari = null;

            // Proses 'pop' sekaligus pencarian data yang diinginkan
            for (int i = top; i >= 0; i--) {               
                if (tumpukan[i].nama.equalsIgnoreCase(namaDicari)) {
                    barangDicari = tumpukan[i];
                    break;
                }
                tumpukanSementara[i] = pop();
            }

            // Mengembalikan data yang telah di-'pop' ke tempat semula
            for (int i = 0; i < tumpukanSementara.length; i++) {
                if (tumpukanSementara[i] != null) {
                    push(tumpukanSementara[i]);
                }
            }

            if (barangDicari != null) {
                System.out.println(
                    "Barang yang dicari: \n" +
                    "   - Kode : " + barangDicari.kode +
                    "\n   - Nama : " + barangDicari.nama + 
                    "\n   - Kategori : " + barangDicari.kategori
                );
                return barangDicari;
            } else {
                System.out.println("Data tidak ditemukan!");
                return null;
            }
        } else {
            System.out.println("Tumpukan barang kosong!");
            return null;
        }
    }
    ```
    Proses pencarian ini sesuai dengan mekanisme stack, yaitu bisa melihat data dari yang paling atas terlebih dahulu. Jika data yang paling atas ini memiliki nilai yang sesuai dengan data yang dicari, maka proses pencarian akan dihentikan dan akan mengembalikan nilai sesuai yang dicari. Jika tidak sesuai, maka akan melakukan proses `pop`, yaitu mengeluarkan data teratas dan data tersebut saya simpan di array sementara `tumpukanSementara`. 

    Setelah proses `pop` selesai, maka proses selanjutnya adalah mengembalikan data yang ada di array `tumpukanSementara` ke kumpulan data sebelumnya. Proses ini dinamakan sebagai `stack`. Dan proses yang terakhir adalah mencetak hasil dari data yang telah ditemukan.

    Berikut adalah contoh hasil output:
    ```
    Tentukan kapasitas gudang terlebih dahulu: 
    >>> 4

    ==============================================
    MENU
    1. Tambah barang
    2. Ambil barang
    3. Cari barang
    4. Lihat barang teratas
    5. Lihat barang terbawah
    6. Tampilkan tumpukan barang
    7. Keluar
    Pilih operasi: 1
    Masukkan kode barang: 883
    Masukkan nama barang: Jaket
    Masukkan nama kategori: Pakaian

    Barang Jaket berhasil ditambahkan ke gudang
    ==============================================
    MENU
    1. Tambah barang
    2. Ambil barang
    3. Cari barang
    4. Lihat barang teratas
    5. Lihat barang terbawah
    6. Tampilkan tumpukan barang
    7. Keluar
    Pilih operasi: 1
    Masukkan kode barang: 732
    Masukkan nama barang: Burger
    Masukkan nama kategori: Makanan

    Barang Burger berhasil ditambahkan ke gudang
    ==============================================
    MENU
    1. Tambah barang
    2. Ambil barang
    3. Cari barang
    4. Lihat barang teratas
    5. Lihat barang terbawah
    6. Tampilkan tumpukan barang
    7. Keluar
    Pilih operasi: 1
    Masukkan kode barang: 123
    Masukkan nama barang: Mouse
    Masukkan nama kategori: Elektronik

    Barang Mouse berhasil ditambahkan ke gudang
    ==============================================
    MENU
    1. Tambah barang
    2. Ambil barang
    3. Cari barang
    4. Lihat barang teratas
    5. Lihat barang terbawah
    6. Tampilkan tumpukan barang
    7. Keluar
    Pilih operasi: 3
    Pilih opsi berikut:
    1. Berdasarkan kode
    2. Berdasarkan nama
    >>> 1
    Masukkan kode barang yang ingin dicari: 883
    Barang yang dicari:
    - Kode : 883
    - Nama : Jaket
    - Kategori : Pakaian

    ==============================================
    MENU
    1. Tambah barang
    2. Ambil barang
    3. Cari barang
    4. Lihat barang teratas
    5. Lihat barang terbawah
    6. Tampilkan tumpukan barang
    7. Keluar
    Pilih operasi: 3
    Pilih opsi berikut:
    1. Berdasarkan kode
    2. Berdasarkan nama
    >>> 1
    Masukkan kode barang yang ingin dicari: 1
    Data tidak ditemukan!

    ==============================================
    MENU
    1. Tambah barang
    2. Ambil barang
    3. Cari barang
    4. Lihat barang teratas
    5. Lihat barang terbawah
    6. Tampilkan tumpukan barang
    7. Keluar
    Pilih operasi: 3
    Pilih opsi berikut:
    1. Berdasarkan kode
    2. Berdasarkan nama
    >>> 2
    Masukkan nama barang yang ingin dicari: Burger
    Barang yang dicari:
    - Kode : 732
    - Nama : Burger
    - Kategori : Makanan

    ==============================================
    MENU
    1. Tambah barang
    2. Ambil barang
    3. Cari barang
    4. Lihat barang teratas
    5. Lihat barang terbawah
    6. Tampilkan tumpukan barang
    7. Keluar
    Pilih operasi: 3
    Pilih opsi berikut:
    1. Berdasarkan kode
    2. Berdasarkan nama
    >>> 2
    Masukkan nama barang yang ingin dicari: Susu
    Data tidak ditemukan!
    ```
