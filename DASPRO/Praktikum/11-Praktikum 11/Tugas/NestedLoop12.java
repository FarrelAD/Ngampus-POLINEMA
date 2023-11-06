import java.util.Scanner;
public class NestedLoop12 {
    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);
        double[][] temps = new double[5][7]; 

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + (i +1) + ": ");
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = sc12.nextDouble();
            }
            System.out.println();
        }

        /*
        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + (i + 1) + " ");
            for (int j = 0; j < temps[0].length; j++) {
                System.out.println(temps[i][j] + " ");
            }
            System.out.println();
        }
        */

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + (i + 1) + " ");
            for (double suhu : temps[i]) {
                System.out.print(suhu + " \n");
            }
        }
        /*
        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + (i + 1) + " ");
            double suhuTotal = 0.0, suhuRataRata = 0.0;
            for (double suhu : temps[i]) {
                System.out.print(suhu + " \n");
                suhuTotal += suhu; // Akumulasi suhu di suatu kota dalam seminggu
            }
            suhuRataRata = suhuTotal / temps[i].length; // Menghitung suhu rata-rata tiap kota
            System.out.println("Suhu rata-rata: " + suhuRataRata);
            System.out.println();
        }
        */
    }
}
