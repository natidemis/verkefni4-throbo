public class ReservationDbMock implements ReservationDb {

    @Override
    public boolean book(Date date, Customer customer, int noOfSeats){
        return true;
    }
}
