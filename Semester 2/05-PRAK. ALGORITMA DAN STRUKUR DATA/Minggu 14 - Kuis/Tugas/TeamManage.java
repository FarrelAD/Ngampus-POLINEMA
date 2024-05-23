public class TeamManage {
    Team head, tail;

    boolean isEmpty() {
        return head == null;
    }    

    // Addlast
    public void addNewTeam(String name, String constructor) {
        Team temp = new Team(null, name, constructor, null);
        if (isEmpty()) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
    }

    public void printAllTeams() {
        Team temp = head;
        while (temp != null) {
            System.out.println(temp.name);
            temp = temp.next;
        }
    }
}
