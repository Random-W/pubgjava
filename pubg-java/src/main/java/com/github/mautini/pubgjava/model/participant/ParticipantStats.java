package com.github.mautini.pubgjava.model.participant;

import com.google.gson.annotations.SerializedName;

public class ParticipantStats {

    @SerializedName("DBNOs")
    private Integer dbnos;

    private Integer assists;

    private Integer boosts;

    private Double damageDealt;

    private String deathType;

    private Integer headshotKills;

    private Integer heals;

    private Integer killPlace;

    // Deprecated for PC
    @Deprecated
    private Integer killPoints;

    // Deprecated for PC
    @Deprecated
    private Double killPointsDelta;

    private Integer killStreaks;

    private Integer kills;

    private Integer lastKillPoints;

    private Integer lastWinPoints;

    private Double longestKill;

    private Double mostDamage;

    private String name;

    private String playerId;

    // PC only
    @Deprecated
    private Double rankPoints;

    private Integer revives;

    private Double rideDistance;

    private Integer roadKills;

    private Double swimDistance;

    private Integer teamKills;

    private Double timeSurvived;

    private Integer vehicleDestroys;

    private Double walkDistance;

    private Integer weaponsAcquired;

    private Integer winPlace;

    // Deprecated for PC
    @Deprecated
    private Integer winPoints;

    // Deprecated for PC
    @Deprecated
    private Double winPointsDelta;

    public ParticipantStats() {
    }

    public Integer getDbnos() {
        return dbnos;
    }

    public void setDbnos(Integer dbnos) {
        this.dbnos = dbnos;
    }

    public Integer getAssists() {
        return assists;
    }

    public void setAssists(Integer assists) {
        this.assists = assists;
    }

    public Integer getBoosts() {
        return boosts;
    }

    public void setBoosts(Integer boosts) {
        this.boosts = boosts;
    }

    public Double getDamageDealt() {
        return damageDealt;
    }

    public void setDamageDealt(Double damageDealt) {
        this.damageDealt = damageDealt;
    }

    public String getDeathType() {
        return deathType;
    }

    public void setDeathType(String deathType) {
        this.deathType = deathType;
    }

    public Integer getHeadshotKills() {
        return headshotKills;
    }

    public void setHeadshotKills(Integer headshotKills) {
        this.headshotKills = headshotKills;
    }

    public Integer getHeals() {
        return heals;
    }

    public void setHeals(Integer heals) {
        this.heals = heals;
    }

    public Integer getKillPlace() {
        return killPlace;
    }

    public void setKillPlace(Integer killPlace) {
        this.killPlace = killPlace;
    }

    @Deprecated
    public Integer getKillPoints() {
        return killPoints;
    }

    @Deprecated
    public void setKillPoints(Integer killPoints) {
        this.killPoints = killPoints;
    }

    @Deprecated
    public Double getKillPointsDelta() {
        return killPointsDelta;
    }

    @Deprecated
    public void setKillPointsDelta(Double killPointsDelta) {
        this.killPointsDelta = killPointsDelta;
    }

    public Integer getKillStreaks() {
        return killStreaks;
    }

    public void setKillStreaks(Integer killStreaks) {
        this.killStreaks = killStreaks;
    }

    public Integer getKills() {
        return kills;
    }

    public void setKills(Integer kills) {
        this.kills = kills;
    }

    public Integer getLastKillPoints() {
        return lastKillPoints;
    }

    public void setLastKillPoints(Integer lastKillPoints) {
        this.lastKillPoints = lastKillPoints;
    }

    public Integer getLastWinPoints() {
        return lastWinPoints;
    }

    public void setLastWinPoints(Integer lastWinPoints) {
        this.lastWinPoints = lastWinPoints;
    }

    public Double getLongestKill() {
        return longestKill;
    }

    public void setLongestKill(Double longestKill) {
        this.longestKill = longestKill;
    }

    public Double getMostDamage() {
        return mostDamage;
    }

    public void setMostDamage(Double mostDamage) {
        this.mostDamage = mostDamage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    @Deprecated
    public Double getRankPoints() {
        return rankPoints;
    }

    @Deprecated
    public void setRankPoints(Double rankPoints) {
        this.rankPoints = rankPoints;
    }

    public Integer getRevives() {
        return revives;
    }

    public void setRevives(Integer revives) {
        this.revives = revives;
    }

    public Double getRideDistance() {
        return rideDistance;
    }

    public void setRideDistance(Double rideDistance) {
        this.rideDistance = rideDistance;
    }

    public Integer getRoadKills() {
        return roadKills;
    }

    public void setRoadKills(Integer roadKills) {
        this.roadKills = roadKills;
    }

    public Double getSwimDistance() {
        return swimDistance;
    }

    public void setSwimDistance(Double swimDistance) {
        this.swimDistance = swimDistance;
    }

    public Integer getTeamKills() {
        return teamKills;
    }

    public void setTeamKills(Integer teamKills) {
        this.teamKills = teamKills;
    }

    public Double getTimeSurvived() {
        return timeSurvived;
    }

    public void setTimeSurvived(Double timeSurvived) {
        this.timeSurvived = timeSurvived;
    }

    public Integer getVehicleDestroys() {
        return vehicleDestroys;
    }

    public void setVehicleDestroys(Integer vehicleDestroys) {
        this.vehicleDestroys = vehicleDestroys;
    }

    public Double getWalkDistance() {
        return walkDistance;
    }

    public void setWalkDistance(Double walkDistance) {
        this.walkDistance = walkDistance;
    }

    public Integer getWeaponsAcquired() {
        return weaponsAcquired;
    }

    public void setWeaponsAcquired(Integer weaponsAcquired) {
        this.weaponsAcquired = weaponsAcquired;
    }

    public Integer getWinPlace() {
        return winPlace;
    }

    public void setWinPlace(Integer winPlace) {
        this.winPlace = winPlace;
    }

    @Deprecated
    public Integer getWinPoints() {
        return winPoints;
    }

    @Deprecated
    public void setWinPoints(Integer winPoints) {
        this.winPoints = winPoints;
    }

    @Deprecated
    public Double getWinPointsDelta() {
        return winPointsDelta;
    }

    @Deprecated
    public void setWinPointsDelta(Double winPointsDelta) {
        this.winPointsDelta = winPointsDelta;
    }
}