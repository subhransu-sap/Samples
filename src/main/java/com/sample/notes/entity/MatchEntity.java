package com.sample.notes.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "matches")
public class MatchEntity {

    @Id
    private int id;
    private int score;
    private String status;

    // Constructors
    public MatchEntity() {}

    public MatchEntity(int id, int score, String status) {
        this.id = id;
        this.score = score;
        this.status = status;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
