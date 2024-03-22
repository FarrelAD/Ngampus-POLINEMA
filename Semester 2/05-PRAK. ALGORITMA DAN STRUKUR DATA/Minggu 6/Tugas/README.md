<div align="center">

# Laporan Praktikum Algoritma dan Struktur Data
## Pertemuan 5

<img src="../../../../assets/logo-polinema.png" align="center" width="200px">

\
Nama: Farrel Augusta Dinata

NIM: 2341720081

No. Absen: 12

Kelas: TI-1B

</div>

---
### Percobaan 1 - Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Bubble Sort
Hasil percobaan:
```java
Data mahasiswa sebelum sorting = 
Nama = Nusa
Tahun masuk = 2017
Umur = 25
IPK = 3.0
========================
Nama = Rara
Tahun masuk = 2012
Umur = 19
IPK = 4.0
========================
Nama = Dompu
Tahun masuk = 2018
Umur = 19
IPK = 3.5
========================
Nama = Abdul
Tahun masuk = 2017
Umur = 23
IPK = 2.0
========================
Nama = Ummi
Tahun masuk = 2019
Umur = 21
IPK = 3.75
========================
Data mahasiswa setelah sorting desc berdasarkan IPK (BUBBLE SORT)
Nama = Rara
Tahun masuk = 2012
Umur = 19
IPK = 4.0
========================
Nama = Ummi
Tahun masuk = 2019
Umur = 21
IPK = 3.75
========================
Nama = Dompu
Tahun masuk = 2018
Umur = 19
IPK = 3.5
========================
Nama = Nusa
Tahun masuk = 2017
Umur = 25
IPK = 3.0
========================
Nama = Abdul
Tahun masuk = 2017
Umur = 23
IPK = 2.0
========================
```

**Pertanyaan**
1. Terdapat di method apakah proses bubble sort?

    Jawab: Method bubble sort berada di method **bubbleSort()** yang bertipe void dan berada di dalam class **DaftarMahasiswa.java**
    ```java
        void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    Mahasiswa tmp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }
    ```
2. Di dalam method bubbleSort(), terdapat baris program seperti di bawah ini:
    ```java
    if (listMhs[j].ipk > listMhs[j - 1].ipk) {
        Mahasiswa tmp = listMhs[j];
        listMhs[j] = listMhs[j - 1];
        listMhs[j - 1] = tmp;
    }
    ```
    Untuk apakah proses tersebut?

    Jawab: Proses tersebutlah yang menjadi proses utama dalam bubble sort. Data IPK yang ada pada indeks j akan ditukarkan dengan data IPK pada indeks [j - 1] jika nilai dari IPK pada indeks j lebih besar dari indeks [j - 1]. Proses ini terus berlanjut sesuai dengan iterasi yang ada sehingga data **listMhs** akan terurut berdasarkan nilai IPK dari terbesar hingga ke terkecil.

3. Perhatikan perulangan di dalam **bubbleSort()** di bawah ini!
    ```java
    for (int i = 0; i < listMhs.length - 1; i++>) {
        for (int j = 1; j < listMhs.length - i; j++>) {

        }
    }
    ```
    - Apakah perbedaan antara kegunaan perulangan i dan perulangan j?
    
        Jawab: Perulangan **i** akan mengulangi sebanyak panjang dari array **listMhs** dikurangi 1. Ini tujuannya untuk mengulang proses bubble sort karena di dalam proses bubble sort, proses swapping tidak langsung membuat datanya menjadi terurut. Sedangkan pada perulangan **j**, akan melakukan proses perulangan yang tujuannya adalah swapping antar bilangan yang saling berdekatan.
    - Mengapa syarat dari perulangan i adalah i < listMhs.length - 1?
        
        Jawab: Hal utama yang harus dilakukan pada proses perulangan **i** adalah untuk mengulang-ulang proses swapping hingga menjadi terurut. Karena bubble sort hanya membandingkan kedua nilai, jadi bisa saja datanya masih tidak terurut. Maka dari itu proses swapping di bubble sort harus diulang sebanyak elemen yang dimiliki. Panjang dari elemen array dikurangi 1 karena iterasi yang terakhir sudah pasti datanya terurut. Jadi tidak perlu dilakukan iterasi lagi.
    - Mengapa syarat dari perulangan j adalah j < listMhs.length - i; j++?

        Jawab: Karena pada setiap proses setelah swapping di bubble sort, data yang paling kanan dari sebuah array sudah pasti terurut. Jadi tidak perlu dilakukan proses swapping.
    - Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan i akan berlangsung? Dan ada berapa tahap bubble sort yang ditempuh?

        Jawab: Iterasi pada **i** akan dilakukan sebanyak 49 kali dari hasil **listMhs.length - 1**. Sedangkan untuk jumlah tahapnya akan sesuai dengan tahapan iterasi pada **j** selama iterasi i berlangsung. Hasilnya adalah **1225** yang didapat dari hasil 49 + 48 + 47 + 46 + 45 + ... + 1 = 1225.

---
### Percobaan 2 - Mengurutkan Data Mahasiswa Berdaasarkan IPK Menggunakan Selection Sort
Hasil percobaan
```java
Data mahasiswa sebelum sorting = 
Nama = Nusa
Tahun masuk = 2017
Umur = 25
IPK = 3.0
========================
Nama = Rara
Tahun masuk = 2012
Umur = 19
IPK = 4.0
========================
Nama = Dompu
Tahun masuk = 2018
Umur = 19
IPK = 3.5
========================
Nama = Abdul
Tahun masuk = 2017
Umur = 23
IPK = 2.0
========================
Nama = Ummi
Tahun masuk = 2019
Umur = 21
IPK = 3.75
========================
Data mahasiswa setelah sorting desc berdasarkan IPK (BUBBLE SORT)
Nama = Rara
Tahun masuk = 2012
Umur = 19
IPK = 4.0
========================
Nama = Ummi
Tahun masuk = 2019
Umur = 21
IPK = 3.75
========================
Nama = Dompu
Tahun masuk = 2018
Umur = 19
IPK = 3.5
========================
Nama = Nusa
Tahun masuk = 2017
Umur = 25
IPK = 3.0
========================
Nama = Abdul
Tahun masuk = 2017
Umur = 23
IPK = 2.0
========================
Data mahasiswa setelah sorting asc berdasarkan IPK (SELECTION SORT)
Nama = Abdul
Tahun masuk = 2017
Umur = 23
IPK = 2.0
========================
Nama = Nusa
Tahun masuk = 2017
Umur = 25
IPK = 3.0
========================
Nama = Dompu
Tahun masuk = 2018
Umur = 19
IPK = 3.5
========================
Nama = Ummi
Tahun masuk = 2019
Umur = 21
IPK = 3.75
========================
Nama = Rara
Tahun masuk = 2012
Umur = 19
IPK = 4.0
========================
```

**Pertanyaan**

Di dalam method selection sort, terdapat baris program seperti di bawah ini:
```java
int idxMin = i;
for (int j = i +1; j < listMhs.length; j++>) {
    if (listMhs[j].ipk < listMhs[idxMin].ipk>) {
        idxMin = j;
    }
}
```
Untuk apakah proses tersebut, jelaskan!

Jawab: Untuk menentukan indeks pada array of object **listMhs** dengan nilai IPK terendah. Jadi, program akan menentukan nilai awal dengan IPK terendah berada pada indeks ke 0 (sehingga nilai **idxMin** = 0). Setelah itu, dicek apakah nilai dari array of object pada indeks ke-j lebih kecil dari nilai **listMhs** dengan indeks sebelumnya. Jika iya, maka nilai indeks akan diupdate (ini akan mengubah nilai **idxMin**). Proses ini berlangsung selama nilai i tidak lebih dari panjang array of object **listMhs**.

---
### Percobaan 3 - Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Insertion Sort
Hasil percobaan
```java
Data mahasiswa sebelum sorting = 
Nama = Nusa
Tahun masuk = 2017
Umur = 25
IPK = 3.0
========================
Nama = Rara
Tahun masuk = 2012
Umur = 19
IPK = 4.0
========================
Nama = Dompu
Tahun masuk = 2018
Umur = 19
IPK = 3.5
========================
Nama = Abdul
Tahun masuk = 2017
Umur = 23
IPK = 2.0
========================
Nama = Ummi
Tahun masuk = 2019
Umur = 21
IPK = 3.75
========================
Data mahasiswa setelah sorting desc berdasarkan IPK (BUBBLE SORT)
Nama = Rara
Tahun masuk = 2012
Umur = 19
IPK = 4.0
========================
Nama = Ummi
Tahun masuk = 2019
Umur = 21
IPK = 3.75
========================
Nama = Dompu
Tahun masuk = 2018
Umur = 19
IPK = 3.5
========================
Nama = Nusa
Tahun masuk = 2017
Umur = 25
IPK = 3.0
========================
Nama = Abdul
Tahun masuk = 2017
Umur = 23
IPK = 2.0
========================
Data mahasiswa setelah sorting asc berdasarkan IPK (SELECTION SORT)
Nama = Abdul
Tahun masuk = 2017
Umur = 23
IPK = 2.0
========================
Nama = Nusa
Tahun masuk = 2017
Umur = 25
IPK = 3.0
========================
Nama = Dompu
Tahun masuk = 2018
Umur = 19
IPK = 3.5
========================
Nama = Ummi
Tahun masuk = 2019
Umur = 21
IPK = 3.75
========================
Nama = Rara
Tahun masuk = 2012
Umur = 19
IPK = 4.0
========================
Data mahasiswa setelah sorting asc berdasarkan IPK (INSERTION SORT)
Nama = Abdul
Tahun masuk = 2017
Umur = 23
IPK = 2.0
========================
Nama = Nusa
Tahun masuk = 2017
Umur = 25
IPK = 3.0
========================
Nama = Dompu
Tahun masuk = 2018
Umur = 19
IPK = 3.5
========================
Nama = Ummi
Tahun masuk = 2019
Umur = 21
IPK = 3.75
========================
Nama = Rara
Tahun masuk = 2012
Umur = 19
IPK = 4.0
========================
```

**Pertanyaan**

Ubahlah fungsi pada **insertionSort** sehingga fungsi ini dapat melaksanakan proses sorting dengan cara descending!

Jawab: Saya buat dengan kode berikut ini:
```java
void insertionSortDesc() {
    // DESCENDING SORT
    for (int i = 0; i < listMhs.length; i++) {
        Mahasiswa temp = listMhs[i];
        int j = i;
        while (j > 0 && listMhs[j - 1].ipk < temp.ipk) {
            listMhs[j] = listMhs[j -1];
            j--;
        }
        listMhs[j] = temp;
    }
}
```
Disini saya hanya mengubah tanda operator pembanding yang ada di antara **listMhs[j - 1].ipk < temp.ipk**. Dengan demikian, jika nilai IPK array **listMhs** pada indeks [j - 1] lebih kecil dari nilai IPK yang ada di objek **temp**, akan terjadi proses swap ke kiri hingga nilai j sama dengan 0.

Outputnya seperti ini:
```
Data mahasiswa setelah sorting desc berdasarkan IPK (INSERTION SORT)
Nama = Rara
Tahun masuk = 2012
Umur = 19
IPK = 4.0
========================
Nama = Ummi
Tahun masuk = 2019
Umur = 21
IPK = 3.75
========================
Nama = Dompu
Tahun masuk = 2018
Umur = 19
IPK = 3.5
========================
Nama = Nusa
Tahun masuk = 2017
Umur = 25
IPK = 3.0
========================
Nama = Abdul
Tahun masuk = 2017
Umur = 23
IPK = 2.0
========================
```
---
### Latihan Praktikum
Sebuah platform travel yang menyediakan layanan pemesanan kebutuhan travelling sedang mengembangkan backend untuk sistem pemesanan/reservasi akomodasi (penginapan), salah satu fiturnya adalah menampilkan daftar penginapan yang tersedia berdasarkan pilihan filter yang diinginkan user.Daftar penginapan ini harus dapat disorting berdasarkan:
1. Harga dimulai dari harga termurah ke harga tertinggi
2. Rating bintang penginapan dari bintang tertinggi (5) ke terendah (1)
Buatlah proses sorting data untuk kedua filter teresbut dengan menggunakan algoritma **bubble sort** dan **selection sort**!

| HotelService | 
| -- | 
| -rooms: Hotel |
| +tambah(Hotel H) : void |
| +tampilAll() : void |
| +bubbleSort() : void |
| +selectionSort() : void |

| Hotel |
| -- |
| -nama: String |
| -kota: String |
| -harga: int |
| -bintang: Byte |
| +Hotel (String n, String k, int h, Byte b): void |

| MainHotel |
| -- |
| +Main(String[] abcd): void |


Jawab: Hasil kode program yang saya buat bisa dilihat pada link berikut: [code di github](./bubble-sort-insertion/src%20[MY%20CODES%20ARE%20HERE]/latihan_praktikum/)

*Cuplikan sebagian code di class HotelService:*
```java
public class HotelService {
    Hotel allHotels[] = new Hotel[13];

    static NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

    void tambah(Hotel h) {
        for (int i = 0; i < allHotels.length; i++) {
            if (allHotels[i] == null) {
                allHotels[i] = h;
                break;
            }
        }

        boolean isFull = true;
        for (Hotel hotel : allHotels) {
            if (hotel == null) {
                isFull = false;
                break;
            }
        }

        if (isFull) {
            System.out.println("Data sudah penuh!");
        }
    }
}
```
Disini saya tidak membuat atribut idx sebagai penanda berapa jumlah yang ada di array hotel. Saya melakukannya dengan pengecekan apakah array pada indeks tersebut *null* atau tidak. Jika iya, maka data baru bisa ditambahkan. Namun, jika tidak bisa menemukan elemen di array yang masih *null*, maka berarti array sudah penuh dan data baru tidak bisa ditambahkan. Disini saya mengatur nilai array sebanyak 13 nilai dengan data yang terisi sebanyak 4.


Pada baris code ini: 
```java
static NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
```
Bertujuan untuk memformat tampilan harga yang berupa integer menjadi menyerupai format mata uang di Indonesia. Output yang dihasilkan menjadi seperti ini ```Harga : Rp800.000,00```.

Proses pengurutan harga terendah ke tertinggi saya lakukan dengan proses **bubble sort**
```java
    void bubbleSort() {
        // Bubble sort untuk mengurutkan harga dari termurah ke tertinggi
        for (int i = 0; i < allHotels.length - 1; i++) {
            for (int j = 1; j < allHotels.length - i; j++) {
                if (allHotels[j] != null && allHotels[j - 1] != null) {
                    if (allHotels[j].harga < allHotels[j - 1].harga) {
                        Hotel temp = allHotels[j];
                        allHotels[j] = allHotels[j - 1];
                        allHotels[j - 1] = temp;
                    }
                }
            }
        }
    }
```
Sedangkan untuk pengurutan rating dari tertinggi ke terendah saya lakukan dengan algoritma **insertion sort**
```java
    void selectionSort() {
        // Selection sort untk mengurutkan rating bintang tertinggi ke terendah
        for (int i = 1; i < allHotels.length; i++) {
            if (allHotels[i] != null) {
                Hotel temp = allHotels[i];
                int j = i;
                while (j > 0 && allHotels[j - 1].bintang < temp.bintang) {
                    allHotels[j] = allHotels[j - 1];
                    j--;
                }
                allHotels[j] = temp;
            }
        }
    }
```

Pada fungsi **MainHotel.java**, saya membuat **switch case** untuk pemilihan filter yang akan digunakan. Jika pengguna memilih opsi menu nomor 1, maka akan menggunakan bubble sort untuk pengurutan harga. Jika pengguna memilih opsi menu nomor 2, maka akan menggunakan insertion sort untuk pengurutan rating.
```java
    System.out.print(
        "===============================================\n" +
        "Filter daftar hotel? (Y/T) >>> "
    );
    char konfirmasiFilter = sc.next().charAt(0);

    if (Character.toUpperCase(konfirmasiFilter) == 'Y') {
        System.out.print(
            "Urutkan berdasarkan: \n" +
            "   1. Harga\n" +
            "   2. Rating\n" +
            ">>> "
        );
        int pilihanFilter = sc.nextInt();
        System.out.println("===============================================");
        switch (pilihanFilter) {
            case 1:
                // Mengurutkan berdasarkan data harga termurah ke tertinggi
                System.out.println("List harga hotel dari yang paling termurah");
                listHotels.bubbleSort();
                break;
            case 2:
                // Mengurutkan berdasarkan data rating tertinggi ke terendah
                System.out.println("List harga hotel dari rating paling tinggi");
                listHotels.selectionSort();
                break;
            default:
                System.out.println("Input anda salah!");
                break;
        }

        listHotels.tampilAll();
    }
```

