package org.trilhaCap.interfaces;

public class Gado implements InterfaceAnimal{
    @Override
    public void animalComer() {
    System.out.println("Comendo Capim");
    }

    @Override
    public void animalSom() {
        System.out.println("Muuuuuu");
    }

    @Override
    public void animalAbrigo() {
        System.out.println("Pasto");
    }
}
