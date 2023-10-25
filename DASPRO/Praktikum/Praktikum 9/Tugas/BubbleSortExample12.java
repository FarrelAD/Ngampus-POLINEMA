public class BubbleSortExample12 {
    public static void main(String[] args) {
        int[] intData = {34, 18, 87, 72, 32, 54, 43};
        int temp = 0;

        for (int i=0; i < intData.length; i++) {
            for (int j=1; j < intData.length-i; j++) {
                if (intData[j-1] < intData[j]) {
                    // Swap elemen
                    temp = intData[j];
                    intData[j] = intData[j-1];
                    intData[j-1] = temp;
                }
            }
        }

        // Penampilan hasil pengurutan dari data yang ada
        System.out.println("Hasil pengurutan: ");
        for (int i=0; i < intData.length; i++) {
            System.out.println(intData[i]);
        }
    }
}
