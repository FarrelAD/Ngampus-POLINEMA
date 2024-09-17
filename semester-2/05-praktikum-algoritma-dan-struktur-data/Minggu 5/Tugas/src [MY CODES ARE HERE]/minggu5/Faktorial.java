package minggu5;

public class Faktorial {
    public int nilai;

    // int faktorialBF(int n) {
    //     int fakto = 1;
    //     for (int i = n; i >= 1; i--) {
    //         fakto = fakto * i;
    //     }
    //     return fakto;
    // }

    // method faktorialBF menggunakan looping while
    // int faktorialBF(int n) {
    //     int fakto = 1;
    //     int i = n;
    //     while (i >= 1) {
    //         fakto = fakto * i;
    //         i--;
    //     }
    //     return fakto;
    // }

    // Method faktorialBF menggunakan looping do-while
    int faktorialBF(int n) {
        int fakto = 1;
        int i = n;
        do {
            fakto = fakto * i;
            i--;
        } while (i >= 1);
        return fakto;
    }

    int faktorialDC(int n) {
        if (n == 1) {
            return 1;
        } else {
            int fakto = n * faktorialDC(n - 1);
            return fakto;
        }
    }
}
