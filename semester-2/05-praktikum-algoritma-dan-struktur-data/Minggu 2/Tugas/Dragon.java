// PRAKTIKUM ALGORITMA DAN STRUKTUR DATA
// JOBSHEET 2 
// 21 Februari 2024

import java.util.Scanner;

public class Dragon {
    // Below is the attribute of the Dragon class
    int x, y, width, height;
    boolean isContinue = false;


    // Below is method for Dragon class
    void moveLeft() {
        x--;

        if (x < 0) {
            detectCollision(x, y);
        }
    }

    void moveRight() {
        x++;

        if (x > width) {
            detectCollision(x, y);
        }
    }

    void moveUp() {
        y++;

        if (y > height) {
            detectCollision(x, y);
        }
    }

    void moveDown() {
        y--;

        if (y < 0) {
            detectCollision(x, y);
        }
    }

    void detectCollision(int x, int y) {
        isContinue = true;
        System.out.println("------------------------------------");
        System.out.println("GAME OVER!");
        System.out.println("------------------------------------");
    }

    void printPosition() {
        System.out.printf("POSITION x: %d - y: %d\n", x, y);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Dragon myDragon = new Dragon();

        System.out.print(
            "SET UP YOUR PLAYING AREA\n" +
            "- HEIGHT : "
        );
        myDragon.height = scan.nextInt();
        System.out.print("- WIDTH : ");
        myDragon.width = scan.nextInt();

        System.out.println("------------------------------------");

        do {
            System.out.print(
                "PILIH ARAH!\n" +
                "1. KE ATAS\n" +
                "2. KE BAWAH\n" +
                "3. KE KANAN\n" +
                "4. KE KIRI\n" +
                "input> "
            );
            int direction = scan.nextInt();

            switch (direction) {
                case 1:
                    myDragon.moveUp();
                    break;
                case 2:
                    myDragon.moveDown();
                    break;
                case 3:
                    myDragon.moveRight();
                    break;
                case 4:
                    myDragon.moveLeft();
                    break;
                default:
                    break;
            }
            // Print the dragon position
            myDragon.printPosition();
            System.out.println("------------------------------------");
        } while (!myDragon.isContinue);
    }
}
