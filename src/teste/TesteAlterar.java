package teste;

import controller.AlunoController;
import model.Aluno;

/**
 * Classe responsável por testar a alteração do objeto Aluno no banco de dados
 *
 * @author João Victor
 * @since 16/03/2021
 * @version 1.0
 */
public class TesteAlterar {

    // método principal para executar a classe
    public static void main(String[] args) {

        // objeto Aluno auxiliar
        Aluno aluno = new Aluno();

        // valorizando os atributos que serão utilizados no UPDATE
        aluno.setCidade("Guarapuava");
        aluno.setIdAluno(1);

        // acessando objeto de controle
        new AlunoController().alterar(aluno);
    }
}
