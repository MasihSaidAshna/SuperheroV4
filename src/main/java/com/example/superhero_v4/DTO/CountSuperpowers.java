package com.example.superhero_v4.DTO;
import java.util.List;

public class CountSuperpowers {

    private String name;
    private String realName;
    protected List<String> powers;
    private final int countPowers;

    public CountSuperpowers (String name, String realName, List<String> powers) {
        this.name = name;
        this.realName = realName;
        this.powers = powers;
        this.countPowers = powers.size();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public int getCountPowers(){
        return countPowers;
    }
}
