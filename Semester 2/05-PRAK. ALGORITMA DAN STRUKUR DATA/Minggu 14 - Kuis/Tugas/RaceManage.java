import java.util.Random;

public class RaceManage {
    int currentRace, totalRace;
    Race[] race;
    Race head, tail;
    RiderManage allRiders;
    CircuitManage allCircuit;

    public RaceManage(int totalRace, RiderManage allRiders, CircuitManage allCircuit) {
        this.totalRace = totalRace;
        this.allRiders = allRiders;
        this.allCircuit = allCircuit;
    }

    boolean isEmpty() {
        return head == null;
    }

    public void addNewRace(Race newRace) {
        Race tempRace = newRace;
        if (isEmpty()) {
            head = tempRace;
            tail = tempRace;
        } else {
            tail.next = tempRace;
            tail = tempRace;
        }
    }

    public void raceNow(int raceAmount) {
        int[] points = {25, 20, 16, 13, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        for (int i = 0; i < raceAmount; i++) {
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

    private void shuffleData(int[] array) {
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
}