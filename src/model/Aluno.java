package model;

/**
 * Classe responsável por armazenar os atributos do objeto Aluno
 *
 * @author João Victor
 * @since 10/03/2021
 * @version 1.0
 */
public class Aluno {

    // delcarando os atributos
    private int idAluno;
    private String nome;
    private int idade;
    private String cidade;

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

}
