package tugas_jobsheet.tugas;

public class WalkingZombie extends Zombie {
    public WalkingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    public void heal() {
        switch (this.level) {
            case 1:
                this.health += 0.2 * this.health;
                break;
            case 2:
                this.health += 0.3 * this.health;
                break;
            case 3:
                this.health += 0.4 * this.health;
                break;
            default:
                break;
        }
    }

    public void destroyed() {
        if (this.health > 0) {
            this.health -= (0.2 * this.health);
        }

        if (this.health <= 0) {
            System.out.println("\n\u001B[31mWALKING ZOMBIE BERHASIL DIKALAHKAN!!!\u001B[0m");
        }
    }

    public String getZombieInfo() {
        return String.format(
            """
            \u001B[35m[[WALKING ZOMBIE]]\u001B[0m
            Health: %d
            Level: %d
            """,
            this.health,
            this.level
        );
    }
}
