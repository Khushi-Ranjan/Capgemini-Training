package com.capgemini.dao;

import com.capgemini.repository.DBUtil;
import com.capgemini.entity.Player;
import java.sql.*;
import java.util.List;

public class PlayerDAOImpl implements PlayerDAO {

    // insert
    public void insertPlayer(Player player) {
        String sql = "INSERT INTO players VALUES (?,?,?)";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, player.getPlayerId());
            pstmt.setString(2, player.getPlayerName());
            pstmt.setString(3, player.getPlayerCountry());

            pstmt.executeUpdate();
            System.out.println("Player Inserted");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

//    @Override
//    public void updatePlayer(Player player) throws SQLException{
//        String updateQuery =
//                "UPDATE players SET player_name = ?, player_country = ? WHERE player_id = ?";
//
//        try (Connection connection = DBUtil.getConnection();
//             PreparedStatement stmt = connection.prepareStatement(updateQuery)) {
//
//            for (Player p : player) {
//
//                stmt.setString(1, p.getPlayerName());
//                stmt.setString(2, p.getPlayerCountry());
//                stmt.setInt(3, p.getPlayerId());
//
//                stmt.addBatch();
//            }
//
//            int[] result = stmt.executeBatch();
//
//            System.out.println("Batch update completed. Rows affected: " + result.length);
//        }
//    }
//
//
//
//    @Override
//    public void deletePlayer(int playerId) {
//
//    }
//
//    @Override
//    public List<Player> getAllPlayer() {
//        return List.of();
//    }
//}