package com.example.helloworld.services;

import com.example.helloworld.models.Player;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> findAllPlayers() {
        return playerRepository.findAll();
    }

    public Player findPlayerById(Long id) {
        return playerRepository.findById(id).orElse(null);
    }

    public Player addNewPlayer(Player player) {
        return playerRepository.save(player);
    }

}
