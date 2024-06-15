package com.fametro.gestao_de_clientes.controller;

import com.fametro.gestao_de_clientes.entity.Clientes;
import com.fametro.gestao_de_clientes.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClientesController {
    private final ClientesRepository clientesRepository;

    @Autowired
    public ClientesController(ClientesRepository clientesRepository){
        this.clientesRepository = clientesRepository;

    }

    @GetMapping
    public List<ClientesDTO> getAllClientes(){
        List<Clientes> clientes = clientesRepository.findAll();
        return clientes.stream()
                .map(ClientesDTO::fromEntity)
                .toList();
    }

}
