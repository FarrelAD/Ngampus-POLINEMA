package percobaan2;

public class GraphMain12 {
    public static void main(String[] args) {
        GraphMatrix12 gdg = new GraphMatrix12(4);

        gdg.makeEdge(0, 1, 50);
        gdg.makeEdge(1, 0, 60);
        gdg.makeEdge(1, 2, 70);
        gdg.makeEdge(2, 1, 80);
        gdg.makeEdge(2, 3, 40);
        gdg.makeEdge(3, 0, 90);
        gdg.printGraph();
        System.out.println("Hasil setelah penghapusan edge");
        gdg.removeEdge(2, 1);
        gdg.printGraph();

        System.out.println("");
        System.out.println("Total in-degree vertex [0] : " + gdg.countInDegree(0));
        System.out.println("Total in-degree vertex [1] : " + gdg.countInDegree(1));
        System.out.println("Total in-degree vertex [2] : " + gdg.countInDegree(2));
        System.out.println("Total in-degree vertes [3] : " + gdg.countInDegree(3));
        System.out.println("Total out-degree vertex [0] : " + gdg.countOutDegree(0));
        System.out.println("Total out-degree vertex [1] : " + gdg.countOutDegree(1));
        System.out.println("Total out-degree vertex [2] : " + gdg.countOutDegree(2));
        System.out.println("Total out-degree vertex [3] : " + gdg.countOutDegree(3));
    }
}
