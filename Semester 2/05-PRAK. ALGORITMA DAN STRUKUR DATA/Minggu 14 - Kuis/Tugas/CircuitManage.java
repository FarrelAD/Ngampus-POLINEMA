public class CircuitManage {
    Circuit head, tail;
    int totalCircuit;

    public boolean isEmpty() {
        return head == null;
    }

    // Addfirst
    public void addNewCircuit(String name) {
        if (isEmpty()) {
            head = tail =  new Circuit(null, name, null);
            totalCircuit++;
        } else {
            head.prev = new Circuit(null, name, head);
            totalCircuit++;
            head = head.prev;
        }
    }

    public Circuit showNextRace(int nextRace) {
        Circuit result = null;
        if (nextRace <= totalCircuit) {
            Circuit temp = head;
            int raceNum = 1;
            while (temp != null) {
                if (raceNum == nextRace) {
                    result = temp;
                }
                temp = temp.next;
                raceNum++;
            }
        }
        return result;
    }

    public void printtAllCircuit() {
        Circuit temp = head;
        while (temp != null) {
            System.out.println(temp.name);
            temp = temp.next;
        }
    }
}