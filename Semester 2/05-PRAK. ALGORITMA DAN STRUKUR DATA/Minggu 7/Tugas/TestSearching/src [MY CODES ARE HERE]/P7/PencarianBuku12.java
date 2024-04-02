package P7;

public class PencarianBuku12 {
    Buku12 listBk[] = new Buku12[5];
    int idx;


    void tambah(Buku12 m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (Buku12 m : listBk) {
            if (m != null) {
                m.tampilDataBuku();
            }
        }
    }

    // Searching dengan metode sequential dan return value bertipe int
    public int findSeqSearch(String cari) { // sebelumnya: int cari
        int posisi = -1;
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].kodeBuku.equals(cari)) { // sebelumnya: listBk[i] == cari
                posisi = i;
                break;
            }
        }

        return posisi;
    }

    // Searching dengan metode sequential dan return value bertipe objek
    public Buku12 findBuku(String cari) { // sebelumnya: int cari
        int posisi = -1;
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].kodeBuku.equalsIgnoreCase(cari)) { // sebelumnya: listBk[i] == cari
                posisi = i;
                break;
            }
        }

        return listBk[posisi];
    }

    public Buku12 findJudulBuku(String cari) {
        int posisi = -1;
        int jumlahBukuDitemukan = 0;
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].judulBuku.equalsIgnoreCase(cari)) {
                posisi = i;
                jumlahBukuDitemukan++;
            }
        }

        if (jumlahBukuDitemukan > 1) {
            tampilDitemukanJudulSama();
        }

        return listBk[posisi];
    }

    public void tampilPosisi(String x, int pos) { // sebelumnya: int x, int pos
        if (pos != -1) {
            System.out.println("Data: "+ x +" ditemukan pada indeks "+ pos);
        } else {
            System.out.println("Data: "+ x + " tidak ditemukan!");
        }
    }

    public void tampilData(int pos) { // sebelumnya: int x, int pos
        if (pos != -1) {
            System.out.println(
                "======================================\n" +
                "- Kode buku\t: " + listBk[pos].kodeBuku +
                "\n- Judul buku\t: " + listBk[pos].judulBuku + 
                "\n- Tahun terbit\t: " + listBk[pos].tahunTerbit +
                "\n- Pengarang\t: " + listBk[pos].pengarang +
                "\nStock\t: " + listBk[pos].stock
            );
        } else {
            System.out.println("Data tidak ditemukan!");
        }
    }

    // 1st version
    ////////////////////////////////////////////////////////////////
    // public int findBinarySearch(int cari, int left, int right) {
    //     int mid;
    //     if (right >= left) {
    //         mid = (right + left) / 2;
    //         if (cari == listBk[mid].kodeBuku) {
    //             return mid;
    //         } else if (listBk[mid].kodeBuku > cari) {
    //             return findBinarySearch(cari, left, mid);
    //         } else {
    //             return findBinarySearch(cari, mid, right);
    //         }
    //     }
    //     return -1;
    // }

    // 2nd version
    ////////////////////////////////////////////////////////////////
    // public int findBinarySearch(String cari, int left, int right) {
    //     int mid;
    //     if (right >= left) {
    //         mid = (right + left) / 2;
    //         if (cari.equals(listBk[mid].kodeBuku)) {
    //             return mid;
    //         } else if (listBk[mid].kodeBuku < cari) {
    //             return findBinarySearch(cari, left, mid - 1);
    //         } else {
    //             return findBinarySearch(cari, mid + 1, right);
    //         }
    //     }
    //     return -1;
    // }

    // Latihan praktikum version
    public int findBinarySearch(String cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (right + left) / 2;
            if (cari.equals(listBk[mid].kodeBuku)) {
                return mid;
            } else {
                int posisiKiri = findBinarySearch(cari, left, mid - 1);
                int posisiKanan = findBinarySearch(cari, mid + 1, right);
                if (posisiKanan != -1) {
                    return posisiKanan;
                } else if (posisiKiri != -1) {
                    return posisiKiri;
                }
            }
        }
        return -1;
    }

    // public int findBinarySearchJudulBuku(String cari, int left, int right) {
    //     insertionSort();

    //     int mid;
    //     if (right >= left) {
    //         mid = (right + left) / 2;
    //         if (cari.equalsIgnoreCase(listBk[mid].judulBuku)) {
    //             return mid;
    //         } else {
    //             int posisiKiri = findBinarySearchJudulBuku(cari, left, mid - 1);
    //             int posisiKanan = findBinarySearchJudulBuku(cari, mid + 1, right);

    //             if (posisiKanan != -1) {
    //                 return posisiKanan;
    //             } else if (posisiKiri != -1) {
    //                 return posisiKiri;
    //             }
    //         }
    //     }
    //     return -1;
    // }

    // Modifikasi binary search sehingga bisa memunculkan peringatan terdapat duplikasi data
    public int findBinarySearchJudulBuku(String cari, int left, int right) {
        insertionSort();

        int mid;
        if (right >= left) {
            mid = (right + left) / 2;
            if (cari.equalsIgnoreCase(listBk[mid].judulBuku)) {
                // Cari data lain lain yang mungkin sama
                int posisiKiri = findBinarySearchJudulBuku(cari, left, mid - 1);
                int posisiKanan = findBinarySearchJudulBuku(cari, mid + 1, right);

                // Jika nilai 'posisiKanan' atau 'posisiKiri' tidak -1, berarti ada data lain yang ditemukan di indeks tertentu
                // Maka dari itu, kode di bawah ini yang menyatakan adanya duplikasi data
                if (posisiKanan != -1 || posisiKiri != -1) {
                    tampilDitemukanJudulSama();
                }
                return mid;
            } else {
                int posisiKiri = findBinarySearchJudulBuku(cari, left, mid - 1);
                int posisiKanan = findBinarySearchJudulBuku(cari, mid + 1, right);

                if (posisiKanan != -1) {
                    return posisiKanan;
                } else if (posisiKiri != -1) {
                    return posisiKiri;
                }
            }
        }
        return -1;
    }

    private void insertionSort() {
        // ASCENDING SORT
        for (int i = 1; i < listBk.length; i++) {
            Buku12 temp = listBk[i];
            int j = i;
            while (j > 0 && listBk[j - 1].judulBuku.compareToIgnoreCase(temp.judulBuku) > 0) {
                listBk[j] = listBk[j - 1];
                j--;
            }
            listBk[j] = temp;
        }
    }

    private static void tampilDitemukanJudulSama() {
        System.out.println("TERDAPAT LEBIH DARI 1 BUKU DENGAN JUDUL SAMA");
    }
}