package org.trilhaCap.arrays;

import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] alunos = {"João", "Maria", "José"};
        float[][] notasPorAluno = new float[3][4];
        float somaNotas, mediaAluno;

        for(int i = 0; i < alunos.length; i++){
            System.out.println("Informe as notas do aluno: " + alunos[i]);
            somaNotas = 0;
            mediaAluno = 0;

            for(int j = 0; j < notasPorAluno.length; j++){
                notasPorAluno[i][j] = sc.nextFloat();
                somaNotas += notasPorAluno[i][j];
            }
            mediaAluno = somaNotas / 3;
            if(mediaAluno >= 7.5){
                System.out.println(alunos[i] + " Aprovado com media: " + mediaAluno);
            } else if (mediaAluno >= 5.5 && mediaAluno < 7.5) {
                System.out.println(alunos[i] + " Em recuperação com media: " + mediaAluno);
            }else{
                System.out.println(alunos[i] + " Reprovado com media: " + mediaAluno);
            }
        }

    }
}
