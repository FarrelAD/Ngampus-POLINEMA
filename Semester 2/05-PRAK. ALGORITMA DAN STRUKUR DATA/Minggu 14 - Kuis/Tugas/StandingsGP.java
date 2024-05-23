public class StandingsGP {
    RiderManage allRiders;
    CircuitManage allCircuit;
    RaceManage allRace;
    int currentRace;

    StandingsGP(RiderManage allRiders, CircuitManage allCircuit, RaceManage allRace) {
        this.allRiders = allRiders;
        this.allCircuit = allCircuit;
        this.allRace = allRace;
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

        bubbleSortPoints(allRiders.head);
        while (tmp != null) {
            // Melakukan format skor pada tiap balapan agar output bisa lebih rapi
            // saat dijadikan dalam bentuk tabel
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
            tmp = tmp.next;
            numStanding++;
        }
        System.out.println("=============================================================================================================================================");
    }

    public void bubbleSortPoints(Rider head) {
        // Langsung menghentikan proses sorting ketika datanya kosong
        if (head == null) return; 
    
        boolean swapped;
        do {
            swapped = false;
            Rider current = head;
            while (current.next != null) {
                if (current.totalPoint < current.next.totalPoint) {
                    Rider temp = current;
                    current = current.next;
                    current.next = temp;
    
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }
}
