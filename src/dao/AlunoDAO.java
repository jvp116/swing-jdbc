package dao;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Aluno;

/**
 * Classe responsável por armazenar os métodos CRUD (inserir, consultar, alterar
 * e excluir)
 *
 * @author João Victor
 * @since 16/03/2021
 * @version 1.0
 */
public class AlunoDAO {

    // delcarando o atributo de conexão com o banco dados
    private Connection conexao;

    // método construtor da classe que recebe uma conexão com o banco de dados
    public AlunoDAO(Connection conexao) {
        this.conexao = conexao;
    }

    /*
     * método para inserir um Aluno na tabela aluno no banco de dados dtb-escola
     */
    public void inserir(Aluno aluno) throws SQLException {
        // comando SQL INSERT
        String sql = "INSERT INTO aluno (nome, idade, cidade) VALUES (?,?,?)";
        // classe auxiliar para comunicar com o banco de dados e executar a instrução sql
        PreparedStatement comando = (PreparedStatement) this.conexao.prepareStatement(sql);
        // valorizar o campo nome, idade e cidade da instrução sql
        comando.setString(1, aluno.getNome());
        comando.setInt(2, aluno.getIdade());
        comando.setString(3, aluno.getCidade());
        // executando o comando SQL com a conexão
        comando.execute();
    }// fim do método inserir

    /*
     * método para alterar um Aluno na tabela aluno no banco de dados dtb-escola
     */
    public void alterar(Aluno aluno) throws SQLException {
        // comando SQL UPDATE
        String sql = "UPDATE aluno SET cidade = ? WHERE id_aluno = ?";
        // classe auxiliar para comunicar com o banco de dados e executar a instrução sql
        PreparedStatement comando = (PreparedStatement) this.conexao.prepareStatement(sql);
        // valorizando a cidade da instrução sql
        comando.setString(1, aluno.getCidade());
        // valorizando o id_aluno da instrução sql
        comando.setInt(2, aluno.getIdAluno());
        // executando o comando SQL com a conexão
        comando.execute();
    }// fim do método alterar

    /*
     * método para excluir um Aluno na tabela aluno no banco de dados dtb-escola
     */
    public void excluir(Aluno aluno) throws SQLException {
        // comando SQL DELETE
        String sql = "DELETE FROM aluno WHERE id_aluno = ?";
        // classe auxiliar para comunicar com o banco de dados e executar a instrução sql
        PreparedStatement comando = (PreparedStatement) this.conexao.prepareStatement(sql);
        // valorizando o id_aluno da instrução sql
        comando.setInt(1, aluno.getIdAluno());
        // executando o comando SQL com a conexão
        comando.execute();
    }// fim do método alterar

    /*
     * método para consultar os Alunos cadastrados na tabela
     */
    public ArrayList<Aluno> buscarTodos() throws SQLException {
        // comando SQL SELECT
        String sql = "SELECT * FROM aluno ORDER BY nome";
        // classe auxiliar para comunicar com o banco de dados e executar a instrução sql
        PreparedStatement comando = (PreparedStatement) this.conexao.prepareStatement(sql);
        // classe auxiliar para armazenar o resultado do comando SELECT
        ResultSet cursor = comando.executeQuery();// executando o comando SQL
        // lista para retornar no método
        ArrayList<Aluno> alunos = new ArrayList<>();

        // laço de repetição para varrer o cursor de dados
        while (cursor.next()) {
            // objeto Aluno auxiliar
            Aluno aluno = new Aluno();
            // valorizando os atributos do aluno com os dados do SELECT
            aluno.setIdAluno(cursor.getInt("id_aluno"));
            aluno.setNome(cursor.getString("nome"));
            aluno.setIdade(cursor.getInt("idade"));
            aluno.setCidade(cursor.getString("cidade"));
            // adicionando o objeto na lista de retorno
            alunos.add(aluno);
        }// fim do laço

        // retornando a lista de alunos
        return alunos;
        
    }// fim do método buscarTodos

}// fim da classe
