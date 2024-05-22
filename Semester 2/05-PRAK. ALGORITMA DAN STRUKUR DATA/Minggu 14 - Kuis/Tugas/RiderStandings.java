import java.util.Random;

public class RiderStandings {
    RiderManage allRiders;
    CircuitManage allCircuit;
    // Race singleRace;
    RaceManage allRace;
    int currentRace;

    RiderStandings(RiderManage allRiders, CircuitManage allCircuit, RaceManage allRace) {
        this.allRiders = allRiders;
        this.allCircuit = allCircuit;
        this.allRace = allRace;
    }

    public void raceNow(int totalRace) {
        int[] points = {25, 20, 16, 13, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        for (int i = 0; i < totalRace; i++) {
            shuffleData(points);
            int[] tempPoints = points;
            int[] riderIndex = new int[allRiders.totalRider];
            for (int j = 0; j < riderIndex.length; j++) {
                riderIndex[j] = j;
            }
            shuffleData(riderIndex);
            currentRace++;

            Race newRace = new Race(null, allCircuit.showNextRace(currentRace - 1), allRiders, null);
            for (int j = 0; j < riderIndex.length; j++) {
                if (tempPoints.length >= 1) {
                    newRace.allRiders.addPoint(riderIndex[j], currentRace, tempPoints[0]);
    
                    // Melakukan swap ke kiri karena data pertama sudah diambil
                    for (int k = 1; k < tempPoints.length; k++) {
                        tempPoints[k - 1] = tempPoints[k];
                    }    
                    tempPoints[tempPoints.length - 1] = 0;
                } else {
                    newRace.allRiders.addPoint(j, currentRace, 0);
                }
            }
        }
    }

    private static void shuffleData(int[] array) {
        // Memanfaatkan library bawaan Java (random) untuk melakuakn pengacakan pemilihan data
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            int randomIndex = random.nextInt(array.length);

            // Swap data saat ini dengan data pada index random
            int temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
    }

    public void printRiderStandings() {
        System.out.print(
            "\n=============================================================================================================================================\n" +
            "|  N  | Nama                  |  Total  |                                         Balapan ke-                                               |\n" +
            "|  o  |                       |  Poin   | 1  | 2  | 3  | 4  | 5  | 6  | 7  | 8  | 9  | 10 | 11 | 12 | 13 | 14 | 15 | 16 | 17 | 18 | 19 | 20 |\n" +
            "=============================================================================================================================================\n"
        );
        Rider tmp = allRiders.head;
        int numStanding = 1;
        while (tmp != null) {
            // Melakukan format skor pada tiap balapan agar output bisa lebih rapi
            String newPointsStr[] = new String[tmp.allPoints.length];
            for (int i = 0; i < tmp.allPoints.length; i++) {
                if (Integer.toString(tmp.allPoints[i]).length() == 1) {
                    newPointsStr[i] = " " + Integer.toString(tmp.allPoints[i]);
                } else {
                    newPointsStr[i] = Integer.toString(tmp.allPoints[i]);
                }
            }

            if (numStanding < 10) {
                System.out.printf("|  %d  |", numStanding);
            } else {
                System.out.printf("|  %d |", numStanding);
            }

            System.out.printf(" %s | %d\t|", tmp.name, tmp.totalPoint);

            for (int i = 0; i < newPointsStr.length; i++) {
                System.out.printf(" %s |", newPointsStr[i]);
            }
            System.out.println("");
            tmp = tmp.prev;
            numStanding++;
        }
        System.out.println("=============================================================================================================================================");
    }
}
