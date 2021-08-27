import RoomTypes.ConferenceRoomType;
import RoomTypes.DiningRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;
    String name;

    @Before
    public void before(){
        diningRoom = new DiningRoom("White Lodge", ConferenceRoomType.LARGE);
    }

    @Test
    public void canGetName(){
        assertEquals("White Lodge", diningRoom.getName());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(20, diningRoom.getCapacity());
    }
}
