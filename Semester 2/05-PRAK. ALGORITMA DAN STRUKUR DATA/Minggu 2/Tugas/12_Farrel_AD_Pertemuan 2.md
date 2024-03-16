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
### Percobaan 1 - Deklarasi Class, Atribut dan Method
Full kode program yang telah dibuat bisa klik link berikut: [disini](https://github.com/FarrelAD/Ngampus-POLINEMA/blob/main/Semester%202/05-PRAK.%20ALGORITMA%20DAN%20STRUKUR%20DATA/Minggu%202/Tugas/Buku12.java)

Hasil awal code:
```
Error: Main method not found in class Buku12, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application
```
Akan muncul error karena tidak ada method main

Pertanyaan:

1. **Sebutkan dua karakteristik class atau object!**

    Jawab: Class: terdapat atribut yang bisa diganti saat instansiasi objek, sebuah blueprint yang artinya merupakan sebuah template yang bisa digunakan berulang kali. Object: harus memiliki class agar bisa diinstansiasikan, tiap object bisa memiliki atribut/identitas yang berbeda.

2. **Perhatikan class Buku pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class Buku? Sebutkan apa saja atributnya!**

    Jawab: Ada 5 atribut, yaitu judul, pengarang, halaman, stok, dan harga.

3. **Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya!**

    Jawab: Ada 4 method, yaitu tampilInformasi(), terjual(), restock(), dan gantiHarga().

4. **Perhatikan method terjual() yang terdapat di dalam class Buku. Modifikasi isi method tersebut sehingga proses pengurangan hanya dapat dilakukan jika stok masih ada (lebih besar dari 0)!**

    Jawab: Hasil modifikasi pada method terjual():
    ```java
    void terjual(int jml) {
        if (stok > 0) {
            stok -= jml;
        }
    }
    ```
    Dengan demikian, method ini akan bekerja jika jumlah stoknya lebih dari 0.

5. **Menurut Anda, mengapa method restock() mempunyai satu parameter berupa bilangan int?** 

    Jawab: Karena untuk menambah stok, berarti hanya butuh satu elemen yaitu stok baru yang ingin ditambahkan. Maka dari itu, hanya butuh satu parameter.

6. **Commit dan push kode program ke Github!**

    Jawab: https://github.com/FarrelAD/Ngampus-POLINEMA/tree/main/Semester%202/05-PRAK.%20ALGORITMA%20DAN%20STRUKUR%20DATA/Minggu%202/Tugas
---
### Percobaan 2 - Instansiasi Object, serta Mengakses Atribut dan Method
Full kode program yang telah dibuat bisa klik link berikut: [disini](https://github.com/FarrelAD/Ngampus-POLINEMA/blob/main/Semester%202/05-PRAK.%20ALGORITMA%20DAN%20STRUKUR%20DATA/Minggu%202/Tugas/BukuMain12.java)

Hasil kode yang telah dibuat:
```
Judul : Today Ends Tomorrow Comes
Pengarang : Denanda Pratiwi
Jumlah halamab : 198
Sisa stok : 13
Harga: Rp71000
Judul : Today Ends Tomorrow Comes
Pengarang : Denanda Pratiwi
Jumlah halamab : 198
Sisa stok : 8
Harga: Rp60000
```

**Pertanyaan:**

1. **Pada class BukuMain, tunjukkan baris kode program yang digunakan untuk proses instansiasi!** 
Apa nama object yang dihasilkan?

    Jawab: Baris yang menunjukkan proses instansiasi:
    ```java
    public static void main(String[] args) {
        Buku12 bk1 = new Buku12();
        // other statement
    }
    ```
    Baris Buku12 bk1 = new Buku12(); adalah baris yang melakukan proses instansiasi. Untuk objek yang dihasilkan adalah **bk1**

2. **Bagaimana cara mengakses atribut dan method dari suatu objek?** 

    Jawab: Caranya adalah dengann menggunakan nama objek kemudian dilanjutkan dengan nama dari atribut atau method. Misalnya, pada baris ini: 
    ```java
        bk1.judul = "Today Ends Tomorrow Comes";
    ```
    Di situ melakukan akses terhadap atribut dan melakukan pemberian nilai terhadap atribut yang bernama judul dengan nama "Today Ends Tomorrow Comes".

3. **Mengapa hasil output pemanggilan method tampilInformasi() pertama dan kedua berbeda?**

    Jawab: Karena hasil tampilInformasi() yang kedua menampilkan atribut yang telah dirubah pada baris sebelumnya. Lebih tepatnya pada baris kode berikut:
    ```java
        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
    ```


---
### Percobaan 3 - Membuat Konstruktor
Full kode program bisa diakses pada link berikut: [file_pertama](https://github.com/FarrelAD/Ngampus-POLINEMA/blob/main/Semester%202/05-PRAK.%20ALGORITMA%20DAN%20STRUKUR%20DATA/Minggu%202/Tugas/Buku12.java) dan [file_kedua](https://github.com/FarrelAD/Ngampus-POLINEMA/blob/main/Semester%202/05-PRAK.%20ALGORITMA%20DAN%20STRUKUR%20DATA/Minggu%202/Tugas/BukuMain12.java)

Hasil kode yang dibuat:
```
Judul : Today Ends Tomorrow Comes
Pengarang : Denanda Pratiwi
Jumlah halaman : 198
Sisa stok : 13
Harga: Rp71000
Judul : Today Ends Tomorrow Comes    
Pengarang : Denanda Pratiwi
Jumlah halaman : 198
Sisa stok : 8
Harga: Rp60000
Judul : Self Reward
Pengarang : Maheera Ayesha
Jumlah halaman : 160
Sisa stok : 18
Harga: Rp59000
```
Pertanyaan:
1. **Pada class Buku di Percobaan 3, tunjukkan baris kode program yang digunakan untuk mendeklarasikan konstruktor berparameter!** 

    Jawab: Bagian ini adalah yang mendeklarasikan konstruktor dengan parameter
    ```java
    public Buku12(String jud, String pg, int hal, int stok, int har) {
            judul = jud;
            pengarang = pg;
            halaman = hal;
            this.stok = stok;
            harga = har;
    }
    ```

2. **Perhatikan class BukuMain. Apa sebenarnya yang dilakukan pada baris program berikut?** 

    ```java
    Buku bk2 = new Buku("Self Reward", "Maheera Ayesha", 160, 29, 59000);
    ```

    Jawab: Baris tersebut artinya melakukan instansiasi objek baru yang bernama bk2 dengan memberikan nilai ke parameter konstruktor.

3. **Hapus konstruktor default pada class Buku, kemudian compile dan run program. Bagaimana hasilnya? Jelaskan mengapa hasilnya demikian!**

    Jawab: Akan muncul pesan eror seperti ini:
    ```
    Exception in thread "main" java.lang.Error: Unresolved compilation problem:     
        The constructor Buku12() is undefined

        at BukuMain12.main(BukuMain12.java:9)
    ```
    Ini karena pada instansiasi objek yang bernama **bk1**, perlu memanggil konstruktor tanpa parameter. Pada saat pemanggilan, program tidak bisa menemukan konstruktor dengan tanpa parameter. Maka yang terjadi adalah eror.


4. **Setelah melakukan instansiasi object, apakah method di dalam class Buku harus diakses secara berurutan? Jelaskan alasannya!** 

    Jawab: Tidak harus. Jika sebuah method sudah dibuat, objek apapun itu bisa dengan mudah mengakses method yang sudah dibuat. Tapi jika memang method tersebut harus dijalankan secara berurutan maka harus dieksekusi secara urut agar hasil yang diinginkan sesuai. 

5. **Buat object baru dengan nama buku<NamaMahasiswa> menggunakan konstruktor berparameter dari class Buku!**

    Jawab: Kode yang saya buat akan menjadi seperti ini
    ```java
    public class BukuMain12 {
        public static void main(String[] args) {
            // other statements

            // Create a new object with my name as the object name
            Buku12 bukuFarrel = new Buku12("Atomic Habits", "James Clear", 352, 4, 85000);
        }
    }
    ```

6. **Commit dan push kode program ke Github!**

    Jawab: Hasil commit dan push ada di link berikut:

    https://github.com/FarrelAD/Ngampus-POLINEMA/tree/main/Semester%202/05-PRAK.%20ALGORITMA%20DAN%20STRUKUR%20DATA/Minggu%202/Tugas

---
### 2.4 Latihan Praktikum
1. Pada class **Buku**, tambahkan tiga method, yaitu **hitungHargaTotal(), hitungDiskon()**, dan **hitungHargaBayar()**

    Class diagram dari nomor 1:
    | Buku |
    | -- |
    | judul: String <br> pengarang: String <br> halaman: int <br> stok: int <br> harga: int |
    | tampilInformasi(): void <br> terjual(jml: int) : void <br> restock(n: int) : void <br> gantiHarga(hrg: int) : int <br> hitungHargaTotal(): void <br> hitungDiskon(): int <br> hitungHargaBayar(): void |

    Jawab: Hasil full code dari file [**Buku.java**](https://github.com/FarrelAD/Ngampus-POLINEMA/blob/main/Semester%202/05-PRAK.%20ALGORITMA%20DAN%20STRUKUR%20DATA/Minggu%202/Tugas/Buku12.java)
    ```java
    // PRAKTIKUM ALGORITMA DAN STRUKTUR DATA
    // JOBSHEET 2 
    // 21 Februari 2024

    public class Buku12 {
        
        String judul, pengarang;
        int halaman, stok, harga, terjual;

        // Default constructor without parameter
        public Buku12() {

        }

        // Constructor with some parameter
        public Buku12(String jud, String pg, int hal, int stok, int har) {
            judul = jud;
            pengarang = pg;
            halaman = hal;
            this.stok = stok;
            harga = har;
        }

        void tampilInformasi() {
            System.out.println("Judul : " + judul);
            System.out.println("Pengarang : " + pengarang);
            System.out.println("Jumlah halaman : " + halaman);
            System.out.println("Sisa stok : " + stok);
            System.out.println("Harga: Rp" + harga);
            System.out.println("Harga total: " + hitungHargaTotal());
            System.out.println("Diskon: " + hitungDiskon());
            System.out.println("Harga bayar: " + hitungHargaBayar());
            System.out.println("----------------------------------\n");
        }
        
        void terjual(int jml) {
            // Old code
            // stok -= jml;

            // Modified code
            terjual = jml;
            if (stok > 0) {
                stok -= jml;
            }
        }

        void restock(int jml) {
            stok += jml;
        }

        void gantiHarga(int hrg) {
            harga = hrg;
        }



        // Practical Training - NEW CODE!!
        int hitungHargaTotal() {
            return harga * terjual;
        }

        int hitungDiskon() {
            if (hitungHargaTotal() > 150000) {
                return (int) (hitungHargaTotal() * 0.12);
            } else if (hitungHargaTotal() == 75000 || hitungHargaTotal() == 150000) {
                return (int) (hitungHargaTotal() * 0.05);
            } else {
                return 0;
            }
        }

        int hitungHargaBayar() {
            int hargaTotal = hitungHargaTotal();
            return hargaTotal -= hitungDiskon();
        }
    }
    ```
    Pada method hitungDiskon() dan hitungHargaBayar() saya memanfaatkan method yang sudah ada untuk diolah kembali dan menghasilkan nilai baru. Disini saya juga menambahkan variabel baru yang bisa diakses secara global **terjual** untuk menampung jumlah barang yang terjual dari input pengguna. 

2. Membuat program berdasarkan class diagram berikut!

    | Dragon |
    |---|
    | x: int <br> y: int <br> width: int <br> height: int |
    | moveLeft(): void <br> moevRight(): void <br> moveUp(): void <br> moveDown(): void <br> printPosition(): void <br> detectCollision(x: int, y: int): void <br> 

    Jawab: Hasil full code dari file [**Dragon.java**](https://github.com/FarrelAD/Ngampus-POLINEMA/blob/main/Semester%202/05-PRAK.%20ALGORITMA%20DAN%20STRUKUR%20DATA/Minggu%202/Tugas/Dragon.java)
    ```java
    // PRAKTIKUM ALGORITMA DAN STRUKTUR DATA
    // JOBSHEET 2 
    // 21 Februari 2024

    import java.util.Scanner;

    public class Dragon {
        // Below is the attribute of the Dragon class
        int x, y, width, height;
        boolean isContinue = false;


        // Below is method for Dragon class
        void moveLeft() {
            x--;

            if (x < 0) {
                detectCollision(x, y);
            }
        }

        void moveRight() {
            x++;

            if (x > width) {
                detectCollision(x, y);
            }
        }

        void moveUp() {
            y++;

            if (y > height) {
                detectCollision(x, y);
            }
        }

        void moveDown() {
            y--;

            if (y < 0) {
                detectCollision(x, y);
            }
        }

        void detectCollision(int x, int y) {
            isContinue = true;
            System.out.println("------------------------------------");
            System.out.println("GAME OVER!");
            System.out.println("------------------------------------");
        }

        void printPosition() {
            System.out.printf("POSITION x: %d - y: %d\n", x, y);
        }

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            Dragon myDragon = new Dragon();

            System.out.print(
                "SET UP YOUR PLAYING AREA\n" +
                "- HEIGHT : "
            );
            myDragon.height = scan.nextInt();
            System.out.print("- WIDTH : ");
            myDragon.width = scan.nextInt();

            System.out.println("------------------------------------");

            do {
                System.out.print(
                    "PILIH ARAH!\n" +
                    "1. KE ATAS\n" +
                    "2. KE BAWAH\n" +
                    "3. KE KANAN\n" +
                    "4. KE KIRI\n" +
                    "input> "
                );
                int direction = scan.nextInt();

                switch (direction) {
                    case 1:
                        myDragon.moveUp();
                        break;
                    case 2:
                        myDragon.moveDown();
                        break;
                    case 3:
                        myDragon.moveRight();
                        break;
                    case 4:
                        myDragon.moveLeft();
                        break;
                    default:
                        break;
                }
                // Print the dragon position
                myDragon.printPosition();
                System.out.println("------------------------------------");
            } while (!myDragon.isContinue);
        }
    }
    ```
    Dan ini adalah contoh dari output yang dihasilkan dari program yang saya buat:
    ```
    SET UP YOUR PLAYING AREA
    - HEIGHT : 3
    - WIDTH : 2
    ------------------------------------
    PILIH ARAH!
    1. KE ATAS
    2. KE BAWAH
    3. KE KANAN
    4. KE KIRI
    input> 3
    POSITION x: 1 - y: 0
    ------------------------------------
    PILIH ARAH!
    1. KE ATAS
    2. KE BAWAH
    3. KE KANAN
    4. KE KIRI
    input> 3
    POSITION x: 2 - y: 0
    ------------------------------------
    PILIH ARAH!
    1. KE ATAS
    2. KE BAWAH
    3. KE KANAN
    4. KE KIRI
    input> 3
    ------------------------------------
    GAME OVER!
    ------------------------------------
    POSITION x: 3 - y: 0
    ------------------------------------
    ```
    Saya menambahkan method main agar program bisa dijalankan. Saya juga melakukan kreasi pada mekanisme permainan yaitu dengan memungkinkan pengguna untuk bisa kustom width dan height dari area permainan dan  menggunakan looping sehingga pengguna bisa melakukan permainan secara terus-menerus selagi tidak **game over**.