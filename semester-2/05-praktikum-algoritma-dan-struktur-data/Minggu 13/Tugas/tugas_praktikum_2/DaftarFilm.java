package tugas_praktikum_2;

public class DaftarFilm {
    Film head, tail;
    int size;

    private boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int id, String judul, float rating) {
        if (isEmpty()) {
            head = tail = new Film(null, id, judul, rating, null);
        } else {
            Film dataBaru = new Film(null, id, judul, rating, head);
            head.prev = dataBaru;
            head = head.prev;
        }
        size++;
    }

    public void addLast(int id, String judul, float rating) {
        if (isEmpty()) {
            head = tail = new Film(null, id, judul, rating, null);
        } else {
            Film dataBaru = new Film(tail, id, judul, rating, null);
            tail.next = dataBaru;
            tail = tail.next;
        }
        size++;
    }

    public void addAtIndex(int index, int id, String judul, float rating) {
        if (index == 0) {
            addFirst(id, judul, rating);
        } else {
            int currentIndex = 1;
            Film temp = head.next;
            while (temp != null) {
                if (currentIndex == index) {
                    Film baru = new Film(temp.prev, id, judul, rating, temp);
                    temp.prev.next = baru;
                    temp.prev = baru;
                    break;
                } else {
                    currentIndex++;
                    temp = temp.next;
                }
            }
            size++;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Data masih kosong! Tidak ada yang dihapus");
        } else {
            System.out.println(
                "======PENGHAPUSAN FILM======\n" +
                "- "+head.id+"\n"+
                "- "+head.judul+"\n"+
                "- "+head.rating+"\n"+
                "============================"
            );
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Data masih kosong! Tidak ada yang dihapus");
        } else {
            System.out.println(
                "======PENGHAPUSAN FILM======\n" +
                "- "+tail.id+"\n"+
                "- "+tail.judul+"\n"+
                "- "+tail.rating+"\n"+
                "============================"
            );
            tail = tail.prev;
            tail.next = null;
            size--;
        }
    }

    public void removeAtIndex(int index) {
        if (isEmpty()) {
            System.out.println("Data masih kosong! Tidak ada yang dihapus");
        } else {
            if (index >= size) {
                System.out.println("Indeks melampaui batas!");
            } else if (index == 0) {
                removeFirst();
            } else if (index == size - 1) {
                removeLast();
            } else {
                Film temp = head;
                int currentIndex = 0;
                while (temp != null) {
                    if (currentIndex == index) {
                        System.out.println(
                            "======PENGHAPUSAN FILM======\n" +
                            "- "+temp.id+"\n"+
                            "- "+temp.judul+"\n"+
                            "- "+temp.rating+"\n"+
                            "============================"
                        );
                        temp.prev.next = temp.next;
                        temp.next.prev = temp.prev;
                        break;
                    } else {
                        temp = temp.next;
                        currentIndex++;
                    }
                }
            }
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Data masih kosong! Tidak ada yang dicetak");
        } else {
            System.out.println("=========CETAK DATA=========");
            Film temp = head;
            int nomor = 1;
            while (temp != null) {
                System.out.println(
                    nomor + ". ID : " + temp.id + "\n" +
                    "   Judul film\t: " + temp.judul + "\n" +
                    "   Rating\t: " + temp.rating + "\n"
                );
                nomor++;
                temp = temp.next;
            }
        }
    }

    public void searchData(int searchedId) {
        if (isEmpty()) {
            System.out.println("Data masih kosong! Tidak ada data yang bisa dicari");
        } else {
            Film temp = head;
            int currentIndex = 0;
            do {
                if (temp.id == searchedId) {
                    System.out.println(
                        "=======PENCARIAN DATA=======\n" +
                        "Data ID film : " + searchedId + " berada di node indeks ke-" + currentIndex + "\n" +
                        "IDENTITAS:\n" +
                        "   ID film\t: " + temp.id + "\n" +
                        "   Judul film\t: " + temp.judul + "\n" + 
                        "   Rating\t: " + temp.rating + "\n" +
                        "============================"
                    );
                    break;
                }
                currentIndex++;
                temp = temp.next;
            } while (temp != null);
        }
    }

    // Menggunakan algoritma sorting insertion sort
    public void sortByRatings() {
        // Sebuah kondisi dimana tidak perlu melakukan sorting
        if (head == null || head.next == null) {
            return;
        }

        Film current = head.next;
        while (current != null) {
            // Data dari bagian tidak terurut diambil satu
            // Caranya memutuskan relasinya
            Film key = current;
            Film nextCurrent = current.next;
            if (key.prev != null) {
                key.prev.next = key.next;
            }

            if (key.next != null) {
                key.next.prev = key.prev;
            }

            // Menentukan posisi data baru akan dimasukkan
            Film prevSorted = key.prev;
            for (; prevSorted != null && key.rating > prevSorted.rating; prevSorted = prevSorted.prev) {
                // Akan dilakukan looping untuk memperbarui posisi pointer prevSorted
            }

            // Memasukkan data baru ke bagian terurut
            if (prevSorted == null) {
                key.next = head;
                key.prev = null;
                head.prev = key;
                head = key;
            } else {
                key.next = prevSorted.next;
                key.prev = prevSorted;
                prevSorted.next = key;
                if (prevSorted.next != null) {
                    key.next.prev = key;
                }
            }
            current = nextCurrent;
        }

        // Memperbarui nilai tail
        Film temp = head;
        for (; temp.next != null; temp = temp.next) {
            // Akan melakukan traverse hingga ke ujung akhir node
        }

        tail = temp;
    }
}