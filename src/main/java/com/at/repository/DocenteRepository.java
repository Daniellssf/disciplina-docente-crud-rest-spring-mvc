package com.at.repository;

import com.at.model.Docente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocenteRepository extends CrudRepository<Docente, Long> {

    Docente findByEmail(String email);
}
