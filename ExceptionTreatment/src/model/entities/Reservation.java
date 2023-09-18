package model.entities;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Reservation {

    private int roomNumber;
    private LocalDateTime checkin;
    private LocalDateTime checkout;

    public final static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Reservation(int roomNumber, LocalDateTime checkin, LocalDateTime checkout) {
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDateTime getCheckin() {
        return checkin;
    }

    public void setCheckin(LocalDateTime checkin) {
        this.checkin = checkin;
    }

    public LocalDateTime getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDateTime checkout) {
        this.checkout = checkout;
    }

    public int duration(){
        return (int) Duration.between(checkin, checkout).toDays();
    }

    public void updateDates(LocalDateTime checkin, LocalDateTime checkout){
        setCheckin(checkin);
        setCheckout(checkout);
    }

    @Override
    public String toString() {
        return "\nReservation:" +
                "\nRoom Number = " + roomNumber +
                "\nCheckin date = " + checkin.format(dtf) +
                "\nCheckout date = " + checkout.format(dtf) +
                "\nNights = " + duration();
    }
}
