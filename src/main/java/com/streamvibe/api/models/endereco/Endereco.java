package com.streamvibe.api.models.endereco;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Endereco {
    private String rua;
    private String numero;
    private String bairro;
    private String cep;
    private String cidade;
    private String complemento;

    public Endereco(DadosCadastroEndereco dados) {
        this.rua = dados.rua();
        this.numero = dados.numero();
        this.bairro = dados.bairro();
        this.cep = dados.cep();
        this.cidade = dados.cidade();
        this.complemento = dados.complemento();
    }

}

