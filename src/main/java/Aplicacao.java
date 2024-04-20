import enumeradores.Genero;
import model.Cliente;
import model.DadosPessoais;
import model.Identificacao;

import java.time.LocalDate;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o seu usuario:");
        String login = scan.next();


        System.out.println("Digite sua senha:");
        String senha = scan.next();


        Identificacao identificacao = new Identificacao();
        identificacao.setLogin(login);
        identificacao.setPassword(senha);


        if (identificacao.login()) {
            System.out.println("Login realizado com sucesso!");
        }else {
            System.out.println("Usuario invalido");
        }
    }

}
