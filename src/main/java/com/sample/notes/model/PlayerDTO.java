package com.sample.notes.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PlayerDTO {
    private int id;
    private String name;
    private String role;
}
