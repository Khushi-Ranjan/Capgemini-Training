package org.example;

import java.sql.*;

public class PlayerService {
    public static void main(String[] args) throws SQLException {

        // PostgreSQL connection
        Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/cap_player",
                "postgres",
                "root1234"
        );

        Statement statement = connection.createStatement();
//insert
//        int rowsInserted = statement.executeUpdate(
//                "INSERT INTO players values (2, 'Smith', 'Aus')"
//        );
//
//        if(rowsInserted > 0){
//            System.out.println(rowsInserted + " rows Inserted");
//        }
//        else {
//            System.out.println("insert failed");
//        }
//fetch
        ResultSet resultSet = statement.executeQuery("SELECT * FROM players");

        while(resultSet.next()){
            int id = resultSet.getInt("playerid");     // adjusted column name
            String name = resultSet.getString("playername");  // adjusted column name
            String country = resultSet.getString("playercountry");

            System.out.println(id + "|" + name + "|" + country);
        }
////update
//        int rowsUpdated = statement.executeUpdate(
//                "UPDTE players SET playercountry = 'ENGLAND' WHERE playerid = '2'"
//        );
//        if (rowsUpdated > 0){
//            System.out.println("rows updated"+ rowsUpdated);
//        }
//        else
//        {
//            System.out.println("update failed");
//        }
//        //delete
//        int rowsDeleted = statement.executeUpdate(
//                "DELETE FROM players WHERE playerid = '2'"
//        );
//        if(rowsDeleted > 0){
//            System.out.println(rowsDeleted + "rows deleted");
//        }else{
//            System.out.println("Delete Failed");
//        }

      //  connection.close();
    }
}