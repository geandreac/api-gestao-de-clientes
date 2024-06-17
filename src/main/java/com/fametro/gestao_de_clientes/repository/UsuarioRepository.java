package com.fametro.gestao_de_clientes.repository;

import com.fametro.gestao_de_clientes.entity.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UsuarioRepository extends JpaRepository<Usuarios, Long> {
    UserDetails findByUsername(String username);

}
