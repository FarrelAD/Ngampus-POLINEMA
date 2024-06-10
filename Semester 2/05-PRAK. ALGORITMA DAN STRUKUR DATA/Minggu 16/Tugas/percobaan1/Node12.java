package percobaan1;


public class Node12 {
    int data;
    Node12 prev, next;
    int jarak;

    Node12(Node12 prev, int data, int jarak, Node12 next) {
        this.prev = prev;
        this.data = data;
        this.jarak = jarak;
        this.next = next;
    }
}