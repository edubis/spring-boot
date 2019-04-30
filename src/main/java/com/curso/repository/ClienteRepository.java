package com.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.dominio.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
