public class Operasi {
    Data[] arrayData = new Data[17];
    int idx = 0;

    void tambahData(Data[] data) {
        for (int i = 0; i < data.length; i++) {
            arrayData[idx] = data[i];
            idx++;
        }
    }

    void tampilData() {
        for (Data data : arrayData) {
            if (data != null) {
                System.out.print(data.nilai + " ");
            }
        }
    }

    // SORTING - Menggunakan insertion sort
    void pengurutanAscending() {
        for (int i = 1; i < arrayData.length; i++) {
            Data temp = arrayData[i];
            int j = i - 1;
            while (j >= 0 && arrayData[j].nilai > temp.nilai) {
                arrayData[j + 1] = arrayData[j];
                j--;
            }
            arrayData[j + 1] = temp;
        }
    }

    // SORTING - Menggunakan selection sort
    void pengurutanDescending() {
        for (int i = 0; i < arrayData.length; i++) {
            int indexMax = i;

            for (int j = i + 1; j < arrayData.length; j++) {
                if (arrayData[j].nilai > arrayData[indexMax].nilai) {
                    indexMax = j;
                }
            }

            // Swapping data
            Data temp = arrayData[i];
            arrayData[i] = arrayData[indexMax];
            arrayData[indexMax] = temp;
        }
    }

    // SEARCHING - Menggunakan binary search
    int pencarianData(int target, Data[] kumpulanData, int left, int right) {
        if (right >= left) {
            int mid = (left + right) / 2;
            if (arrayData[mid].nilai == target) {
                return mid;
            } else {
                int posisiKiri = pencarianData(target, kumpulanData, left, mid - 1);
                int posisiKanan = pencarianData(target, kumpulanData, mid + 1, right);
                if (posisiKiri != -1) {
                    return posisiKiri;
                } else if (posisiKanan != -1) {
                    return posisiKanan;
                }
            }
        }
        return -1;
    }

}
