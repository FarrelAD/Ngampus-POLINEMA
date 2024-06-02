package tugas_praktikum_1;

public class Pengantri {
    Pengantri prev, next;
    int nomorAntrian;
    String nama;

    Pengantri(Pengantri prev, int nomorAntrian, String nama, Pengantri next) {
        this.prev = prev;
        this.next = next;
        this.nomorAntrian = nomorAntrian;
        this.nama = nama;
    }
}