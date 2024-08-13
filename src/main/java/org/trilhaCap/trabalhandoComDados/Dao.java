package org.trilhaCap.trabalhandoComDados;

import java.sql.*;

public class Dao {

    Connection conexao; //Conexão com bando de dados
    PreparedStatement stmt; // Acessa a Tabela (insert, update, delete, select)
    ResultSet resultSet; //Consulta da tabela (select)
    CallableStatement call; // Procedures e Function

    public void abreConexao() throws Exception{
        String url = "jdbc:postgresql://localhost:5432/cadastroscap";
        String user = "postgres";
        String password = "123";

        try {
            Class.forName("org.postgresql.Driver");
            conexao = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão realizada com sucesso");
        }catch (SQLException | ClassNotFoundException ex){
            System.out.println("Erro ao tentar conectar com banco de dados");
        }

    }

    public void fechaConexao() throws Exception{
        conexao.close();
    }
}
