package com.capg.entity;

public class Player {
    private int playerId;
    private String playerName;
    private String playerCountry;

    public Player(int playerId, String playerName, String playerCountry){
        this.playerId = playerId;
        this.playerName = playerName;
        this.playerCountry = playerCountry;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setPlayerCountry(String playerCountry) {
        this.playerCountry = playerCountry;
    }

    public int getPlayerId() {
        return playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public String getPlayerCountry() {
        return playerCountry;
    }
}