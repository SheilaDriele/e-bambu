package model;

import enumeradores.TipoEndereco;

public record Endereco(TipoEndereco tipo, String logradouro, String cep, String numero, String complemento, String bairro) {
}
