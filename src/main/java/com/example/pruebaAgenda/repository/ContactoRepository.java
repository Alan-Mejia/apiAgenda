package com.example.pruebaAgenda.repository;

import com.example.pruebaAgenda.model.Contacto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactoRepository
    extends CrudRepository<Contacto, Integer> {


}
