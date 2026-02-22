package com.example.trainweb.entity;

import jakarta.persistence.*;

@Entity
public class Train {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String trainName;
    private String source;
    private String destination;
    private int seats;

    // Getters & Setters
    public Long getId() { return id; }

    public String getTrainName() { return trainName; }
    public void setTrainName(String trainName) { this.trainName = trainName; }

    public String getSource() { return source; }
    public void setSource(String source) { this.source = source; }

    public String getDestination() { return destination; }
    public void setDestination(String destination) { this.destination = destination; }

    public int getSeats() { return seats; }
    public void setSeats(int seats) { this.seats = seats; }
}
