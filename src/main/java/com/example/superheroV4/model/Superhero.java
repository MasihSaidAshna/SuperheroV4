package com.example.superheroV4.model;

public class Superhero {

    private int id;
    private String heroName;
    private String realName;
    private int creationYear;

    public Superhero(int id, String heroName, String realName, int creationYear) {
        this.id = id;
        this.heroName = heroName;
        this.creationYear = creationYear;
        this.realName = realName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getCreationYear() {
        return creationYear;
    }

    public void setCreationYear(int creationYear) {
        this.creationYear = creationYear;
    }

}

