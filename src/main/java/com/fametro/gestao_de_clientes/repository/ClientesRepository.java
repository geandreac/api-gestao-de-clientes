package com.fametro.gestao_de_clientes.repository;


import com.fametro.gestao_de_clientes.entity.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientesRepository extends JpaRepository<Clientes,Long> {

}
