package com.yusufguler.trainbookingsystem.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name="carriage_class")
@Getter
@Setter
@NoArgsConstructor
public class CarriageClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "class_name")
    private String className;
    @Column(name = "seating_capacity")
    private String seatingCapacity;
    @OneToMany(mappedBy = "carriageClass",cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
    private List<CarriagePrice> carriagePrices;

    @ManyToMany(fetch = FetchType.LAZY,cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinTable(
            name = "journey_carriage",
            joinColumns = @JoinColumn(name = "carriage_class_id"),
            inverseJoinColumns = @JoinColumn(name = "journey_id")
    )
    private List<TrainJourney> trainJourneys;
    @OneToMany(mappedBy = "carriageClass",cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
    private List<Booking> bookings;
    public CarriageClass(String className, String seatingCapacity) {
        this.className = className;
        this.seatingCapacity = seatingCapacity;
    }
}
