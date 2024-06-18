package com.fametro.gestao_de_clientes.controller;

import com.fametro.gestao_de_clientes.entity.Clientes;
import com.fametro.gestao_de_clientes.entity.Usuarios;
import com.fametro.gestao_de_clientes.repository.ClientesRepository;
import com.fametro.gestao_de_clientes.useCases.LoginUseCases;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginUseCases loginUseCases;

    @Autowired
    private ClientesRepository clientesRepository;

    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseEntity<LoginResponseDTO> login(@RequestBody LoginBodyDTO loginBody) {
        var userPassToken = new UsernamePasswordAuthenticationToken(loginBody.username(), loginBody.password());
        System.out.println(new BCryptPasswordEncoder().encode(loginBody.password()));
        var auth = authenticationManager.authenticate(userPassToken);
        var token = loginUseCases.generateToken((Usuarios) auth.getPrincipal());

        return ResponseEntity.ok(new LoginResponseDTO(token));
    }
}
