package com.study.springmv.sdt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.study.springmv.sdt.dto.Persona;

public class PersonaMapper implements RowMapper<Persona> {

    @Override
    public Persona mapRow(ResultSet arg0, int arg1) throws SQLException {
        Persona persona = new Persona();
        persona.setTipoDocumento(arg0.getString("TIPODOCUMENTO"));
        persona.setDocumento(arg0.getString("DOCUMENTO"));
        persona.setNombre(arg0.getString("NOMBRE"));
        persona.setApellido(arg0.getString("APELLIDO"));
        persona.setEdad(arg0.getInt("EDAD"));
        return persona;
    }

}
