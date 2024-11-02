public class PerkalianKu2 {
    void perkalian(int a, int b) {
        System.out.println(a * b);
    }

    void perkalian(double a, double b) {
        System.out.println(a * b);
    }

    public static void main(String[] args) {
        PerkalianKu2 obj = new PerkalianKu2();
        obj.perkalian(25, 43);
        obj.perkalian(34.56, 23.7);
    }
}
