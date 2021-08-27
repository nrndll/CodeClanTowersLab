package RoomTypes;

import Booking.Booking;
import Hotel.Guest;
import Room.Room;

import java.util.ArrayList;

public class Bedroom extends Room {

    private BedroomType bedroomType;
    private int capacity;
    private int roomNumber;
    private double rate;

    public Bedroom(int roomNumber, BedroomType bedroomType, double rate){
        super();
        this.capacity = bedroomType.getCapacity();
        this.roomNumber = roomNumber;
        this.bedroomType = bedroomType;
        this.rate = rate;
    }

    public BedroomType getBedroomType() {
        return bedroomType;
    }

    public void setBedroomType(BedroomType bedroomType) {
        this.bedroomType = bedroomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getTotalBill(Booking booking){
        return (rate * booking.getNightsBooked());
    }

}
