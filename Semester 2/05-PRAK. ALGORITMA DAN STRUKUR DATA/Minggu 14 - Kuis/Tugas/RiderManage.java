public class RiderManage {
    Rider head, tail;
    int totalRider;

    boolean isEmpty() {
        return head == null;
    }

    public void addNewRider(String name, Team team) {
        if (isEmpty()) {
            head = tail =  new Rider(null, name, team, null);
        } else {
            head.next = new Rider(head, name, team, null);
            head = head.next;
        }
        totalRider++;
    }

    public void addPoint(int riderIndex, int currentRace, int point) {
        Rider temp = head;
        int riderNum = 0;
        while (temp != null) {
            if (riderIndex == riderNum) {
                temp.totalPoint += point;
                temp.allPoints[currentRace - 1] = point;
            }
            temp = temp.prev;
            riderNum++;
        }
    }
}
