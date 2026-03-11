package com.capgemini.dao;

import com.capgemini.entity.Player;
import java.util.List;

public interface PlayerDAO {
    void insertPlayer(Player player);
    void  updatePlayer(Player player);
    void deletePlayer(int playerId);

    List<Player> getAllPlayer();
}
