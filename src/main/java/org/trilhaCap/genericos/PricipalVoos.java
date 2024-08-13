package org.trilhaCap.genericos;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class PricipalVoos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aeronaves<Integer> agendaDeVoos = new Aeronaves<>();
        int quantidadeDeVoos = 0;
        Integer codigoDoVoo = 0;
        int cont = 0;

        System.out.println("Informe a quantidade de voos para está agenda");
        System.out.println("__________________________________________");

        quantidadeDeVoos = sc.nextInt();

        for (int i = 0; i < quantidadeDeVoos; i++){
            System.out.println("Informe o código do voo: " + cont++);
            agendaDeVoos.adicionarVoos(codigoDoVoo = sc.nextInt());
        }
        System.out.println("__________________________________________");

        System.out.println("Vôos agendados com sucesso");
        System.out.println("__________________________________________");

        agendaDeVoos.mostrarPrimeiroVoo();
        System.out.println("__________________________________________");

        agendaDeVoos.listarVoos();

    }
}
