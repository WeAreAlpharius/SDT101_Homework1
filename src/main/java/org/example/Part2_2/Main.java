package org.example.Part2_2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Animal> a = new ArrayList<>();
        a.add(new Cat());
        a.add(new Dog());
        a.add(new Cow());
        a.add(new Pig());

        for (Animal animal : a){
            animal.makeSound();
        }
    }
}
