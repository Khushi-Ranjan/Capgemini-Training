package com.capg.dao;

import com.capg.entity.Player;
import com.capg.repository.DBUtil;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PlayerDAOImpl implements PlayerDAO{

    //insert
    public void insertBatch(List<Player> players ) throws SQLException {
        Connection connection = DBUtil.getConnection();

        String insertQuery =" INSERT INTO players VALUES(?, ?, ?)";
        PreparedStatement stmt = connection.prepareStatement(insertQuery);

        for (Player p : players){
            stmt.setInt(1, p.getPlayerId());
            stmt.setString(2, p.getPlayerName());
            stmt.setString(3,p.getPlayerCountry());

            stmt.addBatch();
        }

        int[] result = stmt.executeBatch();
        System.out.println("All players implemented");
    }
//update
    @Override
    public void updateBatch(List<Player> players) throws SQLException {

        String updateQuery =
                "UPDATE players SET player_name = ?, player_country = ? WHERE player_id = ?";

        try (Connection connection = DBUtil.getConnection();
             PreparedStatement stmt = connection.prepareStatement(updateQuery)) {


            for (Player p : players) {

                stmt.setString(1, p.getPlayerName());
                stmt.setString(2, p.getPlayerCountry());
                stmt.setInt(3, p.getPlayerId());

                stmt.addBatch();
            }

            int[] result = stmt.executeBatch();

            connection.commit();

            System.out.println("Batch update successful");
        }
    }
//delete
@Override
public void deleteBatch(List<Integer> playerIds) throws SQLException {

    String deleteQuery = "DELETE FROM players WHERE player_id = ?";

    try (Connection connection = DBUtil.getConnection();
         PreparedStatement stmt = connection.prepareStatement(deleteQuery)) {

        connection.setAutoCommit(false);

        for (Integer id : playerIds) {

            stmt.setInt(1, id);
            stmt.addBatch();
        }

        int[] result = stmt.executeBatch();

        connection.commit();

        System.out.println("Batch deletion successful");
    }
}
//fetch
@Override
public List<Player> fetchAll() throws SQLException {

    String selectQuery = "SELECT player_id, player_name, player_country FROM players";

    List<Player> players = new ArrayList<>();

    try (Connection connection = DBUtil.getConnection();
         PreparedStatement stmt = connection.prepareStatement(selectQuery);
         ResultSet rs = stmt.executeQuery()) {

        while (rs.next()) {

            int id = rs.getInt("player_id");
            String name = rs.getString("player_name");
            String country = rs.getString("player_country");

            Player player = new Player(id, name, country);
            players.add(player);
        }
    }

    return players;}
}
