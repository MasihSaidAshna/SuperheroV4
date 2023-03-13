package com.example.superheroV4.services;

import org.springframework.stereotype.Service;
import com.example.superheroV4.repositories.SuperheroRepository;

@Service
public class SuperheroService {

    SuperheroRepository repo = new SuperheroRepository();


   /* public void addSuperhero(String name, boolean isHuman, String superPower, int creationYear, double strength){
        repo.addSuperheroes(name, isHuman, superPower, creationYear, strength);
    }

    public Superhero findSuperhero(String name){
        return repo.findSuperhero(name);
    }

    public void updateSuperhero(String name, boolean isHuman, String superPower, int creationYear, double strength) {
        repo.editSuperhero(name, isHuman, superPower, creationYear, strength);
    }

    public void deleteSuperhero(String name) {
        repo.deleteHeroSearch(name);

    }

    public List<Superhero> getSuperHeroes() {
        return repo.getHeroDatabase();
    }

    */
}

