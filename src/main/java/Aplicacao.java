import enumeradores.Genero;
import model.DadosPessoais;

import java.time.LocalDate;

public class Aplicacao {
    public static void main(String[] args) {
        DadosPessoais dados=new DadosPessoais("Luiza", LocalDate.now(), Genero.FEMININO,"0000");
        System.out.println(dados.genero());
        System.out.println(dados.nome());
    }
}
