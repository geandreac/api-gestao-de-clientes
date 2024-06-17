package com.fametro.gestao_de_clientes.controller;

import com.fametro.gestao_de_clientes.entity.Clientes;
import com.fametro.gestao_de_clientes.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{Id}")
    public ClientesDTO getClientesById(@PathVariable Long id) {
            Clientes clientes = clientesRepository.findById(id);
            return ClientesDTO.fromEntity(clientes);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ClientesDTO createCliente(@RequestBody ClientesBodyDTO clienteBody){
        return ClientesDTO.fromEntity(clientesRepository.save(clienteBody.toEntity()));
    }

    @PutMapping("/{Id}")
    public ClientesDTO updateCliente(@PathVariable Long id, @RequestBody ClientesBodyDTO clientesBody){
        Clientes clienteDB = clientesRepository.findById(id);
        clienteDB.setNome(clientesBody.nome());
        clienteDB.setEmail(clientesBody.email());
        clienteDB.setSenha(clientesBody.senha());
        clienteDB.setTelefone(clientesBody.telefone());
        return ClientesDTO.fromEntity(clienteDB);
    }

    @DeleteMapping("/{Id}")
    public ClientesDTO deleteCliente(@PathVariable Long id){
        Clientes cliente = clientesRepository.findById(id);
        clientesRepository.deleteById(id);
        return ClientesDTO.fromEntity(cliente);
    }


}
