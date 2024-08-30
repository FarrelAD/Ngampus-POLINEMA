package tugas_praktikum_2;

public class Film {
    Film prev, next;
    int id;
    String judul;
    float rating;

    Film(Film prev, int id, String judul, float rating, Film next) {
        this.prev = prev;
        this.next = next;
        this.id = id;
        this.judul = judul;
        this.rating = rating;
    }
}
