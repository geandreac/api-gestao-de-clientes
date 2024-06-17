package com.fametro.gestao_de_clientes.controller;

import com.fametro.gestao_de_clientes.entity.Clientes;

public record ClientesBodyDTO(String nome,String senha, String email, String telefone) {
    public Clientes toEntity(){
        return new Clientes(nome,senha,email,telefone);

    }

}
