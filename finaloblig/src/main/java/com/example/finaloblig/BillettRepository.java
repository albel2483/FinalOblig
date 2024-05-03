package com.example.finaloblig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BillettRepository {
    @Autowired
    private JdbcTemplate db;

    public void lagrebillett(Billett innBillett){
        String sql = "INSERT INTO Billett (film, antall, fornavn, etternavn, telefon, Epost ) VALUES(?,?,?,?,?,?)";
        db.update(sql, innBillett.getFilm(), innBillett.getAntall(),
                innBillett.getFornavn(), innBillett.getEtternavn(),
                innBillett.getTelefon(), innBillett.getEpost());
    }
    public List<Billett> hentAlleBilletter(){
        String sql = "SELECT * FROM Billett ORDER BY etternavn";
        List<Billett> alleBilletter = db.query(sql, new BeanPropertyRowMapper<>(Billett.class));
        return alleBilletter;
    }
    public void slettALleBilletter(){
        String sql = "DELETE FROM Billett";
        db.update(sql);
    }
}
