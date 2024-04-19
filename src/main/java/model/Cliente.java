package model;

import java.util.List;

public record Cliente(DadosPessoais dadosPessoais, List<Endereco> enderecos, List<Contato> contatos, Identificacao identificacao) {
}
