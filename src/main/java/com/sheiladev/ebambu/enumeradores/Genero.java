package com.sheiladev.ebambu.enumeradores;

public enum Genero {
    MASCULINO(1L, "MASCULINO"),
    FEMININO(2L, "FEMININO"),
    NAO_INFORMADO(3L, "NAO_INFORMADO");

    private final Long id;
    private final String nome;

    Genero(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public static Genero get(Long id){
        return switch (id.intValue()){
            case 1 -> Genero.MASCULINO;
            case 2 -> Genero.FEMININO;
            default -> Genero.NAO_INFORMADO;
        };
    }

    public Long getId(){
        return this.id;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
