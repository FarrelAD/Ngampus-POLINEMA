package praktikum8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static JumpingZombie[] jumpingZombiesArray;
    static WalkingZombie[] walkingZombiesArray;
    static Plant[] plantsArray;
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        startingGame();
        loopingGame();

        sc.close();
    }

    private static void startingGame() {
        System.out.print(
            """
            Pilih jenis zombie: 
            1. Jumping Zombie
            2. Walking Zombie

            Masukkan 1 2 untuk memilih semua zombie
            Masukkan salah satu kode angka untuk memilih salah satu zombie
            """
        );
        String zombiePilihan = sc.nextLine();
        String[] zombiePilihanArray = zombiePilihan.split("\\s+");

        int totalJumpingZombie = 0;
        if (Arrays.asList(zombiePilihanArray).contains("1")) {
            System.out.print("Masukkan jumlah Jumping Zombie: ");
            totalJumpingZombie = sc.nextInt();
        }

        int totalWalkingZombie = 0;
        if (Arrays.asList(zombiePilihanArray).contains("2")) {
            System.out.print("Masukkan jumlah Walking Zombie: ");
            totalWalkingZombie = sc.nextInt();
        }
        
        System.out.print("Masukkan jumlah plant: ");
        int totalPlant = sc.nextInt();

        try {
            for (int i = 3; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
            System.out.println("GAME START!!!");
        } catch (InterruptedException e) {
            System.err.println("Game error!");
        }

        jumpingZombiesArray = new JumpingZombie[totalJumpingZombie];
        for (int i = 0; i < jumpingZombiesArray.length; i++) {
            jumpingZombiesArray[i] = new JumpingZombie(
                random.nextInt(30) + 15, 
                random.nextInt(3));
        }

        walkingZombiesArray = new WalkingZombie[totalWalkingZombie];
        for (int i = 0; i < walkingZombiesArray.length; i++) {
            walkingZombiesArray[i] = new WalkingZombie(
                random.nextInt(30) + 15, 
                random.nextInt(3));
        }

        plantsArray = new Plant[totalPlant];
        for (int i = 0; i < plantsArray.length; i++) {
            plantsArray[i] = new Plant();
        }
    }

    private static void loopingGame() {
        while (isZombiesStillAlive(jumpingZombiesArray, walkingZombiesArray)) {
            for (JumpingZombie jumpingZombie : jumpingZombiesArray) {
                if (jumpingZombie != null) {
                    System.out.println(jumpingZombie.getZombieInfo());
                }
            }

            for (WalkingZombie walkingZombie : walkingZombiesArray) {
                if (walkingZombie != null) {
                    System.out.println(walkingZombie.getZombieInfo());
                }
            }

            // Melakukan beberapa serangan sekaligus
            for (int i = 0; i < 3; i++) {
                for (Plant plant : plantsArray) {
                    JumpingZombie randomZombie = jumpingZombiesArray[random.nextInt(jumpingZombiesArray.length)];

                    if (randomZombie.health > 0) {
                        plant.doDestroy(randomZombie);
                        randomZombie.heal();
                    }
                }
            }


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println("Gamenya bermasalah! ;)");
            }
        }
    }

    private static boolean isZombiesStillAlive(JumpingZombie[] jumpingZombiesArray, WalkingZombie[] walkingZombiesArray) {
        for (WalkingZombie walkingZombie : walkingZombiesArray) {
            if (walkingZombie != null) {
                if (walkingZombie.health > 0) {
                    return true;
                }
            }
        }

        for (JumpingZombie jumpingZombie : jumpingZombiesArray) {
            if (jumpingZombie != null) {
                if (jumpingZombie.health > 0) {
                    return true;
                }
            }
        }

        return false;
    }
}
