package percobaan1;
public class DoubleLinkedLists12 {
    Node12 head, tail;
    int size;

    public DoubleLinkedLists12() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item, int jarak) {
        if (isEmpty()) {
            head = new Node12(null, item, jarak, null);
            tail = head;
        } else {
            Node12 newNode12 = new Node12(null, item, jarak, head);
            head.prev = newNode12;
            head = newNode12;
        }
        size++;
    }

    public void addLast(int item, int jarak) {
        if (isEmpty()) {
            addFirst(item, jarak);
        } else {
            // Node12 current = head;
            // while (current.next != null) {
            //     current = current.next;
            // }
            // Node12 newNode12 = new Node12(current, item, null);
            // current.next = newNode12;
            // size++;

            // Cara lain - dengan menggunakan tail
            Node12 newNode12 = new Node12(tail, item, jarak, null);
            tail.next = newNode12;
            tail = newNode12;
            size++;
        }
    }

    public void add(int item, int index, int jarak) throws Exception {
        if (isEmpty()) {
            addFirst(item, jarak);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Node12 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }

            if (current.prev == null) {
                Node12 newNode12 = new Node12(null, item, jarak, current);
                current.prev = newNode12;
                head = newNode12;
            } else {
                Node12 newNode12 = new Node12(current.prev, item,jarak,  current);
                newNode12.prev = current.prev;
                newNode12.next = current;
                current.prev.next = newNode12;
                current.prev = newNode12;
            }
            size++;
        }
    }

    public int getJarak(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }

        Node12 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.jarak;
    }

    public void updateLength(int tujuan, int newLength) {
        Node12 temp = tail;
        boolean isFind = false;
        while (temp != null) {
            if (temp.data == tujuan) {
                temp.jarak = newLength;
                isFind = true;
            }
            temp = temp.prev;
        }

        if (!isFind) {
            System.out.println("Edge tidak ditemukan! Tidak dapat memperbarui jarak!");
        }
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Node12 tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked list kosong!");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        } else {
            Node12 current = head;
            while (current.next.next != null) {
                current = current.next;
            }
    
            current.next = null;
            size--;
        }

    }

    public void remove(int data) {
        Node12 current = head;
        while (current != null) {
            if (current.data == data) {
                if (current.data == data) {
                    if (current.prev != null) {
                        current.prev.next = current.next;
                    } else {
                        head = current.next;
                    }

                    if (current.next != null) {
                        current.next.prev = current.prev;
                    }
                    break;
                }
                current = current.next;
            }
        }
        size--;
    }

    public int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list kosong!");
        }
        return head.data;
    }

    public int getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list kosong!");
        } else {
            Node12 tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            return tmp.data;
        }
    }

    public int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas!");
        } else {
            Node12 tmp = head;
            for (int i = 0; i < index; i++) {
                tmp = tmp.next;
            }
            return tmp.data;
        }
    }

    public boolean checkVertexOwnership(int tujuan) {
        Node12 current = tail;
        while (current != null) {
            if (current.data == tujuan) {
                return true;
            }
            current = current.prev;
        }
        return false;
    }
}
