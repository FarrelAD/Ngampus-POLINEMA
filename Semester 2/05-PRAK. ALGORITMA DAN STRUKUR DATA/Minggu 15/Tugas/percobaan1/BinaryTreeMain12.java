package percobaan1;
public class BinaryTreeMain12 {
    public static void main(String[] args) {
        BinaryTree12 bt = new BinaryTree12();

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);

        System.out.print("PreOrder Traversal : ");
        bt.traversePreOrder(bt.root);
        System.out.print("\nInOrder Traversal : ");
        bt.traverseInOrder(bt.root);
        System.out.print("\nPostOrder Traversal : ");
        bt.traversePostOrder(bt.root);
        System.out.print("\nFind node : " + bt.find(5));
        System.out.println("\nDelete Node 8");
        bt.delete(8);
        System.out.print("\nPreOrder Traversal : ");
        bt.traversePreOrder(bt.root);
        System.out.println("");

        ///////////////////////////////
        /////// TUGAS PRAKTIKUM ///////
        bt.deleteAll();
        System.out.println("\nPenghapusan data sudah dilakukan");
        System.out.println(
            "\n\nTUGAS PRAKTIKUM\n" + 
            "===================================="
        );
        bt.addRecursiveWay(null, 5);
        bt.addRecursiveWay(bt.root, 4);
        bt.addRecursiveWay(bt.root, 12);
        bt.addRecursiveWay(bt.root, 8);
        bt.addRecursiveWay(bt.root, 93);
        bt.addRecursiveWay(bt.root, 34);
        bt.addRecursiveWay(bt.root, 3);
        System.out.print("PreOrder Traversal : ");
        bt.traversePreOrder(bt.root);
        System.out.print("\nInOrder Traversal : ");
        bt.traverseInOrder(bt.root);
        System.out.print("\nPostOrder Traversal : ");
        bt.traversePostOrder(bt.root);
        int[] smallestAndLargestValue = bt.findSmallestAndLargestData();
        System.out.println("\nBilangan terkecil: " + smallestAndLargestValue[0]);
        System.out.println("Bilangan terbesar: " + smallestAndLargestValue[1]);

        bt.showLeaf();
        bt.countLeaf();
    }
}
