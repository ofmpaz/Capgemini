package org.trilhaCap.genericos;

import java.util.ArrayList;
import java.util.List;

public class Aeronaves<T> {

    private List<T> listaAeronaves = new ArrayList<>();

    public void adicionarVoos(T codigoVoo){
        listaAeronaves.add(codigoVoo);
    }
    public void mostrarPrimeiroVoo() {
        if (listaAeronaves.isEmpty()) {
            throw new RuntimeException("A lista estpa vazia");
        } else {
            System.out.println("O código do primeiro voo é: " + listaAeronaves.get(0));
        }
    }

        public void listarVoos(){
            for(T lista : listaAeronaves){
                System.out.println("Agenda de voos: " + lista);
            }
        }
    }

