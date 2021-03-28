import org.junit.*;
import static org.junit.Assert.*;

public class ReservationControllerTest {
    private ReservationDbMock resDbMock;
    private ReservationController resController;

    @Before
    public void setUp() {
        resDbMock = new ReservationDbMock();
        resController = new ReservationController(resDbMock);
    }

    @After
    public void tearDown() {

    }

    @Test
    public void someTestCase() {

    }
    // ...
}
