package com.fametro.gestao_de_clientes.controller;

public record LoginBodyDTO(String username, String password) {

    public static LoginBodyDTO fromEntity(String username, String password) {
        return new LoginBodyDTO(username, password);
    }
}