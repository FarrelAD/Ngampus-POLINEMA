package InfixKePostfix;

import java.util.Scanner;

public class PostfixMain12 {
    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);
        
        String P, Q;

        System.out.print("Masukkan ekspresi matematika (infix) : ");
        Q = sc12.nextLine();
        Q = Q.trim();
        Q = Q + ")";

        int total = Q.length();

        Postfix12 post = new Postfix12(total);
        P = post.konversi(Q);
        System.out.println("Postfix: " + P);
    }
}
