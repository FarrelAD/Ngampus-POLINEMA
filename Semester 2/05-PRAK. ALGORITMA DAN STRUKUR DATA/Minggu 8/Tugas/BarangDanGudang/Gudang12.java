package BarangDanGudang;

public class Gudang12 {
    Barang12[] tumpukan;
    int size, top;

    public Gudang12(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang12[size];
        top = -1;
    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if (top == size - 1) {
            return true;
        } else {
            return false;

        }
    }

    public void tambahBarang(Barang12 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.printf("\nBarang %s berhasil ditambahkan ke gudang", brg.nama);
        } else {
            System.out.println("Gagal! Tumpukan barang di gudang sudah penuh!");
        }
    }

    public Barang12 ambilBarang12() {
        if (!cekKosong()) {
            Barang12 delete = tumpukan[top];
            top--;
            System.out.printf("\nBarang %s diambil dari gudang", delete.nama);
            System.out.printf("\nKode unik dalam biner: %s", konversiDesimalKeBiner(delete.kode));
            return delete;
        } else {
            System.out.println("Tumpuukan barang kosong!");
            return null;
        }
    }

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

    public Barang12 lihatBarangTerbawah() {
        if (!cekKosong()) {
            Barang12 tumpukanSementara[] = new Barang12[size];
            Barang12 barangTerbawah = null;

            // Melakukan proses 'pop' agar bisa tahu data pertama
            for (int i = top; i >= 0; i--) {
                if (i == 0) {
                    barangTerbawah = tumpukan[i];
                }
                tumpukanSementara[i] = pop();
            }

            // Mengembalikan data yang telah di 'pop'
            for (int i = 0; i < tumpukanSementara.length; i++) {
                if (tumpukanSementara[i] != null) {
                    push(tumpukanSementara[i]);
                }
            }
            System.out.println("Cek kepenuhan: " + cekPenuh());
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

    public void tampilkanBarang() {
        // Proses tampil barang dengan cek kondisi (!cekKosong())
        // if (!cekKosong()) {
        //     System.out.println("Rincian tumpukan barang di gudang");
        //     for (int i = top; i >= 0 ; i--) {
        //         System.out.printf(
        //             "Kode %d: %s (Kategori %s)\n",
        //             tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori
        //         );
        //     }
        // } else {
        //     System.out.println("Tumpukan barang kosong!");
        
        // Proses tampil barang tanpa cek kondisi (!cekKosong())
        for (int i = top; i >= 0 ; i--) {
            System.out.printf(
                "Kode %d: %s (Kategori %s)\n",
                tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori
            );
        }
    }

    public String konversiDesimalKeBiner(int kode) {
        StackKonversi12 stack = new StackKonversi12();
        while (kode != 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }

        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }

}
