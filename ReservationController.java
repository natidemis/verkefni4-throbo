public class ReservationController {
    private ReservationDb resDb;

    public ReservationController(ReservationDb resDb) {
        this.resDb = resDb;
    }

    public boolean makeReservation(Date date, Customer customer, int noOfSeats) {
        return true;
    }
}