import java.util.Random;

public class RiderStandings {
    RiderManage allRiders;
    CircuitManage allCircuit;
    RaceManage allRace;
    int currentRace;

    RiderStandings(RiderManage allRiders, CircuitManage allCircuit, RaceManage allRace) {
        this.allRiders = allRiders;
        this.allCircuit = allCircuit;
        this.allRace = allRace;
    }

    public void sortStandings() {
        System.out.println("hahahaha");
        boolean swapped = true;
        while (swapped) {
            System.out.println("yayay");
            swapped = false;
            Rider currentRider = allRiders.head;
            while (currentRider != null && currentRider.prev != null) {
                System.out.println("appaaan?");
                if (currentRider.prev.totalPoint > currentRider.totalPoint) {
                    System.out.println("apa???");
                    Rider temp = currentRider.prev;
                    currentRider = currentRider.prev;
                    currentRider.prev = temp;
                    swapped = true;
                } else {
                    currentRider = currentRider.prev;
                }
            }
        }
    }

    public void printRiderStandings() {
        // sortStandings();
        System.out.print(
            "\n=============================================================================================================================================\n" +
            "|  N  | Nama                  |  Total  |                                         Balapan ke-                                               |\n" +
            "|  o  |                       |  Poin   | 1  | 2  | 3  | 4  | 5  | 6  | 7  | 8  | 9  | 10 | 11 | 12 | 13 | 14 | 15 | 16 | 17 | 18 | 19 | 20 |\n" +
            "=============================================================================================================================================\n"
        );
        Rider tmp = allRiders.head;
        int numStanding = 1;

        bubbleSortPoints(allRiders.head);
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

    public void bubbleSortPoints(Rider head) {
        if (head == null) return;
    
        boolean swapped;
        do {
            swapped = false;
            Rider current = head;
            while (current.prev != null) {
                if (current.totalPoint < current.prev.totalPoint) {
                    int tempPoint = current.totalPoint;
                    current.totalPoint = current.prev.totalPoint;
                    current.prev.totalPoint = tempPoint;
    
                    String tempName = current.name;
                    current.name = current.prev.name;
                    current.prev.name = tempName;
    
                    // Swap poin array
                    int[] tempPointsArray = current.allPoints;
                    current.allPoints = current.prev.allPoints;
                    current.prev.allPoints = tempPointsArray;
    
                    swapped = true;
                }
                current = current.prev;
            }
        } while (swapped);
    }
}
