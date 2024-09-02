package com.sample.notes.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class RecordDTO {
    private int id;
    private LocalDateTime recordDate;
    private LocalDateTime lastUpdated;
}
