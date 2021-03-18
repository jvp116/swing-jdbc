package util;

/**
 * Classe responsável por testar a conexão com o banco de dados
 *
 * @author João Victor
 * @since 10/03/2021
 * @version 1.0
 */
public class TestaConexao {

    /*
     método principal para executar a classe
     */
    public static void main(String[] args) {

        new Conexao().getConexao();
        System.out.println("Conexão efetuada com sucesso");
    }
}
