import org.junit.*;
import static org.junit.Assert.*;

public class ReservationControllerTest {
    private ReservationDbMock resDbMock;
    private ReservationController resController;
    private DateMock d1, d2;
    private CustomerMock c1, c2;

    @Before
    public void setUp() {
        resDbMock = new ReservationDbMock();
        resController = new ReservationController(resDbMock);
        d1 = new DateMock(0);
        d2 = new DateMock(4);
        c1 = new CustomerMock("Siggi", "siggi@hi.is");
        c2 = new CustomerMock("Lalli", "lalligerðivitlaust");
    }

    @After
    public void tearDown() {
        resDbMock = null;
        resController = null;
        d1 = null;
        d2 = null;
        c1 = null;
        c2 = null;
    }

    @Test
    public void testNoAvailability() {
        boolean res = resController.makeReservation(d1, c1, 2);
        assertFalse(res);
    }

    @Test
    public void testUser() {
        boolean res = resController.makeReservation(d1, c2, 3);
        assertFalse(res);
    }
}
