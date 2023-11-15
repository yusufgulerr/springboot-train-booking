package com.yusufguler.trainbookingsystem.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.lang.model.element.Name;
import java.util.Date;

@Entity
@Table(name = "booking")
@Getter
@Setter
@NoArgsConstructor
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "booking_date")
    private Date bookingDate;
    @Column(name = "amount_paid")
    private int amountPaid;
    @Column(name = "ticket_no")
    private int ticketNo;
    @Column(name = "seat_no")
    private int seatNo;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private BookingStatus bookingStatus;

    @ManyToOne
    @JoinColumn(name = "starting_station_id")
    private TrainStation trainStartingStation;
    @ManyToOne
    @JoinColumn(name = "ending_station_id")
    private TrainStation trainEndingStation;
    @ManyToOne
    @JoinColumn(name = "train_journey_id")
    private TrainJourney trainJourney;

    @ManyToOne
    @JoinColumn(name = "passenger_id")
    private Passenger passenger;
    @ManyToOne
    @JoinColumn(name = "ticket_class_id")
    private CarriageClass carriageClass;

    public Booking(Date bookingDate, int amountPaid, int ticketNo, int seatNo) {
        this.bookingDate = bookingDate;
        this.amountPaid = amountPaid;
        this.ticketNo = ticketNo;
        this.seatNo = seatNo;
    }
}
