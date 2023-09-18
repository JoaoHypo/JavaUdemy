package model.entities;

import model.exceptions.DomainException;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Reservation {

    private final int roomNumber;
    private LocalDateTime checkin;
    private LocalDateTime checkout;

    public final static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Reservation(int roomNumber, LocalDateTime checkin, LocalDateTime checkout){
        if (!checkout.isAfter(checkin)){
            throw new DomainException("Check-out date must be after check-in date!");
        } //defensive programming , error check first
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public void setCheckin(LocalDateTime checkin) {
        this.checkin = checkin;
    }


    public void setCheckout(LocalDateTime checkout) {
        this.checkout = checkout;
    }

    public int duration(){
        return (int) Duration.between(checkin, checkout).toDays();
    }

    public void updateDates(LocalDateTime checkin, LocalDateTime checkout){
        LocalDateTime now = LocalDateTime.now();
        if (checkin.isBefore(now) || checkout.isBefore(now)){
            throw new DomainException("Reservation dates for update must be future dates!");
        }
        if (!checkout.isAfter(checkin)){
            throw new DomainException("Check-out date must be after check-in date!");
        }
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
