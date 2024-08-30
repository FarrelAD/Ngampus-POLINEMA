package doublelinkedlists;

public class DoubleLinkedListsMain {
    public static void main(String[] args) throws Exception {
        DoubleLinkedLists dll = new DoubleLinkedLists();

        // Percobaan 1
        dll.print();
        System.out.println("Size : " + dll.size);
        System.out.println("===================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : " + dll.size);
        System.out.println("===================================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : " + dll.size);
        System.out.println("===================================");
        dll.clear();
        dll.print();
        System.out.println("Size : " + dll.size);
        System.out.println("===================================");

        // Percobaan 2
        dll.addLast(50);
        dll.addLast(40);
        dll.addLast(10);
        dll.addLast(20);
        dll.print();
        System.out.println("Size : " + dll.size);
        System.out.println("===================================");
        dll.removeFirst();
        dll.print();
        System.out.println("Size : " + dll.size);
        System.out.println("===================================");
        dll.removeLast();
        dll.print();
        System.out.println("Size : " + dll.size);
        System.out.println("===================================");
        dll.remove(1);
        dll.print();
        System.out.println("Size : " + dll.size);
        System.out.println("===================================");


        // Percobaan 3
        dll.clear();
        dll.print();
        System.out.println(
            "Size : " + dll.size + 
            "\n==================================="
        );
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println(
            "Size : " + dll.size + 
            "\n==================================="
        );
        dll.add(40, 1);
        dll.print();
        System.out.println(
            "Size : " + dll.size + 
            "\n===================================" +
            "\nData awal pada linked list adalah: " + dll.getFirst() +
            "\nData akhir pada linked list adalah: " + dll.getLast() + 
            "\nData indeks ke-1 pada linked list adalah: " + dll.get(1)
        );
    }
}
