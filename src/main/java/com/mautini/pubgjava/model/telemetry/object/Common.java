package com.mautini.pubgjava.model.telemetry.object;

public class Common {

    private String matchId;

    private Map mapName;

    private Float isGame;

    public Common() {
    }

    public String getMatchId() {
        return matchId;
    }

    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }

    public Map getMapName() {
        return mapName;
    }

    public void setMapName(Map mapName) {
        this.mapName = mapName;
    }

    public Float getIsGame() {
        return isGame;
    }

    public void setIsGame(Float isGame) {
        this.isGame = isGame;
    }
}
