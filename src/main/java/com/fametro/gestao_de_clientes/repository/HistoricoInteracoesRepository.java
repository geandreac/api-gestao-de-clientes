package com.fametro.gestao_de_clientes.repository;

import com.fametro.gestao_de_clientes.entity.HistoricoInteracoes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoricoInteracoesRepository extends JpaRepository<HistoricoInteracoes,Long> {
}
