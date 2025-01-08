package foro.hub.api.controller;
import foro.hub.api.domain.usuarios.DatosAuntenticacionUsaurio;
import foro.hub.api.domain.usuarios.Usuario;
import foro.hub.api.infra.security.DatosJWTToken;
import foro.hub.api.infra.security.TokenService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AutenticacionController {

    @Autowired
    private AuthenticationManager authentictionManager;

    @Autowired
    private TokenService tokenService;
    @PostMapping
    public ResponseEntity auntenticarUsuario(@RequestBody @Valid DatosAuntenticacionUsaurio datosAuntenticacionUsaurio){
        Authentication authtoken = new UsernamePasswordAuthenticationToken(datosAuntenticacionUsaurio.login(),
                datosAuntenticacionUsaurio.clave());
       var usuarioAuntenticado = authentictionManager.authenticate(authtoken);
        var JWTtoken = tokenService.generarToken((Usuario) usuarioAuntenticado.getPrincipal());
        return ResponseEntity.ok(new DatosJWTToken(JWTtoken));
    }
}
