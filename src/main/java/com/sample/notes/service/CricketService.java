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


public class CricketService {

    public CompletableFuture<PlayerDTO> getPlayerById(int id) {
        return null;
    }

    public CompletableFuture<MatchDTO> getMatchById(int id) {
        return null;
    }

    public CompletableFuture<RecordDTO> getRecordById(int id) {
        return null;
    }
}
