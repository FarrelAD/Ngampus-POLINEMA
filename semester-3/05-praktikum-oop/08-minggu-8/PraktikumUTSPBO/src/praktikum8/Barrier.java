package praktikum8;

public class Barrier implements Destroyable {
    private int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void destroyed() {
        if (this.strength > 0) {
            this.strength -= 9;
        }

        if (this.strength <= 0) {
            System.out.println("\n\u001B[31mBARRIER BERHASIL DIKALAHKAN!!!\u001B[0m");
        }
    }

    public String getBarrierInfo() {
        return String.format(
            """

            \u001B[32m[[BARRIER]]\u001B[0m
            Strength: %d
            """,
            this.strength
        );
    }
}
