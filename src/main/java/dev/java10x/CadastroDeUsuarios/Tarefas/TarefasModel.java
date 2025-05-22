package dev.java10x.CadastroDeUsuarios.Tarefas;


import dev.java10x.CadastroDeUsuarios.Usuarios.Controller.Service.UsuarioModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table (name = "tb_tarefas")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TarefasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;

    private String usuario;

    private String tipo;

    private String prazo;

    // @OneToMany - Uma tarefa pode ter varios usuarios
    @OneToMany(mappedBy = "tarefas" )
    private List<TarefasModel> tarefas;
}
