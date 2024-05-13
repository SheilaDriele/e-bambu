package com.sheiladev.ebambu.enumeradores;

public enum TipoEndereco {
    RESIDENCIAL(1L, "RESIDENCIAL"),
    COMERCIAL(2L, "COMERCIAL"),
    TRABALHO(3L, "TRABALHO"),
    OUTRO(4L, "OUTRO");

    private final Long id;
    private final String nome;

    TipoEndereco(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public static TipoEndereco get(Long id)
    {
        return switch (id.intValue()) {
            case 1 -> TipoEndereco.RESIDENCIAL;
            case 2 -> TipoEndereco.COMERCIAL;
            case 3 -> TipoEndereco.TRABALHO;
            case 4 -> TipoEndereco.OUTRO;
            default -> null;
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
