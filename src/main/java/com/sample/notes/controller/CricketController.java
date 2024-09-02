package com.sample.notes.controller;


import com.sample.notes.model.MatchDTO;
import com.sample.notes.model.PlayerDTO;
import com.sample.notes.model.RecordDTO;
import com.sample.notes.service.CricketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/api/cricket")
public class CricketController {

    @Autowired
    private CricketService cricketService;

    @GetMapping("/fetch")
    public ResponseEntity<String> fetchCricketData(@RequestParam int playerId, @RequestParam int matchId, @RequestParam int recordId) {

        return null;
    }
}
