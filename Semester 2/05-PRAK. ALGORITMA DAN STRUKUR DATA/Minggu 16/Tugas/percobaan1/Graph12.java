package percobaan1;
public class Graph12 {
    int vertex;
    DoubleLinkedLists12 list[];

    public Graph12(int v) {
        vertex = v;
        list = new DoubleLinkedLists12[v];
        for (int i = 0; i < v; i++) {
            list[i] = new DoubleLinkedLists12();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak) {
        // list[asal].addFirst(tujuan, jarak);
        if (asal < vertex && tujuan < vertex && asal >= 0 && tujuan >= 0) {
            list[asal].addLast(tujuan, jarak);
        } else {
            System.out.println("Tidak bisa menambahkan edge baru! Gedung tidak ditemukan!!");
        }

        // list[asal].addFirst(asal, jarak);
    }

    public void degree(int asal) throws Exception {
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < list[i].size; j++) {
                if (list[i].get(j) == asal) {
                    ++totalIn;
                }
            }

            for (k = 0; k < list[asal].size; k++) {
                list[asal].get(k);
            }
            totalOut = k;
        }

        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + ": " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + ": " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": " + (totalIn + totalOut));

        //
        // System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": " + list[asal].size);
    }

    public void updateJarak(int asal, int tujuan, int newLength) {
        list[asal].updateLength(tujuan, newLength);
    }

    public void removeEdge(int asal, int tujuan) throws Exception {
        // Tidak perlu melakukan looping jadi bisa dipanggil secara langsung sesuai nilai parameter yang tersedia
        if (asal < vertex && tujuan < vertex && asal >= 0 && tujuan >= 0) {
            list[asal].remove(tujuan);
        } else {
            System.out.println("Tidak bisa menghapus edge! Gedung tidak bisa ditemukan!");
        }

        // for (int i = 0; i < vertex; i++) {
        //     if (i == tujuan) {
        //     }
        // }
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graf berhasil dikosongkan!");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size > 0) {
                System.out.println("Gedung " + (char) ('A' + i) + " terhubung dengan ");
                for (int j = 0; j < list[i].size; j++) {
                    System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + " m), ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }

    public void checkEdge(int asal, int tujuan) {
        boolean result = list[asal].checkVertexOwnership(tujuan);

        System.out.print("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan));
        if (result) {
            System.out.println(" bertetangga");
        } else {
            System.out.println(" tidak bertetangga");
        }
    }

    public void hitungEdge() {
        int totalEdge = 0;
        for (int i = 0; i < list.length; i++) {
            Node12 temp = list[i].head;
            while (temp != null) {
                totalEdge++;
                temp = temp.next;
            }
        }
        System.out.println("Total edge: " + totalEdge);
    }
}
