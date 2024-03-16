<div align="center">

# Laporan Praktikum Algoritma dan Struktur Data
## Pertemuan 1

<img src="./" align="center" width="200px">

\
Nama: Farrel Augusta Dinata

NIM: 2341720081

No. Absen: 12

Kelas: TI-1B

</div>

---
### Percobaan 1 - Membuat Array dari Object, Mengisi dan Menampilkan
Hasil kode program yang dibuat:
```
Peresgi panjang ke-0, panjang: 110, lebar: 30
Peresgi panjang ke-0, panjang: 80, lebar: 40
Peresgi panjang ke-0, panjang: 100, lebar: 20
```
**Pertanyaan:**
1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki 
atribut dan sekaligus method? Jelaskan!

    Jawab: Untuk atribut, Iya. Ini karena objek yang akan dibuat nanti bakal dimasukkan ke sebuah array. Untuk memiliki objek di array harus ada atribut sebagai identitas dari tiap-tiap objek. Untuk method, juga harus ada. Method yang langsung ada di class **PersegiPanjang** bisa digunakan untuk proses perhitungan luas atau keliling dari sebuah objek persegi panjang.

2. Apakah class PersegiPanjang memiliki konstruktor? Jika tidak, kenapa dilakukan pemanggilan 
konstruktur pada baris program berikut :
    ```java
    ppArray[1] = new PersegiPanjang();
    ```
    Jawab: Tidak ada konstruktor. Tapi Java akan otomatis membuatkannya secaara default yang berupa konstruktor tanpa parameter. Sehingga saat memanggil konstruktor **PersegiPanjang()** akan tetap bisa dijalankan. 

3. Apa yang dimaksud dengan kode berikut ini!
    ```java
    PersegiPanjang[] ppArray = new PersegiPanjang[3];
    ```
    Jawab: Kode tersebut berarti mendeklarasikan array of object yang bernama **ppArray** dengan panjang 3. 

4. Apa yang dimaksud dengan kode berikut ini:
    ```java
    ppArray[1] = new PersegiPanjang();
    ppArray[1].panjang = 80;
    ppArray[1].lebar = 40;
    ```
    Jawab: Kode tersebut berarti pembuatan sebuah objek baru dengan atribut panjang 80 dan lebar 40.

5. Mengapa class **main** dan juga class **PersegiPanjang** dipisahkan pada uji coba 3.2?

    Jawab: Karena kedua class tersebut memiliki perbedaan fungsi. Class **PersegiPanjang** digunakan untuk menyiapkan objek yang akan digunakan, seperti pembuatan atribut dan method. Sedangkan pada class lain digunakan untuk menjalankan program yang dibuat.

    Pemisahan file ini juga bisa memudahkan dalam mengatur keseluruhan kode yang dibuat.


---
### Percobaan 2 - Menerima Input Isian Array Menggunakan Looping
Hasil program ketika dijalankan:
```
Persegi panjang ke-1
Masukkan panjang: 5
Masukkan lebar: 6
Persegi panjang ke-2
Masukkan panjang: 5
Masukkan lebar: 3
Persegi panjang ke-3
Masukkan panjang: 4
Masukkan lebar: 8
Persegi panjang ke-1
Panjang: 5, lebar: 6
Persegi panjang ke-2
Panjang: 5, lebar: 3
Persegi panjang ke-3
Panjang: 4, lebar: 8
```

**Pertanyaan:**
1. Apakah array of object dapat diimplementasikan pada array 2 Dimensi?
    
    Jawab: Bisa-bisa saja. Caranya mirip dengan pembuatan array of object satu dimensi. Namun dengan menambahkan elemen baru sehingga menjadi 2 dimensi. 

2. Jika jawaban soal no satu iya, berikan contohnya! Jika tidak, jelaskan!
    
    Jawab: Contohnya adalah seperti ini:
    ```java
    PersegiPanjang[][] ppArray = new PersegiPanjang[3][4];

    // Proses instance object
    ppArray[0][0] = new PersegiPanjang();
    ppArray[0][0].panjang = 50;
    ppArray[0][0].lebar = 20;
    ```
    Ini berarti akan membuat sebuah array of object dengan panjang baris 3 dan panjang kolom 4.

3. Jika diketahui terdapat class **Persegi** yang memiliki atribut sisi bertipe integer, maka kode di bahwa ini akan memunculkan error saat dijalankan. Mengapa?
    ```java
    Persegi[] pgArray = new Persegi[100];
    pgArray[5].sisi = 20;
    ```
    Jawab: Kode tersebut error karena tidak melakukan proses instance object terlebih dahulu. Sehingga saat mencoba pemberian nilai ke atribut sisi, program akan bingung karena tidak ada objek yang jelas.

4. Modifikasi kode program pada praktikum 3.3 agar length array menjadi inputan dengan Scanner!
    
    Jawab: 
    Kode program yang saya buat:
    ```java
    package ArrayObjects;
    import java.util.Scanner;

    public class ArrayObjects12 {
        public static void main(String[] args) {
            Scanner sc12 = new Scanner(System.in);

            // PersegiPanjang12[] ppArray = new PersegiPanjang12[3];

            // Percobaan 2 - pertanyaan 4 - modifikasi pembuatan panjang dari array
            System.out.print("Masukkan panjang dari array: ");
            int length = sc12.nextInt();
            PersegiPanjang12[] ppArray = new PersegiPanjang12[length];

            for (int i = 0; i < ppArray.length; i++) {
                ppArray[i] = new PersegiPanjang12();
                System.out.println("Persegi panjang ke-" + (i + 1));
                System.out.print("Masukkan panjang: ");
                ppArray[i].panjang = sc12.nextInt();
                System.out.print("Masukkan lebar: ");
                ppArray[i].lebar = sc12.nextInt();
            }

            for (int i = 0; i < ppArray.length; i++) {
                System.out.println("Persegi panjang ke-" + (i + 1));
                System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
            }
        }
    }
    ```

    Contoh dari output yang bisa dihasilkan:
    ```
    Masukkan panjang dari array: 2
    Persegi panjang ke-1
    Masukkan panjang: 8
    Masukkan lebar: 2
    Persegi panjang ke-2
    Masukkan panjang: 9
    Masukkan lebar: 5
    Persegi panjang ke-1
    Panjang: 8, lebar: 2
    Persegi panjang ke-2
    Panjang: 9, lebar: 5
    ```
    Jadi saya membuat variabel baru dengan nama **length** bertipe integer. Variabel tersebut diisi sesuai dengan keinginan pengguna. Setelah itu, nilai dari variabel **length** akan dijadikan nilai panjang dari array of object **ppArray**.

5. Apakah boleh jika terjadi duplikasi instansiasi array of object, misalkan saja instansiasi dilakukan pada **ppArray[i]** sekaligus **ppArray[0]**? Jelaskan!

    Jawab: Bisa. Duplikasi instansiasi tidak akan kode menjadi eror karena instansiasi disini hanya menyiapkan bahwa akan ada sebuah objek baru yang sedang dibuat. Jadi, tidak akan berpengaruh ke elemen lain.

---
### Percobaan 3 - Penambahan Operasi Matematika di Dalam Method
Hasil program yang telah dibuat:
```
Volume balok ke-1: 36000
Volume balok ke-2: 72000
Volume balok ke-3: 262500
```

**Pertanyaan:**
1. Dapatkah konstruktor berjumlah lebih dalam satu kelas? Jelaskan dengan contoh!
    
    Jawab: Bisa, asalkan konstruktor-konstruktor tersebut memiliki banyak parameter yang berbeda-beda. Contohnya adalah sebuah class yang akan berisi beberapa bangun datar.
    ```java
    public class BangunDatar {
        int sisi, panjang, lebar, sisiA, sisiB, tinggi;

        public BangunDatar(int sisi) {
            this.sisi = sisi;
        }

        public BangunDatar(int panjang, int lebar) {
            this.panjang = panjang;
            this.lebar = lebar;
        }

        public BangunDatar(int sisiA, int sisiB, int tinggi) {
            this.sisiA = sisiA;
            this.sisiB = sisiB;
            this.tinggi = tinggi;
        }
    }
    ```
    Dari ketiga konstruktor tersebut memiliki banyak parameter yang berbeda-beda. Dengan demikian, jika kita hanya memasukkan sebuah argumen ke konstruktor saat instansiasi objek maka program akan mengetahui bahwa itu adalah konstruktor pertama (dengan hanya 1 parameter). Begitupun jika kita memasukkan argumen berjumlah 2 dan 3.

2. Jika diketahui terdapat class **Segitiga** seperti berikut ini:
    ```java
    public class Segitiga {
        public int alas;
        public int tinggi;
    }
    ```
    Tambahkan konstruktor pada class Segitiga tersebut yang berisi parameter int a, int t yang masing-masing digunakan untuk mengisikan atribut alas dan tinggi. 

    Jawab: Ini adalah kode yang saya buat:
    ```java
    package ArrayBalok;

    public class Segitiga12 {
        int alas, tinggi;

        public Segitiga12(int a, int t) {
            alas = a;
            tinggi = t;
        }
    }
    ```
    Saya buat atribut bertipe integer dengan nama alas dan tinggi. Kemudian nilai parameter yang ada di konstruktor akan dimasukkan ke atribut **alas** dan **tinggi**.

3. Tambahkan method hitungLuas() dan hitungKeliling() pada class Segitiga tersebut. Asumsi segitiga adalah segitiga siku-siku. (Hint: Anda dapat menggunakan bantuan library Math pada Java untuk mengkalkulasi sisi miring)

    Jawab: Kode yang saya buat:
    ```java
    public class Segitiga12 {
    int alas, tinggi, luas;
    double sisiMiring, keliling;

        public Segitiga12(int a, int t) {
            alas = a;
            tinggi = t;
        }
        
        public int hitungLuas() {
            luas = (alas * tinggi) / 2;
            return luas;
        }

        public double hitungKeliling() {
            sisiMiring = Math.sqrt((alas * alas) + (tinggi * tinggi));
            keliling = alas + sisiMiring + tinggi;
            return keliling;
        }
    }
    ```
    Selain menambahkan method **hitungLuas()** dan **hitungKeliling()**, saya juga menambahkan atribut baru yaitu **sisiMiring** dan **keliling**.

4. Pada fungsi main, buat array Segitiga sgArray yang berisi 4 elemen, isikan masing-masing 
atributnya sebagai berikut:

    Jawab: Saya membuatnya dengan sebagai berikut:
    ```java
    public static void main(String[] args) {
        Segitiga12[] sgArray = new Segitiga12[4];

        sgArray[0] = new Segitiga12(10, 4);
        sgArray[1] = new Segitiga12(20, 10);
        sgArray[2] = new Segitiga12(15, 6);
        sgArray[3] = new Segitiga12(25, 10);
    }
    ```

5. Kemudian menggunakan looping, cetak luas dan keliling dengan cara memanggil method 
hitungLuas() dan hitungKeliling().

    Jawab: Kode yang saya buat:
    ```java
    // Mencetak luas dari objek yang dibuat
    for (int i = 0; i < sgArray.length; i++) {
        System.out.printf("Luas segitiga ke-%d: %d\n", (i + 1), sgArray[i].hitungLuas());
    }

    // Mencetak keliling dari objek yang dibuat
    for (int i = 0; i < sgArray.length; i++) {
        System.out.printf("Keliling segitiga ke-%d: %.2f\n", (i + 1), sgArray[i].hitungKeliling());
    }
    ```

### Latihan Praktikum
1. Buatlah program yang dapat menghitung luas permukaan dan volume bangun ruang kerucut, limas segi empat sama sisi, dan bola. Buatlah 3 (tiga) class sesuai dengan jumlah jenis bangun ruang. Buatlah satu main class untuk membuat array of objects yang menginputkan atribut
atribut yang ada menggunakan konstruktor semua bangun ruang tersebut. Dengan ketentuan sebagai berikut:

    - Buat looping untuk menginputkan masing-masing atributnya, kemudian tampilkan 
luas permukaan dan volume dari tiap jenis bangun ruang tersebut. 
    - Pada kerucut, inputan untuk atribut hanya jari-jari dan sisi miring
    - Pada limas segi empat sama sisi, inputan untuk atribut hanya panjang sisi alas dan 
tinggi limas
    - Pada bola, inpuntan untuk atribut hanya jari-jari

    Jawab:
    Hasil kode yang dibuat bisa di cek pada link berikut ini -> [Praktikum1](https://github.com/FarrelAD/Ngampus-POLINEMA/tree/main/Semester%202/05-PRAK.%20ALGORITMA%20DAN%20STRUKUR%20DATA/Minggu%203/Tugas/LatihanPraktikum/hitung_luas_permukaan_dan_volume)

2. Sebuah kampus membutuhkan program untuk menampilkan informasi mahasiswa berupa nama, nim, jenis kelamin dan juga IPK mahasiswa. Program dapat menerima input semua informasi tersebut, kemudian menampilkanya kembali ke user Implementasikan program tersebut jika dimisalkan terdapat 3 data mahasiswa yang tersedia. Contoh output program:
    ```
    Masukkan data mahasiswa ke- 1
    Masukkan nama : Rina
    Masukkan nim : 1234567
    Masukkan jenis kelamin : P
    Masukkan IPK : 3.5
    Masukkan data mahasiswa ke- 2
    Masukkan nama : Rio
    Masukkan nim : 7654321
    Masukkan jenis kelamin : L
    Masukkan IPK : 4.0
    Masukkan data mahasiswa ke-3
    Masukkan nama : Reza
    Masukkan nim : 8765398
    Masukkan jenis kelamin : L
    Masukkan IPK : 3.8

    Data Mahasiswa ke-1
    nama: Rina
    nim: 1234567
    Jenis kelamin : P
    Nilai IPK: 3.5
    Data Mahasiswa ke-2
    nama: Rio
    nim: 7654321
    Jenis kelamin : L
    Nilai IPK: 4.0
    Data Mahasiswa ke-3
    nama: Reza
    nim: 8765398
    Jenis kelamin : L
    Nilai IPK: 3.8
    ```
    Jawab: 
    Hasil kode yang dibuat bisa dilihat pada link berikut -> [Praktikum2](https://github.com/FarrelAD/Ngampus-POLINEMA/tree/main/Semester%202/05-PRAK.%20ALGORITMA%20DAN%20STRUKUR%20DATA/Minggu%203/Tugas/LatihanPraktikum/mahasiswa)

3. Modifikasi program Latihan no.2 di atas, sehingga bisa digunakan untuk menghitung rata-rata IPK, 
serta menampilkan data mahasiswa dengan IPK terbesar! (gunakan method untuk masing-masing 
proses tersebut)!

    Jawab:
    Saya modifikasi dengan menambahkan dua method baru seperti ini:
    ```java
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
    ```