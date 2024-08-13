package org.trilhaCap.construtores;

public class Aluno {
    private double nota1, nota2, nota3;
    MATRICULA situacaoMatricula;
    STATUS situacaoAluno;

    public Aluno(){

    }

    //Construtor com sobrecarga
    public Aluno(double nota1, double nota2, double nota3){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;

    }

    public double calculo (){
        double mediaAluno = 0;
        mediaAluno = (this.nota1 + this.nota2 + this.nota3) / 3;
        return mediaAluno;
    }

    public enum STATUS{
        APROVADO,
        REPROVADO
    }

    public enum MATRICULA{
        MATRICULADO,
        PENDENTE,
        RECUSADO;
    }

}

