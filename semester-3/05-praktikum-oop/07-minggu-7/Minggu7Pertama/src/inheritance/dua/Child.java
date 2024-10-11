package src.inheritance.dua;

public class Child extends Parent{
    public int x = 10;

    public void info(int x) {
        System.out.println(
            "Nilai x sebagai parameter: " + x + "\n" +
            "Data member x di class Child: " + this.x + "\n" +
            "Data member x di class Parent: " + super.x
        );
    }
}
