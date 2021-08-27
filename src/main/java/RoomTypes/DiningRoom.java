package RoomTypes;

import Room.Room;

public class DiningRoom extends Room {

    private String name;
    private ConferenceRoomType diningRoomType;

    public DiningRoom(String name, ConferenceRoomType diningRoomType){
        super();
        this.name = name;
        this.diningRoomType = diningRoomType;
    }

    public String getName(){
        return this.name;
    }

    public int getCapacity(){
        return diningRoomType.getCapacity();
    }
}
