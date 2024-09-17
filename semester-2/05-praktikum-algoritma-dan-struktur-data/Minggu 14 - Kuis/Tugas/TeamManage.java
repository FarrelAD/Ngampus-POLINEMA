public class TeamManage {
    Team head, tail;

    boolean isEmpty() {
        return head == null;
    }    

    // Addlast
    public void addNewTeam(String name, String constructor) {
        if (isEmpty()) {
            head = tail = new Team(null, name, constructor, null);
        } else {
            tail.next = new Team(tail, name, constructor, null);
            tail = tail.next;
        }
    }

    public void printAllTeams() {
        Team temp = head;
        int num = 1;
        System.out.println("");
        while (temp != null) {
            System.out.println(num + ". " + temp.name);
            temp = temp.next;
            num++;
        }
        System.out.println("");
    }
}
