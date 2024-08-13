package org.trilhaCap.construtores;


public class Principal {

    public static void main(String[] args) {

        Aluno aluno = new Aluno(2, 5, 5);
        double media = 0;
        media = aluno.calculo();

        if(media < 6){
            aluno.situacaoAluno = Aluno.STATUS.REPROVADO;
        }
        else{
            aluno.situacaoAluno = Aluno.STATUS.APROVADO;
        }

        System.out.println("A situação do aluno é: " + aluno.situacaoAluno + ", com média final: " + media);


    }

}
