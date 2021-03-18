package teste;

import controller.AlunoController;
import model.Aluno;

/**
 * Classe responsável por testar a consulta na tabela aluno
 *
 * @author João Victor
 * @since 16/03/2021
 * @version 1.0
 */
public class TesteBuscarTodos {

    // método principal para executar a classe
    public static void main(String[] args) {

        // laço de repetição para exibir os dados da consulta
        for (Aluno aluno : new AlunoController().buscarTodos()) {
            System.out.println("ID do Aluno: " + aluno.getIdAluno());
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Idade: " + aluno.getIdade());
            System.out.println("Cidade: " + aluno.getCidade());
            System.out.println("\n");
        }
    }
}
