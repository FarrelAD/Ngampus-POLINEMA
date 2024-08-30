package TugasAkhir.Nomor1;

public class SLLMain {
    public static void main(String[] args) {
        SingleLinkedList singLL = new SingleLinkedList();

        singLL.print();
        singLL.addFirst(112, "Prita");
        singLL.print();
        singLL.addFirst(111, "Anton");
        singLL.print();
        singLL.insertAfter(112, 114, "Doni");
        singLL.print();
        singLL.insertAt(2, 113, "Yusuf");
        singLL.print();
        singLL.addLast(115, "Sari");
        singLL.print();
    }
}
