package com.sample.notes.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "records")
public class RecordEntity {

    @Id
    private int id;
    private LocalDateTime recordDate;
    private LocalDateTime lastUpdated;

    // Constructors
    public RecordEntity() {}

    public RecordEntity(int id, LocalDateTime recordDate, LocalDateTime lastUpdated) {
        this.id = id;
        this.recordDate = recordDate;
        this.lastUpdated = lastUpdated;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(LocalDateTime recordDate) {
        this.recordDate = recordDate;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
