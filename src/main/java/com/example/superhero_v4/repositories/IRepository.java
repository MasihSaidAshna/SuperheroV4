package com.example.superhero_v4.repositories;
import com.example.superhero_v4.model.Superhero;
import java.util.List;

public interface IRepository {
    List<Superhero> getSuperheroes();
    void addSuperhero(Superhero s);
}
