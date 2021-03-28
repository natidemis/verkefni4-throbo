import org.junit.*;
import static org.junit.Assert.*;

public class ReservationControllerTest {
    private ReservationDbMock resDbMock;
    private ReservationController resController;
    private DateMock d1;
    private CustomerMock c1;

    @Before
    public void setUp() {
        resDbMock = new ReservationDbMock();
        resController = new ReservationController(resDbMock);
        d1 = new DateMock(0);
        c1 = new CustomerMock("Siggi", "siggi@hi.is");
    }

    @After
    public void tearDown() {

    }

    @Test
    public void testNoAvailability() {
        boolean res = resController.makeReservation(d1, c1, 2);
        assertFalse(res);
    }
}
