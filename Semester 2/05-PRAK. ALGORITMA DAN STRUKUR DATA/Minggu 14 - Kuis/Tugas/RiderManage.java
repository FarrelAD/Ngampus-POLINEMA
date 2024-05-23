public class RiderManage {
    Rider head, tail;
    int totalRider;

    boolean isEmpty() {
        return head == null;
    }

    // Addfirst
    public void addNewRider(String name, Team team) {
        if (isEmpty()) {
            head = tail =  new Rider(null, name, team, null);
        } else {
            head.prev = new Rider(null, name, team, head);
            head = head.prev;
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
            temp = temp.next;
            riderNum++;
        }
    }

    public void printAllRider() {
        Rider temp = head;
        while (temp != null) {
            System.out.println(temp.name);
            temp = temp.next;
        }
    }

    public void printAllRiderPoints() {
        Rider temp = head;
        int num = 1;
        while (temp != null) {
            System.out.println(num + ". " + temp.name + " - " + temp.totalPoint);
            num++;
            temp = temp.next;
        }
    }
}
