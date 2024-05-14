package com.sheiladev.ebambu.enumeradores;


public enum TipoContato {
    EMAIL(1L, "EMAIL"),
    CELULAR(2L, "CELULAR"),
    TELEFONE_COMERCIAL(3L, "TELEFONE_COMERCIAL"),
    TELEFONE_RECADO(4L, "TELEFONE_RECADO"),
    TELEFONE_RESIDENCIAL(5L, "TELEFONE_RESIDENCIAL"),
    WHATSAPP(6L, "WHATSAPP");

    private final Long id;
    private final String nome;

    TipoContato(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public static TipoContato get(Long id) {
        return switch (id.intValue()) {
            case 1 -> TipoContato.EMAIL;
            case 2 -> TipoContato.CELULAR;
            case 3 -> TipoContato.TELEFONE_COMERCIAL;
            case 4 -> TipoContato.TELEFONE_RECADO;
            case 5 -> TipoContato.TELEFONE_RESIDENCIAL;
            case 6 -> TipoContato.WHATSAPP;
            default -> null;
        };
    }

    public Long getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
