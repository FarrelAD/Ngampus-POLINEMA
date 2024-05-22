public class CircuitManage {
    Circuit head, tail;
    int totalCircuit;

    public boolean isEmpty() {
        return head == null;
    }

    public void addNewCircuit(String name) {
        if (isEmpty()) {
            head = tail =  new Circuit(null, name, null);
            totalCircuit++;
        } else {
            head.next = new Circuit(head, name, null);
            totalCircuit++;
            head = head.next;
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
                temp = temp.prev;
                raceNum++;
            }
        }
        return result;
    }
}