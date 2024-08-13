package org.trilhaCap.trabalhandoComDados;

import java.util.List;

public class PrincipalPessoa {

    public static void main(String[] args) throws Exception {
        PessoaDao pd = new PessoaDao();


        Pessoa pes = pd.consultarPessoaIndividual(2);
        if (pes != null) {
            pes.setEmailPessoa("joao2@gmail.com");
            pd.alterarPessoa(pes);
        } else {
            System.out.println("Pessoa não encontrada ou falha no acesso ao banco de dados");
        }

        // Listando todas as pessoas
        List<Pessoa> listaPessoas = pd.ListarPessoas();
        for (Pessoa p : listaPessoas) {
            System.out.println("Id.: " + p.getIdPessoa());
            System.out.println("Nome : " + p.getNomePessoa());
            System.out.println("Email : " + p.getEmailPessoa());
        }
    }
}
