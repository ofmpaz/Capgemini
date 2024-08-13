package org.trilhaCap.trabalhandoComDados;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PessoaDao extends Dao {

    public void incluirPessoa(Pessoa p) throws Exception {
        abreConexao();
        stmt = conexao.prepareStatement("insert into pessoa values(?,?,?)");
        stmt.setInt(1, p.getIdPessoa());
        stmt.setString(2, p.getNomePessoa());
        stmt.setString(3, p.getEmailPessoa());
        stmt.execute();
        stmt.close();
    }

    public void alterarPessoa(Pessoa p) throws Exception {
        abreConexao();
        stmt = conexao.prepareStatement("update Pessoa set nomepessoa = ?, emailPessoa = ? where idPessoa = ?");
        stmt.setString(1, p.getNomePessoa());
        stmt.setString(2, p.getEmailPessoa());
        stmt.setInt(3, p.getIdPessoa());
        stmt.execute();
        stmt.close();
    }

    public void excluirPessoa(Pessoa p) throws Exception {
        abreConexao();
        stmt = conexao.prepareStatement("delete from Pessoa where idPessoa = ?");
        stmt.setInt(1, p.getIdPessoa());
        stmt.execute();
        stmt.close();
    }

    public Pessoa consultarPessoaIndividual(int cod) throws Exception {
        abreConexao();
        stmt = conexao.prepareStatement("select * from pessoas where idPessoa = ? ");
        stmt.setInt(1, cod);
        try {
            resultSet = stmt.executeQuery();
        }
        catch (SQLException ex) {
            throw new Exception(ex);

        }
        finally {
            System.out.println("Fechando a conex o com banco de dados no Finally");
            stmt.close();
        }
        Pessoa p = null;
        if (resultSet != null) {
            if (resultSet.next()) {
                p = new Pessoa();
                p.setIdPessoa(resultSet.getInt("idPessoa"));
                p.setNomePessoa(resultSet.getString("nomePessoa"));
                p.setEmailPessoa(resultSet.getString("email"));
            }
        }
        stmt.close();
        return p;
    }



    public List<Pessoa> ListarPessoas() {
        List<Pessoa> listaPessoas = new ArrayList<>();
        try {
            abreConexao();
            stmt = conexao.prepareStatement("select * from pessoa");
            resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                Pessoa p = new Pessoa();
                p.setIdPessoa(resultSet.getInt("idPessoa"));
                p.setNomePessoa(resultSet.getString("nomePessoa"));
                p.setEmailPessoa(resultSet.getString("emailPessoa"));
                listaPessoas.add(p);
            }
            stmt.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listaPessoas;
    }
}
