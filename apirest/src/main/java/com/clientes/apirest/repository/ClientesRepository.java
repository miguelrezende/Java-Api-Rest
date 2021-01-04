package com.clientes.apirest.repository;

import com.clientes.apirest.models.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientesRepository extends JpaRepository<Clientes,Long> {

    Clientes findById(long id);
}
