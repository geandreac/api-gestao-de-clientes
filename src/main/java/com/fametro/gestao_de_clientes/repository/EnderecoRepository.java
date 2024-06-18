package com.fametro.gestao_de_clientes.repository;

import com.fametro.gestao_de_clientes.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
