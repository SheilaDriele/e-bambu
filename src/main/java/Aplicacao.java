import enumeradores.Genero;
import model.Cliente;
import model.DadosPessoais;

import java.time.LocalDate;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
//        DadosPessoais dados=new DadosPessoais("Luiza", LocalDate.now(), Genero.FEMININO,"0000");
//        System.out.println(dados.genero());
//        System.out.println(dados.nome());

        Cliente flavio = new Cliente();
        System.out.println(flavio);
    }

}
