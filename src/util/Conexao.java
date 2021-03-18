package util;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe resposável porm conectar com a base de dados (banco de dados)
 *
 * @author João Victor
 * @since 10/03/2021
 * @version 1.0
 */
public class Conexao {

    /*
     * método para criar a conexão com a base de dados (banco de dados)
     */
    public static Connection getConexao() {

        // declarando os atributos de conexão
        // driver utilizado na conexão com o banco
        final String drive = "com.mysql.jdbc.Driver";
        // local de conexão - nome do banco de dados
        final String local = "jdbc:mysql://localhost/dtb_escola";
        // usuario de conexão
        final String login = "root";
        // senha de conexão
        final String senha = "root";

        // atributo auxiliar para retornar no método
        Connection conexao = null;

        try {
            // informando o drive utilizado na conexão com o banco de dados
            Class.forName(drive);

            // iniciando a conexão com o banco de dados
            conexao = (Connection) DriverManager.getConnection(local, login, senha);

        } catch (ClassNotFoundException ex) {
            System.out.println("Erro ao carregar o drive");
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            System.out.println("Erro ao efetuar a conexão");
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }

        // retornando conexão do método
        return conexao;
    }// fim do método

}// fim da classe
