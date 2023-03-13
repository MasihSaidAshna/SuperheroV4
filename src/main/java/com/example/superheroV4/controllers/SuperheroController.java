package com.example.superheroV4.controllers;

import com.example.superheroV4.DTO.*;
import com.example.superheroV4.model.*;
import com.example.superheroV4.repositories.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@Controller
@RequestMapping("superhero")
public class SuperheroController {

    //private final SuperheroService superheroService;
    private final SuperheroRepository repo;

    public SuperheroController(SuperheroRepository repo) {
        //this.superheroService = superheroService;
        this.repo = repo;
    }


    //If path is empty, client simply displays all superheroes in the database
    //Forespørgsel (1)
    // http://localhost:8181/superhero/
    @GetMapping(path = "")
    public ResponseEntity<List<Superhero>> readSuperheroes() {
        List<Superhero> superheroList = repo.getSuperheroes();
        return new ResponseEntity<>(superheroList, HttpStatus.OK);
    }

    //Search superhero
    //Example: http://localhost:8181/superhero/{heroName}
    @GetMapping(path = "/{heroName}")
    public ResponseEntity<Superhero> searchSuperhero(@PathVariable String heroName) {
        return new ResponseEntity<>(repo.getSuperhero(heroName), HttpStatus.OK);
    }

    //Forespørgsel (2)
    //http://localhost:8181/superhero/superpower/count
    @GetMapping(path = "/superpower/count")
    public ResponseEntity<List<CountSuperpowersDTO>> countSuperheroesPowers() {
        List<CountSuperpowersDTO> powerList = repo.countSuperheroesPowers();
        return new ResponseEntity<>(powerList, HttpStatus.OK);
    }

    //http://localhost:8181/superhero/superpower/count/{heroName}
    @GetMapping(path = "/superpower/count/{heroName}")
    public ResponseEntity<CountSuperpowersDTO> countSuperheroPowers(@PathVariable String heroName) {
        CountSuperpowersDTO powerList = repo.countSuperheroPowers(heroName);
        return new ResponseEntity<>(powerList, HttpStatus.OK);
    }

    //Forespørgsel (3)
    //http://localhost:8181/superhero/superpower
    @GetMapping(path = "/superpower")
    public ResponseEntity<List<SuperpowerDTO>> getSuperheroesPowers() {
        return new ResponseEntity<>(repo.getSuperheroesPowers(), HttpStatus.OK);
    }

    //http://localhost:8181/superhero/superpower/{heroName}
    @GetMapping(path = "/superpower/{heroName}")
    public ResponseEntity<SuperpowerDTO> getSuperheroPowers(@PathVariable String heroName) {
        return new ResponseEntity<>(repo.getSuperheroPowers(heroName), HttpStatus.OK);
    }

    //Forespørgsel (4)
    //http://localhost:8181/superhero/city
    @GetMapping(path = "/city")
    public ResponseEntity<List<HeroNameCityDTO>> getSuperheroesCities() {
        return new ResponseEntity<>(repo.getSuperheroesCities(), HttpStatus.OK);
    }

    //http://localhost:8181/superhero/city/{cityName}
    @GetMapping(path = "/city/{cityName}")
    public ResponseEntity<HeroNameCityDTO> getSuperheroesCity(@PathVariable String cityName) {
        return new ResponseEntity<>(repo.getSuperheroesCity(cityName), HttpStatus.OK);
    }


}

