public class Race {
    Circuit circuit;
    RiderManage allRiders;
    Race prev, next;

    Race(Race prev, Circuit circuit, RiderManage allRiders, Race next) {
        this.prev = prev;
        this.next = next;
        this.circuit = circuit;
        this.allRiders = allRiders;
    }
}