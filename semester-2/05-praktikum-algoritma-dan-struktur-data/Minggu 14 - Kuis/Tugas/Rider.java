public class Rider {
    Rider prev, next;
    String name;
    Team team;
    int totalPoint;
    int[] allPoints;

    Rider(Rider prev, String name, Team team, Rider next) {
        this.prev = prev;
        this.name = name;
        this.team = team;
        this.next = next;
        totalPoint = 0;
        allPoints = new int[20];
        for (int i = 0; i < 20; i++) {
            allPoints[i] = 0;
        }
    }
}