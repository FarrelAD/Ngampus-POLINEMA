import java.util.Arrays; // Import library Arrays
public class Numbers12 {
    public static void main(String[] args) {
        int[][] myNumbers = new int [3][1];
        myNumbers[0] = new int [5];
        myNumbers[1] = new int [3];
        myNumbers[2] = new int [1];

        // Menampilkan isi dari setiap elemen pada setiap baris array
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));
        }
        
        // Menampilkan panjang baris array
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Panjang baris ke-" + (i+1) + ": " + myNumbers[i].length);
        }

        myNumbers[0] = new int[3];
        myNumbers[1] = new int[3];
        myNumbers[2] = new int[3];

        // Menampilkan panjang baris array
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Panjang baris ke-" + (i+1) + ": " + myNumbers[i].length);
        }
    }
}