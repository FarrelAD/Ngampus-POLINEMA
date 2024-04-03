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
            System.out.printf("\nKode unik dalam biner: %s", konersiDesimalKeBiner(delete.kode));
            return delete;
        } else {
            System.out.println("Tumpuukan barang kosong!");
            return null;
        }
    }

    public Barang12 lihatBarangTeratas() {
        if (!cekKosong()) {
            Barang12 barangTeratas = tumpukan[top];
            System.out.printf("\nBarang teratas %s ", barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong!");
            return null;
        }
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

    public String konersiDesimalKeBiner(int kode) {
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
