package com.sample.notes.service;

import com.sample.notes.entity.MatchEntity;
import com.sample.notes.entity.PlayerEntity;
import com.sample.notes.entity.RecordEntity;
import com.sample.notes.model.MatchDTO;
import com.sample.notes.model.PlayerDTO;
import com.sample.notes.model.RecordDTO;
import com.sample.notes.repository.MatchRepository;
import com.sample.notes.repository.PlayerRepository;
import com.sample.notes.repository.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class CricketService {

    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private MatchRepository matchRepository;

    @Autowired
    private RecordRepository recordRepository;

    public CompletableFuture<PlayerDTO> getPlayerById(int id) {
        return CompletableFuture.supplyAsync(() -> {
            PlayerEntity entity = playerRepository.findById(id).orElse(null);
            return entity != null ? new PlayerDTO(entity.getId(), entity.getName(), entity.getRole()) : null;
        });
    }

    public CompletableFuture<MatchDTO> getMatchById(int id) {
        return CompletableFuture.supplyAsync(() -> {
            MatchEntity entity = matchRepository.findById(id).orElse(null);
            return entity != null ? new MatchDTO(entity.getId(), entity.getScore(), entity.getStatus()) : null;
        });
    }

    public CompletableFuture<RecordDTO> getRecordById(int id) {
        return CompletableFuture.supplyAsync(() -> {
            RecordEntity entity = recordRepository.findById(id).orElse(null);
            return entity != null ? new RecordDTO(entity.getId(), entity.getRecordDate(), entity.getLastUpdated()) : null;
        });
    }
}
