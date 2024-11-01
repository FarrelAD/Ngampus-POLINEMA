package latihan_personal;
public class User {

    private String name;
    private int age;


    // Overloading
    public User() {
        this.name = "John Doe";
        this.age = 20;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void doSomething() {
        System.out.println("User is walking!");
    }
}