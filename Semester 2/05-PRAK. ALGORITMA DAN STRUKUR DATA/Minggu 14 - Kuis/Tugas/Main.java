import java.util.Scanner;

public class Main {
    static Scanner sc12 = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println(
            "==========================================\n" +
            "   -- WELCOME TO MOTOGP 2024 STANDINGS--  \n"
        );

        // Data ini berdaarkan data yang ada di MotoGP pada tahun 2024
        // dengan beberapa penyesuaian
        // Sumber: https://www.motogp.com/en/teams/motogp
        String team[] = {
            "Ducati Lenovo Team", // 1 - Ducati
            "Prima Pramac Racing", // 2 - Ducati
            "Gresini Racing MotoGP", // 3 - Ducati
            "Pertamina Endura VR46 Team", // 4 - Ducati
            "Aprilia Racing", // 5 - Aprilia
            "Trackhouse Racing", // 6 - Aprilia
            "Red Bull KTM Factory Racing", // 7 - KTM
            "Monster Energy Yamaha MotoGP", // 8 - Yamaha
            "LCR Honda", // 9 - Honda
            "Repsol Honda Team" // 10 - Honda
        };

        String rider[] = {
            "Francesco Bagnaia    ", // 1
            "Enea Bastianini      ",  // 1
            "Franco Morbidelli    ", // 2
            "Jorge Martin         ", // 2
            "Maverick Vinales     ", // 3
            "Alex Espargaro       ", // 3
            "Alex Marquez         ", // 4
            "Marc Marquez         ", // 4
            "Dani Pedrosa         ", // 5
            "Brad Binder          ", // 5
            "Fabio di Giannantonio", // 6
            "Marco Bezzecchi      ", // 6
            "Raul Fernandez       ", // 7
            "Miguel Oliviera      ", // 7
            "Fabio Quartararo     ", // 8
            "Alex Rins            ", // 8
            "Johann Zarco         ", // 9
            "Takaaki Nakagami     ", // 9
            "Joan Mir             ", // 10
            "Jack Miller          " // 10
        };

        String constructor[] = {
            "Ducati",
            "Aprilia",
            "KTM",
            "Yamaha",
            "Honda"
        };

        String raceCircuit[] = {
            "Mandalika", // 1
            "Assen", // 2
            "Motegi", // 3
            "Red Bull Ring", // 4
            "Silverstone", // 5
            "Misano", // 6
            "Sachsenring",  // 7
            "KymiRing", // 8
            "Catalunya", // 9 
            "Sepang", // 10
            "Mugello", // 11
            "Jerez", // 12
            "Chang International Circuit", // 13
            "Aragón", // 14
            "Phillip Island", // 15
            "Autodromo Internacional do Algarve", // 16
            "Shanghai", // 17
            "Le Mans", // 18
            "Indianapolis Motor Speedway", // 19
            "Circuit of the Americas" // 20
        };

        // Menambahkan data rider, team, dan konstruktor ke data klasemen MotoGP 2024

        // Menambahkan data team ke dalam bentuk double linked list
        TeamManage tm2024 = new TeamManage();
        for (int i = 0; i < team.length; i++) {
            if (i < 4) {
                tm2024.addNewTeam(team[i], constructor[0]); // Ducati
            } else if (i < 6) {
                tm2024.addNewTeam(team[i], constructor[1]); // Aprilia
            } else if (i == 6) {
                tm2024.addNewTeam(team[i], constructor[2]); // KTM
            } else if (i == 7) {
                tm2024.addNewTeam(team[i], constructor[3]); // Yamaha
            } else {
                tm2024.addNewTeam(team[i], constructor[4]); // Honda
            }
        }

        
        // Menambahkan data rider ke dalam bentuk double linked list
        RiderManage rdrM2024 = new RiderManage();

        Team tempTeam = tm2024.head;
        int riderIndex = 0;
        while (tempTeam != null) {
            rdrM2024.addNewRider(rider[riderIndex], tempTeam);
            riderIndex++;
            rdrM2024.addNewRider(rider[riderIndex], tempTeam);
            riderIndex++;
            tempTeam = tempTeam.next;
        }
        
        // Menambahkan data circuit ke dalam bentuk double linked list
        CircuitManage ctM2024 = new CircuitManage();
        for (int i = 0; i < raceCircuit.length; i++) {
            ctM2024.addNewCircuit(raceCircuit[i]);
        }
                
        // Objek race manage untuk menampung seluruh balapan yang ada di MotoGP
        int totalRace = 20;
        RaceManage rcM2024 = new RaceManage(totalRace, rdrM2024, ctM2024);
        
        // Use data from object rdrM2024 and ctM2024 to rider standings
        RiderStandings rdStandings2024 = new RiderStandings(rdrM2024, ctM2024, rcM2024);

        int currentRace = 0;
        char seeNextRace = 'y';
        char nextMenu = 'p';
        while ((currentRace <= totalRace && (seeNextRace == 'y' || seeNextRace == 'Y')) || nextMenu == 'p') {
            menu();
            int selectedMenu = sc12.nextInt();

            switch (selectedMenu) {
                case 1:
                    System.out.printf("\nBalapan ke-%d\n", currentRace);
                    showStandings(rdStandings2024);
                    break;
                case 2:

                    break;
                case 3:

                    break;
                default:
                    break;
            }
            
            
            if (currentRace < totalRace) {
                System.out.print(
                    "Lanjut balapan selanjutnya ("+ ctM2024.showNextRace(currentRace + 1).name +") ? (Y/T)\n" +
                    "Ketik 'N' untuk skip ke beberapa balapan berikutnya\n" +
                    ">>> "
                );
                seeNextRace = sc12.next().charAt(0);
                if (seeNextRace == 'N') {
                    skipToTheNextRace(ctM2024, rcM2024, currentRace);
                } else if (seeNextRace == 'Y' || seeNextRace == 'y') {
                    rcM2024.raceNow(1);
                }
            } else {
                System.out.print(
                    "Lihat siapa pemenangnya! \n" +
                    "Lanjutkan (Ketik P)\n" +
                    ">>> "
                );
                nextMenu = sc12.next().charAt(0);
            }

            currentRace++;
            
            // Mekanisme untuk menghapus output yang sudah ditampilkan di terminal
            // System.out.print("\033[H\033[2J");
            // System.out.flush();
        }
    }
    
    private static void menu() {
        System.out.print(
            " Silakan pilih menu yang tersedia\n" +
            "   1. Lihat klasemen\n" +
            "   2. Cari posisi pembalap\n" +
            "   3. -\n" +
            ">>> "
            );
        }
        
    private static void showStandings(RiderStandings rdStandings2024) {
        System.out.println("Data klasemen terkini MotoGP 2024");
        rdStandings2024.printRiderStandings();
    }

    private static void skipToTheNextRace(CircuitManage ctM2024, RaceManage rcM2024, int currentRace) {
        System.out.print(
            "Masukkan nomor urut balapan selanjutnya (1 - 20) \n" +
            ">>> "
        );
        int nextRace = sc12.nextInt();
        rcM2024.raceNow(nextRace - currentRace);
        // wait bro, it's not done
    }
}