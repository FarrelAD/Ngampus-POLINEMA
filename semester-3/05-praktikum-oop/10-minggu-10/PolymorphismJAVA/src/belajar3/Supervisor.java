package belajar3;

public class Supervisor extends Manajer {
    public Supervisor(String nama, int gaji) {
        super(nama, gaji);
    }

    @Override
    public void naikkanGaji() {
        this.gaji += 1500000;
    }
}
