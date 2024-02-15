package com.study.springmv.sdt.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.study.springmv.sdt.dto.Persona;

@Repository
public class PersonaRepositoryJDBC {

    private JdbcTemplate jdbcTemplate;

    public PersonaRepositoryJDBC(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<Persona> getPersonas() {
        return jdbcTemplate.query("SELECT P.TIPODOCUMENTO, P.DOCUMENTO, P.NOMBRE, P.APELLIDO , P.EDAD FROM PERSONAS P",
                new PersonaMapper());
    }

    public void insertPersona(Persona persona) {
        jdbcTemplate.update(
                "INSERT INTO PERSONAS (TIPODOCUMENTO, DOCUMENTO, NOMBRE, APELLIDO, EDAD) VALUES (?, ?, ?, ?, ?)",
                persona.getTipoDocumento(), persona.getDocumento(), persona.getNombre(), persona.getApellido(),
                persona.getEdad());
    }

    public void updatePersona(Persona persona) {
        jdbcTemplate.update(
                "UPDATE PERSONAS SET NOMBRE = ?, APELLIDO = ?, EDAD = ? WHERE TIPODOCUMENTO = ? AND DOCUMENTO = ?",
                persona.getNombre(), persona.getApellido(), persona.getEdad(), persona.getTipoDocumento(),
                persona.getDocumento());
    }

    public void deletePersona(Persona persona) {
        jdbcTemplate.update("DELETE FROM PERSONAS WHERE TIPODOCUMENTO = ? AND DOCUMENTO = ?",
                persona.getTipoDocumento(), persona.getDocumento());
    }

    public Persona getPersona(String tipoDocumento, String documento) {
        return jdbcTemplate.query("SELECT * FROM PERSONAS WHERE TIPODOCUMENTO = ? AND DOCUMENTO = ?", (rs) -> {
            if (rs.next()) {
                Persona persona = new Persona();
                persona.setTipoDocumento(rs.getString("TIPODOCUMENTO"));
                persona.setDocumento(rs.getString("DOCUMENTO"));
                persona.setNombre(rs.getString("NOMBRE"));
                persona.setApellido(rs.getString("APELLIDO"));
                persona.setEdad(rs.getInt("EDAD"));
                return persona;
            }
            return new Persona();
        });
    }

}
