package teste;

import controller.AlunoController;
import model.Aluno;

/**
 * Classe responsável por testar o método inserir do projeto
 *
 * @author João Victor
 * @since 16/03/2021
 * @version 1.0
 */
public class TesteInserir {

    // método principal para executar a classe
    public static void main(String[] args) {

        // objeto auxiliar para inserir na tabela
        Aluno aluno = new Aluno();

        // valorizando os atributos
        aluno.setNome("Camila Bastos");
        aluno.setIdade(40);
        aluno.setCidade("Terra Roxa");

        // inserindo um registro na tabela
        new AlunoController().inserir(aluno);
    }
}
