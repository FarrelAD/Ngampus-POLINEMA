import java.util.Scanner;

public class LatihanSuhu12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suhu;
        char hujan;

        System.out.println("Masukkan suhu: ");
        suhu = sc.nextInt();
        System.out.println("Apakah hujan? (y atau t) ");
        hujan = sc.next().charAt(0);

        if (suhu > 27) {
            System.out.println("Memakai Dress");
            if (hujan == 'y'){
                System.out.println("membawa payung");
            }else{
                System.out.println("Memakai Sunscreen");
            }
        }else{
            System.out.println("Memakai Celana Panjang");
        }
    }
}
