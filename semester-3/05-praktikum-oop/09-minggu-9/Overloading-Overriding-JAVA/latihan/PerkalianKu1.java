public class PerkalianKu1 {
    void perkalian(int a, int b) {
        System.out.println(a * b);
    }

    void perkalian(int a, int b, int c) {
        System.out.println(a * b * c);
    }

    public static void main(String[] args) {
        PerkalianKu1 obj = new PerkalianKu1();
        obj.perkalian(25, 43);
        obj.perkalian(34, 23, 56);
    }
}
