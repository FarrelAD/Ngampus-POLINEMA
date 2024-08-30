import java.util.Scanner;
public class Segitiga12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alas, tinggi;
        double luas;
        
        System.out.println("Alas garasi: ");
        alas = sc.nextInt();

        System.out.println("Tinggi garasi:");
        tinggi = sc.nextInt();

        luas = (alas * tinggi) / 2;

        System.out.println("Luas garasi: " + luas);

    }
    
}
