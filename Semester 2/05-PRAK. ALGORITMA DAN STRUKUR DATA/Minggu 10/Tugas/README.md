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
## Percobaaan 1 
Hasil dari percobaan 1:
```shell
Masukkan kapasitas queue: 4


Masukkan operasi yang diinginkan: 
   1. Enqueue
   2. Dequeue
   3. Print
   4. Peek
   5. Clear
=====================================
 >>> 1
Masukkan data baru: 15


Masukkan operasi yang diinginkan: 
   1. Enqueue
   2. Dequeue
   3. Print
   4. Peek
   5. Clear
=====================================
 >>> 1
Masukkan data baru: 31


Masukkan operasi yang diinginkan: 
   1. Enqueue
   2. Dequeue
   3. Print
   4. Peek
   5. Clear
=====================================
 >>> 4
Elemen terdepan: 15
```

**Pertanyaan:**
1. Pada konstruktor, mengapa nilai awal atribut front dan rear bernilai -1, sementara atribut size bernilai 0?

    Jawab: Atribut **front** dan **rear** adalah atribut yang menunjukkan titik awal/depan dan titik belakang dari queue. Dikarenakan masih belum ada data yang diisi, maka untuk inisialiasinya diisi dengan nilai `-1` yang tidak mewakili indeks data manapun. Sedangkan **size** bernilai 0 karena masih dengan alasan yang sama, yaitu queue belum menyimpan data sama sekali. Tujuan dari atribut **size** ini adalah untuk mengetahui banyak data yang ada dari queue, jadi jika belum ada datanya, maka size akan otomatis bernilai 0.

2. Pada method `enqueue`, jelaskan maksud dan kegunaan dari potongan kode berikut!
    ```java
    if (rear == max - 1) {
        rear = 0;
    }
    ```
    Jawab: Potongan kode itu memiliki maksud untuk menginisialisasi atribut `rear` bernilai 0. Itu terjadi jika nilai dari front berada pada di indeks terakhir atau sama dengan `max - 1`. Secara konsep, method `enqueue` akan menambahkan data baru begitu pula dengan `rear`. Tapi, apabila rear sudah berada pada indeks terakhir dari queue (yang bisa dicek melalui `max - 1`), maka nilai dari `rear` akan kembali ke `0`.

3. Pada method `dequeue`, jelaskan maksud dan kegunaan dari potongan kode berikut!
    ```java
    if (front == max - 1) {
        front = 0;
    }
    ```
    Jawab: Potongan kode itu artinya menginisialiasikan atribut `front` dengan nilai `0`. Kondisi ini terjadi ketika nilai dari `front` sudah sama dengan `max - 1` atau berada di indeks terakhir queue. Jadi, saat melakukan proses `dequeue` dilakukan, maka data yang ada di indeks `front` akan diambil dan nilai `front` biasanya akan bertambah `1`.  Namun, karena nilai `front` sudah mencapai di akhir indeks, maka sudah tidak bisa melakukan penambahan `1` lagi karena jika dipaksakan bakal terjadi error `java.lang.ArrayIndexOutOfBoundsException`. Maka dari itu, jika sudah mencapai indeks akhir, nilai dari `front` akan kembali ke indeks awal jika masih ada ruang yang tersisa.

4. Pada method `print`, mengapa pada proses perulangan variabel i tidak dimulai dari 0 `(int i = 0)`, melainkan `int i = front`?

    Jawab: Pada struktur data **queue**, program apapun akan dieksekusi jika dia berada di awal terlebih dahulu. Untuk mengetahui posisi di awal itu, maka diperlukan atribut `front` sebagai penanda bahwa itu adalah titik awal/depan dari queue. Karena posisi `front` tidak selalu pada indeks `0`, maka langkah yang tepat untuk melakukan perulangan adalah dengan memulainya dari titik `front` hingga ke titik `rear`. 

5. Perhatikan kembali method `print`, jelaskan maksud dari potongan kode berikut!
    ```java
    i = (i + 1) % max;
    ```
    Jawab: Kode tersebut berarti akan memberikan nilai `i` sesuai dengan hasil perhitungan `(i + 1) % max`. Hasil dari nilai `i` itu adalah antara `0` hingga maksimum size/indeks dikurangi 1. Jadi, jika nilai `i` awal adalah `4` dan nilai `max` adalah `5`, maka untuk nilai `i` selanjutnya adalah `0`, karena (4 + 1) % 4 = 0. Begitu pula seterusnya. Ini tujuannya untuk menginisialiasi nilai `i` pada tahap selanjutnya. 

6. Tunjukkan potongan kode program yang merupakan queue overflow!

    Jawab: Queue overlow adalah kondisi ketika ingin menambahkan data baru padahal data yang ada di queue sudah penuh. Pada class `Queue`, kondisi tersebut bisa terjadi pada bagian berikut:
    ```java
        if (isFull()) {
            System.out.println("Queue sudah penuh");
        } 
    ```

7. Pada saat terjadi queue overflow dan queue underflow, program terebut tetap dapat berjalan dan hanya menampilkan teks informasi. Lakukan modifikasi program sehingga pada saat terjadi queue overflow dan queue underflow, program dihentikan!

    Jawab: Saya menambahkan satu baris kode berikut agar program bisa langsung berhenti ketika sudah mencapai *overflow* atau *underflow*:
    - Pada kasus *underflow*
        ```java
        public int dequeue() {
            int dt = 0;
            if (isEmpty()) {
                System.out.println("Queue masih kosong");
                System.exit(0); // Ini baris baru yang saya tambahkan
            } else {
                // kode lain
            }
        }
        ```
    - Pada kasus *overflow*
        ```java
        public void enqueue(int dt) {
            if (isFull()) {
                System.out.println("Queue sudah penuh");
                System.exit(0); // Ini baris baru yang saya tambahkan
            } else {
                // kode lain
            }
        }
        ```
---
## Percobaan 2
Hasil percobaan 2:
```bash
Masukkan kapasitas queue: 8
Pilihan menu: 
   1. Antrian baru
   2. Antrian keluar
   3. Cek antrian terdepan
   4. Cek semua antrian
=====================================
 >>> 1
No rekening: 12345
Nama: Dewi
Alamat: Malang
Umur: 23
Saldo: 1300000

Pilihan menu: 
   1. Antrian baru
   2. Antrian keluar
   3. Cek antrian terdepan
   4. Cek semua antrian
=====================================
 >>> 1
No rekening: 32940
Nama: Susan
Alamat: Surabaya
Umur: 39
Saldo: 42000000

Pilihan menu:
   1. Antrian baru
   2. Antrian keluar
   3. Cek antrian terdepan
   4. Cek semua antrian
=====================================
 >>> 4
12345 Dewi Malang 23 1300000.0
32940 Susan Surabaya 39 4.2E7
```

**Pertanyaan:**
1. Pada clas `QueueMain`, jelaskan fungsi if pada potongan kode program berikut!
    ```java
        if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) &&
            data.umur != 0 && data.saldo != 0) {
            System.out.println("Antrian yang keluar: " + data.norek + " " + data.nama + " "
                + data.alamat + " " + data.umur + " " + data.saldo);
            break;
        }
    ```
    Jawab: Kode tersebut tujuannya adalah untuk mencetak isi dari objek data, mulai dari norek, nama, alamat, umur, dan saldo. Namun, itu bisa dilakukan asalkan isi/atribut dari objek data tidak kosong atau bernilai 0 jika tipe data atribut integer.

2. Lakukan modifikasi program dengan menambahkan method baru bernama `peekRear` pada class `Queue` yang digunakan untuk mengecek antrian yang berada di posisi belakang! Tambahkan pula daftar menu `5. Cek antrian paling belakang` pada class `QueueMain` sehingga method `peekRear` dapat dipanggil!

    Jawwab: Saya menambahkan `case 5` di switch-case yang ada di class `QueueMain`:
    ```java
        switch (pilihMenu):
            // kode lain
            case 5:
            Nasabah data2 = antri.peakRear();
            if (!"".equals(data2.norek) && !"".equals(data2.nama) && !"".equals(data2.alamat) &&
                data2.umur != 0 && data2.saldo != 0) {
                System.out.println("Antrian yang keluar: " + data2.norek + " " + data2.nama + " "
                    + data2.alamat + " " + data2.umur + " " + data2.saldo);
                break;
            }
            break;

    // kode lain
    ```
    Sedangkan pada class `Queue`, saya menambahkan method `peekRear` yang gunanya adalah untuk melihat data yang ada pada antrian terakhir. Untuk rinciannya sebagai berikut:
    ```java
    public Nasabah peekRear() {
        Nasabah result = new Nasabah();
        if (isEmpty()) {
            System.out.println("Queue masih kosong!");
        } else {
            // Array sementara untuk menampung data yang diambil
            Nasabah[] dataSementara = new Nasabah[size];
            int totalData = 0;

            // Proses dequeue sampai menyentuh index `rear`
            while (front != rear) {
                dataSementara[totalData] = dequeue(); // Memanfaatkan method 'dequeue' untuk mengeluarkan data
                totalData++;

            }
            // Data di elemen terakhir disimpan di variable 
            result = data[front];

            // Proses dequeue data terakhir
            dataSementara[totalData] = dequeue();
            totalData++;

            // Mengembalikan data ke data aslinya
            for (int i = 0; i < totalData; i++) {
                enqueue(dataSementara[i]);
            }

        }
        return result;
    }
    ```
    Pada struktur data Queue, sebuah data hanya bisa diakses dari sisi depan/front. Maka dari itu, saya perlu mengeluarkan satu persatu data yang ada di depan/front kemudian saya simpan di array sementara bernama `dataTemp`. Di sini saya memanfaatkan method yang sudah ada, yaitu `dequeue`. Setelah itu, ketika nilai dari `front` sama dengan `rear`, maka sudah ditemukan nilai yang berada di bagian paling akhir. Tahap selanjutnya adalah mengembalikan data yang ada di `dataTemp` ke data aslinya. Saya juga menggunakan method yang sudah ada, `enqueue` untuk mengembilkan data ke tempat aslinya.

    Contoh hasilnya sebagai berikut:
    ```bash
    Masukkan kapasitas queue: 6


    Pilihan menu: 
    1. Antrian baru
    2. Antrian keluar
    3. Cek antrian terdepan
    4. Cek semua antrian
    5. Cek antrian paling belakang
    =====================================
    >>> 1
    No rekening: 92831
    Nama: Jaya
    Alamat: Jalan Raya
    Umur: 821
    Saldo: 1289182   


    Pilihan menu:
    1. Antrian baru
    2. Antrian keluar
    3. Cek antrian terdepan
    4. Cek semua antrian
    5. Cek antrian paling belakang
    =====================================
    >>> 1
    No rekening: 129831
    Nama: Budi
    Alamat: Jalan Budiman
    Umur: 34
    Saldo: 1290000


    Pilihan menu:
    1. Antrian baru
    2. Antrian keluar
    3. Cek antrian terdepan
    4. Cek semua antrian
    5. Cek antrian paling belakang
    =====================================
    >>> 1
    No rekening: 923891
    Nama: Alex
    Alamat: Jalan Alexis
    Umur: 45
    Saldo: 234000


    Pilihan menu:
    1. Antrian baru
    2. Antrian keluar
    3. Cek antrian terdepan
    4. Cek semua antrian
    5. Cek antrian paling belakang
    =====================================
    >>> 5
    Antrian terakhir: 923891 Alex Jalan Alexis 45 234000.0
    ```
---
## Tugas
1. Buatlah program antrian untuk mengilustrasikan pesanan di sebuah warung. Ketika seorang pembeli akan mengantri, maka dia harus mendaftarkan nama, dan nomor HP seperti yang digambarkan pada class diagram berikut:

    | Pembeli |
    | -- |
    | nama: String |
    | noHP: int |
    | Pembeli(nama: String, noHP: int) |

    Class diagram Queue digambarkan sebagai berikut:
    | Queue |
    | -- |
    | antrian: Pembeli[] |
    | front: int |
    | rear: int | 
    | size: int |
    | max: int |
    | Queue(n: int) |
    | isEmpty(): boolean |
    | isFull(): boolean |
    | enqueue(antri: Pembeli): void |
    | dequeue(): int |
    | print(): void |
    | peek(): void |
    | peekRear(): void |
    | peekPosition(nama: String): void |
    | daftarPembeli(): void |

    Keterangan:
    - Method create(), isEmpty(), isFull(), enqueue(), dequeue(), dan print(), kegunannya sama seperti yang telah dibuat pada praktikum
    - Method peek(): digunakan untuk menampilkan data pembeli yang berada di posisi antrian paling depan
    - Method peekRear(): digunakan untuk menampilkan data Pembeli yang berada di posisi antrian paling belakang
    - Method peekPosition(): digunakan untuk menampilkan seorang pembeli (berdasarkan nama) posisi antrian ke berapa
    - Method daftarPembeli(): digunakan untuk menampilkan data seluruh pembeli

    Jawab:
    Untuk keseluruhan kode yang saya buat bisa cek pada link berikut [klik aku](TugasAkhir). Jadi, saya membuat 3 class, 1) Main, untuk menjalankan program secara keseluruhan; 2) Pembeli, untuk menyimpan data objek pembeli; 3) Queue, untuk melakuakn operasi Queue. Untuk beberapa method di class `Queue`, saya menggunakan method yang sudah ada sebelumnya dan melakukan penyesuaian seperti nama class dan beberapa variabel lainnya. 

    Di sini saya simulasikan sebuah program antrian di sebuah warung bernama **"Lancar Jaya"**. Ini selayaknya pengguna di posisi kasir. Dia bisa menambahkan antrian, menyelesaikan satu antrian, melihat secara keseluruhan antrian, melihat antrian depan dan belakang, dan juga mencari data dari nama yang ada. Saya juga menambahkan opsi untuk keluar dari menu yang bisa diakses di menu nomor 7.

    Contoh output yang dihasilkan dari program yang ada:
    ```bash
    ---SELAMAT DATANG DI WARUNG LANCAR JAYA---
        Anda senang, kami pun senang :)
    ==========================================

    - Masukkan jumlah antrian maksimal: 5


    ==========================================
    1. Tambahkan antrian
    2. Selesaikan antrian
    3. Tampilkan keseluruhan antrian
    4. Tampilkan antrian terdepan
    5. Tampilkan antrian paling belakang
    6. Cari data dari antrian
    7. KELUAR
    >>> 1

    Masukkan antrian ke-1
    - Nama pembeli : Ivon
    - Nomor HP : 127182711


    ==========================================
    1. Tambahkan antrian
    2. Selesaikan antrian
    3. Tampilkan keseluruhan antrian
    4. Tampilkan antrian terdepan
    5. Tampilkan antrian paling belakang
    6. Cari data dari antrian
    7. KELUAR
    >>> 1

    Masukkan antrian ke-2
    - Nama pembeli : Samsul
    - Nomor HP : 12636121


    ==========================================
    1. Tambahkan antrian
    2. Selesaikan antrian
    3. Tampilkan keseluruhan antrian
    4. Tampilkan antrian terdepan
    5. Tampilkan antrian paling belakang
    6. Cari data dari antrian
    7. KELUAR
    >>> 1

    Masukkan antrian ke-3
    - Nama pembeli : Poko
    - Nomor HP : 2864121


    ==========================================
    1. Tambahkan antrian
    2. Selesaikan antrian
    3. Tampilkan keseluruhan antrian
    4. Tampilkan antrian terdepan
    5. Tampilkan antrian paling belakang
    6. Cari data dari antrian
    7. KELUAR
    >>> 1

    Masukkan antrian ke-4
    - Nama pembeli : Nokya
    - Nomor HP : 82746124


    ==========================================
    1. Tambahkan antrian
    2. Selesaikan antrian
    3. Tampilkan keseluruhan antrian
    4. Tampilkan antrian terdepan
    5. Tampilkan antrian paling belakang
    6. Cari data dari antrian
    7. KELUAR
    >>> 6

    Masukkan pembeli yang ingin dicari:
    >>> Pokok

    Data Pokok berada di posisi: 3


    ==========================================
    1. Tambahkan antrian
    2. Selesaikan antrian
    3. Tampilkan keseluruhan antrian
    4. Tampilkan antrian terdepan
    5. Tampilkan antrian paling belakang
    6. Cari data dari antrian
    7. KELUAR
    >>> 3
    --Data seluruh antrian--

    Data ke-1
    - Nama : Ivon
    - No HP : 127182711

    Data ke-2
    - Nama : Samsul
    - No HP : 12636121

    Data ke-3
    - Nama : Poko
    - No HP : 2864121

    Data ke-4
    - Nama : Nokya
    - No HP : 82746124


    ==========================================
    1. Tambahkan antrian
    2. Selesaikan antrian
    3. Tampilkan keseluruhan antrian
    4. Tampilkan antrian terdepan
    5. Tampilkan antrian paling belakang
    6. Cari data dari antrian
    7. KELUAR
    >>> 2

    Pembeli Ivon telah berhasil dilayani!


    ==========================================
    1. Tambahkan antrian
    2. Selesaikan antrian
    3. Tampilkan keseluruhan antrian
    4. Tampilkan antrian terdepan
    5. Tampilkan antrian paling belakang
    6. Cari data dari antrian
    7. KELUAR
    >>> 2

    Pembeli Samsul telah berhasil dilayani!


    ==========================================
    1. Tambahkan antrian
    2. Selesaikan antrian
    3. Tampilkan keseluruhan antrian
    4. Tampilkan antrian terdepan
    5. Tampilkan antrian paling belakang
    6. Cari data dari antrian
    7. KELUAR
    >>> 3
    --Data seluruh antrian--

    Data ke-1
    - Nama : Pokok
    - No HP : 2864121

    Data ke-2
    - Nama : Nokya
    - No HP : 82746124


    ==========================================
    1. Tambahkan antrian
    2. Selesaikan antrian
    3. Tampilkan keseluruhan antrian
    4. Tampilkan antrian terdepan
    5. Tampilkan antrian paling belakang
    6. Cari data dari antrian
    7. KELUAR
    >>> 4
    Data paling depan: Pokok, 2864121


    ==========================================
    1. Tambahkan antrian
    2. Selesaikan antrian
    3. Tampilkan keseluruhan antrian
    4. Tampilkan antrian terdepan
    5. Tampilkan antrian paling belakang
    6. Cari data dari antrian
    7. KELUAR
    >>> 5

    Data paling belakang: Nokya, 82746124


    ==========================================
    1. Tambahkan antrian
    2. Selesaikan antrian
    3. Tampilkan keseluruhan antrian
    4. Tampilkan antrian terdepan
    5. Tampilkan antrian paling belakang
    6. Cari data dari antrian
    7. KELUAR
    >>> 7
    ==========================================
    -- Anda telah keluar dari sistem --
    ==========================================
    ```