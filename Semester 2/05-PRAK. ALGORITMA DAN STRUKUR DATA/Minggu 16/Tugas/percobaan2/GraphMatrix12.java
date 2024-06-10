package percobaan2;

public class GraphMatrix12 {
    int vertex;
    int[][] matrix;

    public GraphMatrix12(int v) {
        vertex = v;
        matrix = new int[v][v];
    }

    public void makeEdge(int asal, int tujuan, int jarak) {
        matrix[asal][tujuan] = jarak;
    }

    public void removeEdge(int asal, int tujuan) {
        matrix[asal][tujuan] = 0;
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            System.out.print("Gedung " + (char) ('A' + i) + ": ");
            for (int j = 0; j < vertex; j++) {
                if (matrix[i][j] != -1) {
                    System.out.print("Gedung " + (char) ('A' + j) + " (" + matrix[i][j] + " m, ");
                }
            }
            System.out.println("");
        }
    }

    public int countInDegree(int vertex) {
        int result = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][vertex] != 0) {
                result++;
            }
        }
        return result;
    }

    public int countOutDegree(int vertex) {
        int result = 0;
        for (int i = 0; i < matrix[vertex].length; i++) {
            if (matrix[vertex][i] != 0) {
                result++;
            }
        }
        return result;
    }
}
