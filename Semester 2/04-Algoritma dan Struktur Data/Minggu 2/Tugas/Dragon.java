// PRAKTIKUM ALGORITMA DAN STRUKTUR DATA
// JOBSHEET 2 
// 21 Februari 2024

public class Dragon {
    // Below is the attribute of the Dragon class
    int x, y, width, height;


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
        System.out.println("Game Over");
    }
}
