package com.yusufguler.trainbookingsystem.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.awt.print.Book;
import java.util.List;

@Entity
@Table(name = "train_journey")
@Getter
@Setter
@NoArgsConstructor
public class TrainJourney {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @ManyToMany(fetch = FetchType.LAZY,cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinTable(
            name = "journey_station",
            joinColumns = @JoinColumn(name = "journey_id"),
            inverseJoinColumns = @JoinColumn(name = "station_id")
    )
    private List<TrainStation> trainStations;
    @ManyToOne(fetch = FetchType.EAGER,cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "schedule_id")
    private Schedule schedule;
    @ManyToMany(fetch = FetchType.LAZY,cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinTable(
            name = "journey_carriage",
            joinColumns = @JoinColumn(name = "journey_id"),
            inverseJoinColumns = @JoinColumn(name = "carriage_class_id")
    )
    private List<CarriageClass> carriageClasses;

    @OneToMany(mappedBy = "trainJourney",cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
    private List<Booking> bookings;

    public TrainJourney(String name) {
        this.name = name;
    }
}
