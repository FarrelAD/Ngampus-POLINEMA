public class Team {
    Team prev, next;
    String name, constructor;
    int totalPoint;

    public Team(Team prev, String name, String constructor, Team next) {
        this.name = name;
        this.constructor = constructor;
        totalPoint = 0;
    }
}   
