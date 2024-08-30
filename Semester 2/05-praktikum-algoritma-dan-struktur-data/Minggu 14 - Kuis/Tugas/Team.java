public class Team {
    Team prev, next;
    String name, constructor;
    int totalPoint;

    public Team(Team prev, String name, String constructor, Team next) {
        this.prev = prev;
        this.next = next;
        this.name = name;
        this.constructor = constructor;
        totalPoint = 0;
    }

    public void addPoint(int point) {
        totalPoint += point;
    }
}   
