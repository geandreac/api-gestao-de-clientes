package com.fametro.gestao_de_clientes.controller;

import com.fametro.gestao_de_clientes.entity.Clientes;

public record ClientesDTO(Long id, String nome, String email, String telefone){
    public static ClientesDTO fromEntity(Clientes clientes){
        return new ClientesDTO(
                clientes.getId(),
                clientes.getNome(),
                clientes.getEmail(),
                clientes.getTelefone()
        );

    }
}
