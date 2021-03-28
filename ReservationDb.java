public interface ReservationDb {

    public boolean book(Date date, Customer customer, int noOfSeats);

}
