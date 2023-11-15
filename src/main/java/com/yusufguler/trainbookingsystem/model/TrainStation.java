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

import java.util.List;

@Entity
@Table(name = "train_station")
@Getter
@Setter
@NoArgsConstructor
public class TrainStation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "station_name")
    private String stationName;
    @ManyToMany(fetch = FetchType.LAZY,cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinTable(
            name = "journey_station",
            joinColumns = @JoinColumn(name = "station_id"),
            inverseJoinColumns = @JoinColumn(name = "journey_id")
    )
    private List<TrainJourney> trainJourneys;


    @OneToMany(mappedBy = "trainStartingStation")
    private List<Booking> bookingsFromStartingStation;
    @OneToMany(mappedBy = "trainEndingStation")
    private List<Booking> bookingsFromEndingStation;


    public TrainStation(String stationName) {
        this.stationName = stationName;
    }
}
