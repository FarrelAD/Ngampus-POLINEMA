package Minggu11;

public class SingleLinkedList {
    Node head, tail;

    boolean isEmpty() {
        // return head != null;
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            Node tmp = head;
            System.out.print("Isi linked list: \t");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    void addFirst(int input) { // Menambahkan data di awal linked-list
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
            // ndInput.next = head;
            // head = ndInput;
        } else {
            // tail = ndInput;
            ndInput.next = head;
            head = ndInput;
            // head = ndInput;
        }
    }

    void addLast(int input) { // Menambahkan data di akhir linked-list
        // Node ndInput = new Node();
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
            // tail.next = ndInput;
        } else {
            // head = ndInput;
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input) { // Menambahkan data setelah data tertentu
        // Node ndInput = new Node();
        Node ndInput = new Node(input, null);
        Node temp = head;
        do {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next.next == null) {
                    tail = ndInput;
                    break;
                }
            }
            temp = temp.next;
        } while (temp != null);
    }

    void insertAt(int index, int input) { // Menambahkan data di indeks tertentu
        // Node ndInput = new Node();
        if (index > 0) {
            Node temp = head;
            for (int i = 1; i < index; i++) { // int i berubah dari 0 menjadi 1
                temp = temp.next;
            }
            temp.next = new Node(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
            // System.out.println(
            //     "Perbaiki logikanya! \n" +
            //     "Kalau indeksnya  -1 bagaimana????"
            // );
        } else if (index == 0) {
            addFirst(input);
        } else {
            System.out.println("Indeks -1. Tidak bisa melakukan operasi linked list!");
        }
    }


    //////////////////////////////////////////////////////
    // Percobaan 2
    int getData(int index) { // Mendapatkan data yang diinginkan
        Node tmp = head;
        for (int i = 1; i <= index; i++) { // Inisialisasi nilai int i berubah menjadi 1
            tmp = tmp.next;
        }

        return tmp.data;
    }

    int indexOf(int key) { // Mencari data berada di indeks mana
        Node tmp = head;
        int index = 0;
        while (tmp != null && tmp.data != key) {
            tmp = tmp.next;
            index++;
        }

        if (tmp != null) {
            return index; // Ditukar dengan kode di bawah 
        } else {
            return -1; // Berubah menjadi -1 yang tidak menunjukkan indeks manapun
        }
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        } else if (head == tail) { // Merubah tanda perbandingan menjadi `==`
            head = tail = null;
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            } 
            temp.next = null;
            tail = temp.next;
        }
    }

    void remove(int key) {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        } else {
            Node temp = head;
            while (temp != null) {
                if (temp.data == key && temp == head) { // Merubah perbandingan antara `temp.data` dengan `key`
                    removeFirst();
                    break;
                } else if (temp.next.data == key) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }

                temp = temp.next;
            }
        }
    }

    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }
}
