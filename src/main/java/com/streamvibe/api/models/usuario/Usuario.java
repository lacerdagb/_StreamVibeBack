package com.streamvibe.api.models.usuario;

import lombok.*;

import com.streamvibe.api.models.endereco.Endereco;

import jakarta.persistence.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
//Nome, data de nascimento, email, senha, cpf -> String 
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String nome;
    private String dataNascimento;
    private String email;
    private String senha;
    private String cpf;

    @Embedded
    private Endereco endereco;
    
    public Usuario(DadosCadastroUsuario dados) {
        this.nome = dados.nome();
        this.dataNascimento = dados.dataNascimento();
        this.email = dados.email();
        this.senha = dados.senha();
        this.cpf = dados.cpf();
        this.endereco = new Endereco(dados.endereco());
    }

}




