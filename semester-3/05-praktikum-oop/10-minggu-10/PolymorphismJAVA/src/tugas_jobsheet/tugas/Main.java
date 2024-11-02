package tugas_jobsheet.tugas;

public class Main {

    public static void main(String[] args) {
        WalkingZombie wz = new WalkingZombie(100, 1);
        JumpingZombie jz = new JumpingZombie(100, 2);
        Barrier b = new Barrier(100);
        Plant p = new Plant();
        System.out.printf(
        """
        %s
        %s
        %s
        ---------------------------\n
        """,
        wz.getZombieInfo(),
        jz.getZombieInfo(),
        b.getBarrierInfo()
        );

        for (int i = 0; i < 4; i++) {
            p.doDestroy(wz);
            p.doDestroy(jz);
            p.doDestroy(b);
        }

        System.out.printf(
        """
        %s
        %s
        %s
        ---------------------------\n
        """,
        wz.getZombieInfo(),
        jz.getZombieInfo(),
        b.getBarrierInfo()
        );
    }
}
