package com.sample.notes.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MatchDTO {
    private int id;
    private int score;
    private String status;

}
