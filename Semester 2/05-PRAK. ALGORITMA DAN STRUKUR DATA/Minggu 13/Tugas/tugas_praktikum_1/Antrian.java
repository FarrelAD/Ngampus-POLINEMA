package tugas_praktikum_1;

public class Antrian {
    Pengantri head, tail;
    int size;

    private boolean isEmpty() {
        return size == 0;
    }

    public void add(int nomor, String nama) {
        if (isEmpty()) {
            head = tail = new Pengantri(null, nomor, nama, null);
        } else {
            Pengantri orangBaru = new Pengantri(tail, nomor, nama, null);
            tail.next = orangBaru;
            tail = orangBaru;
        }
        size++;
    }

    public void remove() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong! Tidak ada yang sudah divaksin");
        } else {
            System.out.printf("%s telah selesai divaksinasi\n", head.nama);
            head.next.prev = null;
            head = head.next;
            size--;
        }
    }

    public void print() {
        System.out.println(
            "===================================\n" +
            "       Daftar pengantri vaksin     \n" +
            "===================================\n" +
            "| No.\t| Nama\t|"
        );
        Pengantri temp = head;
        while (temp != null) {
            System.out.printf("| %d\t| %s\t|\n", temp.nomorAntrian, temp.nama);
            temp = temp.next;
        }
        System.out.println("Sisa antrian: " + size);
    }
}
