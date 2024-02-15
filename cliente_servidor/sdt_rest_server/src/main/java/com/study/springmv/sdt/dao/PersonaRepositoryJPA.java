package com.study.springmv.sdt.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.springmv.sdt.dto.Persona;
import com.study.springmv.sdt.dto.PersonaId;

public interface PersonaRepositoryJPA extends JpaRepository<Persona, PersonaId> {

    public void deleteBytipoDocumentoAndDocumento(String tipoDocumento, String documento);

}
