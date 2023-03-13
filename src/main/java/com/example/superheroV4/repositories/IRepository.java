package com.example.superheroV4.repositories;
import com.example.superheroV4.model.Superhero;

import java.util.List;

public interface IRepository {
    List<Superhero> getSuperheroes();
    Superhero getSuperhero(String heroName);
}
