package com.example.superhero_v4.repositories;

import com.example.superhero_v4.model.Superhero;
import org.springframework.stereotype.Repository;
import java.sql.*;
import java.util.*;

@Repository
public class SuperheroRepository implements IRepository{

    /*@Value("${spring.datasource.url}")
    private String db_url;

    @Value("${spring.datasource.username}")
    private String uid;

    @Value("${spring.datasource.password}")
    private String pwd;*/

    public List<Superhero> getSuperheroes() {
        Superhero superhero1 = null;
        List<Superhero> superheroes = new ArrayList<Superhero>();
        try (Connection con = DBManager.getConnection()) {
//        try (Connection connection = DriverManager.getConnection(db_url,uid,pwd)) {
            String SQL = "SELECT * FROM superhero";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                int ID = rs.getInt("id");
                String superhero = rs.getString("Superhero");
                superheroes.add(new Superhero(ID, superhero, superhero1.getRealName(), superhero1.getCreationYear()));
            }
            return superheroes;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Superhero getSuperhero(int id ) {
        Superhero superheroOBJ = null;
        try(Connection con = DBManager.getConnection()) {
            String SQL = "SELECT * FROM superhero WHERE ID = ? ;";
            PreparedStatement pstmt = con.prepareStatement(SQL);
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                int ID = rs.getInt("id");
                String superhero = rs.getString("superhero");
                superheroOBJ = new Superhero(ID, superhero, superheroOBJ.getRealName(), superheroOBJ.getCreationYear());
            }
            return superheroOBJ;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void addSuperhero(Superhero superhero) {
        try (Connection connection = DBManager.getConnection()) {
            String SQL = "INSERT INTO Superheroes(superhero) VALUES (?) ;";
            PreparedStatement pstmt = connection.prepareStatement(SQL);
            pstmt.setString(1, superhero.getHeroName());
            System.out.println(superhero.getHeroName());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        //return superhero;
    }

    public Superhero editSuperhero(Superhero superhero)  {
        int rows = 0; // antal rækker der er ændret
        try (Connection connection = DBManager.getConnection()){
            String SQL = "UPDATE Superheroes SET superhero = ? WHERE ID ? = ? ;";
            PreparedStatement pstmt = connection.prepareStatement(SQL);
            pstmt.setString(1, superhero.getHeroName());
            pstmt.setInt(2, superhero.getId());
            rows = pstmt.executeUpdate();
            System.out.println("Rows" +rows);
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
        if (rows == 1) // superhero fundet og opdateret
            return superhero;
        else
            return null;
    }
}

