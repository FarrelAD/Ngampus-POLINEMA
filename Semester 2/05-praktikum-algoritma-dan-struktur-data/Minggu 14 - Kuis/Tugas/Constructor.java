public class Constructor {
    Constructor prev, next;
    String name;
    int totalPoint;

    public Constructor(Constructor prev, String name, int totalPoint, Constructor next) {
        this.prev = prev;
        this.next = next;
        this.name = name;
        this.totalPoint = totalPoint;
    }
}
