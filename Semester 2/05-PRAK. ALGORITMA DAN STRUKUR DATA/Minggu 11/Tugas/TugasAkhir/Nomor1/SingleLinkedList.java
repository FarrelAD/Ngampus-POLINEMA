package TugasAkhir.Nomor1;

public class SingleLinkedList {
    Node head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            Node tmp = head;
            System.out.print("Isi linked list: \t");
            while (tmp != null) {
                System.out.print("[" + tmp.nim + ", " + tmp.nama +  "]\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    void addFirst(int nim, String nama) {
        Node ndInput = new Node(nim, nama, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int nim, String nama) {
        Node ndInput = new Node(nim, nama,null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int nim, String nama) {
        Node ndInput = new Node(nim, nama, null);
        Node temp = head;
        do {
            if (temp.nim == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;

                if (ndInput.next != null) {
                    if (ndInput.next.next == null) {
                        tail = ndInput;
                        break;
                    }
                } else {
                    tail = ndInput;
                }
            }
            temp = temp.next;
        } while (temp != null);
    }

    void insertAt(int index, int nim, String nama) {
        if (index > 0) {
            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            temp.next = new Node(nim, nama, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        } else if (index == 0) {
            addFirst(nim, nama);
        } else {
            System.out.println("Indeks -1. Tidak bisa melakukan operasi linked list!");
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
        } else if (head == tail) {
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
                if (temp.nim == key && temp == head) {
                    removeFirst();
                    break;
                } else if (temp.next.nim == key) {
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
