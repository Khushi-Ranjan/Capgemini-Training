package com.capg;

import com.capg.dao.PlayerDAO;
import com.capg.dao.PlayerDAOImpl;
import com.capg.entity.Player;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

public class BatchApp {
    public static void main (String[] args) throws SQLException {
        PlayerDAO dao = new PlayerDAOImpl();

        List<Player> players = Arrays.asList(
                new Player(8956, "Virat", "India "),
                new Player(9567, "Warner", "England"),
                new Player(8563, "Babar", "Pakistan")
        );

        dao.insertBatch(players);
//
//        dao.updateBatch(Arrays.asList(
//                new Player(5966, "Shubhman","India"),
//                new Player (8456,"Smith", "Australia")
//        ));
//        dao.deleteBatch(players);
//
    }
}
