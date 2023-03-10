package com.example.superhero_v4.DTO;
import java.util.List;

public class HeroNameCity {

    private String heroName;
    private String city;
    protected List<String> superheroes;

    public HeroNameCity (String heroName, String city, List<String> superheroes) {
        this.heroName = heroName;
        this.city = city;
        this.superheroes = superheroes;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<String> getSuperheroes() {
        return superheroes;
    }

    public void setSuperheroes(List<String> superheroes) {
        this.superheroes = superheroes;
    }
}
