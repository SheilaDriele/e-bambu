package model;

import enumeradores.TipoDocumeto;

import java.time.LocalDate;

public record Documento(TipoDocumeto tipo, String numero, LocalDate dataEmissao, String nacionalidade, String orgaoEmissor) {
}
