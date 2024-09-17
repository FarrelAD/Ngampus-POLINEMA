public class Circuit {
    String name;;
    Circuit prev, next;

    Circuit(Circuit prev, String name, Circuit next) {
        this.name = name;
        this.prev = prev;
        this.next = next;
    }
}
