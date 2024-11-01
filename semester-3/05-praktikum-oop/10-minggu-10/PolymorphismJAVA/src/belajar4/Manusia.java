package belajar4;

public class Manusia {
    public void makanBuah(Buah x) {
        if (x instanceof Apel) {
            System.out.println("Apel langsung dimakan");
            ((Apel) x).tampilkanBiji();
        } else if (x instanceof Pisang) {
            System.out.println("Pisang dikupas terlebih dahulu!");
            ((Pisang) x).tampilkanKulit();
        }

        System.out.println("Rasanya: " + x.rasa);
    }
}
