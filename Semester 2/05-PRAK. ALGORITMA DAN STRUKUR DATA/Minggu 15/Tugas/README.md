<div align="center">

# Laporan Praktikum Algoritma dan Struktur Data
## Jobsheet 13

<img src="../../../../assets/logo-polinema.png" align="center" width="200px">

\
Nama: Farrel Augusta Dinata

NIM: 2341720081

No. Absen: 12

Kelas: TI-1B

</div>

---
## Percobaan 1
**Implementasi binary search tree menggunakan linked list**

Verifikasi hasil yang didapat:

![Output Percobaan 1](img/percobaan-1.png)

**Pertanyaan:**
1. Mengapa dalam binary search tree proses pencarian data bisa lebih efektif dilakukan dibanding binary tree biasa?
    
    Jawab: Itu karena pada binary search tree, struktur datanya sudah terurut. Setiap node yang memiliki parent, sudah dipastikan node di kirinya lebih kecil dari parent dan node di sisi kanan nilainya lebih besar dari parent. Karena sudah terurut, maka untuk melakukan pencarian data bisa lebih mudah karena pola datanya sudah kelihatan. Berbeda dengan binary tree biasa yang pola susunan datanya bisa acak. Dengan begitu, kita perlu mengecek satu-satu node hingga ketemu node yang sesuai untuk melakukan pencarian data. Ini jauh lebih memakan waktu daripada binary search tree.

2. Untuk apakah di class `Node`, kegunaan dari atribut `left` dan `right`?

    Jawab: Kedua atribut tersebut digunakan untuk menunjukkan bahwa node tersebut terhubung dengan node lain. Karena ini adalah struktur data pohon/tree, maka nilai dari `left` dan `right` menunjukkan anak dari node/cabang tersebut. Jika sebuah node memiliki nilai atribut `left` dan `right` tidak `null`, maka sudah dipastikan itu adalah parent node. 

3. a. Untuk apakah kegunaan dari atribut `root` di dalam class `BinaryTree`?

    Jawab: Atribut `root` digunakan sebagai titik awal dari seluruh percabangan data yang ada di binary tree. Kalau pada struktur data sebelumnya yang bertipe liniar data structure seperti linked list, atribut `root` mirip dengan atribut `head`. Jika ingin melakukan pencarian data, maka semua itu diawali oleh node `root`. 

    b. Ketika objek tree pertama kali dibuat, apakah nilai dari `root` ?

    Jawab: Ketika baru saja objek tree pertama kali dibuat, maka nilai dari atribut `root` akan bernilai `null`. Alasannya adalah belum ada data yang disimpan pada struktur data tree.

4. Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, proses apa yang akan terjadi?

    Jawab: Proses yang dilakukan pertama kali adalah akan pengecekan apakah tree memang dalam kosong atau tidak. Jika iya, maka data baru tersebut akan dijadikan sebagai `root` dari keseluruhan struktur data tree seterusnya. 

5. Perhatikan method `add()`, di dalamnya terdapat baris program seperti di bawah ini. Jelaskan secara detil untuk apa baris program tersebut?
    ```java
    if (data < current.data) {
        if (current.left != null) {
            current = current.left;
        } else {
            current.left = new Node(data);
            break;
        }
    }
    ```
    Jawab: Kode tersebut awalnya akan memastikan bahwa data baru yang akan dimasukkan nilainya benar-benar lebih kecil dari pointer `current`. Jika data baru yang akan ditambahkan ini memang lebih kecil, maka itu akan siap-siap ditaruh di sisi kiri node. Karena ini adalah data yang baru, maka harus memastikan bahwa di sisi kiri node `current` sudah tidak ada node lagi atau bisa dikatakan atribut `left` dari node `current` bernilai `null`. Itulah fungsi dari blok kode if yang ada di dalam `if (data < current.data)`. 

    Jika sudah berada di node paling akhir yang tidak punya pasangan di sisi kiri, maka langkah selanjutnua adalah melakukan instansiasi objek baru yang isinya data baru yang ingin dimasukkan. 

---
## Percobaan 2
**Implementasi binary tree dengan array**

Verifikasi hasil yang didapat:

![Percobaan 2](img/percobaan-2.png)

**Pertanyaan:**
1. Apakah kegunaan dari atribut `data` dan `idxLast` yang ada di class `BinaryTreeArray`?

    Jawab: Atribut `data` digunakan untuk menyimpan seluruh data yang ada berupa array. Sedangkan `idxLast` digunakan untuk menunjukkan posisi indeks terakhir dari array yang digunakan pada struktur data tree. Itu karena tidak semua data yang ada di array digunakan untuk proses struktur data tree. Atribut `idxLast` bisa berguna lagi saat proses traverse data yang mana itu menggunakan recursive function. Nilai dari `idxLast` bisa digunakan untuk membatasi proses rekursif yang terjadi.

2. Apakah kegunaan dari method `populateData()` ?

    Jawab: Method `populateData()` digunakan untuk menyiapkan data yang digunakan di struktur data tree. Data yang dibutuhkan adalah array yang menampung keseluruhan data dan nilai indeks terakhir untuk mengisi atribut `idxLast`.

3. Apakah kegunaan dari method `traverseInOrder()`?

    Jawab: Method tersebut digunakan untuk mengunjungi data-data yang ada dengan pola seperti ini: `traverse sisi kiri` -> `parent` -> `traverse sisi kanan`. Untuk proses traverse sisi kiri dan kanan dilakukan dengan menggunakan fungsi rekursif `traverseInOrder()`. Sedangkan untuk nilai dari `parent` sesuai dengan nilai parameter `idxStart`. 
    
    Pada kasus ini, struktur data tree disimpan ke dalam array, sehingga penyusunan data agar seperti tree adalah dengan menggunakan pola: nilai parent adalah sesuai indeks *(i)*, nilai *left child* berada di *2i + 1*, nilai *right child* berada di *2i + 2*. Maka dari itu, untuk melakukan traverse sisi kiri argumen yang diisi adalah `2 * idxStart + 1`. Sedangkan untuk traverse ke sisi kanan argumen yang diisi adalah `2 * idxStart + 2`.

4. Jika suatu node binary tree disimpan dalam array indeks 2, maka di indeks berapakah posisi left child dan right child masing-masing?

    Jawab: Pola umum yang digunakan untuk menyimpan data dengan menerapkan konsep tree berbasis array adalah: Anggap saja index sebagai *i*, indeks tersebut digunakan untuk menunjukan data `parent`; data di sebelah kiri ditunjukkan pada posisi *2i + 1*; data di sebelah kanan ditunjukkan pada posisi *2i + 2*. Maka dari itu, jika sebuah data disimpan pada indeks 2, maka posisi left child berada di indeks 5. Sedangkan posisi right child berada di posisi indeks 6.

5. Apa kegunaan statement `int idxLast = 6` pada praktikum 2 percobaan nomor 4?

    Jawab: Statement tersebut digunakan untuk membatasi indeks array yang digunakan. Sebelumnya bisa dilihat jika array `data` memiliki 10 elemen. Tapi dari situ ternyata tidak semuanya dibutuhkan. Hanya sampai data pada indeks ke-6 yang digunakan untuk proses struktur data tree.

---
## Tugas Praktikum
1. Buat method di dalam class `BinaryTree` yang akan menambahkan node dengan cara rekursif!
2. Buat method di dalam class `BinaryTree` untuk menampilkan nilai paling kecil dan yang paling besar yang ada di dalam tree!
3. Buat method di dalam class `BinaryTree` untuk menampilkan data yang ada di leaf!
4. Buat method di dalam class `BinaryTree` untuk menampilkan berapa jumlah leaf yang ada di dalam tree!
5. Modifikasi class `BinaryTreeArray`, dan tambahkan:
    - Method `add(int data)` untuk memasukkan data ke dalam tree
    - Method `traversePreOrder()` dan `traversePostOrder()`
    