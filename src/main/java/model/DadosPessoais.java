package model;

import enumeradores.Genero;

import java.time.LocalDate;

public record DadosPessoais(String nome, LocalDate dataNascimento, Genero genero, String documento) {

}
