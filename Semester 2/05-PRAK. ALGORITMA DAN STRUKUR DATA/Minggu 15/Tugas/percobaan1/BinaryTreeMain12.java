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
    }
}
