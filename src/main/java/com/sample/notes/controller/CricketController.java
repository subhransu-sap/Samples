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
        CompletableFuture<PlayerDTO> player = cricketService.getPlayerById(playerId);
        CompletableFuture<MatchDTO> match = cricketService.getMatchById(matchId);
        CompletableFuture<RecordDTO> record = cricketService.getRecordById(recordId);

        CompletableFuture<Void> allOf = CompletableFuture.allOf(player, match, record);

        return allOf.thenApply(v -> {
            try {
                String result = "Player: " + player.get().getName() + " - " + player.get().getRole() + "\n" +
                        "Match: " + match.get().getScore() + " - " + match.get().getStatus() + "\n" +
                        "Record Date: " + record.get().getRecordDate() + " - Last Updated: " + record.get().getLastUpdated();
                return ResponseEntity.ok(result);
            } catch (Exception e) {
                return ResponseEntity.status(500).body("Error occurred: " + e.getMessage());
            }
        }).join();
    }
}
