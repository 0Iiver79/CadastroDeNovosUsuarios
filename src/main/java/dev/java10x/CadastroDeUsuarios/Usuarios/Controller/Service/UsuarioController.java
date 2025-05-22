package dev.java10x.CadastroDeUsuarios.Usuarios.Controller.Service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController


public class UsuarioController {

    @GetMapping("/boasVindas")
    public String boasVindas(){
        return "Primeira Rota!" ;
    }



}
