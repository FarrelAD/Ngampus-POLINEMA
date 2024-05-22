public class RaceManage {
    int totalRace;
    Race[] race;
    Race head, tail;

    public RaceManage(int totalRace) {
        this.totalRace = totalRace;
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
}