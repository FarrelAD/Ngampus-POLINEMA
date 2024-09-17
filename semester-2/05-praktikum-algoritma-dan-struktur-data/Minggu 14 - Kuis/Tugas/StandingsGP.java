public class StandingsGP {
    RaceManage allRaces;

    StandingsGP(RaceManage allRaces) {
        this.allRaces = allRaces;
    }

    public void printRiderStandings() {
        System.out.print(
            "\n=============================================================================================================================================\n" +
            "|  N  | Nama                  |  Total  |                                         Balapan ke-                                               |\n" +
            "|  o  |                       |  Poin   | 1  | 2  | 3  | 4  | 5  | 6  | 7  | 8  | 9  | 10 | 11 | 12 | 13 | 14 | 15 | 16 | 17 | 18 | 19 | 20 |\n" +
            "=============================================================================================================================================\n"
        );
        Rider tmp = allRaces.head.allRiders.head;
        int numStanding = 1;

        bubbleSortPointsRiders(tmp);
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

    private void bubbleSortPointsRiders(Rider data) {
        // Langsung menghentikan proses sorting ketika datanya kosong
        if (data == null) return; 

        boolean swapped;
        do {
            swapped = false;
            Rider current = data;
            while (current.next != null) {
                if (current.totalPoint < current.next.totalPoint) {
                    // Melakukan proses swapping data-data yang ada di tiap-tiap node
                    int tempPoint = current.totalPoint;
                    current.totalPoint = current.next.totalPoint;
                    current.next.totalPoint = tempPoint;
    
                    String tempName = current.name;
                    current.name = current.next.name;
                    current.next.name = tempName;

                    int[] tempPointsArray = current.allPoints;
                    current.allPoints = current.next.allPoints;
                    current.next.allPoints = tempPointsArray;

                    // Swap data team
                    Team tempTeam = current.team;
                    current.team = current.next.team;
                    current.next.team = tempTeam;
    
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }
    
    public void printTeamsStandings() {
        System.out.print(
            "\n=================================================\n" +
            "|  N  |              Nama             |  Total  |\n" +
            "|  o  |              Tim              |  Poin   |\n" +
            "=================================================\n"
            );
            
        Team tmp = allRaces.head.allRiders.head.team; // Data ini berada di tail TeamManage
        int numStanding = 1;

        bubbleSortPointsTeams(tmp);
        while (tmp != null) {
            if (numStanding < 10) {
                System.out.printf("|  %d  |", numStanding);
            } else {
                System.out.printf("|  %d |", numStanding);
            }

            System.out.printf(" %s | %d\t|\n", tmp.name, tmp.totalPoint);

            tmp = tmp.prev;
            numStanding++;
        }
        System.out.println("=================================================");
    }


    private void bubbleSortPointsTeams(Team data) {
        // Variabel data pada class Team ini adalah data yang ada di tail dalam
        // kumpulan double linked list team. Sebelumnya, saya menggunakan penambahan data yang
        // cukup berbeda dari data yang lain (race, circuit, rider, dll). Alasan menggunakan ini
        // adalah dengan memeanfaatkan dua pointer yang ada di tiap-tiap node

        // Langsung menghentikan proses sorting ketika datanya kosong
        if (data == null) return; 

        boolean swapped;
        do {
            swapped = false;
            Team current = data;
            while (current.prev != null) {
                if (current.totalPoint < current.prev.totalPoint) {
                    // Melakukan proses swapping data-data yang ada di tiap-tiap node
                    int tempPoint = current.totalPoint;
                    current.totalPoint = current.prev.totalPoint;
                    current.prev.totalPoint = tempPoint;
    
                    String tempName = current.name;
                    current.name = current.prev.name;
                    current.prev.name = tempName;
    
                    swapped = true;
                }
                current = current.prev;
            }
        } while (swapped);
    }
}