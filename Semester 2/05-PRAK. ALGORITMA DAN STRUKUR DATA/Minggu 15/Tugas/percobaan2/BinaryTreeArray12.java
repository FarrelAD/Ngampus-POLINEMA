package percobaan2;

public class BinaryTreeArray12 {
    int[] data;
    int idxLast;

    public BinaryTreeArray12() {
        data = new int[10];
    }

    public void add(int newData) {
        for (int i = 0; i < data.length;) {
            if (data[i] == 0) {
                data[i] = newData;
                idxLast = i;
                break;
            } else if (newData > data[i]) {
                i = 2 * i + 2;
                if (i >= data.length) {
                    makeNewArray(i + 1);
                }
            } else if (newData < data[i]) {
                i = 2 * i + 1;
                if (i >= data.length) {
                    makeNewArray(i + 1);
                }
            }
        }
    }

    private void makeNewArray(int length) {
        int[] oldData = new int[data.length];

        // Menyimpan data lama ke array baru
        for (int i = 0; i < data.length; i++) {
            oldData[i] = data[i];
        }

        // Membuat array dengan lebih panjang
        data = new int[length + 1];
        for (int i = 0; i < oldData.length; i++) {
            data[i] = oldData[i];
        }
    }

    void populateData(int data[], int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast && data[idxStart] != 0) {
            traverseInOrder(2 * idxStart + 1);
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2 * idxStart + 2);
        }
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast && data[idxStart] != 0) {
            System.out.print(data[idxStart] + " ");
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }

    void traversePostOrder(int idxStart) {
        if (idxStart <= idxLast && data[idxStart] != 0) {
            traversePostOrder(2 * idxStart + 1);
            traversePostOrder(2 * idxStart + 2);
            System.out.print(data[idxStart] + " ");
        }
    }

    void print() {
        for (int i : data) {
            System.out.print(i + " ");
        }
    }
}
