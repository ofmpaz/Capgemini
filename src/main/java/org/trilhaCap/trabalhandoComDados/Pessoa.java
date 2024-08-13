package org.trilhaCap.trabalhandoComDados;

public class Pessoa {

    private int idPessoa;
    private String nomePessoa;
    private String emailPessoa;

    public Pessoa(){

    }

    public Pessoa(int idPessoa, String nomePessoa, String emailPessoa) {
        super();
        this.idPessoa = idPessoa;
        this.nomePessoa = nomePessoa;
        this.emailPessoa = emailPessoa;
    }

    public Pessoa(String nomePessoa, String emailPessoa) {
        super();
        this.nomePessoa = nomePessoa;
        this.emailPessoa = emailPessoa;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getEmailPessoa() {
        return emailPessoa;
    }

    public void setEmailPessoa(String emailPessoa) {
        this.emailPessoa = emailPessoa;
    }
}
