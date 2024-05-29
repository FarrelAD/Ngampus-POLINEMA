import java.util.Random;

public class RaceManage {
    int currentRace, totalRace;
    Race head, tail;

    boolean isEmpty() {
        return head == null;
    }

    // Addfirst
    public void addNewRace(Circuit circuit, RiderManage allRider) {
        if (isEmpty()) {
            head = tail = new Race(null, circuit, allRider, null);
        } else {
            head.prev = new Race(null, circuit, allRider, head);
            head = head.prev;
        }
    }

    public void raceNow(int raceAmount) {
        int[] points = {25, 20, 16, 13, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        for (int i = 0; i < raceAmount; i++) {
            shuffleData(points);
            int[] tempPoints = points;
            int[] riderIndex = new int[head.allRiders.totalRider];
            for (int j = 0; j < riderIndex.length; j++) {
                riderIndex[j] = j;
            }
            shuffleData(riderIndex);
            currentRace++;

            for (int j = 0; j < riderIndex.length; j++) {
                head.allRiders.addPoint(riderIndex[j], currentRace, tempPoints[0]);

                // Melakukan swap ke kiri karena data pertama sudah diambil
                for (int k = 1; k < tempPoints.length; k++) {
                    tempPoints[k - 1] = tempPoints[k];
                }

                // Reset poin ke 0 di sisi kanan
                tempPoints[tempPoints.length - 1] = 0;
            }

            // Memperbarui data poin pada team MotoGP
            updateTeamsPoints(currentRace);
            // Melakukan update pointer head karena dianggap race sudah selesai
            head = head.next;
        }
    }

    private void updateTeamsPoints(int currentRace) {
        Rider tempRider = head.allRiders.head;
        while (tempRider.next != null) {
            if (tempRider.team.equals(tempRider.next.team)) {
                tempRider.team.addPoint(tempRider.allPoints[currentRace - 1] + tempRider.next.allPoints[currentRace - 1]);
            }
            tempRider = tempRider.next;
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

    public void printAllRaces() {
        Race tempR = head;
        while (tempR != null) {
            System.out.println("\n" + tempR.circuit.name);
            Rider tempI = tempR.allRiders.head;
            int numRider = 1;
            System.out.println("-----------------------------------------\n");
            while (tempI != null) {
                System.out.printf("%d. %s\t- %s\n", numRider, tempI.name, tempI.team.name);
                tempI = tempI.next;
                numRider++;
            }
            System.out.println("");
            tempR = tempR.next;
        }
    }
}