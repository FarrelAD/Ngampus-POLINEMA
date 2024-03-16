public class Main {
    public static void main(String[] args) {
        Persegi[] ps = new Persegi[3];

        for (int i = 0; i < ps.length; i++) {
            ps[i] = new Persegi();
            ps[i].hitungLuas(3);
        }
    }
}