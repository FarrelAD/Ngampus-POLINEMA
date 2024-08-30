public class ArrayBilangan12 {

    public static void main(String[] args) {
        
        /*
        int [] bil = new int[4];

        
        bil [0] = 5;
        bil [1] = 13;
        bil [2] = -7;
        bil [3] = 17;
        */

        // Pengisian nilai pada array dengan menuliskannya sekaligus
        int [] bil = {5, 13, -7, 17};
        
        /*
        System.out.println(bil[0]);
        System.out.println(bil[1]);
        System.out.println(bil[2]);
        System.out.println(bil[3]);
        */

        // Modifikasi program untuk menampilkan nilai pada variabel dengan fungsi for
        for (int i = 0; i <= 4; i++ ) {
            System.out.println(bil[i]);
        }

    }
}