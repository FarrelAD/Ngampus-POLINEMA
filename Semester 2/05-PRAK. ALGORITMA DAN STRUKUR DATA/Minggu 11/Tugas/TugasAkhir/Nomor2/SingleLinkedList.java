package TugasAkhir.Nomor2;

public class SingleLinkedList {
    Node head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            Node tmp = head;
            System.out.println("Isi antrian: ");
            int nomor = 1;
            while (tmp != null) {
                System.out.println(nomor + ". [" + tmp.nim + ", " + tmp.nama +  "]\t");
                tmp = tmp.next;
                nomor++;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    void addData(int nim, String nama) { // Ini sama dengan method `addLast` yang ada di nomor 1
        Node ndInput = new Node(nim, nama,null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    String[] getData(int index) {
        Node tmp = head;
        for (int i = 1; i <= index; i++) {
            tmp = tmp.next;
        }

        String[] result = {String.valueOf(tmp.nim), tmp.nama};
        return result;
    }

    int indexOf(int key) {
        Node tmp = head;
        int index = 0;
        while (tmp != null && tmp.nim != key) {
            tmp = tmp.next;
            index++;
        }

        if (tmp != null) {
            return index;
        } else {
            return -1;
        }
    }

    void remove() { // Ini sama dengan method `removeFirst` yang ada di nomor 1
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }
}
