import Booking.Booking;
import RoomTypes.Bedroom;
import RoomTypes.BedroomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Bedroom bedroom;
    Booking booking;

    @Before
    public void setUp(){
        bedroom = new Bedroom(9, BedroomType.TRIPLE, 150);
        booking = new Booking(bedroom, 2);
    }

    @Test
    public void canGetBedroom(){
        assertEquals(bedroom, booking.getBedroom());
    }

    @Test
    public void canGetNightsBooked(){
        assertEquals(2, booking.getNightsBooked());
    }
}
