package dev.java10x.CadastroDeUsuarios.Usuarios.Controller.Service;

import dev.java10x.CadastroDeUsuarios.Tarefas.TarefasModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Table(name = "tb_cadastro")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
// @Entity tranforma uma class em uma entidade do DB(database)
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    private String email;

    private int idade;

    // @ManyToOne - Um usuario tem uma unica tarefa
    @ManyToOne
    @JoinColumn(name = "tarefas_id") // Foreina Key ou chave estrangeira
    private TarefasModel tarefas;



}
