package com.fametro.gestao_de_clientes.useCases;

import com.fametro.gestao_de_clientes.entity.Clientes;
import com.fametro.gestao_de_clientes.entity.Usuarios;
import com.fametro.gestao_de_clientes.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class LoginUseCases implements UserDetailsService {
    @Autowired
    UsuarioRepository usuarioRepository;

    @Value("pitucho")
    private String SECRET_KEY;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return usuarioRepository.findByUsername(username);
    }

    public String generateToken(Clientes clientes) throws JWTCreationException{
        Algorithm algorithm = Algorithm.HMAC256(SECRET_KEY);
        return JWT.create()
                .withIssuer("ums-auth")
                .withSubject(user.getEmail())
                .withExpiresAt(generateExpirationDate())
                .sign(algorithm);
    }

    private Instant generateExpirationDate() {
        return LocalDateTime.now().plusHours(2).toInstant(ZoneOffset.of("-04:00"));
    }

    public String validateToken(String token) throws JWTDecodeException, JWTVerificationException {
        Algorithm algorithm = Algorithm.HMAC256(SECRET_KEY);
        return JWT.require(algorithm)
                .withIssuer("ums-auth")
                .build()
                .verify(token)
                .getSubject();
    }

}
