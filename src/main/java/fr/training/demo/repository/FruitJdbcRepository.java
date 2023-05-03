package fr.training.demo.repository;

import fr.training.demo.modele.Fruit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.util.List;

@Repository
public class FruitJdbcRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Fruit> fetchAll() {
        String sql = "SELECT id, name FROM fruits";
        return jdbcTemplate.query(sql,
                (rs, rowNum) -> new Fruit(rs.getInt("id"), rs.getString("name"))
                );
    }

    public Fruit fetchOne(int id) {
        String sql = "SELECT id, name FROM fruits WHERE id=" + id;
        return jdbcTemplate.query(sql, (ResultSetExtractor<Fruit>) rs -> {
            rs.next();
            return new Fruit(rs.getInt("id"), rs.getString("name"));
        });
    }

//    public Fruit fetchOneById(int id) {
//        return jdbcTemplate.queryForObject("SELECT id, name FROM fruits WHERE id = " + id, (rs, rowNum) -> new Fruit(rs.getInt(), rs.getString())
//        );
//    }
public void create (Fruit fruit) {
        String sql = "INSERT INTO fruits(name) VALUES (?)";
        jdbcTemplate.update(sql, fruit.getName());
}
}
