package com.sheiladev.ebambu;

import com.sheiladev.ebambu.enumeradores.Genero;
import com.sheiladev.ebambu.enumeradores.TipoContato;
import com.sheiladev.ebambu.enumeradores.TipoEndereco;
import com.sheiladev.ebambu.model.*;

import java.time.LocalDate;
import java.util.List;

public class Util {
    public static Pessoa getClienteValido() {
        return new Pessoa(getDadosPessoaisValidos(), List.of(getEnderecoValido()), List.of(getContatoValido()), getIdentificacaoValidos());
    }

    private static DadosPessoais getDadosPessoaisValidos() {
        return new DadosPessoais("Flavio", LocalDate.now(), Genero.MASCULINO, null);
    }

    private static Identificacao getIdentificacaoValidos() {
        return new Identificacao("xpto", "flavio", "senha");
    }

    public static Endereco getEnderecoValido() {
        return new Endereco(TipoEndereco.RESIDENCIAL, "Rua de Residencia", "00000-000", "11975121212", "Casa 2", "bairro");
    }

    public static Contato getContatoValido() {
        return new Contato(TipoContato.EMAIL, "email@provedor.com.br");
    }
}
