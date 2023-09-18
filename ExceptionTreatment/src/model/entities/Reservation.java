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

    public String updateDates(LocalDateTime checkin, LocalDateTime checkout){
        LocalDateTime now = LocalDateTime.now();
        if (checkin.isBefore(now) || checkout.isBefore(now)){
            return "Reservation dates for update must be future dates!";
        }
        if (!checkout.isAfter(checkin)){
            return "Check-out date must be after check-in date!";
        }
        setCheckin(checkin);
        setCheckout(checkout);
        return null;
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
