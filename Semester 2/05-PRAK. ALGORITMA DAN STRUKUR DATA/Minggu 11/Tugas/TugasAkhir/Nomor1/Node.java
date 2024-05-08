package TugasAkhir.Nomor1;

public class Node {
    int nim;
    String nama;
    Node next;

    Node(int nim, String nama, Node berikutnya) {
        this.nim = nim;
        this.nama = nama;
        next = berikutnya;
    }

    Node() {
        
    }
}