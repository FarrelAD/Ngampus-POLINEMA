package percobaan2;

public class BinaryTreeArrayMain12 {
    public static void main(String[] args) {
        BinaryTreeArray12 bta = new BinaryTreeArray12();

        int[] data = {6, 4, 8, 3, 5, 7, 9, 0, 0, 0};
        int idxLast = 6;
        bta.populateData(data, idxLast);
        System.out.print("\nInOrder Traversal : ");
        bta.traverseInOrder(0);
        System.out.println("\n");

        ///////////////////////////////////
        ///////// TUGAS PRAKTIKUM /////////
        bta.add(20);
        bta.add(11);
        bta.add(2);
        bta.add(1);
        bta.add(56);

        System.out.println("Data seluruh array");
        bta.print();
        System.out.print("\nInOrder Traversal : ");
        bta.traverseInOrder(0);

        System.out.print("\nPreOrder Traversal : ");
        bta.traversePreOrder(0);

        System.out.print("\nPostOrder Traversal: ");
        bta.traversePostOrder(0);
    }
}