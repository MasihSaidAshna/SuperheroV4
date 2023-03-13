package com.example.superheroV4.model;

import java.util.List;

public class Superpower {

    private int ID;
    private String heroName;
    private String realName;
    private String superpowerName;
    private List<String> powerList;
    private int countPower = 0;

    public Superpower(int ID, String heroName, String realName, String superpowerName, List<String> powerList) {
        this.ID = ID;
        this.heroName = heroName;
        this.realName = realName;
        this.superpowerName = superpowerName;
        this.powerList = powerList;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getSuperpowerName() {
        return superpowerName;
    }

    public void setSuperpowerName(String superpowerName) {
        this.superpowerName = superpowerName;
    }

    public List<String> getPowerList() {
        return powerList;
    }

    public void setPowerList(List<String> powerList) {
        this.powerList = powerList;
    }

    public int getCountPower() {
        return countPower;
    }

    public void setCountPower(int countPower) {
        this.countPower = countPower;
    }
}
