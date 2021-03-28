public class DateMock implements Date {

    private String tourName;
    private int availability;

    public DateMock(String tourName, int availability) {
        this.tourName = tourName;
        this.availability = availability;
    }

    @Override
    public int getAvailability() {
        return availability;
    }

    @Override
    public void setAvailability(int availability) {
        this.availability = availability;
    }


}
